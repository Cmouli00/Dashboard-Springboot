package com.restapi.associate.Repository;

import com.restapi.associate.Object.Competancy;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CompetancyRepository extends JpaRepository<Competancy,Long> {
    List<Competancy> findByassociateid(Long associate_id);
    List<Competancy> findByCompetancyid(Long competancyid);
}