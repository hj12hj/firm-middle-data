package com.ifohoo.firm25.ifms.middata.core.secu.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 利率信息表
 * @TableName SECU_INTEREST_RATE
 */
@TableName(value ="SECU_INTEREST_RATE")
public class SecuInterestRate implements Serializable {
    /**
     * 记录唯一编号
     */
    @TableId
    private Long interestRateNo;

    /**
     * 发生日期
     */
    private String occurDate;

    /**
     * 证券代码
     */
    private String secuGlobalCode;

    /**
     * 利率
     */
    private BigDecimal interestRate;

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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 记录唯一编号
     */
    public Long getInterestRateNo() {
        return interestRateNo;
    }

    /**
     * 记录唯一编号
     */
    public void setInterestRateNo(Long interestRateNo) {
        this.interestRateNo = interestRateNo;
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
     * 利率
     */
    public BigDecimal getInterestRate() {
        return interestRate;
    }

    /**
     * 利率
     */
    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
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
        SecuInterestRate other = (SecuInterestRate) that;
        return (this.getInterestRateNo() == null ? other.getInterestRateNo() == null : this.getInterestRateNo().equals(other.getInterestRateNo()))
            && (this.getOccurDate() == null ? other.getOccurDate() == null : this.getOccurDate().equals(other.getOccurDate()))
            && (this.getSecuGlobalCode() == null ? other.getSecuGlobalCode() == null : this.getSecuGlobalCode().equals(other.getSecuGlobalCode()))
            && (this.getInterestRate() == null ? other.getInterestRate() == null : this.getInterestRate().equals(other.getInterestRate()))
            && (this.getRowVersionNo() == null ? other.getRowVersionNo() == null : this.getRowVersionNo().equals(other.getRowVersionNo()))
            && (this.getLastOperateStaffCode() == null ? other.getLastOperateStaffCode() == null : this.getLastOperateStaffCode().equals(other.getLastOperateStaffCode()))
            && (this.getLastOperateDatetime() == null ? other.getLastOperateDatetime() == null : this.getLastOperateDatetime().equals(other.getLastOperateDatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInterestRateNo() == null) ? 0 : getInterestRateNo().hashCode());
        result = prime * result + ((getOccurDate() == null) ? 0 : getOccurDate().hashCode());
        result = prime * result + ((getSecuGlobalCode() == null) ? 0 : getSecuGlobalCode().hashCode());
        result = prime * result + ((getInterestRate() == null) ? 0 : getInterestRate().hashCode());
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
        sb.append(", interestRateNo=").append(interestRateNo);
        sb.append(", occurDate=").append(occurDate);
        sb.append(", secuGlobalCode=").append(secuGlobalCode);
        sb.append(", interestRate=").append(interestRate);
        sb.append(", rowVersionNo=").append(rowVersionNo);
        sb.append(", lastOperateStaffCode=").append(lastOperateStaffCode);
        sb.append(", lastOperateDatetime=").append(lastOperateDatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}