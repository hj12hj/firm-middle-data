package com.ifohoo.firm25.ifms.middata.es.corp.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 企业资产状况信息表
 * @TableName CORP_ASSET
 */
public class CorpAsset implements Serializable {
    /**
     * 企业资产记录的唯一编号
     */
    private Long assetNo;

    /**
     * 披露日期
     */
    private String publishDate;

    /**
     * 企业代码
     */
    private String corpCode;

    /**
     * 年份
     */
    private String annualCode;

    /**
     * 报告类型
     */
    private String assetReportTypeCode;

    /**
     * 报告标题
     */
    private String reportTitleText;

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
     * 企业资产记录的唯一编号
     */
    public Long getAssetNo() {
        return assetNo;
    }

    /**
     * 企业资产记录的唯一编号
     */
    public void setAssetNo(Long assetNo) {
        this.assetNo = assetNo;
    }

    /**
     * 披露日期
     */
    public String getPublishDate() {
        return publishDate;
    }

    /**
     * 披露日期
     */
    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
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
     * 年份
     */
    public String getAnnualCode() {
        return annualCode;
    }

    /**
     * 年份
     */
    public void setAnnualCode(String annualCode) {
        this.annualCode = annualCode;
    }

    /**
     * 报告类型
     */
    public String getAssetReportTypeCode() {
        return assetReportTypeCode;
    }

    /**
     * 报告类型
     */
    public void setAssetReportTypeCode(String assetReportTypeCode) {
        this.assetReportTypeCode = assetReportTypeCode;
    }

    /**
     * 报告标题
     */
    public String getReportTitleText() {
        return reportTitleText;
    }

    /**
     * 报告标题
     */
    public void setReportTitleText(String reportTitleText) {
        this.reportTitleText = reportTitleText;
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
        CorpAsset other = (CorpAsset) that;
        return (this.getAssetNo() == null ? other.getAssetNo() == null : this.getAssetNo().equals(other.getAssetNo()))
            && (this.getPublishDate() == null ? other.getPublishDate() == null : this.getPublishDate().equals(other.getPublishDate()))
            && (this.getCorpCode() == null ? other.getCorpCode() == null : this.getCorpCode().equals(other.getCorpCode()))
            && (this.getAnnualCode() == null ? other.getAnnualCode() == null : this.getAnnualCode().equals(other.getAnnualCode()))
            && (this.getAssetReportTypeCode() == null ? other.getAssetReportTypeCode() == null : this.getAssetReportTypeCode().equals(other.getAssetReportTypeCode()))
            && (this.getReportTitleText() == null ? other.getReportTitleText() == null : this.getReportTitleText().equals(other.getReportTitleText()))
            && (this.getRowVersionNo() == null ? other.getRowVersionNo() == null : this.getRowVersionNo().equals(other.getRowVersionNo()))
            && (this.getLastOperateStaffCode() == null ? other.getLastOperateStaffCode() == null : this.getLastOperateStaffCode().equals(other.getLastOperateStaffCode()))
            && (this.getLastOperateDatetime() == null ? other.getLastOperateDatetime() == null : this.getLastOperateDatetime().equals(other.getLastOperateDatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAssetNo() == null) ? 0 : getAssetNo().hashCode());
        result = prime * result + ((getPublishDate() == null) ? 0 : getPublishDate().hashCode());
        result = prime * result + ((getCorpCode() == null) ? 0 : getCorpCode().hashCode());
        result = prime * result + ((getAnnualCode() == null) ? 0 : getAnnualCode().hashCode());
        result = prime * result + ((getAssetReportTypeCode() == null) ? 0 : getAssetReportTypeCode().hashCode());
        result = prime * result + ((getReportTitleText() == null) ? 0 : getReportTitleText().hashCode());
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
        sb.append(", assetNo=").append(assetNo);
        sb.append(", publishDate=").append(publishDate);
        sb.append(", corpCode=").append(corpCode);
        sb.append(", annualCode=").append(annualCode);
        sb.append(", assetReportTypeCode=").append(assetReportTypeCode);
        sb.append(", reportTitleText=").append(reportTitleText);
        sb.append(", rowVersionNo=").append(rowVersionNo);
        sb.append(", lastOperateStaffCode=").append(lastOperateStaffCode);
        sb.append(", lastOperateDatetime=").append(lastOperateDatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}