package com.Project.ServiceManagement.master.MakeMaster.Domain;

import javax.persistence.*;

@Entity
@Table(name = "make_master")
public class MakeMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String makeCode;
    private String makeName;
    private String makeDescription;

    public MakeMaster() {
    }

    public MakeMaster(int id, String makeCode, String makeName, String makeDescription) {
        this.id = id;
        this.makeCode = makeCode;
        this.makeName = makeName;
        this.makeDescription = makeDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMakeCode() {
        return makeCode;
    }

    public void setMakeCode(String makeCode) {
        this.makeCode = makeCode;
    }

    public String getMakeName() {
        return makeName;
    }

    public void setMakeName(String makeName) {
        this.makeName = makeName;
    }

    public String getMakeDescription() {
        return makeDescription;
    }

    public void setMakeDescription(String makeDescription) {
        this.makeDescription = makeDescription;
    }

}
