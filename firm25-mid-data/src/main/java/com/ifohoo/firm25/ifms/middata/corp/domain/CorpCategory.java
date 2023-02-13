package com.ifohoo.firm25.ifms.middata.corp.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 企业分类信息表
 * @TableName CORP_CATEGORY
 */
@TableName(value ="CORP_CATEGORY")
public class CorpCategory implements Serializable {
    /**
     * 记录的唯一编号
     */
    @TableId
    private Long categoryNo;

    /**
     * 企业代码
     */
    private String corpCode;

    /**
     * 企业分类标准代码
     */
    private String corpCategoryStdCode;

    /**
     * 企业分类代码
     */
    private String corpCategoryCode;

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
     * 记录的唯一编号
     */
    public Long getCategoryNo() {
        return categoryNo;
    }

    /**
     * 记录的唯一编号
     */
    public void setCategoryNo(Long categoryNo) {
        this.categoryNo = categoryNo;
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
        CorpCategory other = (CorpCategory) that;
        return (this.getCategoryNo() == null ? other.getCategoryNo() == null : this.getCategoryNo().equals(other.getCategoryNo()))
            && (this.getCorpCode() == null ? other.getCorpCode() == null : this.getCorpCode().equals(other.getCorpCode()))
            && (this.getCorpCategoryStdCode() == null ? other.getCorpCategoryStdCode() == null : this.getCorpCategoryStdCode().equals(other.getCorpCategoryStdCode()))
            && (this.getCorpCategoryCode() == null ? other.getCorpCategoryCode() == null : this.getCorpCategoryCode().equals(other.getCorpCategoryCode()))
            && (this.getRowVersionNo() == null ? other.getRowVersionNo() == null : this.getRowVersionNo().equals(other.getRowVersionNo()))
            && (this.getLastOperateStaffCode() == null ? other.getLastOperateStaffCode() == null : this.getLastOperateStaffCode().equals(other.getLastOperateStaffCode()))
            && (this.getLastOperateDatetime() == null ? other.getLastOperateDatetime() == null : this.getLastOperateDatetime().equals(other.getLastOperateDatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCategoryNo() == null) ? 0 : getCategoryNo().hashCode());
        result = prime * result + ((getCorpCode() == null) ? 0 : getCorpCode().hashCode());
        result = prime * result + ((getCorpCategoryStdCode() == null) ? 0 : getCorpCategoryStdCode().hashCode());
        result = prime * result + ((getCorpCategoryCode() == null) ? 0 : getCorpCategoryCode().hashCode());
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
        sb.append(", categoryNo=").append(categoryNo);
        sb.append(", corpCode=").append(corpCode);
        sb.append(", corpCategoryStdCode=").append(corpCategoryStdCode);
        sb.append(", corpCategoryCode=").append(corpCategoryCode);
        sb.append(", rowVersionNo=").append(rowVersionNo);
        sb.append(", lastOperateStaffCode=").append(lastOperateStaffCode);
        sb.append(", lastOperateDatetime=").append(lastOperateDatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}