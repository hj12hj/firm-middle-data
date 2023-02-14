package com.ifohoo.firm25.ifms.middata.es.corp.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 企业分类标准明细表
 * @TableName CORP_CATEGORY_STD_DETAIL
 */
public class CorpCategoryStdDetail implements Serializable {
    /**
     * 企业分类标准代码
     */
    private String corpCategoryStdCode;

    /**
     * 企业分类代码
     */
    private String corpCategoryCode;

    /**
     * 企业分类名称
     */
    private String corpCategoryName;

    /**
     * 上级企业分类代码
     */
    private String parentCorpCategoryCode;

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
     * 企业分类标准代码
     */
    public String getCorpCategoryStdCode() {
        return corpCategoryStdCode;
    }

    /**
     * 企业分类标准代码
     */
    public void setCorpCategoryStdCode(String corpCategoryStdCode) {
        this.corpCategoryStdCode = corpCategoryStdCode;
    }

    /**
     * 企业分类代码
     */
    public String getCorpCategoryCode() {
        return corpCategoryCode;
    }

    /**
     * 企业分类代码
     */
    public void setCorpCategoryCode(String corpCategoryCode) {
        this.corpCategoryCode = corpCategoryCode;
    }

    /**
     * 企业分类名称
     */
    public String getCorpCategoryName() {
        return corpCategoryName;
    }

    /**
     * 企业分类名称
     */
    public void setCorpCategoryName(String corpCategoryName) {
        this.corpCategoryName = corpCategoryName;
    }

    /**
     * 上级企业分类代码
     */
    public String getParentCorpCategoryCode() {
        return parentCorpCategoryCode;
    }

    /**
     * 上级企业分类代码
     */
    public void setParentCorpCategoryCode(String parentCorpCategoryCode) {
        this.parentCorpCategoryCode = parentCorpCategoryCode;
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
        CorpCategoryStdDetail other = (CorpCategoryStdDetail) that;
        return (this.getCorpCategoryStdCode() == null ? other.getCorpCategoryStdCode() == null : this.getCorpCategoryStdCode().equals(other.getCorpCategoryStdCode()))
            && (this.getCorpCategoryCode() == null ? other.getCorpCategoryCode() == null : this.getCorpCategoryCode().equals(other.getCorpCategoryCode()))
            && (this.getCorpCategoryName() == null ? other.getCorpCategoryName() == null : this.getCorpCategoryName().equals(other.getCorpCategoryName()))
            && (this.getParentCorpCategoryCode() == null ? other.getParentCorpCategoryCode() == null : this.getParentCorpCategoryCode().equals(other.getParentCorpCategoryCode()))
            && (this.getRowVersionNo() == null ? other.getRowVersionNo() == null : this.getRowVersionNo().equals(other.getRowVersionNo()))
            && (this.getLastOperateStaffCode() == null ? other.getLastOperateStaffCode() == null : this.getLastOperateStaffCode().equals(other.getLastOperateStaffCode()))
            && (this.getLastOperateDatetime() == null ? other.getLastOperateDatetime() == null : this.getLastOperateDatetime().equals(other.getLastOperateDatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCorpCategoryStdCode() == null) ? 0 : getCorpCategoryStdCode().hashCode());
        result = prime * result + ((getCorpCategoryCode() == null) ? 0 : getCorpCategoryCode().hashCode());
        result = prime * result + ((getCorpCategoryName() == null) ? 0 : getCorpCategoryName().hashCode());
        result = prime * result + ((getParentCorpCategoryCode() == null) ? 0 : getParentCorpCategoryCode().hashCode());
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
        sb.append(", corpCategoryStdCode=").append(corpCategoryStdCode);
        sb.append(", corpCategoryCode=").append(corpCategoryCode);
        sb.append(", corpCategoryName=").append(corpCategoryName);
        sb.append(", parentCorpCategoryCode=").append(parentCorpCategoryCode);
        sb.append(", rowVersionNo=").append(rowVersionNo);
        sb.append(", lastOperateStaffCode=").append(lastOperateStaffCode);
        sb.append(", lastOperateDatetime=").append(lastOperateDatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}