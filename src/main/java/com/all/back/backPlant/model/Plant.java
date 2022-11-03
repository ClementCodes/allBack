package com.all.back.backPlant.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GenerationType;

import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "plants")
public class Plant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String nameCommun;
    private String nameScientist;
    private String wateringDate;
    private String season;
    private String time;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private Date createdDate;

    @UpdateTimestamp
    @Column(name = "update_at", nullable = false, updatable = false)
    private Date updateTumeStamp;

    public Plant() {
    }

    public Plant(Integer id, String nameCommun, String nameScientist, String wateringDate, String season, String time,
            Date createdDate, Date updateTumeStamp) {
        this.id = id;
        this.nameCommun = nameCommun;
        this.nameScientist = nameScientist;
        this.wateringDate = wateringDate;
        this.season = season;
        this.time = time;
        this.createdDate = createdDate;
        this.updateTumeStamp = updateTumeStamp;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameCommun() {
        return this.nameCommun;
    }

    public void setNameCommun(String nameCommun) {
        this.nameCommun = nameCommun;
    }

    public String getNameScientist() {
        return this.nameScientist;
    }

    public void setNameScientist(String nameScientist) {
        this.nameScientist = nameScientist;
    }

    public String getWateringDate() {
        return this.wateringDate;
    }

    public void setWateringDate(String wateringDate) {
        this.wateringDate = wateringDate;
    }

    public String getSeason() {
        return this.season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
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

    public Plant id(Integer id) {
        setId(id);
        return this;
    }

    public Plant nameCommun(String nameCommun) {
        setNameCommun(nameCommun);
        return this;
    }

    public Plant nameScientist(String nameScientist) {
        setNameScientist(nameScientist);
        return this;
    }

    public Plant wateringDate(String wateringDate) {
        setWateringDate(wateringDate);
        return this;
    }

    public Plant season(String season) {
        setSeason(season);
        return this;
    }

    public Plant time(String time) {
        setTime(time);
        return this;
    }

    public Plant createdDate(Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public Plant updateTumeStamp(Date updateTumeStamp) {
        setUpdateTumeStamp(updateTumeStamp);
        return this;
    }

}
