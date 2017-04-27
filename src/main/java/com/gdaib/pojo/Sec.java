package com.gdaib.pojo;

public class Sec {
    private Integer id;

    private String nSec;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getnSec() {
        return nSec;
    }

    public void setnSec(String nSec) {
        this.nSec = nSec == null ? null : nSec.trim();
    }
}