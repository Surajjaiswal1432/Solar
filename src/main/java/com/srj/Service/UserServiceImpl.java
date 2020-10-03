package com.srj.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srj.Dao.UserDao;
import com.srj.Entity.Commercial;
import com.srj.Entity.Residential;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	 private UserDao dao;
	
	
	public Residential Save(Residential residnetial) {
		return dao.Saveinfo(residnetial);
	}


	
	public Commercial Save(Commercial commercial) {
		
		return dao.Save(commercial);
	}


	
	
	
	
}
