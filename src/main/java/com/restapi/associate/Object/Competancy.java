package com.restapi.associate.Object;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="competancy_detail")
public class Competancy {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="associate_id")
    private Long associateid;
    @Column(name="competancy_id")
    private Long competancyid;
    @Column(name="competancy_name")
    private String competancyname;
    @Column(name="competancy_rank")
    private String competancyrank;
    @Column(name="score")
    private String score;


    public Competancy() {
    }

    public Competancy(Long associateid, Long competancyid, String competancyname, String competancyrank, String score) {
        this.associateid = associateid;
        this.competancyid = competancyid;
        this.competancyname = competancyname;
        this.competancyrank = competancyrank;
        this.score = score;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAssociateid() {
        return this.associateid;
    }

    public void setAssociateid(Long associateid) {
        this.associateid = associateid;
    }

    public Long getCompetancyid() {
        return this.competancyid;
    }

    public void setCompetancyid(Long competancyid) {
        this.competancyid = competancyid;
    }

    public String getCompetancyname() {
        return this.competancyname;
    }

    public void setCompetancyname(String competancyname) {
        this.competancyname = competancyname;
    }

    public String getCompetancyrank() {
        return this.competancyrank;
    }

    public void setCompetancyrank(String competancyrank) {
        this.competancyrank = competancyrank;
    }

    public String getScore() {
        return this.score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", associateid='" + getAssociateid() + "'" +
            ", competancyid='" + getCompetancyid() + "'" +
            ", competancyname='" + getCompetancyname() + "'" +
            ", competancyrank='" + getCompetancyrank() + "'" +
            ", score='" + getScore() + "'" +
            "}";
    }

    
    
}