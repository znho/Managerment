package com.gdaib.pojo;

public class V_Ugom {
    private Integer ugomId;

    private Integer accountId;

    private Integer beAccoId;

    private String module;

    private String operate;

    public Integer getUgomId() {
        return ugomId;
    }

    public void setUgomId(Integer ugomId) {
        this.ugomId = ugomId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getBeAccoId() {
        return beAccoId;
    }

    public void setBeAccoId(Integer beAccoId) {
        this.beAccoId = beAccoId;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module == null ? null : module.trim();
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate == null ? null : operate.trim();
    }
}