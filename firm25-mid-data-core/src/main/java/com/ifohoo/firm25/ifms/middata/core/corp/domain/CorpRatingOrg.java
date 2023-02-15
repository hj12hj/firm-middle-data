package com.ifohoo.firm25.ifms.middata.core.corp.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 评级机构表
 * @TableName CORP_RATING_ORG
 */
@TableName(value ="CORP_RATING_ORG")
public class CorpRatingOrg implements Serializable {
    /**
     * 评级机构代码
     */
    @TableId
    private String ratingOrgCode;

    /**
     * 评级机构名称
     */
    private String ratingOrgName;

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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 评级机构代码
     */
    public String getRatingOrgCode() {
        return ratingOrgCode;
    }

    /**
     * 评级机构代码
     */
    public void setRatingOrgCode(String ratingOrgCode) {
        this.ratingOrgCode = ratingOrgCode;
    }

    /**
     * 评级机构名称
     */
    public String getRatingOrgName() {
        return ratingOrgName;
    }

    /**
     * 评级机构名称
     */
    public void setRatingOrgName(String ratingOrgName) {
        this.ratingOrgName = ratingOrgName;
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
        CorpRatingOrg other = (CorpRatingOrg) that;
        return (this.getRatingOrgCode() == null ? other.getRatingOrgCode() == null : this.getRatingOrgCode().equals(other.getRatingOrgCode()))
            && (this.getRatingOrgName() == null ? other.getRatingOrgName() == null : this.getRatingOrgName().equals(other.getRatingOrgName()))
            && (this.getDisplayOrderNo() == null ? other.getDisplayOrderNo() == null : this.getDisplayOrderNo().equals(other.getDisplayOrderNo()))
            && (this.getRowVersionNo() == null ? other.getRowVersionNo() == null : this.getRowVersionNo().equals(other.getRowVersionNo()))
            && (this.getLastOperateStaffCode() == null ? other.getLastOperateStaffCode() == null : this.getLastOperateStaffCode().equals(other.getLastOperateStaffCode()))
            && (this.getLastOperateDatetime() == null ? other.getLastOperateDatetime() == null : this.getLastOperateDatetime().equals(other.getLastOperateDatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRatingOrgCode() == null) ? 0 : getRatingOrgCode().hashCode());
        result = prime * result + ((getRatingOrgName() == null) ? 0 : getRatingOrgName().hashCode());
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
        sb.append(", ratingOrgCode=").append(ratingOrgCode);
        sb.append(", ratingOrgName=").append(ratingOrgName);
        sb.append(", displayOrderNo=").append(displayOrderNo);
        sb.append(", rowVersionNo=").append(rowVersionNo);
        sb.append(", lastOperateStaffCode=").append(lastOperateStaffCode);
        sb.append(", lastOperateDatetime=").append(lastOperateDatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}