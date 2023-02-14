package com.ifohoo.firm25.ifms.middata.common.dto.corp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 企业股东信息表
 * @TableName CORP_HOLDER
 */
public class CorpHolderDto implements Serializable {
    /**
     * 记录的唯一编号
     */
    private Long holderNo;

    /**
     * 变更日期
     */
    private String changeDate;

    /**
     * 企业代码
     */
    private String corpCode;

    /**
     * 股东名称
     */
    private String holderName;

    /**
     * 股东类型(O=机构,P=个人)
     */
    private String holderTypeCode;

    /**
     * 机构股东的企业代码
     */
    private String holderCorpCode;

    /**
     * 持股比例
     */
    private BigDecimal holdRatio;

    /**
     * 认缴出资日期
     */
    private String contDate;

    /**
     * 认缴出资金额
     */
    private BigDecimal contAmt;

    /**
     * 实缴出资日期
     */
    private String paidDate;

    /**
     * 实缴出资金额
     */
    private BigDecimal paidAmt;

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
     * 记录的唯一编号
     */
    public Long getHolderNo() {
        return holderNo;
    }

    /**
     * 记录的唯一编号
     */
    public void setHolderNo(Long holderNo) {
        this.holderNo = holderNo;
    }

    /**
     * 变更日期
     */
    public String getChangeDate() {
        return changeDate;
    }

    /**
     * 变更日期
     */
    public void setChangeDate(String changeDate) {
        this.changeDate = changeDate;
    }

    /**
     * 企业代码
     */
    public String getCorpCode() {
        return corpCode;
    }

    /**
     * 企业代码
     */
    public void setCorpCode(String corpCode) {
        this.corpCode = corpCode;
    }

    /**
     * 股东名称
     */
    public String getHolderName() {
        return holderName;
    }

    /**
     * 股东名称
     */
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    /**
     * 股东类型(O=机构,P=个人)
     */
    public String getHolderTypeCode() {
        return holderTypeCode;
    }

    /**
     * 股东类型(O=机构,P=个人)
     */
    public void setHolderTypeCode(String holderTypeCode) {
        this.holderTypeCode = holderTypeCode;
    }

    /**
     * 机构股东的企业代码
     */
    public String getHolderCorpCode() {
        return holderCorpCode;
    }

    /**
     * 机构股东的企业代码
     */
    public void setHolderCorpCode(String holderCorpCode) {
        this.holderCorpCode = holderCorpCode;
    }

    /**
     * 持股比例
     */
    public BigDecimal getHoldRatio() {
        return holdRatio;
    }

    /**
     * 持股比例
     */
    public void setHoldRatio(BigDecimal holdRatio) {
        this.holdRatio = holdRatio;
    }

    /**
     * 认缴出资日期
     */
    public String getContDate() {
        return contDate;
    }

    /**
     * 认缴出资日期
     */
    public void setContDate(String contDate) {
        this.contDate = contDate;
    }

    /**
     * 认缴出资金额
     */
    public BigDecimal getContAmt() {
        return contAmt;
    }

    /**
     * 认缴出资金额
     */
    public void setContAmt(BigDecimal contAmt) {
        this.contAmt = contAmt;
    }

    /**
     * 实缴出资日期
     */
    public String getPaidDate() {
        return paidDate;
    }

    /**
     * 实缴出资日期
     */
    public void setPaidDate(String paidDate) {
        this.paidDate = paidDate;
    }

    /**
     * 实缴出资金额
     */
    public BigDecimal getPaidAmt() {
        return paidAmt;
    }

    /**
     * 实缴出资金额
     */
    public void setPaidAmt(BigDecimal paidAmt) {
        this.paidAmt = paidAmt;
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
        CorpHolderDto other = (CorpHolderDto) that;
        return (this.getHolderNo() == null ? other.getHolderNo() == null : this.getHolderNo().equals(other.getHolderNo()))
            && (this.getChangeDate() == null ? other.getChangeDate() == null : this.getChangeDate().equals(other.getChangeDate()))
            && (this.getCorpCode() == null ? other.getCorpCode() == null : this.getCorpCode().equals(other.getCorpCode()))
            && (this.getHolderName() == null ? other.getHolderName() == null : this.getHolderName().equals(other.getHolderName()))
            && (this.getHolderTypeCode() == null ? other.getHolderTypeCode() == null : this.getHolderTypeCode().equals(other.getHolderTypeCode()))
            && (this.getHolderCorpCode() == null ? other.getHolderCorpCode() == null : this.getHolderCorpCode().equals(other.getHolderCorpCode()))
            && (this.getHoldRatio() == null ? other.getHoldRatio() == null : this.getHoldRatio().equals(other.getHoldRatio()))
            && (this.getContDate() == null ? other.getContDate() == null : this.getContDate().equals(other.getContDate()))
            && (this.getContAmt() == null ? other.getContAmt() == null : this.getContAmt().equals(other.getContAmt()))
            && (this.getPaidDate() == null ? other.getPaidDate() == null : this.getPaidDate().equals(other.getPaidDate()))
            && (this.getPaidAmt() == null ? other.getPaidAmt() == null : this.getPaidAmt().equals(other.getPaidAmt()))
            && (this.getRowVersionNo() == null ? other.getRowVersionNo() == null : this.getRowVersionNo().equals(other.getRowVersionNo()))
            && (this.getLastOperateStaffCode() == null ? other.getLastOperateStaffCode() == null : this.getLastOperateStaffCode().equals(other.getLastOperateStaffCode()))
            && (this.getLastOperateDatetime() == null ? other.getLastOperateDatetime() == null : this.getLastOperateDatetime().equals(other.getLastOperateDatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHolderNo() == null) ? 0 : getHolderNo().hashCode());
        result = prime * result + ((getChangeDate() == null) ? 0 : getChangeDate().hashCode());
        result = prime * result + ((getCorpCode() == null) ? 0 : getCorpCode().hashCode());
        result = prime * result + ((getHolderName() == null) ? 0 : getHolderName().hashCode());
        result = prime * result + ((getHolderTypeCode() == null) ? 0 : getHolderTypeCode().hashCode());
        result = prime * result + ((getHolderCorpCode() == null) ? 0 : getHolderCorpCode().hashCode());
        result = prime * result + ((getHoldRatio() == null) ? 0 : getHoldRatio().hashCode());
        result = prime * result + ((getContDate() == null) ? 0 : getContDate().hashCode());
        result = prime * result + ((getContAmt() == null) ? 0 : getContAmt().hashCode());
        result = prime * result + ((getPaidDate() == null) ? 0 : getPaidDate().hashCode());
        result = prime * result + ((getPaidAmt() == null) ? 0 : getPaidAmt().hashCode());
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
        sb.append(", holderNo=").append(holderNo);
        sb.append(", changeDate=").append(changeDate);
        sb.append(", corpCode=").append(corpCode);
        sb.append(", holderName=").append(holderName);
        sb.append(", holderTypeCode=").append(holderTypeCode);
        sb.append(", holderCorpCode=").append(holderCorpCode);
        sb.append(", holdRatio=").append(holdRatio);
        sb.append(", contDate=").append(contDate);
        sb.append(", contAmt=").append(contAmt);
        sb.append(", paidDate=").append(paidDate);
        sb.append(", paidAmt=").append(paidAmt);
        sb.append(", rowVersionNo=").append(rowVersionNo);
        sb.append(", lastOperateStaffCode=").append(lastOperateStaffCode);
        sb.append(", lastOperateDatetime=").append(lastOperateDatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}