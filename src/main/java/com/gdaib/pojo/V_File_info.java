package com.gdaib.pojo;

import java.util.Date;

public class V_File_info {
    private Integer accountId;

    private Integer fileInfoId;

    private Integer departmentId;

    private String department;

    private Integer nFirstId;

    private String nFirst;

    private Integer nSecId;

    private String nSec;

    private String name;

    private String title;

    private Date upTime;

    private String path;

    private String actionCode;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getFileInfoId() {
        return fileInfoId;
    }

    public void setFileInfoId(Integer fileInfoId) {
        this.fileInfoId = fileInfoId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public Integer getnFirstId() {
        return nFirstId;
    }

    public void setnFirstId(Integer nFirstId) {
        this.nFirstId = nFirstId;
    }

    public String getnFirst() {
        return nFirst;
    }

    public void setnFirst(String nFirst) {
        this.nFirst = nFirst == null ? null : nFirst.trim();
    }

    public Integer getnSecId() {
        return nSecId;
    }

    public void setnSecId(Integer nSecId) {
        this.nSecId = nSecId;
    }

    public String getnSec() {
        return nSec;
    }

    public void setnSec(String nSec) {
        this.nSec = nSec == null ? null : nSec.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getUpTime() {
        return upTime;
    }

    public void setUpTime(Date upTime) {
        this.upTime = upTime;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getActionCode() {
        return actionCode;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode == null ? null : actionCode.trim();
    }
}