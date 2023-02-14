package com.ifohoo.firm25.ifms.middata.common.dto.secu;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 债券参数表
 * @TableName SECU_EXTEND_BOND
 */

public class SecuExtendBondDto implements Serializable {
    /**
     * 证券代码
     */

    private String secuGlobalCode;

    /**
     * 发行人类别标识(约等于DB?中的?)
     */
    private String issuerCategoryCode;

    /**
     * 发行人境内境外标识
     */
    private String issuerLocalFlagCode;

    /**
     * 债券信用等级(C=信用债,R=利率债)
     */
    private String bondCreditFlagCode;

    /**
     * 发行方式(O=公开,P=非公开)
     */
    private String issueTypeCode;

    /**
     * 债券形态
     */
    private String bondFormFlagCode;

    /**
     * 利率类型(F=固定,T=浮动)
     */
    private String interestRateTypeCode;

    /**
     * 票面利率
     */
    private BigDecimal couponRate;

    /**
     * 利息计算方式(单利,复利)
     */
    private String interestCalcTypeCode;

    /**
     * 年计息天数
     */
    private String interestDaysBasedCode;

    /**
     * 起息日
     */
    private String interestStartDate;

    /**
     * 到期日
     */
    private String interestEndDate;

    /**
     * 兑付日期
     */
    private String foreCashDate;

    /**
     * 付息方式
     */
    private String interestPayTypeCode;

    /**
     * 付息频率
     */
    private String interestPayFreqCode;

    /**
     * 付息日期（格式：MM-DD;MM-DD）
     */
    private String interestPayDates;

    /**
     * 对应原债券代码
     */
    private String origSecuGlobalCode;

    /**
     * 债权债务登记日
     */
    private String creditDebtDate;

    /**
     * 资金用途
     */
    private String fundsUseText;

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
     * 发行人类别标识(约等于DB?中的?)
     */
    public String getIssuerCategoryCode() {
        return issuerCategoryCode;
    }

    /**
     * 发行人类别标识(约等于DB?中的?)
     */
    public void setIssuerCategoryCode(String issuerCategoryCode) {
        this.issuerCategoryCode = issuerCategoryCode;
    }

    /**
     * 发行人境内境外标识
     */
    public String getIssuerLocalFlagCode() {
        return issuerLocalFlagCode;
    }

    /**
     * 发行人境内境外标识
     */
    public void setIssuerLocalFlagCode(String issuerLocalFlagCode) {
        this.issuerLocalFlagCode = issuerLocalFlagCode;
    }

    /**
     * 债券信用等级(C=信用债,R=利率债)
     */
    public String getBondCreditFlagCode() {
        return bondCreditFlagCode;
    }

    /**
     * 债券信用等级(C=信用债,R=利率债)
     */
    public void setBondCreditFlagCode(String bondCreditFlagCode) {
        this.bondCreditFlagCode = bondCreditFlagCode;
    }

    /**
     * 发行方式(O=公开,P=非公开)
     */
    public String getIssueTypeCode() {
        return issueTypeCode;
    }

    /**
     * 发行方式(O=公开,P=非公开)
     */
    public void setIssueTypeCode(String issueTypeCode) {
        this.issueTypeCode = issueTypeCode;
    }

    /**
     * 债券形态
     */
    public String getBondFormFlagCode() {
        return bondFormFlagCode;
    }

    /**
     * 债券形态
     */
    public void setBondFormFlagCode(String bondFormFlagCode) {
        this.bondFormFlagCode = bondFormFlagCode;
    }

    /**
     * 利率类型(F=固定,T=浮动)
     */
    public String getInterestRateTypeCode() {
        return interestRateTypeCode;
    }

    /**
     * 利率类型(F=固定,T=浮动)
     */
    public void setInterestRateTypeCode(String interestRateTypeCode) {
        this.interestRateTypeCode = interestRateTypeCode;
    }

    /**
     * 票面利率
     */
    public BigDecimal getCouponRate() {
        return couponRate;
    }

    /**
     * 票面利率
     */
    public void setCouponRate(BigDecimal couponRate) {
        this.couponRate = couponRate;
    }

    /**
     * 利息计算方式(单利,复利)
     */
    public String getInterestCalcTypeCode() {
        return interestCalcTypeCode;
    }

    /**
     * 利息计算方式(单利,复利)
     */
    public void setInterestCalcTypeCode(String interestCalcTypeCode) {
        this.interestCalcTypeCode = interestCalcTypeCode;
    }

    /**
     * 年计息天数
     */
    public String getInterestDaysBasedCode() {
        return interestDaysBasedCode;
    }

    /**
     * 年计息天数
     */
    public void setInterestDaysBasedCode(String interestDaysBasedCode) {
        this.interestDaysBasedCode = interestDaysBasedCode;
    }

    /**
     * 起息日
     */
    public String getInterestStartDate() {
        return interestStartDate;
    }

