package main.dataaccess.apigroup;

public interface ApiGroupDao {

	ApiGroup create(ApiGroup grp);
	ApiGroup get(Long id);
	void update(ApiGroup grp);
	void delete(Long id);
}
