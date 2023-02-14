package com.ifohoo.firm25.ifms.middata.es.corp.domain;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 企业资产状况明细信息表
 * @TableName CORP_ASSET_DETAIL
 */
public class CorpAssetDetail implements Serializable {
    /**
     * 企业资产记录的唯一编号
     */
    private Long assetNo;

    /**
     * 项目代码
     */
    private String assetItemCode;

    /**
     * 项目值
     */
    private BigDecimal assetItemValue;

    /**
     * 行的版本号
     */
    private Integer rowVersionNo;

    /**
     * 最后操作人
     */
    private String lastOperateStaffCode;

    /**
     * 最后操作日期\时间
     */
    private Date lastOperateDatetime;

    private static final long serialVersionUID = 1L;

    /**
     * 企业资产记录的唯一编号
     */
    public Long getAssetNo() {
        return assetNo;
    }

    /**
     * 企业资产记录的唯一编号
     */
    public void setAssetNo(Long assetNo) {
        this.assetNo = assetNo;
    }

    /**
     * 项目代码
     */
    public String getAssetItemCode() {
        return assetItemCode;
    }

    /**
     * 项目代码
     */
    public void setAssetItemCode(String assetItemCode) {
        this.assetItemCode = assetItemCode;
    }

    /**
     * 项目值
     */
    public BigDecimal getAssetItemValue() {
        return assetItemValue;
    }

    /**
     * 项目值
     */
    public void setAssetItemValue(BigDecimal assetItemValue) {
        this.assetItemValue = assetItemValue;
    }

    /**
     * 行的版本号
     */
    public Integer getRowVersionNo() {
        return rowVersionNo;
    }

    /**
     * 行的版本号
     */
    public void setRowVersionNo(Integer rowVersionNo) {
        this.rowVersionNo = rowVersionNo;
    }

    /**
     * 最后操作人
     */
    public String getLastOperateStaffCode() {
        return lastOperateStaffCode;
    }

    /**
     * 最后操作人
     */
    public void setLastOperateStaffCode(String lastOperateStaffCode) {
        this.lastOperateStaffCode = lastOperateStaffCode;
    }

    /**
     * 最后操作日期\时间
     */
    public Date getLastOperateDatetime() {
        return lastOperateDatetime;
    }

    /**
     * 最后操作日期\时间
     */
    public void setLastOperateDatetime(Date lastOperateDatetime) {
        this.lastOperateDatetime = lastOperateDatetime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CorpAssetDetail other = (CorpAssetDetail) that;
        return (this.getAssetNo() == null ? other.getAssetNo() == null : this.getAssetNo().equals(other.getAssetNo()))
            && (this.getAssetItemCode() == null ? other.getAssetItemCode() == null : this.getAssetItemCode().equals(other.getAssetItemCode()))
            && (this.getAssetItemValue() == null ? other.getAssetItemValue() == null : this.getAssetItemValue().equals(other.getAssetItemValue()))
            && (this.getRowVersionNo() == null ? other.getRowVersionNo() == null : this.getRowVersionNo().equals(other.getRowVersionNo()))
            && (this.getLastOperateStaffCode() == null ? other.getLastOperateStaffCode() == null : this.getLastOperateStaffCode().equals(other.getLastOperateStaffCode()))
            && (this.getLastOperateDatetime() == null ? other.getLastOperateDatetime() == null : this.getLastOperateDatetime().equals(other.getLastOperateDatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAssetNo() == null) ? 0 : getAssetNo().hashCode());
        result = prime * result + ((getAssetItemCode() == null) ? 0 : getAssetItemCode().hashCode());
        result = prime * result + ((getAssetItemValue() == null) ? 0 : getAssetItemValue().hashCode());
        result = prime * result + ((getRowVersionNo() == null) ? 0 : getRowVersionNo().hashCode());
        result = prime * result + ((getLastOperateStaffCode() == null) ? 0 : getLastOperateStaffCode().hashCode());
        result = prime * result + ((getLastOperateDatetime() == null) ? 0 : getLastOperateDatetime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", assetNo=").append(assetNo);
        sb.append(", assetItemCode=").append(assetItemCode);
        sb.append(", assetItemValue=").append(assetItemValue);
        sb.append(", rowVersionNo=").append(rowVersionNo);
        sb.append(", lastOperateStaffCode=").append(lastOperateStaffCode);
        sb.append(", lastOperateDatetime=").append(lastOperateDatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}