    /**
     * 起息日
     */
    public void setInterestStartDate(String interestStartDate) {
        this.interestStartDate = interestStartDate;
    }

    /**
     * 到期日
     */
    public String getInterestEndDate() {
        return interestEndDate;
    }

    /**
     * 到期日
     */
    public void setInterestEndDate(String interestEndDate) {
        this.interestEndDate = interestEndDate;
    }

    /**
     * 兑付日期
     */
    public String getForeCashDate() {
        return foreCashDate;
    }

    /**
     * 兑付日期
     */
    public void setForeCashDate(String foreCashDate) {
        this.foreCashDate = foreCashDate;
    }

    /**
     * 付息方式
     */
    public String getInterestPayTypeCode() {
        return interestPayTypeCode;
    }

    /**
     * 付息方式
     */
    public void setInterestPayTypeCode(String interestPayTypeCode) {
        this.interestPayTypeCode = interestPayTypeCode;
    }

    /**
     * 付息频率
     */
    public String getInterestPayFreqCode() {
        return interestPayFreqCode;
    }

    /**
     * 付息频率
     */
    public void setInterestPayFreqCode(String interestPayFreqCode) {
        this.interestPayFreqCode = interestPayFreqCode;
    }

    /**
     * 付息日期（格式：MM-DD;MM-DD）
     */
    public String getInterestPayDates() {
        return interestPayDates;
    }

    /**
     * 付息日期（格式：MM-DD;MM-DD）
     */
    public void setInterestPayDates(String interestPayDates) {
        this.interestPayDates = interestPayDates;
    }

    /**
     * 对应原债券代码
     */
    public String getOrigSecuGlobalCode() {
        return origSecuGlobalCode;
    }

    /**
     * 对应原债券代码
     */
    public void setOrigSecuGlobalCode(String origSecuGlobalCode) {
        this.origSecuGlobalCode = origSecuGlobalCode;
    }

    /**
     * 债权债务登记日
     */
    public String getCreditDebtDate() {
        return creditDebtDate;
    }

    /**
     * 债权债务登记日
     */
    public void setCreditDebtDate(String creditDebtDate) {
        this.creditDebtDate = creditDebtDate;
    }

    /**
     * 资金用途
     */
    public String getFundsUseText() {
        return fundsUseText;
    }

