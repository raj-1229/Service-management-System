package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="district")

public class District {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    private long districtCode;

    @Column(name="district_name")
    private String districtName;


    @Column(name="district_description")
    private String districtDescription;


    @Column(name="active_status")
    private String activeStatus;

    public District(){

    }

    public District(String districtName, int districtCode,String districtDescription, String activeStatus) {
        this.districtName = districtName;
        this.districtCode = districtCode;
        this.districtDescription = districtDescription;
        this.activeStatus = activeStatus;
    }

    public long getId() {
        return id;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public long getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(long districtCode) {
        this.districtCode = districtCode;
    }

    public String getDistrictDescription() {
        return districtDescription;
    }

    public void setDistrictDescription(String districtDescription) {
        this.districtDescription = districtDescription;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }
}
