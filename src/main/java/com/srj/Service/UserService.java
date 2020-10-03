package com.srj.Service;

import org.springframework.stereotype.Service;

import com.srj.Entity.Commercial;
import com.srj.Entity.Residential;


@Service
public interface UserService {
	
	public Residential Save(Residential resdential);
	public Commercial Save(Commercial commercial);
	
	

}
