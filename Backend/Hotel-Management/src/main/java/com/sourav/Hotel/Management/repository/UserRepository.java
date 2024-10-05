package com.sourav.Hotel.Management.repository;

import java.util.List;
import org.springframework.data.repository.*;
import com.sourav.Hotel.Management.modal.UserInfoDo;


public interface UserRepository extends CrudRepository<UserInfoDo, Integer> {


	
	List<UserInfoDo> findAll();
	
	List<UserInfoDo> findByUserid(long userId);
	
	UserInfoDo save(UserInfoDo u);

	boolean existsByUserid(long Userid);
	
}
