package com.mpc.vrekon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpc.vrekon.model.InstitusiList;

@Repository
public interface InstitusiListRepository extends JpaRepository<InstitusiList, Integer>{
	InstitusiList findByInstitusiTabel(Integer institusiTabel);
	
	Integer countByInstitusiTabelAndIdNot(Integer institusiTabel, Integer idInstitusi);
	
	Integer countByInstitusiTabel(Integer institusiTabel); 
	
	Integer countByInstitusiTabelNot(Integer institusiTabel);
}
