package com.sourav.Hotel.Management.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sourav.Hotel.Management.modal.UserInfoDo;


@RestController
public class UserInfoController {
	
	@Autowired
	private com.sourav.Hotel.Management.services.UserService UserService;
	
	@GetMapping("/UserInfo")
	public List<UserInfoDo> getAllUserDetail() {
		List<UserInfoDo> AlluserInfo = UserService.getUserDetail();
		System.out.println("getAllUserDetail called");	
		
		return AlluserInfo;
	}
	
	
	@GetMapping("/UserInfo/{UserID}")
	public List<UserInfoDo> getUserDetailById(@PathVariable String UserID) {
		List<UserInfoDo> userInfo = UserService.getUserDetailById(UserID);
		System.out.println(UserID +" getUserDetail by ID called");	
		
		return userInfo;
	}
	
	
	@PostMapping("/newUser")
	public UserInfoDo addNewUser(@RequestBody UserInfoDo NewUserInfoDo) {
		
		UserInfoDo newUser = UserService.addNewUser(NewUserInfoDo);
		return newUser;
		
	}
	
	@PutMapping("/upadateUser")
	public  UserInfoDo updateUserInfo(@RequestBody UserInfoDo updateUserInfoDo) {
		
		UserInfoDo updateUserInfo = UserService.updateUserInfo(updateUserInfoDo);
		System.out.print(" User info is updated");
		
		return updateUserInfo;
			
		
	}
	
	@DeleteMapping("/DeleteUser/{UserID}")
	public String DeleteUserInfo(@PathVariable String UserID) {
		
		String DeletedUserInfo = UserService.deleteUserID(Long.parseLong(UserID));
		System.out.print(" User info is Deleted");
		
		return DeletedUserInfo;
		
	}
		

}
