package main.dataaccess.apigroup.dao;

import java.util.List;

public interface ApiGroupDao {

	ApiGroup create(ApiGroup obj);
	ApiGroup get(Long id);
	void update(ApiGroup obj);
	void delete(Long id);
	List<ApiGroup> selectAll();
}
