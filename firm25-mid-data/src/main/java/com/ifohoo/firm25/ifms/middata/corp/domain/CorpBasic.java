package com.ifohoo.firm25.ifms.middata.corp.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 企业基本信息表
 * @TableName CORP_BASIC
 */
@TableName(value ="CORP_BASIC")
public class CorpBasic implements Serializable {
    /**
     * 企业代码
     */
    @TableId
    private String corpCode;

    /**
     * 企业简称
     */
    private String corpName;

    /**
     * 企业全称
     */
    private String corpFullname;

    /**
     * 企业英文简称
     */
    private String corpForeignName;

    /**
     * 企业英文全称
     */
    private String corpForeignFullname;

    /**
     * 电话号码
     */
    private String telephoneText;

    /**
     * 传真号码
     */
    private String faxText;

    /**
     * 邮箱
     */
    private String emailText;

    /**
     * 网址
     */
    private String websiteText;

    /**
     * 邮政编码
     */
    private String postCode;

    /**
     * 统一社会信用代码
     */
    private String creditCode;

    /**
     * 工商注册号
     */
    private String registerCode;

    /**
     * 组织机构代码
     */
    private String organizationCode;

    /**
     * 经营状态
     */
    private String corpOperatingStatusCode;

    /**
     * 成立日期
     */
    private String establishedDate;

    /**
     * 法定代表人
     */
    private String legalRepresentativeName;

    /**
     * 董事会秘书
     */
    private String boardSecretaryName;

    /**
     * 注册资本
     */
    private BigDecimal registerCapitalAmt;

    /**
     * 实缴资本
     */
    private BigDecimal paidCapitalAmt;

    /**
     * 营业期限
     */
    private String operatingDurText;

    /**
     * 登记机关
     */
    private String recordAuthorityName;

    /**
     * 发照日期
     */
    private String issueDate;

    /**
     * 注册地址
     */
    private String registerAddressText;

    /**
     * 办公地址
     */
    private String officeAddressText;

    /**
     * 经营范围
     */
    private String operatingScopeText;

    /**
     * 行政区划代码
     */
    private String areaCode;

    /**
     * 企业类型
     */
    private String corpTypeCode;

    /**
     * 企业规模标识
     */
    private String corpScaleFlagCode;

    /**
     * 境内境外标识
     */
    private String corpLocalFlagCode;

    /**
     * 城乡标志
     */
    private String corpCityFlagCode;

    /**
     * 全球法人识别编码（20位LEI 码）
     */
    private String leiCode;

    /**
     * 第三方资讯数据的企业代码
     */
    private String thirdCorpCode;

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

    /**
     * 
     */
    private String oldCorpCode;

    /**
     * 
     */
    private Long oldCorpNo;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

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
     * 企业简称
     */
    public String getCorpName() {
        return corpName;
    }

    /**
     * 企业简称
     */
    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    /**
     * 企业全称
     */
    public String getCorpFullname() {
        return corpFullname;
    }

    /**
     * 企业全称
     */
    public void setCorpFullname(String corpFullname) {
        this.corpFullname = corpFullname;
    }

    /**
     * 企业英文简称
     */
    public String getCorpForeignName() {
        return corpForeignName;
    }

    /**
     * 企业英文简称
     */
    public void setCorpForeignName(String corpForeignName) {
        this.corpForeignName = corpForeignName;
    }

    /**
     * 企业英文全称
     */
    public String getCorpForeignFullname() {
        return corpForeignFullname;
    }

    /**
     * 企业英文全称
     */
    public void setCorpForeignFullname(String corpForeignFullname) {
        this.corpForeignFullname = corpForeignFullname;
    }

    /**
     * 电话号码
     */
    public String getTelephoneText() {
        return telephoneText;
    }

    /**
     * 电话号码
     */
    public void setTelephoneText(String telephoneText) {
        this.telephoneText = telephoneText;
    }

    /**
     * 传真号码
     */
    public String getFaxText() {
        return faxText;
    }

    /**
     * 传真号码
     */
    public void setFaxText(String faxText) {
        this.faxText = faxText;
    }

    /**
     * 邮箱
     */
    public String getEmailText() {
        return emailText;
    }

    /**
     * 邮箱
     */
    public void setEmailText(String emailText) {
        this.emailText = emailText;
    }

    /**
     * 网址
     */
    public String getWebsiteText() {
        return websiteText;
    }

    /**
     * 网址
     */
    public void setWebsiteText(String websiteText) {
        this.websiteText = websiteText;
    }

