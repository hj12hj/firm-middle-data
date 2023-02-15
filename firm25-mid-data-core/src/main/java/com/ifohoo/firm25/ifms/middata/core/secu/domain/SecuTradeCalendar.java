package com.ifohoo.firm25.ifms.middata.core.secu.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.github.jeffreyning.mybatisplus.anno.MppMultiId;

import java.io.Serializable;
import java.util.Date;

/**
 * 交易日历表
 * @TableName SECU_TRADE_CALENDAR
 */
@TableName(value ="SECU_TRADE_CALENDAR")
public class SecuTradeCalendar implements Serializable {
    /**
     * 发生日期
     */
    @MppMultiId
    private String occurDate;

    /**
     * 交易场所代码
     */
    @MppMultiId
    private String exchangeCode;

    /**
     * 是否交易日
     */
    private String workdayFlagCode;

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
     * 是否交易日
     */
    public String getWorkdayFlagCode() {
        return workdayFlagCode;
    }

    /**
     * 是否交易日
     */
    public void setWorkdayFlagCode(String workdayFlagCode) {
        this.workdayFlagCode = workdayFlagCode;
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
        SecuTradeCalendar other = (SecuTradeCalendar) that;
        return (this.getOccurDate() == null ? other.getOccurDate() == null : this.getOccurDate().equals(other.getOccurDate()))
            && (this.getExchangeCode() == null ? other.getExchangeCode() == null : this.getExchangeCode().equals(other.getExchangeCode()))
            && (this.getWorkdayFlagCode() == null ? other.getWorkdayFlagCode() == null : this.getWorkdayFlagCode().equals(other.getWorkdayFlagCode()))
            && (this.getRowVersionNo() == null ? other.getRowVersionNo() == null : this.getRowVersionNo().equals(other.getRowVersionNo()))
            && (this.getLastOperateStaffCode() == null ? other.getLastOperateStaffCode() == null : this.getLastOperateStaffCode().equals(other.getLastOperateStaffCode()))
            && (this.getLastOperateDatetime() == null ? other.getLastOperateDatetime() == null : this.getLastOperateDatetime().equals(other.getLastOperateDatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOccurDate() == null) ? 0 : getOccurDate().hashCode());
        result = prime * result + ((getExchangeCode() == null) ? 0 : getExchangeCode().hashCode());
        result = prime * result + ((getWorkdayFlagCode() == null) ? 0 : getWorkdayFlagCode().hashCode());
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
        sb.append(", occurDate=").append(occurDate);
        sb.append(", exchangeCode=").append(exchangeCode);
        sb.append(", workdayFlagCode=").append(workdayFlagCode);
        sb.append(", rowVersionNo=").append(rowVersionNo);
        sb.append(", lastOperateStaffCode=").append(lastOperateStaffCode);
        sb.append(", lastOperateDatetime=").append(lastOperateDatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}