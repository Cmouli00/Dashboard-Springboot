package com.restapi.associate.Object;

import javax.persistence.*;


@Entity
@Table(name="associate_details")
public class Associate {
    @Id
    @Column(name = "associate_id")
    private Long associateid;
    @Column(name = "first_name")
    private String firstname;
    @Column(name = "last_name")
    private String lastname;
    @Column(name = "dob")
    private String dob;
    @Column(name = "hire_date")
    private String hiredate;
    @Column(name = "yrs_exp")
    private String yrsexp;
    @Column(name = "pan")
    private String pan;
    @Column(name = "email")
    private String email;
    @Column(name = "phone_number")
    private String phonenumber;
    @Column(name = "address1")
    private String address1;
    @Column(name = "address2")
    private String address2;
    @Column(name = "post_code")
    private String postcode;
    @Column(name = "manager_id")
    private Long managerid;
    @Column(name = "lead_id")
    private Long leadid;
    @Column(name = "hr_id")
    private Long hrid;

    public Associate() {
    }

    public Associate(Long associateid, String firstname, String lastname, String dob, String hiredate, String yrsexp, String pan, String email, String phonenumber, String address1, String address2, String postcode, Long managerid, Long leadid, Long hrid) {
        this.associateid = associateid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.hiredate = hiredate;
        this.yrsexp = yrsexp;
        this.pan = pan;
        this.email = email;
        this.phonenumber = phonenumber;
        this.address1 = address1;
        this.address2 = address2;
        this.postcode = postcode;
        this.managerid = managerid;
        this.leadid = leadid;
        this.hrid = hrid;
    }

    public Long getAssociateid() {
        return this.associateid;
    }

    public void setAssociateid(Long associateid) {
        this.associateid = associateid;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDob() {
        return this.dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getHiredate() {
        return this.hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public String getYrsexp() {
        return this.yrsexp;
    }

    public void setYrsexp(String yrsexp) {
        this.yrsexp = yrsexp;
    }

    public String getPan() {
        return this.pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return this.phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress1() {
        return this.address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return this.address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getPostcode() {
        return this.postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public Long getManagerid() {
        return this.managerid;
    }

    public void setManagerid(Long managerid) {
        this.managerid = managerid;
    }

    public Long getLeadid() {
        return this.leadid;
    }

    public void setLeadid(Long leadid) {
        this.leadid = leadid;
    }

    public Long getHrid() {
        return this.hrid;
    }

    public void setHrid(Long hrid) {
        this.hrid = hrid;
    }

    @Override
    public String toString() {
        return "{" +
            " associateid='" + getAssociateid() + "'" +
            ", firstname='" + getFirstname() + "'" +
            ", lastname='" + getLastname() + "'" +
            ", dob='" + getDob() + "'" +
            ", hiredate='" + getHiredate() + "'" +
            ", yrsexp='" + getYrsexp() + "'" +
            ", pan='" + getPan() + "'" +
            ", email='" + getEmail() + "'" +
            ", phonenumber='" + getPhonenumber() + "'" +
            ", address1='" + getAddress1() + "'" +
            ", address2='" + getAddress2() + "'" +
            ", postcode='" + getPostcode() + "'" +
            ", managerid='" + getManagerid() + "'" +
            ", leadid='" + getLeadid() + "'" +
            ", hrid='" + getHrid() + "'" +
            "}";
    }

   

}