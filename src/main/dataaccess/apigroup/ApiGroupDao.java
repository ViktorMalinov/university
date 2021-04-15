package main.dataaccess.apigroup;

public interface ApiGroupDao {

	ApiGroup create(ApiGroup obj);
	ApiGroup get(Long id);
	void update(ApiGroup obj);
	void delete(Long id);
}