    /**
     * 邮政编码
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * 邮政编码
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * 统一社会信用代码
     */
    public String getCreditCode() {
        return creditCode;
    }

    /**
     * 统一社会信用代码
     */
    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }

    /**
     * 工商注册号
     */
    public String getRegisterCode() {
        return registerCode;
    }

    /**
     * 工商注册号
     */
    public void setRegisterCode(String registerCode) {
        this.registerCode = registerCode;
    }

    /**
     * 组织机构代码
     */
    public String getOrganizationCode() {
        return organizationCode;
    }

    /**
     * 组织机构代码
     */
    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    /**
     * 经营状态
     */
    public String getCorpOperatingStatusCode() {
        return corpOperatingStatusCode;
    }

    /**
     * 经营状态
     */
    public void setCorpOperatingStatusCode(String corpOperatingStatusCode) {
        this.corpOperatingStatusCode = corpOperatingStatusCode;
    }

    /**
     * 成立日期
     */
    public String getEstablishedDate() {
        return establishedDate;
    }

    /**
     * 成立日期
     */
    public void setEstablishedDate(String establishedDate) {
        this.establishedDate = establishedDate;
    }

    /**
     * 法定代表人
     */
    public String getLegalRepresentativeName() {
        return legalRepresentativeName;
    }

    /**
     * 法定代表人
     */
    public void setLegalRepresentativeName(String legalRepresentativeName) {
        this.legalRepresentativeName = legalRepresentativeName;
    }

    /**
     * 董事会秘书
     */
    public String getBoardSecretaryName() {
        return boardSecretaryName;
    }

    /**
     * 董事会秘书
     */
    public void setBoardSecretaryName(String boardSecretaryName) {
        this.boardSecretaryName = boardSecretaryName;
    }

    /**
     * 注册资本
     */
    public BigDecimal getRegisterCapitalAmt() {
        return registerCapitalAmt;
    }

    /**
     * 注册资本
     */
    public void setRegisterCapitalAmt(BigDecimal registerCapitalAmt) {
        this.registerCapitalAmt = registerCapitalAmt;
    }

    /**
     * 实缴资本
     */
    public BigDecimal getPaidCapitalAmt() {
        return paidCapitalAmt;
    }

    /**
     * 实缴资本
     */
    public void setPaidCapitalAmt(BigDecimal paidCapitalAmt) {
        this.paidCapitalAmt = paidCapitalAmt;
    }

    /**
     * 营业期限
     */
    public String getOperatingDurText() {
        return operatingDurText;
    }

    /**
     * 营业期限
     */
    public void setOperatingDurText(String operatingDurText) {
        this.operatingDurText = operatingDurText;
    }

    /**
     * 登记机关
     */
    public String getRecordAuthorityName() {
        return recordAuthorityName;
    }

    /**
     * 登记机关
     */
    public void setRecordAuthorityName(String recordAuthorityName) {
        this.recordAuthorityName = recordAuthorityName;
    }

    /**
     * 发照日期
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * 发照日期
     */
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * 注册地址
     */
    public String getRegisterAddressText() {
        return registerAddressText;
    }

    /**
     * 注册地址
     */
    public void setRegisterAddressText(String registerAddressText) {
        this.registerAddressText = registerAddressText;
    }

    /**
     * 办公地址
     */
    public String getOfficeAddressText() {
        return officeAddressText;
    }

    /**
     * 办公地址
     */
    public void setOfficeAddressText(String officeAddressText) {
        this.officeAddressText = officeAddressText;
    }

    /**
     * 经营范围
     */
    public String getOperatingScopeText() {
        return operatingScopeText;
    }

    /**
     * 经营范围
     */
    public void setOperatingScopeText(String operatingScopeText) {
        this.operatingScopeText = operatingScopeText;
    }

    /**
     * 行政区划代码
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * 行政区划代码
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * 企业类型
     */
    public String getCorpTypeCode() {
        return corpTypeCode;
    }

    /**
     * 企业类型
     */
    public void setCorpTypeCode(String corpTypeCode) {
        this.corpTypeCode = corpTypeCode;
    }

    /**
     * 企业规模标识
     */
    public String getCorpScaleFlagCode() {
        return corpScaleFlagCode;
    }

    /**
     * 企业规模标识
     */
    public void setCorpScaleFlagCode(String corpScaleFlagCode) {
        this.corpScaleFlagCode = corpScaleFlagCode;
    }

    /**
     * 境内境外标识
     */
    public String getCorpLocalFlagCode() {
        return corpLocalFlagCode;
    }

    /**
     * 境内境外标识
     */
    public void setCorpLocalFlagCode(String corpLocalFlagCode) {
        this.corpLocalFlagCode = corpLocalFlagCode;
    }

    /**
     * 城乡标志
     */
    public String getCorpCityFlagCode() {
        return corpCityFlagCode;
    }

    /**
     * 城乡标志
     */
    public void setCorpCityFlagCode(String corpCityFlagCode) {
        this.corpCityFlagCode = corpCityFlagCode;
    }

    /**
     * 全球法人识别编码（20位LEI 码）
     */
    public String getLeiCode() {
        return leiCode;
    }

    /**
     * 全球法人识别编码（20位LEI 码）
     */
    public void setLeiCode(String leiCode) {
        this.leiCode = leiCode;
    }

    /**
     * 第三方资讯数据的企业代码
     */
    public String getThirdCorpCode() {
        return thirdCorpCode;
    }

    /**
     * 第三方资讯数据的企业代码
     */
    public void setThirdCorpCode(String thirdCorpCode) {
        this.thirdCorpCode = thirdCorpCode;
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

    /**
     * 
     */
    public String getOldCorpCode() {
        return oldCorpCode;
    }

    /**
     * 
     */
    public void setOldCorpCode(String oldCorpCode) {
        this.oldCorpCode = oldCorpCode;
    }

    /**
     * 
     */
    public Long getOldCorpNo() {
        return oldCorpNo;
    }

    /**
     * 
     */
    public void setOldCorpNo(Long oldCorpNo) {
        this.oldCorpNo = oldCorpNo;
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
        CorpBasic other = (CorpBasic) that;
        return (this.getCorpCode() == null ? other.getCorpCode() == null : this.getCorpCode().equals(other.getCorpCode()))
            && (this.getCorpName() == null ? other.getCorpName() == null : this.getCorpName().equals(other.getCorpName()))
            && (this.getCorpFullname() == null ? other.getCorpFullname() == null : this.getCorpFullname().equals(other.getCorpFullname()))
            && (this.getCorpForeignName() == null ? other.getCorpForeignName() == null : this.getCorpForeignName().equals(other.getCorpForeignName()))
            && (this.getCorpForeignFullname() == null ? other.getCorpForeignFullname() == null : this.getCorpForeignFullname().equals(other.getCorpForeignFullname()))
            && (this.getTelephoneText() == null ? other.getTelephoneText() == null : this.getTelephoneText().equals(other.getTelephoneText()))
            && (this.getFaxText() == null ? other.getFaxText() == null : this.getFaxText().equals(other.getFaxText()))
            && (this.getEmailText() == null ? other.getEmailText() == null : this.getEmailText().equals(other.getEmailText()))
            && (this.getWebsiteText() == null ? other.getWebsiteText() == null : this.getWebsiteText().equals(other.getWebsiteText()))
            && (this.getPostCode() == null ? other.getPostCode() == null : this.getPostCode().equals(other.getPostCode()))
            && (this.getCreditCode() == null ? other.getCreditCode() == null : this.getCreditCode().equals(other.getCreditCode()))
            && (this.getRegisterCode() == null ? other.getRegisterCode() == null : this.getRegisterCode().equals(other.getRegisterCode()))
            && (this.getOrganizationCode() == null ? other.getOrganizationCode() == null : this.getOrganizationCode().equals(other.getOrganizationCode()))
            && (this.getCorpOperatingStatusCode() == null ? other.getCorpOperatingStatusCode() == null : this.getCorpOperatingStatusCode().equals(other.getCorpOperatingStatusCode()))
            && (this.getEstablishedDate() == null ? other.getEstablishedDate() == null : this.getEstablishedDate().equals(other.getEstablishedDate()))
            && (this.getLegalRepresentativeName() == null ? other.getLegalRepresentativeName() == null : this.getLegalRepresentativeName().equals(other.getLegalRepresentativeName()))
            && (this.getBoardSecretaryName() == null ? other.getBoardSecretaryName() == null : this.getBoardSecretaryName().equals(other.getBoardSecretaryName()))
            && (this.getRegisterCapitalAmt() == null ? other.getRegisterCapitalAmt() == null : this.getRegisterCapitalAmt().equals(other.getRegisterCapitalAmt()))
            && (this.getPaidCapitalAmt() == null ? other.getPaidCapitalAmt() == null : this.getPaidCapitalAmt().equals(other.getPaidCapitalAmt()))
            && (this.getOperatingDurText() == null ? other.getOperatingDurText() == null : this.getOperatingDurText().equals(other.getOperatingDurText()))
            && (this.getRecordAuthorityName() == null ? other.getRecordAuthorityName() == null : this.getRecordAuthorityName().equals(other.getRecordAuthorityName()))
            && (this.getIssueDate() == null ? other.getIssueDate() == null : this.getIssueDate().equals(other.getIssueDate()))
            && (this.getRegisterAddressText() == null ? other.getRegisterAddressText() == null : this.getRegisterAddressText().equals(other.getRegisterAddressText()))
            && (this.getOfficeAddressText() == null ? other.getOfficeAddressText() == null : this.getOfficeAddressText().equals(other.getOfficeAddressText()))
            && (this.getOperatingScopeText() == null ? other.getOperatingScopeText() == null : this.getOperatingScopeText().equals(other.getOperatingScopeText()))
            && (this.getAreaCode() == null ? other.getAreaCode() == null : this.getAreaCode().equals(other.getAreaCode()))
            && (this.getCorpTypeCode() == null ? other.getCorpTypeCode() == null : this.getCorpTypeCode().equals(other.getCorpTypeCode()))
            && (this.getCorpScaleFlagCode() == null ? other.getCorpScaleFlagCode() == null : this.getCorpScaleFlagCode().equals(other.getCorpScaleFlagCode()))
            && (this.getCorpLocalFlagCode() == null ? other.getCorpLocalFlagCode() == null : this.getCorpLocalFlagCode().equals(other.getCorpLocalFlagCode()))
            && (this.getCorpCityFlagCode() == null ? other.getCorpCityFlagCode() == null : this.getCorpCityFlagCode().equals(other.getCorpCityFlagCode()))
            && (this.getLeiCode() == null ? other.getLeiCode() == null : this.getLeiCode().equals(other.getLeiCode()))
            && (this.getThirdCorpCode() == null ? other.getThirdCorpCode() == null : this.getThirdCorpCode().equals(other.getThirdCorpCode()))
            && (this.getRowVersionNo() == null ? other.getRowVersionNo() == null : this.getRowVersionNo().equals(other.getRowVersionNo()))
            && (this.getLastOperateStaffCode() == null ? other.getLastOperateStaffCode() == null : this.getLastOperateStaffCode().equals(other.getLastOperateStaffCode()))
            && (this.getLastOperateDatetime() == null ? other.getLastOperateDatetime() == null : this.getLastOperateDatetime().equals(other.getLastOperateDatetime()))
            && (this.getOldCorpCode() == null ? other.getOldCorpCode() == null : this.getOldCorpCode().equals(other.getOldCorpCode()))
            && (this.getOldCorpNo() == null ? other.getOldCorpNo() == null : this.getOldCorpNo().equals(other.getOldCorpNo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCorpCode() == null) ? 0 : getCorpCode().hashCode());
        result = prime * result + ((getCorpName() == null) ? 0 : getCorpName().hashCode());
        result = prime * result + ((getCorpFullname() == null) ? 0 : getCorpFullname().hashCode());
        result = prime * result + ((getCorpForeignName() == null) ? 0 : getCorpForeignName().hashCode());
        result = prime * result + ((getCorpForeignFullname() == null) ? 0 : getCorpForeignFullname().hashCode());
        result = prime * result + ((getTelephoneText() == null) ? 0 : getTelephoneText().hashCode());
        result = prime * result + ((getFaxText() == null) ? 0 : getFaxText().hashCode());
        result = prime * result + ((getEmailText() == null) ? 0 : getEmailText().hashCode());
        result = prime * result + ((getWebsiteText() == null) ? 0 : getWebsiteText().hashCode());
        result = prime * result + ((getPostCode() == null) ? 0 : getPostCode().hashCode());
        result = prime * result + ((getCreditCode() == null) ? 0 : getCreditCode().hashCode());
        result = prime * result + ((getRegisterCode() == null) ? 0 : getRegisterCode().hashCode());
        result = prime * result + ((getOrganizationCode() == null) ? 0 : getOrganizationCode().hashCode());
        result = prime * result + ((getCorpOperatingStatusCode() == null) ? 0 : getCorpOperatingStatusCode().hashCode());
        result = prime * result + ((getEstablishedDate() == null) ? 0 : getEstablishedDate().hashCode());
        result = prime * result + ((getLegalRepresentativeName() == null) ? 0 : getLegalRepresentativeName().hashCode());
        result = prime * result + ((getBoardSecretaryName() == null) ? 0 : getBoardSecretaryName().hashCode());
        result = prime * result + ((getRegisterCapitalAmt() == null) ? 0 : getRegisterCapitalAmt().hashCode());
        result = prime * result + ((getPaidCapitalAmt() == null) ? 0 : getPaidCapitalAmt().hashCode());
        result = prime * result + ((getOperatingDurText() == null) ? 0 : getOperatingDurText().hashCode());
        result = prime * result + ((getRecordAuthorityName() == null) ? 0 : getRecordAuthorityName().hashCode());
        result = prime * result + ((getIssueDate() == null) ? 0 : getIssueDate().hashCode());
        result = prime * result + ((getRegisterAddressText() == null) ? 0 : getRegisterAddressText().hashCode());
        result = prime * result + ((getOfficeAddressText() == null) ? 0 : getOfficeAddressText().hashCode());
        result = prime * result + ((getOperatingScopeText() == null) ? 0 : getOperatingScopeText().hashCode());
        result = prime * result + ((getAreaCode() == null) ? 0 : getAreaCode().hashCode());
        result = prime * result + ((getCorpTypeCode() == null) ? 0 : getCorpTypeCode().hashCode());
        result = prime * result + ((getCorpScaleFlagCode() == null) ? 0 : getCorpScaleFlagCode().hashCode());
        result = prime * result + ((getCorpLocalFlagCode() == null) ? 0 : getCorpLocalFlagCode().hashCode());
        result = prime * result + ((getCorpCityFlagCode() == null) ? 0 : getCorpCityFlagCode().hashCode());
        result = prime * result + ((getLeiCode() == null) ? 0 : getLeiCode().hashCode());
        result = prime * result + ((getThirdCorpCode() == null) ? 0 : getThirdCorpCode().hashCode());
        result = prime * result + ((getRowVersionNo() == null) ? 0 : getRowVersionNo().hashCode());
        result = prime * result + ((getLastOperateStaffCode() == null) ? 0 : getLastOperateStaffCode().hashCode());
        result = prime * result + ((getLastOperateDatetime() == null) ? 0 : getLastOperateDatetime().hashCode());
        result = prime * result + ((getOldCorpCode() == null) ? 0 : getOldCorpCode().hashCode());
        result = prime * result + ((getOldCorpNo() == null) ? 0 : getOldCorpNo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", corpCode=").append(corpCode);
        sb.append(", corpName=").append(corpName);
        sb.append(", corpFullname=").append(corpFullname);
        sb.append(", corpForeignName=").append(corpForeignName);
        sb.append(", corpForeignFullname=").append(corpForeignFullname);
        sb.append(", telephoneText=").append(telephoneText);
        sb.append(", faxText=").append(faxText);
        sb.append(", emailText=").append(emailText);
        sb.append(", websiteText=").append(websiteText);
        sb.append(", postCode=").append(postCode);
        sb.append(", creditCode=").append(creditCode);
        sb.append(", registerCode=").append(registerCode);
        sb.append(", organizationCode=").append(organizationCode);
        sb.append(", corpOperatingStatusCode=").append(corpOperatingStatusCode);
        sb.append(", establishedDate=").append(establishedDate);
        sb.append(", legalRepresentativeName=").append(legalRepresentativeName);
        sb.append(", boardSecretaryName=").append(boardSecretaryName);
        sb.append(", registerCapitalAmt=").append(registerCapitalAmt);
        sb.append(", paidCapitalAmt=").append(paidCapitalAmt);
        sb.append(", operatingDurText=").append(operatingDurText);
        sb.append(", recordAuthorityName=").append(recordAuthorityName);
        sb.append(", issueDate=").append(issueDate);
        sb.append(", registerAddressText=").append(registerAddressText);
        sb.append(", officeAddressText=").append(officeAddressText);
        sb.append(", operatingScopeText=").append(operatingScopeText);
        sb.append(", areaCode=").append(areaCode);
        sb.append(", corpTypeCode=").append(corpTypeCode);
        sb.append(", corpScaleFlagCode=").append(corpScaleFlagCode);
        sb.append(", corpLocalFlagCode=").append(corpLocalFlagCode);
        sb.append(", corpCityFlagCode=").append(corpCityFlagCode);
        sb.append(", leiCode=").append(leiCode);
        sb.append(", thirdCorpCode=").append(thirdCorpCode);
        sb.append(", rowVersionNo=").append(rowVersionNo);
        sb.append(", lastOperateStaffCode=").append(lastOperateStaffCode);
        sb.append(", lastOperateDatetime=").append(lastOperateDatetime);
        sb.append(", oldCorpCode=").append(oldCorpCode);
        sb.append(", oldCorpNo=").append(oldCorpNo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}