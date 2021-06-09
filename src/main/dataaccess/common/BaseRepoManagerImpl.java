package main.dataaccess.common;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public abstract class BaseRepoManagerImpl<PK, ENT> implements BaseRepoManager<PK, ENT> {

	
	public abstract PK getPk(ENT entity);
	public abstract void setPk(ENT entity);
	public abstract Map<PK, ENT> getDataSource();
	public abstract String getPath();
	
	
	@Override
	public ENT insert(ENT entity) {
		setPk(entity);
		getDataSource().put(getPk(entity), entity);
		
		persist();
		return entity;
	}

	@Override
	public ENT select(PK id) {
		ENT entity = getDataSource().get(id);
		return entity;	
	}

	@Override
	public void update(ENT entity) {
		getDataSource().put(getPk(entity), entity);
		persist();
	}

	@Override
	public void delete(PK id) {
		getDataSource().remove(id);
		persist();
	}

	@Override
	public List<ENT> selectAll() {
		List<ENT> allData = (List<ENT>) getDataSource().values();
		return allData;
	}
	
	//---------------------------------------------------------------
	
	/*
	public void persist1() {
		ObjectMapper objectMapper = new ObjectMapper();
		File dataFile = new File(this.getPath()); 
		
		//List<ENT> allData = selectAll();
		
		Collection<ENT> allData =  getDataSource().values();	
		
		allData.stream().forEach(e -> {
			try {
				objectMapper.writeValue(dataFile, e);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} );
	
	}

	*/
	
	
	public void load() {
		ObjectMapper mapper = new ObjectMapper();
		
		try {
		
			List<ENT> listENT = mapper.readValue(new File(String.valueOf(getPath())), new TypeReference<List<ENT>>(){});

			//ENT[] listENT = mapper.readValue(new File(String.valueOf(getPath())), ENT[].class);

			
			getDataSource().clear();
			
			for(ENT e : listENT) {
				getDataSource().put(getPk(e), e);
			}
			
			//listENT.stream().forEach(e -> { getDataSource().put(getPk(e), e); } );
			
		
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		//getDataSource().put(getPk(entity), entity);
		
		
		
	}

	
	
	public void persist(){
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        try {
            writer.writeValue(new File(String.valueOf(getPath())), getDataSource().values());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
