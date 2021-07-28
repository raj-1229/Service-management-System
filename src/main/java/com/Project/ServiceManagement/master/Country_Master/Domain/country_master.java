package com.Project.ServiceManagement.master.Country_Master.Domain;

import javax.persistence.*;

@Entity
@Table(name = "country_master")
public class country_master {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String country_name;
    private String country_code;
    private String country_description;
    @Column(columnDefinition="tinyint(1) default 1")
    private boolean active_status;
    //private boolean active_status;

    public country_master() {
    }

    public country_master(int id, String country_name, String country_code, String country_description, boolean active_status) {
        this.id = id;
        this.country_name = country_name;
        this.country_code = country_code;
        this.country_description = country_description;
        this.active_status = active_status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getCountry_description() {
        return country_description;
    }

    public void setCountry_description(String country_description) {
        this.country_description = country_description;
    }

    public boolean isActive_status() {
        return active_status;
    }

    public void setActive_status(boolean active_status) {
        this.active_status = active_status;
    }


}
