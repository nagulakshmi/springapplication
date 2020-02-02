package com.equadriga.sample.demoapp.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "sapling_center")
public class Sapling {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private  int id;

    @ManyToOne(fetch =  FetchType.LAZY,targetEntity = Zone.class)
    @JoinColumn(name = "zone_id", referencedColumnName = "id")
    private Zone zoneId;

    @Column(name = "center_name")
    private  String  centerName;

    @Column(name = "created_date")
    private Date createdDate;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Zone getZoneId() {
        return zoneId;
    }

    public void setZoneId(Zone zoneId) {
        this.zoneId = zoneId;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
