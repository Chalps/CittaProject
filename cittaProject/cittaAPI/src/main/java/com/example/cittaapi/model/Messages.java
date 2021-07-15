package com.example.cittaapi.model;

public class Messages {
    private String text;
    private Long ts;
    private Integer companyId;
    private String companyType;
    private String companyName;

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public Long getTs() {
        return ts;
    }
    public void setTs(Long ts) {
        this.ts = ts;
    }
    public Integer getCompanyId() {
        return companyId;
    }
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
    public String getCompanyType() {
        return companyType;
    }
    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
