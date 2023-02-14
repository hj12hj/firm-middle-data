package com.ifohoo.firm25.ifms.middata.common.dto.secu;

import java.io.Serializable;
import java.util.Date;

/**
 * 理财参数表
 * @TableName SECU_EXTEND_FINANCE
 */

public class SecuExtendFinanceDto implements Serializable {
    /**
     * 证券代码
     */

    private String secuGlobalCode;

    /**
     * 运作方式(开放式,封闭式)
     */
    private String operateTypeCode;

    /**
     * 投资对象(股票型,债券型,货币型,混合型)
     */
    private String investObjectTypeCode;

    /**
     * 投资策略(主动型,被动型)
     */
    private String investStrategyTypeCode;

    /**
     * 投资地域(境内,港澳台,国内,国外)
     */
    private String investAreaTypeCode;

    /**
     * 募集方式(公募,私募)
     */
    private String raiseTypeCode;

    /**
     * 募集开始日期
     */
    private String raiseStartDate;

    /**
     * 募集结束日期
     */
    private String raiseEndDate;

    /**
     * 投资范围
     */
    private String investScopeText;

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
     * 运作方式(开放式,封闭式)
     */
    public String getOperateTypeCode() {
        return operateTypeCode;
    }

    /**
     * 运作方式(开放式,封闭式)
     */
    public void setOperateTypeCode(String operateTypeCode) {
        this.operateTypeCode = operateTypeCode;
    }

    /**
     * 投资对象(股票型,债券型,货币型,混合型)
     */
    public String getInvestObjectTypeCode() {
        return investObjectTypeCode;
    }

    /**
     * 投资对象(股票型,债券型,货币型,混合型)
     */
    public void setInvestObjectTypeCode(String investObjectTypeCode) {
        this.investObjectTypeCode = investObjectTypeCode;
    }

    /**
     * 投资策略(主动型,被动型)
     */
    public String getInvestStrategyTypeCode() {
        return investStrategyTypeCode;
    }

    /**
     * 投资策略(主动型,被动型)
     */
    public void setInvestStrategyTypeCode(String investStrategyTypeCode) {
        this.investStrategyTypeCode = investStrategyTypeCode;
    }

    /**
     * 投资地域(境内,港澳台,国内,国外)
     */
    public String getInvestAreaTypeCode() {
        return investAreaTypeCode;
    }

    /**
     * 投资地域(境内,港澳台,国内,国外)
     */
    public void setInvestAreaTypeCode(String investAreaTypeCode) {
        this.investAreaTypeCode = investAreaTypeCode;
    }

    /**
     * 募集方式(公募,私募)
     */
    public String getRaiseTypeCode() {
        return raiseTypeCode;
    }

    /**
     * 募集方式(公募,私募)
     */
    public void setRaiseTypeCode(String raiseTypeCode) {
        this.raiseTypeCode = raiseTypeCode;
    }

    /**
     * 募集开始日期
     */
    public String getRaiseStartDate() {
        return raiseStartDate;
    }

    /**
     * 募集开始日期
     */
    public void setRaiseStartDate(String raiseStartDate) {
        this.raiseStartDate = raiseStartDate;
    }

    /**
     * 募集结束日期
     */
    public String getRaiseEndDate() {
        return raiseEndDate;
    }

    /**
     * 募集结束日期
     */
    public void setRaiseEndDate(String raiseEndDate) {
        this.raiseEndDate = raiseEndDate;
    }

    /**
     * 投资范围
     */
    public String getInvestScopeText() {
        return investScopeText;
    }

    /**
     * 投资范围
     */
    public void setInvestScopeText(String investScopeText) {
        this.investScopeText = investScopeText;
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
        SecuExtendFinanceDto other = (SecuExtendFinanceDto) that;
        return (this.getSecuGlobalCode() == null ? other.getSecuGlobalCode() == null : this.getSecuGlobalCode().equals(other.getSecuGlobalCode()))
            && (this.getOperateTypeCode() == null ? other.getOperateTypeCode() == null : this.getOperateTypeCode().equals(other.getOperateTypeCode()))
            && (this.getInvestObjectTypeCode() == null ? other.getInvestObjectTypeCode() == null : this.getInvestObjectTypeCode().equals(other.getInvestObjectTypeCode()))
            && (this.getInvestStrategyTypeCode() == null ? other.getInvestStrategyTypeCode() == null : this.getInvestStrategyTypeCode().equals(other.getInvestStrategyTypeCode()))
            && (this.getInvestAreaTypeCode() == null ? other.getInvestAreaTypeCode() == null : this.getInvestAreaTypeCode().equals(other.getInvestAreaTypeCode()))
            && (this.getRaiseTypeCode() == null ? other.getRaiseTypeCode() == null : this.getRaiseTypeCode().equals(other.getRaiseTypeCode()))
            && (this.getRaiseStartDate() == null ? other.getRaiseStartDate() == null : this.getRaiseStartDate().equals(other.getRaiseStartDate()))
            && (this.getRaiseEndDate() == null ? other.getRaiseEndDate() == null : this.getRaiseEndDate().equals(other.getRaiseEndDate()))
            && (this.getInvestScopeText() == null ? other.getInvestScopeText() == null : this.getInvestScopeText().equals(other.getInvestScopeText()))
            && (this.getRowVersionNo() == null ? other.getRowVersionNo() == null : this.getRowVersionNo().equals(other.getRowVersionNo()))
            && (this.getLastOperateStaffCode() == null ? other.getLastOperateStaffCode() == null : this.getLastOperateStaffCode().equals(other.getLastOperateStaffCode()))
            && (this.getLastOperateDatetime() == null ? other.getLastOperateDatetime() == null : this.getLastOperateDatetime().equals(other.getLastOperateDatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSecuGlobalCode() == null) ? 0 : getSecuGlobalCode().hashCode());
        result = prime * result + ((getOperateTypeCode() == null) ? 0 : getOperateTypeCode().hashCode());
        result = prime * result + ((getInvestObjectTypeCode() == null) ? 0 : getInvestObjectTypeCode().hashCode());
        result = prime * result + ((getInvestStrategyTypeCode() == null) ? 0 : getInvestStrategyTypeCode().hashCode());
        result = prime * result + ((getInvestAreaTypeCode() == null) ? 0 : getInvestAreaTypeCode().hashCode());
        result = prime * result + ((getRaiseTypeCode() == null) ? 0 : getRaiseTypeCode().hashCode());
        result = prime * result + ((getRaiseStartDate() == null) ? 0 : getRaiseStartDate().hashCode());
        result = prime * result + ((getRaiseEndDate() == null) ? 0 : getRaiseEndDate().hashCode());
        result = prime * result + ((getInvestScopeText() == null) ? 0 : getInvestScopeText().hashCode());
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
        sb.append(", operateTypeCode=").append(operateTypeCode);
        sb.append(", investObjectTypeCode=").append(investObjectTypeCode);
        sb.append(", investStrategyTypeCode=").append(investStrategyTypeCode);
        sb.append(", investAreaTypeCode=").append(investAreaTypeCode);
        sb.append(", raiseTypeCode=").append(raiseTypeCode);
        sb.append(", raiseStartDate=").append(raiseStartDate);
        sb.append(", raiseEndDate=").append(raiseEndDate);
        sb.append(", investScopeText=").append(investScopeText);
        sb.append(", rowVersionNo=").append(rowVersionNo);
        sb.append(", lastOperateStaffCode=").append(lastOperateStaffCode);
        sb.append(", lastOperateDatetime=").append(lastOperateDatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}