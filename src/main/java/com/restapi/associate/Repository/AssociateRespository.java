package com.restapi.associate.Repository;

import java.util.List;
import com.restapi.associate.Object.Associate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssociateRespository extends JpaRepository<Associate, Long> {
    List<Associate> findByfirstname(String firstname);
    List<Associate> findByManagerid(Long managerid);
}