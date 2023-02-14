package com.ifohoo.firm25.ifms.middata.es.secu.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 债券估值（中债估值）表
 * @TableName SECU_VALUATION
 */
public class SecuValuation implements Serializable {
    /**
     * 记录唯一编号
     */
    private Long valuationNo;

    /**
     * 估值日期
     */
    private String evDate;

    /**
     * 证券代码
     */
    private String secuGlobalCode;

    /**
     * 估价净价
     */
    private BigDecimal evNetPrice;

    /**
     * 日间应计利息
     */
    private BigDecimal evDaytimeInterestPrice;

    /**
     * 日间估价全价
     */
    private BigDecimal evDaytimeFullPrice;

    /**
     * 估价收益率％
     */
    private BigDecimal evYield;

    /**
     * 估价修正久期
     */
    private BigDecimal evDurValue;

    /**
     * 估价凸性(convexity=cvx)
     */
    private BigDecimal evCvxValue;

    /**
     * 估价基点价值
     */
    private BigDecimal evBasepointValue;

    /**
     * 估价利差久期
     */
    private BigDecimal evSpreadDurValue;

    /**
     * 估价利差凸性
     */
    private BigDecimal evSpreadCvxValue;

    /**
     * 估价利率久期
     */
    private BigDecimal evInterestDurValue;

    /**
     * 估价利率凸性
     */
    private BigDecimal evInterestCvxValue;

    /**
     * 日终应计利息
     */
    private BigDecimal evDayendInterestPrice;

    /**
     * 日终估价全价
     */
    private BigDecimal evDayendFullPrice;

    /**
     * 加权平均结算净价
     */
    private BigDecimal avgNetPrice;

    /**
     * 加权平均结算全价
     */
    private BigDecimal avgFullPrice;

    /**
     * 加权平均结算价收益率%
     */
    private BigDecimal avgYield;

    /**
     * 加权平均结算价修正久期
     */
    private BigDecimal avgDurValue;

    /**
     * 加权平均结算价凸性
     */
    private BigDecimal avgCvxValue;

    /**
     * 加权平均结算价基点价值
     */
    private BigDecimal avgBasepointValue;

    /**
     * 加权平均结算价利差久期
     */
    private BigDecimal avgSpreadDurValue;

    /**
     * 加权平均结算价利差凸性
     */
    private BigDecimal avgSpreadCvxValue;

    /**
     * 加权平均结算价利率久期
     */
    private BigDecimal avgInterestDurValue;

    /**
     * 加权平均结算价利率凸性
     */
    private BigDecimal avgInterestCvxValue;

    /**
     * 待偿期(剩余期限)
     */
    private BigDecimal residualPeriodValue;

    /**
     * 剩余本金
     */
    private BigDecimal residualPrincipalValue;

    /**
     * 点差收益率%
     */
    private BigDecimal pointDiffYield;

    /**
     * 可信度
     */
    private String reliabilityText;

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
    public Long getValuationNo() {
        return valuationNo;
    }

    /**
     * 记录唯一编号
     */
    public void setValuationNo(Long valuationNo) {
        this.valuationNo = valuationNo;
    }

    /**
     * 估值日期
     */
    public String getEvDate() {
        return evDate;
    }

