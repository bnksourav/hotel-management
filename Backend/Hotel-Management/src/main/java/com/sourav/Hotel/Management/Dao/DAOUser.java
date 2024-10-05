package com.sourav.Hotel.Management.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sourav.Hotel.Management.modal.UserInfoDo;
import com.sourav.Hotel.Management.repository.*;

@Repository 
public class DAOUser {
	
	@Autowired
	private UserRepository UserRepository;
	@Autowired
	private JdbcTemplate JdbcTemplate;


	public List<UserInfoDo> getUserDetail() {
		
			
		System.out.println("getAllUserDetail cService");
		return UserRepository.findAll();
	}
	
	public List<UserInfoDo> getUserDetailById(String ID){
		 return UserRepository.findByUserid(Long.parseLong(ID)); 
		 
	}
	
	public UserInfoDo  addNewUser(UserInfoDo newuser) {
		 
		 if(UserRepository.existsByUserid(newuser.getUserid())) {
			 System.out.println("User ID is Already present"); 
			 return null;
		 }else {
			 return UserRepository.save(newuser);
		 }
		 
		 
		 
	}
	public UserInfoDo  updateUserInfo(UserInfoDo updateuser) {
		
		 if(UserRepository.existsByUserid(updateuser.getUserid())) {
			 String s="update  hotelmanaement.User_Info "
			 		+ "set dob="+"'"+updateuser.getDoB() +"',"+" "
					+ "addhar_no="+"'"+ updateuser.getAddhar_no()+"',"+" "
					+ "name="+"'"+updateuser.getName()+"'"+" where "
					+"userid="+"'"+updateuser.getUserid()+"';";
			 
			 JdbcTemplate.update(s);
			 System.out.println(s); 
			 return updateuser; 
			
		 }else {
			 System.out.println("User ID is doesnt exist"); 
			 return null;
		 }
		 
	}
	public String deleteUserID(long ID) {
		
		 System.out.println("Deleteby Called for  user ID"); 
		 String s ="Delete from hotelmanaement.User_Info where userid="+"'"+ID+"' ;";
		
		 
		 if(UserRepository.existsByUserid(ID)) {
			 JdbcTemplate.update(s);
			 return "User info removed sucessfully";
			 
		 }else {
			 System.out.println("id not exist"); 
			 return "ID does not exist";
		 }
		 		  
	}

}
