package com.klef.jfsd.sdpproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.klef.jfsd.sdpproject.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	@Query(" select a from Admin a where a.username=?1 and a.password=?2 ")
	public Admin checkadminlogin(String uname,String pwd) ;
	
	@Modifying //for data manpulation like update and delete
	@Transactional //commit
	@Query(" update Faculty f set f.active = ?2 where f.id = ?1 ")
	public int updatestatus(int eid,boolean status);
	
	
}