    /**
     * 资金用途
     */
    public void setFundsUseText(String fundsUseText) {
        this.fundsUseText = fundsUseText;
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
        SecuExtendBondDto other = (SecuExtendBondDto) that;
        return (this.getSecuGlobalCode() == null ? other.getSecuGlobalCode() == null : this.getSecuGlobalCode().equals(other.getSecuGlobalCode()))
            && (this.getIssuerCategoryCode() == null ? other.getIssuerCategoryCode() == null : this.getIssuerCategoryCode().equals(other.getIssuerCategoryCode()))
            && (this.getIssuerLocalFlagCode() == null ? other.getIssuerLocalFlagCode() == null : this.getIssuerLocalFlagCode().equals(other.getIssuerLocalFlagCode()))
            && (this.getBondCreditFlagCode() == null ? other.getBondCreditFlagCode() == null : this.getBondCreditFlagCode().equals(other.getBondCreditFlagCode()))
            && (this.getIssueTypeCode() == null ? other.getIssueTypeCode() == null : this.getIssueTypeCode().equals(other.getIssueTypeCode()))
            && (this.getBondFormFlagCode() == null ? other.getBondFormFlagCode() == null : this.getBondFormFlagCode().equals(other.getBondFormFlagCode()))
            && (this.getInterestRateTypeCode() == null ? other.getInterestRateTypeCode() == null : this.getInterestRateTypeCode().equals(other.getInterestRateTypeCode()))
            && (this.getCouponRate() == null ? other.getCouponRate() == null : this.getCouponRate().equals(other.getCouponRate()))
            && (this.getInterestCalcTypeCode() == null ? other.getInterestCalcTypeCode() == null : this.getInterestCalcTypeCode().equals(other.getInterestCalcTypeCode()))
            && (this.getInterestDaysBasedCode() == null ? other.getInterestDaysBasedCode() == null : this.getInterestDaysBasedCode().equals(other.getInterestDaysBasedCode()))
            && (this.getInterestStartDate() == null ? other.getInterestStartDate() == null : this.getInterestStartDate().equals(other.getInterestStartDate()))
            && (this.getInterestEndDate() == null ? other.getInterestEndDate() == null : this.getInterestEndDate().equals(other.getInterestEndDate()))
            && (this.getForeCashDate() == null ? other.getForeCashDate() == null : this.getForeCashDate().equals(other.getForeCashDate()))
            && (this.getInterestPayTypeCode() == null ? other.getInterestPayTypeCode() == null : this.getInterestPayTypeCode().equals(other.getInterestPayTypeCode()))
            && (this.getInterestPayFreqCode() == null ? other.getInterestPayFreqCode() == null : this.getInterestPayFreqCode().equals(other.getInterestPayFreqCode()))
            && (this.getInterestPayDates() == null ? other.getInterestPayDates() == null : this.getInterestPayDates().equals(other.getInterestPayDates()))
            && (this.getOrigSecuGlobalCode() == null ? other.getOrigSecuGlobalCode() == null : this.getOrigSecuGlobalCode().equals(other.getOrigSecuGlobalCode()))
            && (this.getCreditDebtDate() == null ? other.getCreditDebtDate() == null : this.getCreditDebtDate().equals(other.getCreditDebtDate()))
            && (this.getFundsUseText() == null ? other.getFundsUseText() == null : this.getFundsUseText().equals(other.getFundsUseText()))
            && (this.getRowVersionNo() == null ? other.getRowVersionNo() == null : this.getRowVersionNo().equals(other.getRowVersionNo()))
            && (this.getLastOperateStaffCode() == null ? other.getLastOperateStaffCode() == null : this.getLastOperateStaffCode().equals(other.getLastOperateStaffCode()))
            && (this.getLastOperateDatetime() == null ? other.getLastOperateDatetime() == null : this.getLastOperateDatetime().equals(other.getLastOperateDatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSecuGlobalCode() == null) ? 0 : getSecuGlobalCode().hashCode());
        result = prime * result + ((getIssuerCategoryCode() == null) ? 0 : getIssuerCategoryCode().hashCode());
        result = prime * result + ((getIssuerLocalFlagCode() == null) ? 0 : getIssuerLocalFlagCode().hashCode());
        result = prime * result + ((getBondCreditFlagCode() == null) ? 0 : getBondCreditFlagCode().hashCode());
        result = prime * result + ((getIssueTypeCode() == null) ? 0 : getIssueTypeCode().hashCode());
        result = prime * result + ((getBondFormFlagCode() == null) ? 0 : getBondFormFlagCode().hashCode());
        result = prime * result + ((getInterestRateTypeCode() == null) ? 0 : getInterestRateTypeCode().hashCode());
        result = prime * result + ((getCouponRate() == null) ? 0 : getCouponRate().hashCode());
        result = prime * result + ((getInterestCalcTypeCode() == null) ? 0 : getInterestCalcTypeCode().hashCode());
        result = prime * result + ((getInterestDaysBasedCode() == null) ? 0 : getInterestDaysBasedCode().hashCode());
        result = prime * result + ((getInterestStartDate() == null) ? 0 : getInterestStartDate().hashCode());
        result = prime * result + ((getInterestEndDate() == null) ? 0 : getInterestEndDate().hashCode());
        result = prime * result + ((getForeCashDate() == null) ? 0 : getForeCashDate().hashCode());
        result = prime * result + ((getInterestPayTypeCode() == null) ? 0 : getInterestPayTypeCode().hashCode());
        result = prime * result + ((getInterestPayFreqCode() == null) ? 0 : getInterestPayFreqCode().hashCode());
        result = prime * result + ((getInterestPayDates() == null) ? 0 : getInterestPayDates().hashCode());
        result = prime * result + ((getOrigSecuGlobalCode() == null) ? 0 : getOrigSecuGlobalCode().hashCode());
        result = prime * result + ((getCreditDebtDate() == null) ? 0 : getCreditDebtDate().hashCode());
        result = prime * result + ((getFundsUseText() == null) ? 0 : getFundsUseText().hashCode());
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
        sb.append(", issuerCategoryCode=").append(issuerCategoryCode);
        sb.append(", issuerLocalFlagCode=").append(issuerLocalFlagCode);
        sb.append(", bondCreditFlagCode=").append(bondCreditFlagCode);
        sb.append(", issueTypeCode=").append(issueTypeCode);
        sb.append(", bondFormFlagCode=").append(bondFormFlagCode);
        sb.append(", interestRateTypeCode=").append(interestRateTypeCode);
        sb.append(", couponRate=").append(couponRate);
        sb.append(", interestCalcTypeCode=").append(interestCalcTypeCode);
        sb.append(", interestDaysBasedCode=").append(interestDaysBasedCode);
        sb.append(", interestStartDate=").append(interestStartDate);
        sb.append(", interestEndDate=").append(interestEndDate);
        sb.append(", foreCashDate=").append(foreCashDate);
        sb.append(", interestPayTypeCode=").append(interestPayTypeCode);
        sb.append(", interestPayFreqCode=").append(interestPayFreqCode);
        sb.append(", interestPayDates=").append(interestPayDates);
        sb.append(", origSecuGlobalCode=").append(origSecuGlobalCode);
        sb.append(", creditDebtDate=").append(creditDebtDate);
        sb.append(", fundsUseText=").append(fundsUseText);
        sb.append(", rowVersionNo=").append(rowVersionNo);
        sb.append(", lastOperateStaffCode=").append(lastOperateStaffCode);
        sb.append(", lastOperateDatetime=").append(lastOperateDatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}