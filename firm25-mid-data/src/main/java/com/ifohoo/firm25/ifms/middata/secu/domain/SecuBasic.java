package com.ifohoo.firm25.ifms.middata.secu.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 证券基本信息表
 * @TableName SECU_BASIC
 */
@TableName(value ="SECU_BASIC")
public class SecuBasic implements Serializable {
    /**
     * 系统的证券代码
     */
    @TableId
    private String secuGlobalCode;

    /**
     * 交易场所代码
     */
    private String exchangeCode;

    /**
     * 交易市场代码
     */
    private String marketCode;

    /**
     * 交易场所的证券代码
     */
    private String secuCode;

    /**
     * 证券简称
     */
    private String secuName;

    /**
     * 证券全称
     */
    private String secuFullname;

    /**
     * 拼音简写
     */
    private String pinyinText;

    /**
     * 证券英文简称
     */
    private String secuForeignName;

    /**
     * 证券英文全称
     */
    private String secuForeignFullname;

    /**
     * 证券类别代码
     */
    private String secuCategoryCode;

    /**
     * ISIN（国际证券识别编码）
     */
    private String isinCode;

    /**
     * 交易币种
     */
    private String tradeCurrencyCode;

    /**
     * 结算币种
     */
    private String settleCurrencyCode;

    /**
     * 发行日期
     */
    private String issueDate;

    /**
     * 上市\挂牌日期
     */
    private String listingDate;

    /**
     * 退市\摘牌日期
     */
    private String delistingDate;

    /**
     * 到期日期
     */
    private String dueDate;

    /**
     * 发行量
     */
    private BigDecimal issueQty;

    /**
     * 流通量
     */
    private BigDecimal circulateQty;

    /**
     * 发行价
     */
    private BigDecimal issuePrice;

    /**
     * 面值
     */
    private BigDecimal facevaluePrice;

    /**
     * 发行人的企业代码
     */
    private String issuerCorpCode;

    /**
     * 管理人的企业代码
     */
    private String managerCorpCode;

    /**
     * 托管人的企业代码
     */
    private String trusteeCorpCode;

    /**
     * 主承销人的企业代码
     */
    private String brokerCorpCode;

    /**
     * 附加编码1，资管产品统计编码
     */
    private String extra1Code;

    /**
     * 附加编码2，资管产品登记备案编码
     */
    private String extra2Code;

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
    private BigDecimal totalShareQty;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 系统的证券代码
     */
    public String getSecuGlobalCode() {
        return secuGlobalCode;
    }

