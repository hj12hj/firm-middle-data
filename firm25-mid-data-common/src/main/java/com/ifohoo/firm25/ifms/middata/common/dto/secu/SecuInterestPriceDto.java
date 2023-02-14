package com.ifohoo.firm25.ifms.middata.common.dto.secu;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 债券百元利息表(系统自行计算)表
 * @TableName SECU_INTEREST_PRICE
 */

public class SecuInterestPriceDto implements Serializable {
    /**
     * 记录唯一编号
     */

    private Long interestPriceNo;

    /**
     * 发生日期
     */
    private String occurDate;

    /**
     * 证券代码
     */
    private String secuGlobalCode;

    /**
     * 百元利息
     */
    private BigDecimal interestPrice;

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
     * 记录唯一编号
     */
    public Long getInterestPriceNo() {
        return interestPriceNo;
    }

    /**
     * 记录唯一编号
     */
    public void setInterestPriceNo(Long interestPriceNo) {
        this.interestPriceNo = interestPriceNo;
    }

    /**
     * 发生日期
     */
    public String getOccurDate() {
        return occurDate;
    }

    /**
     * 发生日期
     */
    public void setOccurDate(String occurDate) {
        this.occurDate = occurDate;
    }

    /**
     * 证券代码
     */
    public String getSecuGlobalCode() {
        return secuGlobalCode;
    }

    /**
     * 证券代码
     */
    public void setSecuGlobalCode(String secuGlobalCode) {
        this.secuGlobalCode = secuGlobalCode;
    }

    /**
     * 百元利息
     */
    public BigDecimal getInterestPrice() {
        return interestPrice;
    }

    /**
     * 百元利息
     */
    public void setInterestPrice(BigDecimal interestPrice) {
        this.interestPrice = interestPrice;
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
        SecuInterestPriceDto other = (SecuInterestPriceDto) that;
        return (this.getInterestPriceNo() == null ? other.getInterestPriceNo() == null : this.getInterestPriceNo().equals(other.getInterestPriceNo()))
            && (this.getOccurDate() == null ? other.getOccurDate() == null : this.getOccurDate().equals(other.getOccurDate()))
            && (this.getSecuGlobalCode() == null ? other.getSecuGlobalCode() == null : this.getSecuGlobalCode().equals(other.getSecuGlobalCode()))
            && (this.getInterestPrice() == null ? other.getInterestPrice() == null : this.getInterestPrice().equals(other.getInterestPrice()))
            && (this.getRowVersionNo() == null ? other.getRowVersionNo() == null : this.getRowVersionNo().equals(other.getRowVersionNo()))
            && (this.getLastOperateStaffCode() == null ? other.getLastOperateStaffCode() == null : this.getLastOperateStaffCode().equals(other.getLastOperateStaffCode()))
            && (this.getLastOperateDatetime() == null ? other.getLastOperateDatetime() == null : this.getLastOperateDatetime().equals(other.getLastOperateDatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInterestPriceNo() == null) ? 0 : getInterestPriceNo().hashCode());
        result = prime * result + ((getOccurDate() == null) ? 0 : getOccurDate().hashCode());
        result = prime * result + ((getSecuGlobalCode() == null) ? 0 : getSecuGlobalCode().hashCode());
        result = prime * result + ((getInterestPrice() == null) ? 0 : getInterestPrice().hashCode());
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
        sb.append(", interestPriceNo=").append(interestPriceNo);
        sb.append(", occurDate=").append(occurDate);
        sb.append(", secuGlobalCode=").append(secuGlobalCode);
        sb.append(", interestPrice=").append(interestPrice);
        sb.append(", rowVersionNo=").append(rowVersionNo);
        sb.append(", lastOperateStaffCode=").append(lastOperateStaffCode);
        sb.append(", lastOperateDatetime=").append(lastOperateDatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}