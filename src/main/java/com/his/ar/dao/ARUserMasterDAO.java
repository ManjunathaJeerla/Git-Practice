package com.his.ar.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.his.ar.entity.ARUserMaster;

@Repository("arUserMasterDao")
public interface ARUserMasterDAO extends JpaRepository<ARUserMaster, Serializable> {

	
	@Query("select count(1) from ARUserMaster ar where ar.email=:emailId")
	public Integer findByEmail(String emailId);
	
}
