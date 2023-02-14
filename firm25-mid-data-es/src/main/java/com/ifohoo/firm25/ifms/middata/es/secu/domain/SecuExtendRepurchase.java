package com.ifohoo.firm25.ifms.middata.es.secu.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 回购参数表
 * @TableName SECU_EXTEND_REPURCHASE
 */
public class SecuExtendRepurchase implements Serializable {
    /**
     * 证券代码
     */
    private String secuGlobalCode;

    /**
     * 回购期限
     */
    private Integer stdDaysCount;

    /**
     * 年计息天数
     */
    private Integer yearDaysCount;

    /**
     * 质押物处置方式
     */
    private String collateralDealTypeCode;

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
     * 回购期限
     */
    public Integer getStdDaysCount() {
        return stdDaysCount;
    }

    /**
     * 回购期限
     */
    public void setStdDaysCount(Integer stdDaysCount) {
        this.stdDaysCount = stdDaysCount;
    }

    /**
     * 年计息天数
     */
    public Integer getYearDaysCount() {
        return yearDaysCount;
    }

    /**
     * 年计息天数
     */
    public void setYearDaysCount(Integer yearDaysCount) {
        this.yearDaysCount = yearDaysCount;
    }

    /**
     * 质押物处置方式
     */
    public String getCollateralDealTypeCode() {
        return collateralDealTypeCode;
    }

    /**
     * 质押物处置方式
     */
    public void setCollateralDealTypeCode(String collateralDealTypeCode) {
        this.collateralDealTypeCode = collateralDealTypeCode;
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
        SecuExtendRepurchase other = (SecuExtendRepurchase) that;
        return (this.getSecuGlobalCode() == null ? other.getSecuGlobalCode() == null : this.getSecuGlobalCode().equals(other.getSecuGlobalCode()))
            && (this.getStdDaysCount() == null ? other.getStdDaysCount() == null : this.getStdDaysCount().equals(other.getStdDaysCount()))
            && (this.getYearDaysCount() == null ? other.getYearDaysCount() == null : this.getYearDaysCount().equals(other.getYearDaysCount()))
            && (this.getCollateralDealTypeCode() == null ? other.getCollateralDealTypeCode() == null : this.getCollateralDealTypeCode().equals(other.getCollateralDealTypeCode()))
            && (this.getRowVersionNo() == null ? other.getRowVersionNo() == null : this.getRowVersionNo().equals(other.getRowVersionNo()))
            && (this.getLastOperateStaffCode() == null ? other.getLastOperateStaffCode() == null : this.getLastOperateStaffCode().equals(other.getLastOperateStaffCode()))
            && (this.getLastOperateDatetime() == null ? other.getLastOperateDatetime() == null : this.getLastOperateDatetime().equals(other.getLastOperateDatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSecuGlobalCode() == null) ? 0 : getSecuGlobalCode().hashCode());
        result = prime * result + ((getStdDaysCount() == null) ? 0 : getStdDaysCount().hashCode());
        result = prime * result + ((getYearDaysCount() == null) ? 0 : getYearDaysCount().hashCode());
        result = prime * result + ((getCollateralDealTypeCode() == null) ? 0 : getCollateralDealTypeCode().hashCode());
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
        sb.append(", secuGlobalCode=").append(secuGlobalCode);
        sb.append(", stdDaysCount=").append(stdDaysCount);
        sb.append(", yearDaysCount=").append(yearDaysCount);
        sb.append(", collateralDealTypeCode=").append(collateralDealTypeCode);
        sb.append(", rowVersionNo=").append(rowVersionNo);
        sb.append(", lastOperateStaffCode=").append(lastOperateStaffCode);
        sb.append(", lastOperateDatetime=").append(lastOperateDatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}