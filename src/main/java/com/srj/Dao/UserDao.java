package com.srj.Dao;

import org.springframework.stereotype.Repository;

import com.srj.Entity.Commercial;
import com.srj.Entity.Residential;


@Repository
public interface UserDao {
	
	public Residential Saveinfo(Residential resdiential);
	public Commercial Save(Commercial commercial);

}
