package com.restapi.associate.Object;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="status")
public class Status {

    @Id
    @Column(name="associate_id")
    private Long associateid;
    @Column(name="Wstatus")
    private Boolean Wstatus;

    public Status() {
    }

    public Status(Long associateid, Boolean Wstatus) {
        this.associateid = associateid;
        this.Wstatus = Wstatus;
    }

    public Long getAssociateid() {
        return this.associateid;
    }

    public void setAssociate_id(Long associateid) {
        this.associateid = associateid;
    }

    public Boolean isWstatus() {
        return this.Wstatus;
    }

    public Boolean getWstatus() {
        return this.Wstatus;
    }

    public void setWstatus(Boolean Wstatus) {
        this.Wstatus = Wstatus;
    }


    @Override
    public String toString() {
        return "{" +
            " associate_id='" + getAssociateid() + "'" +
            ", Wstatus='" + isWstatus() + "'" +
            "}";
    }
    
}