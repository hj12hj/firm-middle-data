package com.ifohoo.firm25.ifms.middata.common.dto.corp;

import java.io.Serializable;
import java.util.Date;

/**
 * 企业评级（主体评级）表
 * @TableName CORP_RATING
 */
public class CorpRatingDto implements Serializable {
    /**
     * 记录的唯一编号
     */
    private Long ratingNo;

    /**
     * 发布日期
     */
    private String publishDate;

    /**
     * 评级日期
     */
    private String ratingDate;

    /**
     * 企业代码
     */
    private String corpCode;

    /**
     * 评估机构
     */
    private String ratingOrgCode;

    /**
     * 评级代码
     */
    private String ratingCode;

    /**
     * 评级展望
     */
    private String ratingOutlookText;

    /**
     * 评级变动方向
     */
    private String ratingDirectionCode;

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
    public Long getRatingNo() {
        return ratingNo;
    }

    /**
     * 记录的唯一编号
     */
    public void setRatingNo(Long ratingNo) {
        this.ratingNo = ratingNo;
    }

    /**
     * 发布日期
     */
    public String getPublishDate() {
        return publishDate;
    }

    /**
     * 发布日期
     */
    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    /**
     * 评级日期
     */
    public String getRatingDate() {
        return ratingDate;
    }

    /**
     * 评级日期
     */
    public void setRatingDate(String ratingDate) {
        this.ratingDate = ratingDate;
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
     * 评估机构
     */
    public String getRatingOrgCode() {
        return ratingOrgCode;
    }

    /**
     * 评估机构
     */
    public void setRatingOrgCode(String ratingOrgCode) {
        this.ratingOrgCode = ratingOrgCode;
    }

    /**
     * 评级代码
     */
    public String getRatingCode() {
        return ratingCode;
    }

    /**
     * 评级代码
     */
    public void setRatingCode(String ratingCode) {
        this.ratingCode = ratingCode;
    }

    /**
     * 评级展望
     */
    public String getRatingOutlookText() {
        return ratingOutlookText;
    }

    /**
     * 评级展望
     */
    public void setRatingOutlookText(String ratingOutlookText) {
        this.ratingOutlookText = ratingOutlookText;
    }

    /**
     * 评级变动方向
     */
    public String getRatingDirectionCode() {
        return ratingDirectionCode;
    }

    /**
     * 评级变动方向
     */
    public void setRatingDirectionCode(String ratingDirectionCode) {
        this.ratingDirectionCode = ratingDirectionCode;
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
        CorpRatingDto other = (CorpRatingDto) that;
        return (this.getRatingNo() == null ? other.getRatingNo() == null : this.getRatingNo().equals(other.getRatingNo()))
            && (this.getPublishDate() == null ? other.getPublishDate() == null : this.getPublishDate().equals(other.getPublishDate()))
            && (this.getRatingDate() == null ? other.getRatingDate() == null : this.getRatingDate().equals(other.getRatingDate()))
            && (this.getCorpCode() == null ? other.getCorpCode() == null : this.getCorpCode().equals(other.getCorpCode()))
            && (this.getRatingOrgCode() == null ? other.getRatingOrgCode() == null : this.getRatingOrgCode().equals(other.getRatingOrgCode()))
            && (this.getRatingCode() == null ? other.getRatingCode() == null : this.getRatingCode().equals(other.getRatingCode()))
            && (this.getRatingOutlookText() == null ? other.getRatingOutlookText() == null : this.getRatingOutlookText().equals(other.getRatingOutlookText()))
            && (this.getRatingDirectionCode() == null ? other.getRatingDirectionCode() == null : this.getRatingDirectionCode().equals(other.getRatingDirectionCode()))
            && (this.getRowVersionNo() == null ? other.getRowVersionNo() == null : this.getRowVersionNo().equals(other.getRowVersionNo()))
            && (this.getLastOperateStaffCode() == null ? other.getLastOperateStaffCode() == null : this.getLastOperateStaffCode().equals(other.getLastOperateStaffCode()))
            && (this.getLastOperateDatetime() == null ? other.getLastOperateDatetime() == null : this.getLastOperateDatetime().equals(other.getLastOperateDatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRatingNo() == null) ? 0 : getRatingNo().hashCode());
        result = prime * result + ((getPublishDate() == null) ? 0 : getPublishDate().hashCode());
        result = prime * result + ((getRatingDate() == null) ? 0 : getRatingDate().hashCode());
        result = prime * result + ((getCorpCode() == null) ? 0 : getCorpCode().hashCode());
        result = prime * result + ((getRatingOrgCode() == null) ? 0 : getRatingOrgCode().hashCode());
        result = prime * result + ((getRatingCode() == null) ? 0 : getRatingCode().hashCode());
        result = prime * result + ((getRatingOutlookText() == null) ? 0 : getRatingOutlookText().hashCode());
        result = prime * result + ((getRatingDirectionCode() == null) ? 0 : getRatingDirectionCode().hashCode());
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
        sb.append(", ratingNo=").append(ratingNo);
        sb.append(", publishDate=").append(publishDate);
        sb.append(", ratingDate=").append(ratingDate);
        sb.append(", corpCode=").append(corpCode);
        sb.append(", ratingOrgCode=").append(ratingOrgCode);
        sb.append(", ratingCode=").append(ratingCode);
        sb.append(", ratingOutlookText=").append(ratingOutlookText);
        sb.append(", ratingDirectionCode=").append(ratingDirectionCode);
        sb.append(", rowVersionNo=").append(rowVersionNo);
        sb.append(", lastOperateStaffCode=").append(lastOperateStaffCode);
        sb.append(", lastOperateDatetime=").append(lastOperateDatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}