package com.ifohoo.firm25.ifms.middata.es.secu.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 交易场所表
 * @TableName SECU_EXCHANGE
 */
public class SecuExchange implements Serializable {
    /**
     * 交易场所代码
     */
    private String exchangeCode;

    /**
     * 交易场所简称
     */
    private String exchangeName;

    /**
     * 交易场所全称
     */
    private String exchangeFullname;

    /**
     * 交易场所英文简称
     */
    private String exchangeForeignName;

    /**
     * 交易场所英文全称
     */
    private String exchangeForeignFullname;

    /**
     * 国家地区代码
     */
    private String countryCode;

    /**
     * 交易场所后缀
     */
    private String exchangeSuffixText;

    /**
     * 显示顺序
     */
    private Integer displayOrderNo;

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
     * 交易场所代码
     */
    public String getExchangeCode() {
        return exchangeCode;
    }

    /**
     * 交易场所代码
     */
    public void setExchangeCode(String exchangeCode) {
        this.exchangeCode = exchangeCode;
    }

    /**
     * 交易场所简称
     */
    public String getExchangeName() {
        return exchangeName;
    }

    /**
     * 交易场所简称
     */
    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }

    /**
     * 交易场所全称
     */
    public String getExchangeFullname() {
        return exchangeFullname;
    }

    /**
     * 交易场所全称
     */
    public void setExchangeFullname(String exchangeFullname) {
        this.exchangeFullname = exchangeFullname;
    }

    /**
     * 交易场所英文简称
     */
    public String getExchangeForeignName() {
        return exchangeForeignName;
    }

    /**
     * 交易场所英文简称
     */
    public void setExchangeForeignName(String exchangeForeignName) {
        this.exchangeForeignName = exchangeForeignName;
    }

    /**
     * 交易场所英文全称
     */
    public String getExchangeForeignFullname() {
        return exchangeForeignFullname;
    }

    /**
     * 交易场所英文全称
     */
    public void setExchangeForeignFullname(String exchangeForeignFullname) {
        this.exchangeForeignFullname = exchangeForeignFullname;
    }

    /**
     * 国家地区代码
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 国家地区代码
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * 交易场所后缀
     */
    public String getExchangeSuffixText() {
        return exchangeSuffixText;
    }

    /**
     * 交易场所后缀
     */
    public void setExchangeSuffixText(String exchangeSuffixText) {
        this.exchangeSuffixText = exchangeSuffixText;
    }

    /**
     * 显示顺序
     */
    public Integer getDisplayOrderNo() {
        return displayOrderNo;
    }

    /**
     * 显示顺序
     */
    public void setDisplayOrderNo(Integer displayOrderNo) {
        this.displayOrderNo = displayOrderNo;
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
        SecuExchange other = (SecuExchange) that;
        return (this.getExchangeCode() == null ? other.getExchangeCode() == null : this.getExchangeCode().equals(other.getExchangeCode()))
            && (this.getExchangeName() == null ? other.getExchangeName() == null : this.getExchangeName().equals(other.getExchangeName()))
            && (this.getExchangeFullname() == null ? other.getExchangeFullname() == null : this.getExchangeFullname().equals(other.getExchangeFullname()))
            && (this.getExchangeForeignName() == null ? other.getExchangeForeignName() == null : this.getExchangeForeignName().equals(other.getExchangeForeignName()))
            && (this.getExchangeForeignFullname() == null ? other.getExchangeForeignFullname() == null : this.getExchangeForeignFullname().equals(other.getExchangeForeignFullname()))
            && (this.getCountryCode() == null ? other.getCountryCode() == null : this.getCountryCode().equals(other.getCountryCode()))
            && (this.getExchangeSuffixText() == null ? other.getExchangeSuffixText() == null : this.getExchangeSuffixText().equals(other.getExchangeSuffixText()))
            && (this.getDisplayOrderNo() == null ? other.getDisplayOrderNo() == null : this.getDisplayOrderNo().equals(other.getDisplayOrderNo()))
            && (this.getRowVersionNo() == null ? other.getRowVersionNo() == null : this.getRowVersionNo().equals(other.getRowVersionNo()))
            && (this.getLastOperateStaffCode() == null ? other.getLastOperateStaffCode() == null : this.getLastOperateStaffCode().equals(other.getLastOperateStaffCode()))
            && (this.getLastOperateDatetime() == null ? other.getLastOperateDatetime() == null : this.getLastOperateDatetime().equals(other.getLastOperateDatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getExchangeCode() == null) ? 0 : getExchangeCode().hashCode());
        result = prime * result + ((getExchangeName() == null) ? 0 : getExchangeName().hashCode());
        result = prime * result + ((getExchangeFullname() == null) ? 0 : getExchangeFullname().hashCode());
        result = prime * result + ((getExchangeForeignName() == null) ? 0 : getExchangeForeignName().hashCode());
        result = prime * result + ((getExchangeForeignFullname() == null) ? 0 : getExchangeForeignFullname().hashCode());
        result = prime * result + ((getCountryCode() == null) ? 0 : getCountryCode().hashCode());
        result = prime * result + ((getExchangeSuffixText() == null) ? 0 : getExchangeSuffixText().hashCode());
        result = prime * result + ((getDisplayOrderNo() == null) ? 0 : getDisplayOrderNo().hashCode());
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
        sb.append(", exchangeCode=").append(exchangeCode);
        sb.append(", exchangeName=").append(exchangeName);
        sb.append(", exchangeFullname=").append(exchangeFullname);
        sb.append(", exchangeForeignName=").append(exchangeForeignName);
        sb.append(", exchangeForeignFullname=").append(exchangeForeignFullname);
        sb.append(", countryCode=").append(countryCode);
        sb.append(", exchangeSuffixText=").append(exchangeSuffixText);
        sb.append(", displayOrderNo=").append(displayOrderNo);
        sb.append(", rowVersionNo=").append(rowVersionNo);
        sb.append(", lastOperateStaffCode=").append(lastOperateStaffCode);
        sb.append(", lastOperateDatetime=").append(lastOperateDatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}