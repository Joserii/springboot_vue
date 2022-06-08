package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "fund")
public class Fund {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "f_id")
    private String fid;
    @Column(name = "f_name")
    private String name;
    @Column(name = "f_type")
    private String ftype;
    @Column(name = "f_amount")
    private int famount;
    @Column(name = "risk_level")
    private String riskLevel;
    @Column(name = "f_manager")
    private String fmanager;
    @Column(name = "f_level")
    private String flevel;
    @Column(name = "create_time")
    private String createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFtype() {
        return ftype;
    }

    public void setFtype(String ftype) {
        this.ftype = ftype;
    }

    public int getFamount() {
        return famount;
    }

    public void setFamount(int famount) {
        this.famount = famount;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getFmanager() {
        return fmanager;
    }

    public void setFmanager(String fmanager) {
        this.fmanager = fmanager;
    }

    public String getFlevel() {
        return flevel;
    }

    public void setFlevel(String flevel) {
        this.flevel = flevel;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
