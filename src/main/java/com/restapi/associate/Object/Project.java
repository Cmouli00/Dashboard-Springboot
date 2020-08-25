package com.restapi.associate.Object;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="project_detail")
public class Project {

    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;
    
    @Column(name = "associate_id")
    private Long associateid;
    @Column(name = "project_id")
    private Long projectid;
    @Column(name = "pro_start")
    private String prostart;
    @Column(name = "pro_end")
    private String proend;

    public Project() {
    }

    public Project(Long associateid, Long projectid, String prostart, String proend) {
        this.associateid = associateid;
        this.projectid = projectid;
        this.prostart = prostart;
        this.proend = proend;
    }

    public Long getAssociateid() {
        return this.associateid;
    }

    public void setAssociateid(Long associateid) {
        this.associateid = associateid;
    }

    public Long getProjectid() {
        return this.projectid;
    }

    public void setProjectid(Long projectid) {
        this.projectid = projectid;
    }

    public String getProstart() {
        return this.prostart;
    }

    public void setProstart(String prostart) {
        this.prostart = prostart;
    }

    public String getProend() {
        return this.proend;
    }

    public void setProend(String proend) {
        this.proend = proend;
    }

    @Override
    public String toString() {
        return "{" +
            " associateid='" + getAssociateid() + "'" +
            ", projectid='" + getProjectid() + "'" +
            ", prostart='" + getProstart() + "'" +
            ", proend='" + getProend() + "'" +
            "}";
    }

    
    
}