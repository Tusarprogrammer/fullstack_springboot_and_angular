package com.example.demo.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class EmployeeDTO implements Serializable {

    private static final long serialVersionUID = 7759616797993390278L;

    private String id;
    private String name;
    private String email;
    private String contactNumber;
    private String queryDetails;
    private String address = "Bhubaneswar";
    private boolean active;
    AtomicInteger atomicInteger = new AtomicInteger(1);
    private int deptId;
    private long salary = 50000;
    private Date joingDate = new Date();
    private double loan;
    private char level;
    private boolean isPreviousEmployee;
    private boolean isResigned;
    private String primarySkillSets = "Java,Springboot";

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Date getJoingDate() {
        return joingDate;
    }

    public void setJoingDate(Date joingDate) {
        this.joingDate = joingDate;
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public char getLevel() {
        return level;
    }

    public void setLevel(char level) {
        this.level = level;
    }

    public boolean isPreviousEmployee() {
        return isPreviousEmployee;
    }

    public void setPreviousEmployee(boolean isPreviousEmployee) {
        this.isPreviousEmployee = isPreviousEmployee;
    }

    public boolean isResigned() {
        return isResigned;
    }

    public void setResigned(boolean isResigned) {
        this.isResigned = isResigned;
    }

    public String getPrimarySkillSets() {
        return primarySkillSets;
    }

    public void setPrimarySkillSets(String primarySkillSets) {
        this.primarySkillSets = primarySkillSets;
    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }

    public void setAtomicInteger(AtomicInteger atomicInteger) {
        this.atomicInteger = atomicInteger;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getQueryDetails() {
        return queryDetails;
    }

    public void setQueryDetails(String queryDetails) {
        this.queryDetails = queryDetails;
    }

    public EmployeeDTO(String id, String name, String email, String contactNumber, String queryDetails) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
        this.queryDetails = queryDetails;
    }

}
