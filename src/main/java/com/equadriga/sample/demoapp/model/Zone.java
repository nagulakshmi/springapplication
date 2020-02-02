package com.equadriga.sample.demoapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Zone")
public class Zone {

    @Id
    @GeneratedValue
    private Integer id;

//    @OneToMany(fetch = FetchType.LAZY, targetEntity = Sapling.class)
//    @JoinColumn(referencedColumnName = "zoneId")
//    private List<Sapling> saplingsList;

    @Column(name = "name")
    private String name;

    @Column(name = "wardno")
    private String wardno;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWardno() {
        return wardno;
    }

    public void setWardno(String wardno) {
        this.wardno = wardno;
    }

//    public List<Sapling> getSaplingsList() {
//        return saplingsList;
//    }
//
//    public void setSaplingsList(List<Sapling> saplingsList) {
//        this.saplingsList = saplingsList;
//    }
}
