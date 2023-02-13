package com.ifohoo.firm25.ifms.middata.secu.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 行情表
 * @TableName SECU_QUOTA
 */
@TableName(value ="SECU_QUOTA")
public class SecuQuota implements Serializable {
    /**
     * 记录唯一编号
     */
    @TableId
    private Long quotaNo;

    /**
     * 发生日期
     */
    private String occurDate;

    /**
     * 证券代码
     */
    private String secuGlobalCode;

    /**
     * 昨收盘
     */
    private BigDecimal closePrice;

    /**
     * 今开盘
     */
    private BigDecimal openPrice;

    /**
     * 最新价、最近价
     */
    private BigDecimal latestPrice;

    /**
     * 最高成交价、最高价
     */
    private BigDecimal highestPrice;

    /**
     * 最低成交价、最低价
     */
    private BigDecimal lowestPrice;

    /**
     * 结算价、交割价
     */
    private BigDecimal settlePrice;

    /**
     * 总成交量
     */
    private BigDecimal totalMatchQty;

    /**
     * 总成交额
     */
    private BigDecimal totalMatchAmt;

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
    public Long getQuotaNo() {
        return quotaNo;
    }

    /**
     * 记录唯一编号
     */
    public void setQuotaNo(Long quotaNo) {
        this.quotaNo = quotaNo;
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
     * 昨收盘
     */
    public BigDecimal getClosePrice() {
        return closePrice;
    }

    /**
     * 昨收盘
     */
    public void setClosePrice(BigDecimal closePrice) {
        this.closePrice = closePrice;
    }

    /**
     * 今开盘
     */
    public BigDecimal getOpenPrice() {
        return openPrice;
    }

    /**
     * 今开盘
     */
    public void setOpenPrice(BigDecimal openPrice) {
        this.openPrice = openPrice;
    }

    /**
     * 最新价、最近价
     */
    public BigDecimal getLatestPrice() {
        return latestPrice;
    }

    /**
     * 最新价、最近价
     */
    public void setLatestPrice(BigDecimal latestPrice) {
        this.latestPrice = latestPrice;
    }

    /**
     * 最高成交价、最高价
     */
    public BigDecimal getHighestPrice() {
        return highestPrice;
    }

    /**
     * 最高成交价、最高价
     */
    public void setHighestPrice(BigDecimal highestPrice) {
        this.highestPrice = highestPrice;
    }

    /**
     * 最低成交价、最低价
     */
    public BigDecimal getLowestPrice() {
        return lowestPrice;
    }

    /**
     * 最低成交价、最低价
     */
    public void setLowestPrice(BigDecimal lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    /**
     * 结算价、交割价
     */
    public BigDecimal getSettlePrice() {
        return settlePrice;
    }

    /**
     * 结算价、交割价
     */
    public void setSettlePrice(BigDecimal settlePrice) {
        this.settlePrice = settlePrice;
    }

    /**
     * 总成交量
     */
    public BigDecimal getTotalMatchQty() {
        return totalMatchQty;
    }

    /**
     * 总成交量
     */
    public void setTotalMatchQty(BigDecimal totalMatchQty) {
        this.totalMatchQty = totalMatchQty;
    }

    /**
     * 总成交额
     */
    public BigDecimal getTotalMatchAmt() {
        return totalMatchAmt;
    }

    /**
     * 总成交额
     */
    public void setTotalMatchAmt(BigDecimal totalMatchAmt) {
        this.totalMatchAmt = totalMatchAmt;
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
        SecuQuota other = (SecuQuota) that;
        return (this.getQuotaNo() == null ? other.getQuotaNo() == null : this.getQuotaNo().equals(other.getQuotaNo()))
            && (this.getOccurDate() == null ? other.getOccurDate() == null : this.getOccurDate().equals(other.getOccurDate()))
            && (this.getSecuGlobalCode() == null ? other.getSecuGlobalCode() == null : this.getSecuGlobalCode().equals(other.getSecuGlobalCode()))
            && (this.getClosePrice() == null ? other.getClosePrice() == null : this.getClosePrice().equals(other.getClosePrice()))
            && (this.getOpenPrice() == null ? other.getOpenPrice() == null : this.getOpenPrice().equals(other.getOpenPrice()))
            && (this.getLatestPrice() == null ? other.getLatestPrice() == null : this.getLatestPrice().equals(other.getLatestPrice()))
            && (this.getHighestPrice() == null ? other.getHighestPrice() == null : this.getHighestPrice().equals(other.getHighestPrice()))
            && (this.getLowestPrice() == null ? other.getLowestPrice() == null : this.getLowestPrice().equals(other.getLowestPrice()))
            && (this.getSettlePrice() == null ? other.getSettlePrice() == null : this.getSettlePrice().equals(other.getSettlePrice()))
            && (this.getTotalMatchQty() == null ? other.getTotalMatchQty() == null : this.getTotalMatchQty().equals(other.getTotalMatchQty()))
            && (this.getTotalMatchAmt() == null ? other.getTotalMatchAmt() == null : this.getTotalMatchAmt().equals(other.getTotalMatchAmt()))
            && (this.getRowVersionNo() == null ? other.getRowVersionNo() == null : this.getRowVersionNo().equals(other.getRowVersionNo()))
            && (this.getLastOperateStaffCode() == null ? other.getLastOperateStaffCode() == null : this.getLastOperateStaffCode().equals(other.getLastOperateStaffCode()))
            && (this.getLastOperateDatetime() == null ? other.getLastOperateDatetime() == null : this.getLastOperateDatetime().equals(other.getLastOperateDatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getQuotaNo() == null) ? 0 : getQuotaNo().hashCode());
        result = prime * result + ((getOccurDate() == null) ? 0 : getOccurDate().hashCode());
        result = prime * result + ((getSecuGlobalCode() == null) ? 0 : getSecuGlobalCode().hashCode());
        result = prime * result + ((getClosePrice() == null) ? 0 : getClosePrice().hashCode());
        result = prime * result + ((getOpenPrice() == null) ? 0 : getOpenPrice().hashCode());
        result = prime * result + ((getLatestPrice() == null) ? 0 : getLatestPrice().hashCode());
        result = prime * result + ((getHighestPrice() == null) ? 0 : getHighestPrice().hashCode());
        result = prime * result + ((getLowestPrice() == null) ? 0 : getLowestPrice().hashCode());
        result = prime * result + ((getSettlePrice() == null) ? 0 : getSettlePrice().hashCode());
        result = prime * result + ((getTotalMatchQty() == null) ? 0 : getTotalMatchQty().hashCode());
        result = prime * result + ((getTotalMatchAmt() == null) ? 0 : getTotalMatchAmt().hashCode());
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
        sb.append(", quotaNo=").append(quotaNo);
        sb.append(", occurDate=").append(occurDate);
        sb.append(", secuGlobalCode=").append(secuGlobalCode);
        sb.append(", closePrice=").append(closePrice);
        sb.append(", openPrice=").append(openPrice);
        sb.append(", latestPrice=").append(latestPrice);
        sb.append(", highestPrice=").append(highestPrice);
        sb.append(", lowestPrice=").append(lowestPrice);
        sb.append(", settlePrice=").append(settlePrice);
        sb.append(", totalMatchQty=").append(totalMatchQty);
        sb.append(", totalMatchAmt=").append(totalMatchAmt);
        sb.append(", rowVersionNo=").append(rowVersionNo);
        sb.append(", lastOperateStaffCode=").append(lastOperateStaffCode);
        sb.append(", lastOperateDatetime=").append(lastOperateDatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}