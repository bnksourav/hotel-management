package com.sourav.Hotel.Management.services;

import java.util.List;

import com.sourav.Hotel.Management.Dao.*;

import com.sourav.Hotel.Management.modal.UserInfoDo;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;


@Service
public class UserService {
	
	@Autowired
	private DAOUser DAOUser;
	
	
	 public List<UserInfoDo> getUserDetail(){
		 
		 List<UserInfoDo> Alluser=DAOUser.getUserDetail();
		 return Alluser;
		 
	 }
	 public List<UserInfoDo> getUserDetailById(String ID){
		 
		 List<UserInfoDo> OneUser =DAOUser.getUserDetailById(ID);
		 return OneUser;
		 
	 }
	 public UserInfoDo  addNewUser(UserInfoDo newuser) {
		 UserInfoDo addUser =DAOUser.addNewUser(newuser);
		 return addUser;
		 
	 }
	 public UserInfoDo  updateUserInfo(UserInfoDo updateuser) {
		 
		 UserInfoDo updateUser =DAOUser.updateUserInfo(updateuser);
		 return updateUser;
		 
	 }
	 public String deleteUserID(long ID) {
		 String deleteUser =DAOUser.deleteUserID(ID);
		 return deleteUser ;
	 }
	
	

}
