package com.restapi.associate.Repository;

import java.util.List;

import com.restapi.associate.Object.Project;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
		List<Project> findByAssociateid(Long associateid);
		List<Project> findByProjectid(Long projectid);
}