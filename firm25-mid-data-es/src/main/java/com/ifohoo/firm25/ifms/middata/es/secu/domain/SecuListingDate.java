package com.ifohoo.firm25.ifms.middata.es.secu.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 证券上市日期表(针对发行代码不等于上市代码)表
 * @TableName SECU_LISTING_DATE
 */
public class SecuListingDate implements Serializable {
    /**
     * 记录唯一编号
     */
    private Long listingDateNo;

    /**
     * 发行日期
     */
    private String issueDate;

    /**
     * 发行证券代码(伪代码)
     */
    private String issueSecuGlobalCode;

    /**
     * 上市日期
     */
    private String listingDate;

    /**
     * 上市证券代码
     */
    private String listingSecuGlobalCode;

    /**
     * 备注
     */
    private String remarkText;

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
    public Long getListingDateNo() {
        return listingDateNo;
    }

    /**
     * 记录唯一编号
     */
    public void setListingDateNo(Long listingDateNo) {
        this.listingDateNo = listingDateNo;
    }

    /**
     * 发行日期
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * 发行日期
     */
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * 发行证券代码(伪代码)
     */
    public String getIssueSecuGlobalCode() {
        return issueSecuGlobalCode;
    }

    /**
     * 发行证券代码(伪代码)
     */
    public void setIssueSecuGlobalCode(String issueSecuGlobalCode) {
        this.issueSecuGlobalCode = issueSecuGlobalCode;
    }

    /**
     * 上市日期
     */
    public String getListingDate() {
        return listingDate;
    }

    /**
     * 上市日期
     */
    public void setListingDate(String listingDate) {
        this.listingDate = listingDate;
    }

    /**
     * 上市证券代码
     */
    public String getListingSecuGlobalCode() {
        return listingSecuGlobalCode;
    }

    /**
     * 上市证券代码
     */
    public void setListingSecuGlobalCode(String listingSecuGlobalCode) {
        this.listingSecuGlobalCode = listingSecuGlobalCode;
    }

    /**
     * 备注
     */
    public String getRemarkText() {
        return remarkText;
    }

    /**
     * 备注
     */
    public void setRemarkText(String remarkText) {
        this.remarkText = remarkText;
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
        SecuListingDate other = (SecuListingDate) that;
        return (this.getListingDateNo() == null ? other.getListingDateNo() == null : this.getListingDateNo().equals(other.getListingDateNo()))
            && (this.getIssueDate() == null ? other.getIssueDate() == null : this.getIssueDate().equals(other.getIssueDate()))
            && (this.getIssueSecuGlobalCode() == null ? other.getIssueSecuGlobalCode() == null : this.getIssueSecuGlobalCode().equals(other.getIssueSecuGlobalCode()))
            && (this.getListingDate() == null ? other.getListingDate() == null : this.getListingDate().equals(other.getListingDate()))
            && (this.getListingSecuGlobalCode() == null ? other.getListingSecuGlobalCode() == null : this.getListingSecuGlobalCode().equals(other.getListingSecuGlobalCode()))
            && (this.getRemarkText() == null ? other.getRemarkText() == null : this.getRemarkText().equals(other.getRemarkText()))
            && (this.getRowVersionNo() == null ? other.getRowVersionNo() == null : this.getRowVersionNo().equals(other.getRowVersionNo()))
            && (this.getLastOperateStaffCode() == null ? other.getLastOperateStaffCode() == null : this.getLastOperateStaffCode().equals(other.getLastOperateStaffCode()))
            && (this.getLastOperateDatetime() == null ? other.getLastOperateDatetime() == null : this.getLastOperateDatetime().equals(other.getLastOperateDatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getListingDateNo() == null) ? 0 : getListingDateNo().hashCode());
        result = prime * result + ((getIssueDate() == null) ? 0 : getIssueDate().hashCode());
        result = prime * result + ((getIssueSecuGlobalCode() == null) ? 0 : getIssueSecuGlobalCode().hashCode());
        result = prime * result + ((getListingDate() == null) ? 0 : getListingDate().hashCode());
        result = prime * result + ((getListingSecuGlobalCode() == null) ? 0 : getListingSecuGlobalCode().hashCode());
        result = prime * result + ((getRemarkText() == null) ? 0 : getRemarkText().hashCode());
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
        sb.append(", listingDateNo=").append(listingDateNo);
        sb.append(", issueDate=").append(issueDate);
        sb.append(", issueSecuGlobalCode=").append(issueSecuGlobalCode);
        sb.append(", listingDate=").append(listingDate);
        sb.append(", listingSecuGlobalCode=").append(listingSecuGlobalCode);
        sb.append(", remarkText=").append(remarkText);
        sb.append(", rowVersionNo=").append(rowVersionNo);
        sb.append(", lastOperateStaffCode=").append(lastOperateStaffCode);
        sb.append(", lastOperateDatetime=").append(lastOperateDatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}