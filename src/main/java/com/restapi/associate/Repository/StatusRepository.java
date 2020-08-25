package com.restapi.associate.Repository;

import com.restapi.associate.Object.Status;

import org.springframework.data.jpa.repository.JpaRepository;



public interface StatusRepository extends JpaRepository<Status,Long> {

    
}