    /**
     * 系统的证券代码
     */
    public void setSecuGlobalCode(String secuGlobalCode) {
        this.secuGlobalCode = secuGlobalCode;
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
     * 交易市场代码
     */
    public String getMarketCode() {
        return marketCode;
    }

    /**
     * 交易市场代码
     */
    public void setMarketCode(String marketCode) {
        this.marketCode = marketCode;
    }

    /**
     * 交易场所的证券代码
     */
    public String getSecuCode() {
        return secuCode;
    }

    /**
     * 交易场所的证券代码
     */
    public void setSecuCode(String secuCode) {
        this.secuCode = secuCode;
    }

    /**
     * 证券简称
     */
    public String getSecuName() {
        return secuName;
    }

    /**
     * 证券简称
     */
    public void setSecuName(String secuName) {
        this.secuName = secuName;
    }

    /**
     * 证券全称
     */
    public String getSecuFullname() {
        return secuFullname;
    }

    /**
     * 证券全称
     */
    public void setSecuFullname(String secuFullname) {
        this.secuFullname = secuFullname;
    }

    /**
     * 拼音简写
     */
    public String getPinyinText() {
        return pinyinText;
    }

    /**
     * 拼音简写
     */
    public void setPinyinText(String pinyinText) {
        this.pinyinText = pinyinText;
    }

    /**
     * 证券英文简称
     */
    public String getSecuForeignName() {
        return secuForeignName;
    }

    /**
     * 证券英文简称
     */
    public void setSecuForeignName(String secuForeignName) {
        this.secuForeignName = secuForeignName;
    }

    /**
     * 证券英文全称
     */
    public String getSecuForeignFullname() {
        return secuForeignFullname;
    }

    /**
     * 证券英文全称
     */
    public void setSecuForeignFullname(String secuForeignFullname) {
        this.secuForeignFullname = secuForeignFullname;
    }

    /**
     * 证券类别代码
     */
    public String getSecuCategoryCode() {
        return secuCategoryCode;
    }

    /**
     * 证券类别代码
     */
    public void setSecuCategoryCode(String secuCategoryCode) {
        this.secuCategoryCode = secuCategoryCode;
    }

    /**
     * ISIN（国际证券识别编码）
     */
    public String getIsinCode() {
        return isinCode;
    }

    /**
     * ISIN（国际证券识别编码）
     */
    public void setIsinCode(String isinCode) {
        this.isinCode = isinCode;
    }

    /**
     * 交易币种
     */
    public String getTradeCurrencyCode() {
        return tradeCurrencyCode;
    }

    /**
     * 交易币种
     */
    public void setTradeCurrencyCode(String tradeCurrencyCode) {
        this.tradeCurrencyCode = tradeCurrencyCode;
    }

    /**
     * 结算币种
     */
    public String getSettleCurrencyCode() {
        return settleCurrencyCode;
    }

    /**
     * 结算币种
     */
    public void setSettleCurrencyCode(String settleCurrencyCode) {
        this.settleCurrencyCode = settleCurrencyCode;
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
     * 上市\挂牌日期
     */
    public String getListingDate() {
        return listingDate;
    }

    /**
     * 上市\挂牌日期
     */
    public void setListingDate(String listingDate) {
        this.listingDate = listingDate;
    }

    /**
     * 退市\摘牌日期
     */
    public String getDelistingDate() {
        return delistingDate;
    }

    /**
     * 退市\摘牌日期
     */
    public void setDelistingDate(String delistingDate) {
        this.delistingDate = delistingDate;
    }

    /**
     * 到期日期
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * 到期日期
     */
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * 发行量
     */
    public BigDecimal getIssueQty() {
        return issueQty;
    }

    /**
     * 发行量
     */
    public void setIssueQty(BigDecimal issueQty) {
        this.issueQty = issueQty;
    }

    /**
     * 流通量
     */
    public BigDecimal getCirculateQty() {
        return circulateQty;
    }

    /**
     * 流通量
     */
    public void setCirculateQty(BigDecimal circulateQty) {
        this.circulateQty = circulateQty;
    }

    /**
     * 发行价
     */
    public BigDecimal getIssuePrice() {
        return issuePrice;
    }

    /**
     * 发行价
     */
    public void setIssuePrice(BigDecimal issuePrice) {
        this.issuePrice = issuePrice;
    }

    /**
     * 面值
     */
    public BigDecimal getFacevaluePrice() {
        return facevaluePrice;
    }

    /**
     * 面值
     */
    public void setFacevaluePrice(BigDecimal facevaluePrice) {
        this.facevaluePrice = facevaluePrice;
    }

    /**
     * 发行人的企业代码
     */
    public String getIssuerCorpCode() {
        return issuerCorpCode;
    }

    /**
     * 发行人的企业代码
     */
    public void setIssuerCorpCode(String issuerCorpCode) {
        this.issuerCorpCode = issuerCorpCode;
    }

    /**
     * 管理人的企业代码
     */
    public String getManagerCorpCode() {
        return managerCorpCode;
    }

    /**
     * 管理人的企业代码
     */
    public void setManagerCorpCode(String managerCorpCode) {
        this.managerCorpCode = managerCorpCode;
    }

    /**
     * 托管人的企业代码
     */
    public String getTrusteeCorpCode() {
        return trusteeCorpCode;
    }

    /**
     * 托管人的企业代码
     */
    public void setTrusteeCorpCode(String trusteeCorpCode) {
        this.trusteeCorpCode = trusteeCorpCode;
    }

    /**
     * 主承销人的企业代码
     */
    public String getBrokerCorpCode() {
        return brokerCorpCode;
    }

    /**
     * 主承销人的企业代码
     */
    public void setBrokerCorpCode(String brokerCorpCode) {
        this.brokerCorpCode = brokerCorpCode;
    }

    /**
     * 附加编码1，资管产品统计编码
     */
    public String getExtra1Code() {
        return extra1Code;
    }

    /**
     * 附加编码1，资管产品统计编码
     */
    public void setExtra1Code(String extra1Code) {
        this.extra1Code = extra1Code;
    }

    /**
     * 附加编码2，资管产品登记备案编码
     */
    public String getExtra2Code() {
        return extra2Code;
    }

    /**
     * 附加编码2，资管产品登记备案编码
     */
    public void setExtra2Code(String extra2Code) {
        this.extra2Code = extra2Code;
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
    public BigDecimal getTotalShareQty() {
        return totalShareQty;
    }

    /**
     * 
     */
    public void setTotalShareQty(BigDecimal totalShareQty) {
        this.totalShareQty = totalShareQty;
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
        SecuBasic other = (SecuBasic) that;
        return (this.getSecuGlobalCode() == null ? other.getSecuGlobalCode() == null : this.getSecuGlobalCode().equals(other.getSecuGlobalCode()))
            && (this.getExchangeCode() == null ? other.getExchangeCode() == null : this.getExchangeCode().equals(other.getExchangeCode()))
            && (this.getMarketCode() == null ? other.getMarketCode() == null : this.getMarketCode().equals(other.getMarketCode()))
            && (this.getSecuCode() == null ? other.getSecuCode() == null : this.getSecuCode().equals(other.getSecuCode()))
            && (this.getSecuName() == null ? other.getSecuName() == null : this.getSecuName().equals(other.getSecuName()))
            && (this.getSecuFullname() == null ? other.getSecuFullname() == null : this.getSecuFullname().equals(other.getSecuFullname()))
            && (this.getPinyinText() == null ? other.getPinyinText() == null : this.getPinyinText().equals(other.getPinyinText()))
            && (this.getSecuForeignName() == null ? other.getSecuForeignName() == null : this.getSecuForeignName().equals(other.getSecuForeignName()))
            && (this.getSecuForeignFullname() == null ? other.getSecuForeignFullname() == null : this.getSecuForeignFullname().equals(other.getSecuForeignFullname()))
            && (this.getSecuCategoryCode() == null ? other.getSecuCategoryCode() == null : this.getSecuCategoryCode().equals(other.getSecuCategoryCode()))
            && (this.getIsinCode() == null ? other.getIsinCode() == null : this.getIsinCode().equals(other.getIsinCode()))
            && (this.getTradeCurrencyCode() == null ? other.getTradeCurrencyCode() == null : this.getTradeCurrencyCode().equals(other.getTradeCurrencyCode()))
            && (this.getSettleCurrencyCode() == null ? other.getSettleCurrencyCode() == null : this.getSettleCurrencyCode().equals(other.getSettleCurrencyCode()))
            && (this.getIssueDate() == null ? other.getIssueDate() == null : this.getIssueDate().equals(other.getIssueDate()))
            && (this.getListingDate() == null ? other.getListingDate() == null : this.getListingDate().equals(other.getListingDate()))
            && (this.getDelistingDate() == null ? other.getDelistingDate() == null : this.getDelistingDate().equals(other.getDelistingDate()))
            && (this.getDueDate() == null ? other.getDueDate() == null : this.getDueDate().equals(other.getDueDate()))
            && (this.getIssueQty() == null ? other.getIssueQty() == null : this.getIssueQty().equals(other.getIssueQty()))
            && (this.getCirculateQty() == null ? other.getCirculateQty() == null : this.getCirculateQty().equals(other.getCirculateQty()))
            && (this.getIssuePrice() == null ? other.getIssuePrice() == null : this.getIssuePrice().equals(other.getIssuePrice()))
            && (this.getFacevaluePrice() == null ? other.getFacevaluePrice() == null : this.getFacevaluePrice().equals(other.getFacevaluePrice()))
            && (this.getIssuerCorpCode() == null ? other.getIssuerCorpCode() == null : this.getIssuerCorpCode().equals(other.getIssuerCorpCode()))
            && (this.getManagerCorpCode() == null ? other.getManagerCorpCode() == null : this.getManagerCorpCode().equals(other.getManagerCorpCode()))
            && (this.getTrusteeCorpCode() == null ? other.getTrusteeCorpCode() == null : this.getTrusteeCorpCode().equals(other.getTrusteeCorpCode()))
            && (this.getBrokerCorpCode() == null ? other.getBrokerCorpCode() == null : this.getBrokerCorpCode().equals(other.getBrokerCorpCode()))
            && (this.getExtra1Code() == null ? other.getExtra1Code() == null : this.getExtra1Code().equals(other.getExtra1Code()))
            && (this.getExtra2Code() == null ? other.getExtra2Code() == null : this.getExtra2Code().equals(other.getExtra2Code()))
            && (this.getRowVersionNo() == null ? other.getRowVersionNo() == null : this.getRowVersionNo().equals(other.getRowVersionNo()))
            && (this.getLastOperateStaffCode() == null ? other.getLastOperateStaffCode() == null : this.getLastOperateStaffCode().equals(other.getLastOperateStaffCode()))
            && (this.getLastOperateDatetime() == null ? other.getLastOperateDatetime() == null : this.getLastOperateDatetime().equals(other.getLastOperateDatetime()))
            && (this.getTotalShareQty() == null ? other.getTotalShareQty() == null : this.getTotalShareQty().equals(other.getTotalShareQty()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSecuGlobalCode() == null) ? 0 : getSecuGlobalCode().hashCode());
        result = prime * result + ((getExchangeCode() == null) ? 0 : getExchangeCode().hashCode());
        result = prime * result + ((getMarketCode() == null) ? 0 : getMarketCode().hashCode());
        result = prime * result + ((getSecuCode() == null) ? 0 : getSecuCode().hashCode());
        result = prime * result + ((getSecuName() == null) ? 0 : getSecuName().hashCode());
        result = prime * result + ((getSecuFullname() == null) ? 0 : getSecuFullname().hashCode());
        result = prime * result + ((getPinyinText() == null) ? 0 : getPinyinText().hashCode());
        result = prime * result + ((getSecuForeignName() == null) ? 0 : getSecuForeignName().hashCode());
        result = prime * result + ((getSecuForeignFullname() == null) ? 0 : getSecuForeignFullname().hashCode());
        result = prime * result + ((getSecuCategoryCode() == null) ? 0 : getSecuCategoryCode().hashCode());
        result = prime * result + ((getIsinCode() == null) ? 0 : getIsinCode().hashCode());
        result = prime * result + ((getTradeCurrencyCode() == null) ? 0 : getTradeCurrencyCode().hashCode());
        result = prime * result + ((getSettleCurrencyCode() == null) ? 0 : getSettleCurrencyCode().hashCode());
        result = prime * result + ((getIssueDate() == null) ? 0 : getIssueDate().hashCode());
        result = prime * result + ((getListingDate() == null) ? 0 : getListingDate().hashCode());
        result = prime * result + ((getDelistingDate() == null) ? 0 : getDelistingDate().hashCode());
        result = prime * result + ((getDueDate() == null) ? 0 : getDueDate().hashCode());
        result = prime * result + ((getIssueQty() == null) ? 0 : getIssueQty().hashCode());
        result = prime * result + ((getCirculateQty() == null) ? 0 : getCirculateQty().hashCode());
        result = prime * result + ((getIssuePrice() == null) ? 0 : getIssuePrice().hashCode());
        result = prime * result + ((getFacevaluePrice() == null) ? 0 : getFacevaluePrice().hashCode());
        result = prime * result + ((getIssuerCorpCode() == null) ? 0 : getIssuerCorpCode().hashCode());
        result = prime * result + ((getManagerCorpCode() == null) ? 0 : getManagerCorpCode().hashCode());
        result = prime * result + ((getTrusteeCorpCode() == null) ? 0 : getTrusteeCorpCode().hashCode());
        result = prime * result + ((getBrokerCorpCode() == null) ? 0 : getBrokerCorpCode().hashCode());
        result = prime * result + ((getExtra1Code() == null) ? 0 : getExtra1Code().hashCode());
        result = prime * result + ((getExtra2Code() == null) ? 0 : getExtra2Code().hashCode());
        result = prime * result + ((getRowVersionNo() == null) ? 0 : getRowVersionNo().hashCode());
        result = prime * result + ((getLastOperateStaffCode() == null) ? 0 : getLastOperateStaffCode().hashCode());
        result = prime * result + ((getLastOperateDatetime() == null) ? 0 : getLastOperateDatetime().hashCode());
        result = prime * result + ((getTotalShareQty() == null) ? 0 : getTotalShareQty().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", secuGlobalCode=").append(secuGlobalCode);
        sb.append(", exchangeCode=").append(exchangeCode);
        sb.append(", marketCode=").append(marketCode);
        sb.append(", secuCode=").append(secuCode);
        sb.append(", secuName=").append(secuName);
        sb.append(", secuFullname=").append(secuFullname);
        sb.append(", pinyinText=").append(pinyinText);
        sb.append(", secuForeignName=").append(secuForeignName);
        sb.append(", secuForeignFullname=").append(secuForeignFullname);
        sb.append(", secuCategoryCode=").append(secuCategoryCode);
        sb.append(", isinCode=").append(isinCode);
        sb.append(", tradeCurrencyCode=").append(tradeCurrencyCode);
        sb.append(", settleCurrencyCode=").append(settleCurrencyCode);
        sb.append(", issueDate=").append(issueDate);
        sb.append(", listingDate=").append(listingDate);
        sb.append(", delistingDate=").append(delistingDate);
        sb.append(", dueDate=").append(dueDate);
        sb.append(", issueQty=").append(issueQty);
        sb.append(", circulateQty=").append(circulateQty);
        sb.append(", issuePrice=").append(issuePrice);
        sb.append(", facevaluePrice=").append(facevaluePrice);
        sb.append(", issuerCorpCode=").append(issuerCorpCode);
        sb.append(", managerCorpCode=").append(managerCorpCode);
        sb.append(", trusteeCorpCode=").append(trusteeCorpCode);
        sb.append(", brokerCorpCode=").append(brokerCorpCode);
        sb.append(", extra1Code=").append(extra1Code);
        sb.append(", extra2Code=").append(extra2Code);
        sb.append(", rowVersionNo=").append(rowVersionNo);
        sb.append(", lastOperateStaffCode=").append(lastOperateStaffCode);
        sb.append(", lastOperateDatetime=").append(lastOperateDatetime);
        sb.append(", totalShareQty=").append(totalShareQty);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}