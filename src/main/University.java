package main;

import main.service.apigroup.ApiGroupParam;
import main.service.apigroup.ApiGroupResult;
import main.service.apigroup.ApiGroupService;
import main.service.apigroup.ApiGroupServiceImpl;
import main.service.apigroupuser.ApiGroupUserParam;
import main.service.apigroupuser.ApiGroupUserResult;
import main.service.apigroupuser.ApiGroupUserService;
import main.service.apigroupuser.ApiGroupUserServiceImpl;

public class University {

	public static void main(String[] args) {
		
		apiGroupTest(); 
		apiGroupUserTest();
		
		System.out.println("");
	}
	
	
	
	
	
	
	
	public static void apiGroupTest() {
		ApiGroupService apiGroup = new ApiGroupServiceImpl(); 
		ApiGroupParam param = new ApiGroupParam();
		
		
		System.out.println("------ ApiGroup TEST ----------");
		// create
		//param.setId(id);
		param.setCode(10L);
		param.setName("Group 1");
		param.setDescription("First group ever... :)");
		apiGroup.create(param);

		param.setCode(20L);
		param.setName("Group 2");
		param.setDescription("Secong group ever... :)");
		apiGroup.create(param);

		param.setCode(30L);
		param.setName("Group 3");
		param.setDescription("Last group ever... :)");
		
		// get
		ApiGroupResult res =  apiGroup.get(1L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s%n", res.getId(), res.getCode(), res.getName(), res.getDescription());
		
		res =  apiGroup.get(2L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s%n", res.getId(), res.getCode(), res.getName(), res.getDescription());
		
		// update
		param.setId(res.getId());
		param.setDescription(res.getDescription());
		param.setCode(21L);
		param.setName("Group 2a");
		apiGroup.update(param);
		res =  apiGroup.get(2L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s%n", res.getId(), res.getCode(), res.getName(), res.getDescription());
		
		// delete
		apiGroup.delete(3L); // deleting group 
		System.out.println("id: 3 was deleted...");
		
		System.out.println();
		System.out.println();
	}
	
	//-------------------------------------------------
	public static void apiGroupUserTest() {
		ApiGroupUserService apiGroupUser = new ApiGroupUserServiceImpl(); 
		ApiGroupUserParam param = new ApiGroupUserParam();
		
		
		System.out.println("------ ApiGroupUser TEST ----------");
		// create
		//param.setId(id);
		param.setCode(11L);
		param.setName("Group 11");
		param.setDescription("11 First group ever... :)");
		apiGroupUser.create(param);

		param.setCode(20L);
		param.setName("Group 2");
		param.setDescription("Secong group ever... :)");
		apiGroupUser.create(param);

		param.setCode(30L);
		param.setName("Group 3");
		param.setDescription("Last group ever... :)");
		
		// get
		ApiGroupUserResult res =  apiGroupUser.get(1L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s%n", res.getId(), res.getCode(), res.getName(), res.getDescription());
		
		res =  apiGroupUser.get(2L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s%n", res.getId(), res.getCode(), res.getName(), res.getDescription());
		
		// update
		param.setId(res.getId());
		param.setDescription(res.getDescription());
		param.setCode(21L);
		param.setName("Group 2a");
		apiGroupUser.update(param);
		res =  apiGroupUser.get(2L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s%n", res.getId(), res.getCode(), res.getName(), res.getDescription());
		
		// delete
		apiGroupUser.delete(3L); // deleting group 
		System.out.println("id: 3 was deleted...");
		
		System.out.println();
		System.out.println();
	}

	
	

}
