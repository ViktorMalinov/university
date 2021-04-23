package main.dataaccess.apigroup.dao;

import java.util.List;
import java.util.Set;

public interface ApiGroupDao {

	ApiGroup create(ApiGroup obj);
	ApiGroup get(Long id);
	void update(ApiGroup obj);
	void delete(Long id);
	Set<Long> getKeySet();
	List<ApiGroup> selectAll();
}
