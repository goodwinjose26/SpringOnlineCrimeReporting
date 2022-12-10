package com.example.onlinecomplaintreporting_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "complaints")
public class Complaints {
    @Id
    @GeneratedValue


    private int id;
    private   int userid;
    private String compalaint;

    public Complaints() {
    }

    public Complaints(int id, int userid, String compalaint) {
        this.id = id;
        this.userid = userid;
        this.compalaint = compalaint;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getCompalaint() {
        return compalaint;
    }

    public void setCompalaint(String compalaint) {
        this.compalaint = compalaint;
    }
}
