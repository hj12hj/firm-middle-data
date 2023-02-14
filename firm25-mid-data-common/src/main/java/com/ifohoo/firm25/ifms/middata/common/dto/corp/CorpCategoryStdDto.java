package com.ifohoo.firm25.ifms.middata.common.dto.corp;

import java.io.Serializable;
import java.util.Date;

/**
 * 企业分类标准表
 * @TableName CORP_CATEGORY_STD
 */
public class CorpCategoryStdDto implements Serializable {
    /**
     * 企业分类标准代码
     */
    private String corpCategoryStdCode;

    /**
     * 企业分类标准名称
     */
    private String corpCategoryStdName;

    /**
     * 备注
     */
    private String remarkText;

    /**
     * 显示顺序
     */
    private Integer displayOrderNo;

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
     * 企业分类标准名称
     */
    public String getCorpCategoryStdName() {
        return corpCategoryStdName;
    }

    /**
     * 企业分类标准名称
     */
    public void setCorpCategoryStdName(String corpCategoryStdName) {
        this.corpCategoryStdName = corpCategoryStdName;
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
     * 显示顺序
     */
    public Integer getDisplayOrderNo() {
        return displayOrderNo;
    }

    /**
     * 显示顺序
     */
    public void setDisplayOrderNo(Integer displayOrderNo) {
        this.displayOrderNo = displayOrderNo;
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
        CorpCategoryStdDto other = (CorpCategoryStdDto) that;
        return (this.getCorpCategoryStdCode() == null ? other.getCorpCategoryStdCode() == null : this.getCorpCategoryStdCode().equals(other.getCorpCategoryStdCode()))
            && (this.getCorpCategoryStdName() == null ? other.getCorpCategoryStdName() == null : this.getCorpCategoryStdName().equals(other.getCorpCategoryStdName()))
            && (this.getRemarkText() == null ? other.getRemarkText() == null : this.getRemarkText().equals(other.getRemarkText()))
            && (this.getDisplayOrderNo() == null ? other.getDisplayOrderNo() == null : this.getDisplayOrderNo().equals(other.getDisplayOrderNo()))
            && (this.getRowVersionNo() == null ? other.getRowVersionNo() == null : this.getRowVersionNo().equals(other.getRowVersionNo()))
            && (this.getLastOperateStaffCode() == null ? other.getLastOperateStaffCode() == null : this.getLastOperateStaffCode().equals(other.getLastOperateStaffCode()))
            && (this.getLastOperateDatetime() == null ? other.getLastOperateDatetime() == null : this.getLastOperateDatetime().equals(other.getLastOperateDatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCorpCategoryStdCode() == null) ? 0 : getCorpCategoryStdCode().hashCode());
        result = prime * result + ((getCorpCategoryStdName() == null) ? 0 : getCorpCategoryStdName().hashCode());
        result = prime * result + ((getRemarkText() == null) ? 0 : getRemarkText().hashCode());
        result = prime * result + ((getDisplayOrderNo() == null) ? 0 : getDisplayOrderNo().hashCode());
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
        sb.append(", corpCategoryStdName=").append(corpCategoryStdName);
        sb.append(", remarkText=").append(remarkText);
        sb.append(", displayOrderNo=").append(displayOrderNo);
        sb.append(", rowVersionNo=").append(rowVersionNo);
        sb.append(", lastOperateStaffCode=").append(lastOperateStaffCode);
        sb.append(", lastOperateDatetime=").append(lastOperateDatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}