package com.all.back.backUser.model;

import java.security.Timestamp;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String userName;
    private String mobileNo;
    private String emailId;
    private String city;
    private String password;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private Date createdDate;

    @UpdateTimestamp
    @Column(name = "update_at", nullable = false, updatable = false)
    private Date updateTumeStamp;

    public User() {
    }

    public User(Integer id, String userName, String mobileNo, String emailId, String city, String password,
            Date createdDate, Date updateTumeStamp) {
        this.id = id;
        this.userName = userName;
        this.mobileNo = mobileNo;
        this.emailId = emailId;
        this.city = city;
        this.password = password;
        this.createdDate = createdDate;
        this.updateTumeStamp = updateTumeStamp;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobileNo() {
        return this.mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmailId() {
        return this.emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdateTumeStamp() {
        return this.updateTumeStamp;
    }

    public void setUpdateTumeStamp(Date updateTumeStamp) {
        this.updateTumeStamp = updateTumeStamp;
    }

    public User id(Integer id) {
        setId(id);
        return this;
    }

    public User userName(String userName) {
        setUserName(userName);
        return this;
    }

    public User mobileNo(String mobileNo) {
        setMobileNo(mobileNo);
        return this;
    }

    public User emailId(String emailId) {
        setEmailId(emailId);
        return this;
    }

    public User city(String city) {
        setCity(city);
        return this;
    }

    public User password(String password) {
        setPassword(password);
        return this;
    }

    public User createdDate(Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public User updateTumeStamp(Date updateTumeStamp) {
        setUpdateTumeStamp(updateTumeStamp);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", userName='" + getUserName() + "'" +
                ", mobileNo='" + getMobileNo() + "'" +
                ", emailId='" + getEmailId() + "'" +
                ", city='" + getCity() + "'" +
                ", password='" + getPassword() + "'" +
                ", createdDate='" + getCreatedDate() + "'" +
                ", updateTumeStamp='" + getUpdateTumeStamp() + "'" +
                "}";
    }

}