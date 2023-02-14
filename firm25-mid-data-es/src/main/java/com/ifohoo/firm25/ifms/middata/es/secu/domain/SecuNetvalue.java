package com.ifohoo.firm25.ifms.middata.es.secu.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 净值信息表
 * @TableName SECU_NETVALUE
 */
public class SecuNetvalue implements Serializable {
    /**
     * 记录唯一编号
     */
    private Long netvalueNo;

    /**
     * 发生日期
     */
    private String occurDate;

    /**
     * 证券代码
     */
    private String secuGlobalCode;

    /**
     * 单位净值
     */
    private BigDecimal netvaluePrice;

    /**
     * 累计单位净值
     */
    private BigDecimal accumNetvaluePrice;

    /**
     * 七日年化收益率
     */
    private BigDecimal sevenDaysAnnualYield;

    /**
     * 万份收益率()
     */
    private BigDecimal tenThousandSharesYield;

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
    public Long getNetvalueNo() {
        return netvalueNo;
    }

    /**
     * 记录唯一编号
     */
    public void setNetvalueNo(Long netvalueNo) {
        this.netvalueNo = netvalueNo;
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
     * 单位净值
     */
    public BigDecimal getNetvaluePrice() {
        return netvaluePrice;
    }

    /**
     * 单位净值
     */
    public void setNetvaluePrice(BigDecimal netvaluePrice) {
        this.netvaluePrice = netvaluePrice;
    }

    /**
     * 累计单位净值
     */
    public BigDecimal getAccumNetvaluePrice() {
        return accumNetvaluePrice;
    }

    /**
     * 累计单位净值
     */
    public void setAccumNetvaluePrice(BigDecimal accumNetvaluePrice) {
        this.accumNetvaluePrice = accumNetvaluePrice;
    }

    /**
     * 七日年化收益率
     */
    public BigDecimal getSevenDaysAnnualYield() {
        return sevenDaysAnnualYield;
    }

    /**
     * 七日年化收益率
     */
    public void setSevenDaysAnnualYield(BigDecimal sevenDaysAnnualYield) {
        this.sevenDaysAnnualYield = sevenDaysAnnualYield;
    }

    /**
     * 万份收益率()
     */
    public BigDecimal getTenThousandSharesYield() {
        return tenThousandSharesYield;
    }

    /**
     * 万份收益率()
     */
    public void setTenThousandSharesYield(BigDecimal tenThousandSharesYield) {
        this.tenThousandSharesYield = tenThousandSharesYield;
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
        SecuNetvalue other = (SecuNetvalue) that;
        return (this.getNetvalueNo() == null ? other.getNetvalueNo() == null : this.getNetvalueNo().equals(other.getNetvalueNo()))
            && (this.getOccurDate() == null ? other.getOccurDate() == null : this.getOccurDate().equals(other.getOccurDate()))
            && (this.getSecuGlobalCode() == null ? other.getSecuGlobalCode() == null : this.getSecuGlobalCode().equals(other.getSecuGlobalCode()))
            && (this.getNetvaluePrice() == null ? other.getNetvaluePrice() == null : this.getNetvaluePrice().equals(other.getNetvaluePrice()))
            && (this.getAccumNetvaluePrice() == null ? other.getAccumNetvaluePrice() == null : this.getAccumNetvaluePrice().equals(other.getAccumNetvaluePrice()))
            && (this.getSevenDaysAnnualYield() == null ? other.getSevenDaysAnnualYield() == null : this.getSevenDaysAnnualYield().equals(other.getSevenDaysAnnualYield()))
            && (this.getTenThousandSharesYield() == null ? other.getTenThousandSharesYield() == null : this.getTenThousandSharesYield().equals(other.getTenThousandSharesYield()))
            && (this.getRowVersionNo() == null ? other.getRowVersionNo() == null : this.getRowVersionNo().equals(other.getRowVersionNo()))
            && (this.getLastOperateStaffCode() == null ? other.getLastOperateStaffCode() == null : this.getLastOperateStaffCode().equals(other.getLastOperateStaffCode()))
            && (this.getLastOperateDatetime() == null ? other.getLastOperateDatetime() == null : this.getLastOperateDatetime().equals(other.getLastOperateDatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNetvalueNo() == null) ? 0 : getNetvalueNo().hashCode());
        result = prime * result + ((getOccurDate() == null) ? 0 : getOccurDate().hashCode());
        result = prime * result + ((getSecuGlobalCode() == null) ? 0 : getSecuGlobalCode().hashCode());
        result = prime * result + ((getNetvaluePrice() == null) ? 0 : getNetvaluePrice().hashCode());
        result = prime * result + ((getAccumNetvaluePrice() == null) ? 0 : getAccumNetvaluePrice().hashCode());
        result = prime * result + ((getSevenDaysAnnualYield() == null) ? 0 : getSevenDaysAnnualYield().hashCode());
        result = prime * result + ((getTenThousandSharesYield() == null) ? 0 : getTenThousandSharesYield().hashCode());
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
        sb.append(", netvalueNo=").append(netvalueNo);
        sb.append(", occurDate=").append(occurDate);
        sb.append(", secuGlobalCode=").append(secuGlobalCode);
        sb.append(", netvaluePrice=").append(netvaluePrice);
        sb.append(", accumNetvaluePrice=").append(accumNetvaluePrice);
        sb.append(", sevenDaysAnnualYield=").append(sevenDaysAnnualYield);
        sb.append(", tenThousandSharesYield=").append(tenThousandSharesYield);
        sb.append(", rowVersionNo=").append(rowVersionNo);
        sb.append(", lastOperateStaffCode=").append(lastOperateStaffCode);
        sb.append(", lastOperateDatetime=").append(lastOperateDatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}