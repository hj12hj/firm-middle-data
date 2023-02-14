package com.ifohoo.firm25.ifms.middata.es.secu.domain;



import java.io.Serializable;
import java.util.Date;

/**
 * 交易市场表
 * @TableName SECU_MARKET
 */
public class SecuMarket implements Serializable {
    /**
     * 交易场所代码
     */
    private String exchangeCode;

    /**
     * 交易场所代码
     */
//    @TableId
    private String marketCode;

    /**
     * 交易场所简称
     */
    private String marketName;

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
     * 交易场所代码
     */
    public String getMarketCode() {
        return marketCode;
    }

    /**
     * 交易场所代码
     */
    public void setMarketCode(String marketCode) {
        this.marketCode = marketCode;
    }

    /**
     * 交易场所简称
     */
    public String getMarketName() {
        return marketName;
    }

    /**
     * 交易场所简称
     */
    public void setMarketName(String marketName) {
        this.marketName = marketName;
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
        SecuMarket other = (SecuMarket) that;
        return (this.getExchangeCode() == null ? other.getExchangeCode() == null : this.getExchangeCode().equals(other.getExchangeCode()))
            && (this.getMarketCode() == null ? other.getMarketCode() == null : this.getMarketCode().equals(other.getMarketCode()))
            && (this.getMarketName() == null ? other.getMarketName() == null : this.getMarketName().equals(other.getMarketName()))
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
        result = prime * result + ((getMarketCode() == null) ? 0 : getMarketCode().hashCode());
        result = prime * result + ((getMarketName() == null) ? 0 : getMarketName().hashCode());
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
        sb.append(", marketCode=").append(marketCode);
        sb.append(", marketName=").append(marketName);
        sb.append(", displayOrderNo=").append(displayOrderNo);
        sb.append(", rowVersionNo=").append(rowVersionNo);
        sb.append(", lastOperateStaffCode=").append(lastOperateStaffCode);
        sb.append(", lastOperateDatetime=").append(lastOperateDatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}