package com.restapi.associate.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.restapi.associate.Object.Associate;
import com.restapi.associate.Object.Competancy;
import com.restapi.associate.Object.Project;
import com.restapi.associate.Object.Status;
import com.restapi.associate.Repository.AssociateRespository;
import com.restapi.associate.Repository.CompetancyRepository;
import com.restapi.associate.Repository.ProjectRepository;
import com.restapi.associate.Repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
public class AssociateController {

    @Autowired
    AssociateRespository repository;
    @Autowired
    ProjectRepository prorepository;
    @Autowired
    StatusRepository statrepository;
    @Autowired
    CompetancyRepository comrepository;

    @GetMapping("/associates")
    public List<Associate> getassociate() {
      List < Associate > associate = repository.findAll();

        return associate;
    }
    @GetMapping(value = "associates/{firstname}")
    public List<Associate> search(@PathVariable String firstname) {
 
    List<Associate> associate = repository.findByfirstname(firstname);
    return associate;
    }

  
    @GetMapping("/associates/id/{associate_id}")
    public Optional<Associate> getasssid(@PathVariable Long associate_id) {
      Optional<Associate> associate = repository.findById(associate_id);
    return associate;
  }

  @GetMapping("/associates/managerid/{manager_id}")
    public List<Associate> getman(@PathVariable Long manager_id) {
      List<Associate> associate = repository.findByManagerid(manager_id);
    return associate;
  }

    @PostMapping("associates/create")
    public Associate create(@RequestBody Associate associate) {
      System.out.println("Adding...");
  
      Associate associate1 = repository.save(new Associate(associate.getAssociateid(),associate.getFirstname(),associate.getLastname(),
      associate.getDob(),associate.getHiredate(),associate.getYrsexp(),associate.getPan(),associate.getEmail(),associate.getPhonenumber(),
      associate.getAddress1(),associate.getAddress2(),associate.getPostcode(),associate.getManagerid(),associate.getLeadid(),
      associate.getHrid()));
  
      return associate1;
  }
  @PutMapping("/associates/update/{userid}")
public ResponseEntity<Associate> updateEmployee(@PathVariable(value = "userid") Long userid,
     @RequestBody Associate associate) {
    Optional<Associate> associate1 = repository.findById(userid);
    
    Associate associate2 = associate1.get();
    associate2.setFirstname(associate.getFirstname());
    associate2.setLastname(associate.getLastname());
    associate2.setDob(associate.getDob());
    associate2.setHiredate(associate.getHiredate());
    associate2.setYrsexp(associate.getYrsexp());
    associate2.setPan(associate.getPan());
    associate2.setEmail(associate.getEmail());
    associate2.setPhonenumber(associate.getPhonenumber());
    associate2.setAddress1(associate.getAddress1());
    associate2.setAddress2(associate.getAddress2());
    associate2.setPostcode(associate.getPostcode());
    associate2.setManagerid(associate.getManagerid());
    associate2.setLeadid(associate.getLeadid());
    associate2.setHrid(associate.getHrid());

    
    final Associate Update = repository.save(associate);
    return ResponseEntity.ok(Update);
}

  @DeleteMapping("/associates/{associate_id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "userid") Long userid)
    {
        Optional<Associate> associate = repository.findById(userid);
        Associate associate2 = associate.get();
        repository.delete(associate2);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

    @GetMapping("/project")
    public List<Project> getproject() {
      List < Project > project = prorepository.findAll();
        return project;
    }
    @GetMapping("/project/{associate_id}")
    public List<Project> findProjectsByid(@PathVariable Long associate_id) {
    List<Project> project = prorepository.findByAssociateid(associate_id);
    return project;
  }

  @GetMapping("/project/projectid/{project_id}")
    public List<Project> findassociatesid(@PathVariable Long project_id) {
    List<Project> project = prorepository.findByProjectid(project_id);
    return project;
  }

  @PostMapping("project/create")
  public Project createProject(@RequestBody Project project) {
    System.out.println("Adding Project...");

    Project project1 = prorepository.save(new Project(project.getAssociateid(),project.getProjectid(),
    project.getProstart(),project.getProend()));

    return project1;
}

@PutMapping("/status/update/{userid}")
public ResponseEntity<Status> updateEmployee(@PathVariable(value = "userid") Long userid,
     @RequestBody Status status) {
    Optional<Status> status1 = statrepository.findById(userid);
    Status status2 = status1.get();
    status2.setWstatus(status.getWstatus());    
    final Status Update = statrepository.save(status);
    return ResponseEntity.ok(Update);
}

    @GetMapping("/status")
    public List<Status> getStatus(){
      List<Status> project = statrepository.findAll();
      return project;
    }

    @GetMapping("/status/{associate_id}")
        public Optional<Status> status(@PathVariable Long associate_id) {
          Optional<Status> status = statrepository.findById(associate_id);
        return status;
      }

      @PostMapping("status/create")
  public Status createStatus(@RequestBody Status status) {
    System.out.println("Adding Status...");

    Status status1 = statrepository.save(new Status(status.getAssociateid(),status.getWstatus()));

    return status1;
}

  @GetMapping("/competancy")
  public List<Competancy> getCompetancy(){
    List<Competancy> competancy = comrepository.findAll();
    return competancy;
  }
  @GetMapping("/competancy/{associate_id}")
        public List<Competancy> competancy(@PathVariable Long associate_id) {
          List<Competancy> com = comrepository.findByassociateid(associate_id);
        return com;
      }
      @GetMapping("/competancy/competancyid/{associate_id}")
        public List<Competancy> competancyid(@PathVariable Long associate_id) {
          List<Competancy> com = comrepository.findByCompetancyid(associate_id);
        return com;
      }



  @PostMapping("competancy/create")
  public Competancy createCompetancy(@RequestBody Competancy competancy) {
    System.out.println("Adding Competancy...");

    Competancy status1 = comrepository.save(new Competancy(competancy.getAssociateid(),competancy.getCompetancyid(),
    competancy.getCompetancyname(),competancy.getCompetancyrank(),competancy.getScore()));

    return status1;
}
    
}