    /**
     * 估值日期
     */
    public void setEvDate(String evDate) {
        this.evDate = evDate;
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
     * 估价净价
     */
    public BigDecimal getEvNetPrice() {
        return evNetPrice;
    }

    /**
     * 估价净价
     */
    public void setEvNetPrice(BigDecimal evNetPrice) {
        this.evNetPrice = evNetPrice;
    }

    /**
     * 日间应计利息
     */
    public BigDecimal getEvDaytimeInterestPrice() {
        return evDaytimeInterestPrice;
    }

    /**
     * 日间应计利息
     */
    public void setEvDaytimeInterestPrice(BigDecimal evDaytimeInterestPrice) {
        this.evDaytimeInterestPrice = evDaytimeInterestPrice;
    }

    /**
     * 日间估价全价
     */
    public BigDecimal getEvDaytimeFullPrice() {
        return evDaytimeFullPrice;
    }

    /**
     * 日间估价全价
     */
    public void setEvDaytimeFullPrice(BigDecimal evDaytimeFullPrice) {
        this.evDaytimeFullPrice = evDaytimeFullPrice;
    }

    /**
     * 估价收益率％
     */
    public BigDecimal getEvYield() {
        return evYield;
    }

    /**
     * 估价收益率％
     */
    public void setEvYield(BigDecimal evYield) {
        this.evYield = evYield;
    }

    /**
     * 估价修正久期
     */
    public BigDecimal getEvDurValue() {
        return evDurValue;
    }

    /**
     * 估价修正久期
     */
    public void setEvDurValue(BigDecimal evDurValue) {
        this.evDurValue = evDurValue;
    }

    /**
     * 估价凸性(convexity=cvx)
     */
    public BigDecimal getEvCvxValue() {
        return evCvxValue;
    }

    /**
     * 估价凸性(convexity=cvx)
     */
    public void setEvCvxValue(BigDecimal evCvxValue) {
        this.evCvxValue = evCvxValue;
    }

    /**
     * 估价基点价值
     */
    public BigDecimal getEvBasepointValue() {
        return evBasepointValue;
    }

    /**
     * 估价基点价值
     */
    public void setEvBasepointValue(BigDecimal evBasepointValue) {
        this.evBasepointValue = evBasepointValue;
    }

    /**
     * 估价利差久期
     */
    public BigDecimal getEvSpreadDurValue() {
        return evSpreadDurValue;
    }

    /**
     * 估价利差久期
     */
    public void setEvSpreadDurValue(BigDecimal evSpreadDurValue) {
        this.evSpreadDurValue = evSpreadDurValue;
    }

    /**
     * 估价利差凸性
     */
    public BigDecimal getEvSpreadCvxValue() {
        return evSpreadCvxValue;
    }

    /**
     * 估价利差凸性
     */
    public void setEvSpreadCvxValue(BigDecimal evSpreadCvxValue) {
        this.evSpreadCvxValue = evSpreadCvxValue;
    }

    /**
     * 估价利率久期
     */
    public BigDecimal getEvInterestDurValue() {
        return evInterestDurValue;
    }

    /**
     * 估价利率久期
     */
    public void setEvInterestDurValue(BigDecimal evInterestDurValue) {
        this.evInterestDurValue = evInterestDurValue;
    }

    /**
     * 估价利率凸性
     */
    public BigDecimal getEvInterestCvxValue() {
        return evInterestCvxValue;
    }

    /**
     * 估价利率凸性
     */
    public void setEvInterestCvxValue(BigDecimal evInterestCvxValue) {
        this.evInterestCvxValue = evInterestCvxValue;
    }

    /**
     * 日终应计利息
     */
    public BigDecimal getEvDayendInterestPrice() {
        return evDayendInterestPrice;
    }

    /**
     * 日终应计利息
     */
    public void setEvDayendInterestPrice(BigDecimal evDayendInterestPrice) {
        this.evDayendInterestPrice = evDayendInterestPrice;
    }

    /**
     * 日终估价全价
     */
    public BigDecimal getEvDayendFullPrice() {
        return evDayendFullPrice;
    }

    /**
     * 日终估价全价
     */
    public void setEvDayendFullPrice(BigDecimal evDayendFullPrice) {
        this.evDayendFullPrice = evDayendFullPrice;
    }

    /**
     * 加权平均结算净价
     */
    public BigDecimal getAvgNetPrice() {
        return avgNetPrice;
    }

    /**
     * 加权平均结算净价
     */
    public void setAvgNetPrice(BigDecimal avgNetPrice) {
        this.avgNetPrice = avgNetPrice;
    }

    /**
     * 加权平均结算全价
     */
    public BigDecimal getAvgFullPrice() {
        return avgFullPrice;
    }

    /**
     * 加权平均结算全价
     */
    public void setAvgFullPrice(BigDecimal avgFullPrice) {
        this.avgFullPrice = avgFullPrice;
    }

    /**
     * 加权平均结算价收益率%
     */
    public BigDecimal getAvgYield() {
        return avgYield;
    }

    /**
     * 加权平均结算价收益率%
     */
    public void setAvgYield(BigDecimal avgYield) {
        this.avgYield = avgYield;
    }

    /**
     * 加权平均结算价修正久期
     */
    public BigDecimal getAvgDurValue() {
        return avgDurValue;
    }

    /**
     * 加权平均结算价修正久期
     */
    public void setAvgDurValue(BigDecimal avgDurValue) {
        this.avgDurValue = avgDurValue;
    }

    /**
     * 加权平均结算价凸性
     */
    public BigDecimal getAvgCvxValue() {
        return avgCvxValue;
    }

    /**
     * 加权平均结算价凸性
     */
    public void setAvgCvxValue(BigDecimal avgCvxValue) {
        this.avgCvxValue = avgCvxValue;
    }

    /**
     * 加权平均结算价基点价值
     */
    public BigDecimal getAvgBasepointValue() {
        return avgBasepointValue;
    }

    /**
     * 加权平均结算价基点价值
     */
    public void setAvgBasepointValue(BigDecimal avgBasepointValue) {
        this.avgBasepointValue = avgBasepointValue;
    }

    /**
     * 加权平均结算价利差久期
     */
    public BigDecimal getAvgSpreadDurValue() {
        return avgSpreadDurValue;
    }

    /**
     * 加权平均结算价利差久期
     */
    public void setAvgSpreadDurValue(BigDecimal avgSpreadDurValue) {
        this.avgSpreadDurValue = avgSpreadDurValue;
    }

    /**
     * 加权平均结算价利差凸性
     */
    public BigDecimal getAvgSpreadCvxValue() {
        return avgSpreadCvxValue;
    }

    /**
     * 加权平均结算价利差凸性
     */
    public void setAvgSpreadCvxValue(BigDecimal avgSpreadCvxValue) {
        this.avgSpreadCvxValue = avgSpreadCvxValue;
    }

    /**
     * 加权平均结算价利率久期
     */
    public BigDecimal getAvgInterestDurValue() {
        return avgInterestDurValue;
    }

    /**
     * 加权平均结算价利率久期
     */
    public void setAvgInterestDurValue(BigDecimal avgInterestDurValue) {
        this.avgInterestDurValue = avgInterestDurValue;
    }

    /**
     * 加权平均结算价利率凸性
     */
    public BigDecimal getAvgInterestCvxValue() {
        return avgInterestCvxValue;
    }

    /**
     * 加权平均结算价利率凸性
     */
    public void setAvgInterestCvxValue(BigDecimal avgInterestCvxValue) {
        this.avgInterestCvxValue = avgInterestCvxValue;
    }

    /**
     * 待偿期(剩余期限)
     */
    public BigDecimal getResidualPeriodValue() {
        return residualPeriodValue;
    }

    /**
     * 待偿期(剩余期限)
     */
    public void setResidualPeriodValue(BigDecimal residualPeriodValue) {
        this.residualPeriodValue = residualPeriodValue;
    }

    /**
     * 剩余本金
     */
    public BigDecimal getResidualPrincipalValue() {
        return residualPrincipalValue;
    }

    /**
     * 剩余本金
     */
    public void setResidualPrincipalValue(BigDecimal residualPrincipalValue) {
        this.residualPrincipalValue = residualPrincipalValue;
    }

    /**
     * 点差收益率%
     */
    public BigDecimal getPointDiffYield() {
        return pointDiffYield;
    }

    /**
     * 点差收益率%
     */
    public void setPointDiffYield(BigDecimal pointDiffYield) {
        this.pointDiffYield = pointDiffYield;
    }

    /**
     * 可信度
     */
    public String getReliabilityText() {
        return reliabilityText;
    }

    /**
     * 可信度
     */
    public void setReliabilityText(String reliabilityText) {
        this.reliabilityText = reliabilityText;
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
        SecuValuation other = (SecuValuation) that;
        return (this.getValuationNo() == null ? other.getValuationNo() == null : this.getValuationNo().equals(other.getValuationNo()))
            && (this.getEvDate() == null ? other.getEvDate() == null : this.getEvDate().equals(other.getEvDate()))
            && (this.getSecuGlobalCode() == null ? other.getSecuGlobalCode() == null : this.getSecuGlobalCode().equals(other.getSecuGlobalCode()))
            && (this.getEvNetPrice() == null ? other.getEvNetPrice() == null : this.getEvNetPrice().equals(other.getEvNetPrice()))
            && (this.getEvDaytimeInterestPrice() == null ? other.getEvDaytimeInterestPrice() == null : this.getEvDaytimeInterestPrice().equals(other.getEvDaytimeInterestPrice()))
            && (this.getEvDaytimeFullPrice() == null ? other.getEvDaytimeFullPrice() == null : this.getEvDaytimeFullPrice().equals(other.getEvDaytimeFullPrice()))
            && (this.getEvYield() == null ? other.getEvYield() == null : this.getEvYield().equals(other.getEvYield()))
            && (this.getEvDurValue() == null ? other.getEvDurValue() == null : this.getEvDurValue().equals(other.getEvDurValue()))
            && (this.getEvCvxValue() == null ? other.getEvCvxValue() == null : this.getEvCvxValue().equals(other.getEvCvxValue()))
            && (this.getEvBasepointValue() == null ? other.getEvBasepointValue() == null : this.getEvBasepointValue().equals(other.getEvBasepointValue()))
            && (this.getEvSpreadDurValue() == null ? other.getEvSpreadDurValue() == null : this.getEvSpreadDurValue().equals(other.getEvSpreadDurValue()))
            && (this.getEvSpreadCvxValue() == null ? other.getEvSpreadCvxValue() == null : this.getEvSpreadCvxValue().equals(other.getEvSpreadCvxValue()))
            && (this.getEvInterestDurValue() == null ? other.getEvInterestDurValue() == null : this.getEvInterestDurValue().equals(other.getEvInterestDurValue()))
            && (this.getEvInterestCvxValue() == null ? other.getEvInterestCvxValue() == null : this.getEvInterestCvxValue().equals(other.getEvInterestCvxValue()))
            && (this.getEvDayendInterestPrice() == null ? other.getEvDayendInterestPrice() == null : this.getEvDayendInterestPrice().equals(other.getEvDayendInterestPrice()))
            && (this.getEvDayendFullPrice() == null ? other.getEvDayendFullPrice() == null : this.getEvDayendFullPrice().equals(other.getEvDayendFullPrice()))
            && (this.getAvgNetPrice() == null ? other.getAvgNetPrice() == null : this.getAvgNetPrice().equals(other.getAvgNetPrice()))
            && (this.getAvgFullPrice() == null ? other.getAvgFullPrice() == null : this.getAvgFullPrice().equals(other.getAvgFullPrice()))
            && (this.getAvgYield() == null ? other.getAvgYield() == null : this.getAvgYield().equals(other.getAvgYield()))
            && (this.getAvgDurValue() == null ? other.getAvgDurValue() == null : this.getAvgDurValue().equals(other.getAvgDurValue()))
            && (this.getAvgCvxValue() == null ? other.getAvgCvxValue() == null : this.getAvgCvxValue().equals(other.getAvgCvxValue()))
            && (this.getAvgBasepointValue() == null ? other.getAvgBasepointValue() == null : this.getAvgBasepointValue().equals(other.getAvgBasepointValue()))
            && (this.getAvgSpreadDurValue() == null ? other.getAvgSpreadDurValue() == null : this.getAvgSpreadDurValue().equals(other.getAvgSpreadDurValue()))
            && (this.getAvgSpreadCvxValue() == null ? other.getAvgSpreadCvxValue() == null : this.getAvgSpreadCvxValue().equals(other.getAvgSpreadCvxValue()))
            && (this.getAvgInterestDurValue() == null ? other.getAvgInterestDurValue() == null : this.getAvgInterestDurValue().equals(other.getAvgInterestDurValue()))
            && (this.getAvgInterestCvxValue() == null ? other.getAvgInterestCvxValue() == null : this.getAvgInterestCvxValue().equals(other.getAvgInterestCvxValue()))
            && (this.getResidualPeriodValue() == null ? other.getResidualPeriodValue() == null : this.getResidualPeriodValue().equals(other.getResidualPeriodValue()))
            && (this.getResidualPrincipalValue() == null ? other.getResidualPrincipalValue() == null : this.getResidualPrincipalValue().equals(other.getResidualPrincipalValue()))
            && (this.getPointDiffYield() == null ? other.getPointDiffYield() == null : this.getPointDiffYield().equals(other.getPointDiffYield()))
            && (this.getReliabilityText() == null ? other.getReliabilityText() == null : this.getReliabilityText().equals(other.getReliabilityText()))
            && (this.getRowVersionNo() == null ? other.getRowVersionNo() == null : this.getRowVersionNo().equals(other.getRowVersionNo()))
            && (this.getLastOperateStaffCode() == null ? other.getLastOperateStaffCode() == null : this.getLastOperateStaffCode().equals(other.getLastOperateStaffCode()))
            && (this.getLastOperateDatetime() == null ? other.getLastOperateDatetime() == null : this.getLastOperateDatetime().equals(other.getLastOperateDatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getValuationNo() == null) ? 0 : getValuationNo().hashCode());
        result = prime * result + ((getEvDate() == null) ? 0 : getEvDate().hashCode());
        result = prime * result + ((getSecuGlobalCode() == null) ? 0 : getSecuGlobalCode().hashCode());
        result = prime * result + ((getEvNetPrice() == null) ? 0 : getEvNetPrice().hashCode());
        result = prime * result + ((getEvDaytimeInterestPrice() == null) ? 0 : getEvDaytimeInterestPrice().hashCode());
        result = prime * result + ((getEvDaytimeFullPrice() == null) ? 0 : getEvDaytimeFullPrice().hashCode());
        result = prime * result + ((getEvYield() == null) ? 0 : getEvYield().hashCode());
        result = prime * result + ((getEvDurValue() == null) ? 0 : getEvDurValue().hashCode());
        result = prime * result + ((getEvCvxValue() == null) ? 0 : getEvCvxValue().hashCode());
        result = prime * result + ((getEvBasepointValue() == null) ? 0 : getEvBasepointValue().hashCode());
        result = prime * result + ((getEvSpreadDurValue() == null) ? 0 : getEvSpreadDurValue().hashCode());
        result = prime * result + ((getEvSpreadCvxValue() == null) ? 0 : getEvSpreadCvxValue().hashCode());
        result = prime * result + ((getEvInterestDurValue() == null) ? 0 : getEvInterestDurValue().hashCode());
        result = prime * result + ((getEvInterestCvxValue() == null) ? 0 : getEvInterestCvxValue().hashCode());
        result = prime * result + ((getEvDayendInterestPrice() == null) ? 0 : getEvDayendInterestPrice().hashCode());
        result = prime * result + ((getEvDayendFullPrice() == null) ? 0 : getEvDayendFullPrice().hashCode());
        result = prime * result + ((getAvgNetPrice() == null) ? 0 : getAvgNetPrice().hashCode());
        result = prime * result + ((getAvgFullPrice() == null) ? 0 : getAvgFullPrice().hashCode());
        result = prime * result + ((getAvgYield() == null) ? 0 : getAvgYield().hashCode());
        result = prime * result + ((getAvgDurValue() == null) ? 0 : getAvgDurValue().hashCode());
        result = prime * result + ((getAvgCvxValue() == null) ? 0 : getAvgCvxValue().hashCode());
        result = prime * result + ((getAvgBasepointValue() == null) ? 0 : getAvgBasepointValue().hashCode());
        result = prime * result + ((getAvgSpreadDurValue() == null) ? 0 : getAvgSpreadDurValue().hashCode());
        result = prime * result + ((getAvgSpreadCvxValue() == null) ? 0 : getAvgSpreadCvxValue().hashCode());
        result = prime * result + ((getAvgInterestDurValue() == null) ? 0 : getAvgInterestDurValue().hashCode());
        result = prime * result + ((getAvgInterestCvxValue() == null) ? 0 : getAvgInterestCvxValue().hashCode());
        result = prime * result + ((getResidualPeriodValue() == null) ? 0 : getResidualPeriodValue().hashCode());
        result = prime * result + ((getResidualPrincipalValue() == null) ? 0 : getResidualPrincipalValue().hashCode());
        result = prime * result + ((getPointDiffYield() == null) ? 0 : getPointDiffYield().hashCode());
        result = prime * result + ((getReliabilityText() == null) ? 0 : getReliabilityText().hashCode());
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
        sb.append(", valuationNo=").append(valuationNo);
        sb.append(", evDate=").append(evDate);
        sb.append(", secuGlobalCode=").append(secuGlobalCode);
        sb.append(", evNetPrice=").append(evNetPrice);
        sb.append(", evDaytimeInterestPrice=").append(evDaytimeInterestPrice);
        sb.append(", evDaytimeFullPrice=").append(evDaytimeFullPrice);
        sb.append(", evYield=").append(evYield);
        sb.append(", evDurValue=").append(evDurValue);
        sb.append(", evCvxValue=").append(evCvxValue);
        sb.append(", evBasepointValue=").append(evBasepointValue);
        sb.append(", evSpreadDurValue=").append(evSpreadDurValue);
        sb.append(", evSpreadCvxValue=").append(evSpreadCvxValue);
        sb.append(", evInterestDurValue=").append(evInterestDurValue);
        sb.append(", evInterestCvxValue=").append(evInterestCvxValue);
        sb.append(", evDayendInterestPrice=").append(evDayendInterestPrice);
        sb.append(", evDayendFullPrice=").append(evDayendFullPrice);
        sb.append(", avgNetPrice=").append(avgNetPrice);
        sb.append(", avgFullPrice=").append(avgFullPrice);
        sb.append(", avgYield=").append(avgYield);
        sb.append(", avgDurValue=").append(avgDurValue);
        sb.append(", avgCvxValue=").append(avgCvxValue);
        sb.append(", avgBasepointValue=").append(avgBasepointValue);
        sb.append(", avgSpreadDurValue=").append(avgSpreadDurValue);
        sb.append(", avgSpreadCvxValue=").append(avgSpreadCvxValue);
        sb.append(", avgInterestDurValue=").append(avgInterestDurValue);
        sb.append(", avgInterestCvxValue=").append(avgInterestCvxValue);
        sb.append(", residualPeriodValue=").append(residualPeriodValue);
        sb.append(", residualPrincipalValue=").append(residualPrincipalValue);
        sb.append(", pointDiffYield=").append(pointDiffYield);
        sb.append(", reliabilityText=").append(reliabilityText);
        sb.append(", rowVersionNo=").append(rowVersionNo);
        sb.append(", lastOperateStaffCode=").append(lastOperateStaffCode);
        sb.append(", lastOperateDatetime=").append(lastOperateDatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}