package com.example.server.ribbon.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BaseGoodsInfo {
    private Long skuid;

    private String skuname;

    private Short status;

    private String barcode;

    private BigDecimal cid1;

    private String cid1name;

    private BigDecimal cid2;

    private String cid2name;

    private BigDecimal cid3;

    private String cid3name;

    private BigDecimal cid4;

    private String cid4name;

    private Long cid5;

    private String cid5name;

    private Short batchrule;

    private Integer keepdays;

    private Integer warningday;

    private String remark;

    private Short isbuysale;

    private Short isphcard;

    private BigDecimal saletaxrate;

    private BigDecimal originalskuid;

    private String originalcode;

    private String originalname;

    private Short issurplus;

    private String pkbarcodeid;

    private Short isare;

    private Short skunature;

    private Date createtime;

    private Short isdelete;

    private Short isautofreeze;

    private Short ismix;

    private Date renewfreetime;

    private Short classify;

    private Short valuableflag;

    private Short isscan;

    private BigDecimal operatorid;

    private String operatorname;

    private Date modifytime;

    private String spec;

    private String unitname;

    private BigDecimal erpweight;

    private Integer instockdays;

    private Short packproperty;

    private String shopid;

    private Short shelfflag;

    private Integer limitoutdays;

    public Long getSkuid() {
        return skuid;
    }

    public void setSkuid(Long skuid) {
        this.skuid = skuid;
    }

    public String getSkuname() {
        return skuname;
    }

    public void setSkuname(String skuname) {
        this.skuname = skuname == null ? null : skuname.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    public BigDecimal getCid1() {
        return cid1;
    }

    public void setCid1(BigDecimal cid1) {
        this.cid1 = cid1;
    }

    public String getCid1name() {
        return cid1name;
    }

    public void setCid1name(String cid1name) {
        this.cid1name = cid1name == null ? null : cid1name.trim();
    }

    public BigDecimal getCid2() {
        return cid2;
    }

    public void setCid2(BigDecimal cid2) {
        this.cid2 = cid2;
    }

    public String getCid2name() {
        return cid2name;
    }

    public void setCid2name(String cid2name) {
        this.cid2name = cid2name == null ? null : cid2name.trim();
    }

    public BigDecimal getCid3() {
        return cid3;
    }

    public void setCid3(BigDecimal cid3) {
        this.cid3 = cid3;
    }

    public String getCid3name() {
        return cid3name;
    }

    public void setCid3name(String cid3name) {
        this.cid3name = cid3name == null ? null : cid3name.trim();
    }

    public BigDecimal getCid4() {
        return cid4;
    }

    public void setCid4(BigDecimal cid4) {
        this.cid4 = cid4;
    }

    public String getCid4name() {
        return cid4name;
    }

    public void setCid4name(String cid4name) {
        this.cid4name = cid4name == null ? null : cid4name.trim();
    }

    public Long getCid5() {
        return cid5;
    }

    public void setCid5(Long cid5) {
        this.cid5 = cid5;
    }

    public String getCid5name() {
        return cid5name;
    }

    public void setCid5name(String cid5name) {
        this.cid5name = cid5name == null ? null : cid5name.trim();
    }

    public Short getBatchrule() {
        return batchrule;
    }

    public void setBatchrule(Short batchrule) {
        this.batchrule = batchrule;
    }

    public Integer getKeepdays() {
        return keepdays;
    }

    public void setKeepdays(Integer keepdays) {
        this.keepdays = keepdays;
    }

    public Integer getWarningday() {
        return warningday;
    }

    public void setWarningday(Integer warningday) {
        this.warningday = warningday;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Short getIsbuysale() {
        return isbuysale;
    }

    public void setIsbuysale(Short isbuysale) {
        this.isbuysale = isbuysale;
    }

    public Short getIsphcard() {
        return isphcard;
    }

    public void setIsphcard(Short isphcard) {
        this.isphcard = isphcard;
    }

    public BigDecimal getSaletaxrate() {
        return saletaxrate;
    }

    public void setSaletaxrate(BigDecimal saletaxrate) {
        this.saletaxrate = saletaxrate;
    }

    public BigDecimal getOriginalskuid() {
        return originalskuid;
    }

    public void setOriginalskuid(BigDecimal originalskuid) {
        this.originalskuid = originalskuid;
    }

    public String getOriginalcode() {
        return originalcode;
    }

    public void setOriginalcode(String originalcode) {
        this.originalcode = originalcode == null ? null : originalcode.trim();
    }

    public String getOriginalname() {
        return originalname;
    }

    public void setOriginalname(String originalname) {
        this.originalname = originalname == null ? null : originalname.trim();
    }

    public Short getIssurplus() {
        return issurplus;
    }

    public void setIssurplus(Short issurplus) {
        this.issurplus = issurplus;
    }

    public String getPkbarcodeid() {
        return pkbarcodeid;
    }

    public void setPkbarcodeid(String pkbarcodeid) {
        this.pkbarcodeid = pkbarcodeid == null ? null : pkbarcodeid.trim();
    }

    public Short getIsare() {
        return isare;
    }

    public void setIsare(Short isare) {
        this.isare = isare;
    }

    public Short getSkunature() {
        return skunature;
    }

    public void setSkunature(Short skunature) {
        this.skunature = skunature;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Short getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Short isdelete) {
        this.isdelete = isdelete;
    }

    public Short getIsautofreeze() {
        return isautofreeze;
    }

    public void setIsautofreeze(Short isautofreeze) {
        this.isautofreeze = isautofreeze;
    }

    public Short getIsmix() {
        return ismix;
    }

    public void setIsmix(Short ismix) {
        this.ismix = ismix;
    }

    public Date getRenewfreetime() {
        return renewfreetime;
    }

    public void setRenewfreetime(Date renewfreetime) {
        this.renewfreetime = renewfreetime;
    }

    public Short getClassify() {
        return classify;
    }

    public void setClassify(Short classify) {
        this.classify = classify;
    }

    public Short getValuableflag() {
        return valuableflag;
    }

    public void setValuableflag(Short valuableflag) {
        this.valuableflag = valuableflag;
    }

    public Short getIsscan() {
        return isscan;
    }

    public void setIsscan(Short isscan) {
        this.isscan = isscan;
    }

    public BigDecimal getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(BigDecimal operatorid) {
        this.operatorid = operatorid;
    }

    public String getOperatorname() {
        return operatorname;
    }

    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname == null ? null : operatorname.trim();
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname == null ? null : unitname.trim();
    }

    public BigDecimal getErpweight() {
        return erpweight;
    }

    public void setErpweight(BigDecimal erpweight) {
        this.erpweight = erpweight;
    }

    public Integer getInstockdays() {
        return instockdays;
    }

    public void setInstockdays(Integer instockdays) {
        this.instockdays = instockdays;
    }

    public Short getPackproperty() {
        return packproperty;
    }

    public void setPackproperty(Short packproperty) {
        this.packproperty = packproperty;
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }

    public Short getShelfflag() {
        return shelfflag;
    }

    public void setShelfflag(Short shelfflag) {
        this.shelfflag = shelfflag;
    }

    public Integer getLimitoutdays() {
        return limitoutdays;
    }

    public void setLimitoutdays(Integer limitoutdays) {
        this.limitoutdays = limitoutdays;
    }

    @Override
    public String toString() {
        return "BaseGoodsInfo{" +
                "skuid=" + skuid +
                ", skuname='" + skuname + '\'' +
                ", status=" + status +
                ", barcode='" + barcode + '\'' +
                ", cid1=" + cid1 +
                ", cid1name='" + cid1name + '\'' +
                ", cid2=" + cid2 +
                ", cid2name='" + cid2name + '\'' +
                ", cid3=" + cid3 +
                ", cid3name='" + cid3name + '\'' +
                ", cid4=" + cid4 +
                ", cid4name='" + cid4name + '\'' +
                ", cid5=" + cid5 +
                ", cid5name='" + cid5name + '\'' +
                ", batchrule=" + batchrule +
                ", keepdays=" + keepdays +
                ", warningday=" + warningday +
                ", remark='" + remark + '\'' +
                ", isbuysale=" + isbuysale +
                ", isphcard=" + isphcard +
                ", saletaxrate=" + saletaxrate +
                ", originalskuid=" + originalskuid +
                ", originalcode='" + originalcode + '\'' +
                ", originalname='" + originalname + '\'' +
                ", issurplus=" + issurplus +
                ", pkbarcodeid='" + pkbarcodeid + '\'' +
                ", isare=" + isare +
                ", skunature=" + skunature +
                ", createtime=" + createtime +
                ", isdelete=" + isdelete +
                ", isautofreeze=" + isautofreeze +
                ", ismix=" + ismix +
                ", renewfreetime=" + renewfreetime +
                ", classify=" + classify +
                ", valuableflag=" + valuableflag +
                ", isscan=" + isscan +
                ", operatorid=" + operatorid +
                ", operatorname='" + operatorname + '\'' +
                ", modifytime=" + modifytime +
                ", spec='" + spec + '\'' +
                ", unitname='" + unitname + '\'' +
                ", erpweight=" + erpweight +
                ", instockdays=" + instockdays +
                ", packproperty=" + packproperty +
                ", shopid='" + shopid + '\'' +
                ", shelfflag=" + shelfflag +
                ", limitoutdays=" + limitoutdays +
                '}';
    }
}