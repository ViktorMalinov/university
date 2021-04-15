package main.common;

import java.util.Set;

public class Utils {
	
	public static Long getNextId(Set<Long> set) {
		Long id = 1L;
		
		if (set.isEmpty()) {
			return id; 
		}
			
		for (Long i : set) {
			if (i > id) {
				id = i;
			}
		}
		
		id += 1;
		
		return id;
	}

}
