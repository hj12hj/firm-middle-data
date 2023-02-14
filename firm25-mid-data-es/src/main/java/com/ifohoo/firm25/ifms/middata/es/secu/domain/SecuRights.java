package com.ifohoo.firm25.ifms.middata.es.secu.domain;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 权益信息表
 * @TableName SECU_RIGHTS
 */
public class SecuRights implements Serializable {
    /**
     * 记录的唯一编号
     */
    private Long rightsNo;

    /**
     * 证券代码
     */
    private String secuGlobalCode;

    /**
     * 宣告日期
     */
    private String declarationDate;

    /**
     * 登记日期
     */
    private String registerDate;

    /**
     * 除权日期
     */
    private String exDate;

    /**
     * 上市/到账日期
     */
    private String launchDate;

    /**
     * 送股单位
     */
    private BigDecimal qtyRightsUnitQty;

    /**
     * 每送股单位的送股比例
     */
    private BigDecimal qtyRightsRatio;

    /**
     * 派息单位
     */
    private BigDecimal amtRightsUnitQty;

    /**
     * 每派息单位的派息比例（税前）
     */
    private BigDecimal amtRightsRatio;

    /**
     * 每派息单位的派息比例（税后）
     */
    private BigDecimal amtRightsTaxRatio;

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
    public Long getRightsNo() {
        return rightsNo;
    }

    /**
     * 记录的唯一编号
     */
    public void setRightsNo(Long rightsNo) {
        this.rightsNo = rightsNo;
    }

    /**
     * 证券代码
     */
    public String getSecuGlobalCode() {
        return secuGlobalCode;
    }

    /**
     * 证券代码
     */
    public void setSecuGlobalCode(String secuGlobalCode) {
        this.secuGlobalCode = secuGlobalCode;
    }

    /**
     * 宣告日期
     */
    public String getDeclarationDate() {
        return declarationDate;
    }

    /**
     * 宣告日期
     */
    public void setDeclarationDate(String declarationDate) {
        this.declarationDate = declarationDate;
    }

    /**
     * 登记日期
     */
    public String getRegisterDate() {
        return registerDate;
    }

    /**
     * 登记日期
     */
    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    /**
     * 除权日期
     */
    public String getExDate() {
        return exDate;
    }

    /**
     * 除权日期
     */
    public void setExDate(String exDate) {
        this.exDate = exDate;
    }

    /**
     * 上市/到账日期
     */
    public String getLaunchDate() {
        return launchDate;
    }

    /**
     * 上市/到账日期
     */
    public void setLaunchDate(String launchDate) {
        this.launchDate = launchDate;
    }

    /**
     * 送股单位
     */
    public BigDecimal getQtyRightsUnitQty() {
        return qtyRightsUnitQty;
    }

    /**
     * 送股单位
     */
    public void setQtyRightsUnitQty(BigDecimal qtyRightsUnitQty) {
        this.qtyRightsUnitQty = qtyRightsUnitQty;
    }

    /**
     * 每送股单位的送股比例
     */
    public BigDecimal getQtyRightsRatio() {
        return qtyRightsRatio;
    }

    /**
     * 每送股单位的送股比例
     */
    public void setQtyRightsRatio(BigDecimal qtyRightsRatio) {
        this.qtyRightsRatio = qtyRightsRatio;
    }

    /**
     * 派息单位
     */
    public BigDecimal getAmtRightsUnitQty() {
        return amtRightsUnitQty;
    }

    /**
     * 派息单位
     */
    public void setAmtRightsUnitQty(BigDecimal amtRightsUnitQty) {
        this.amtRightsUnitQty = amtRightsUnitQty;
    }

    /**
     * 每派息单位的派息比例（税前）
     */
    public BigDecimal getAmtRightsRatio() {
        return amtRightsRatio;
    }

    /**
     * 每派息单位的派息比例（税前）
     */
    public void setAmtRightsRatio(BigDecimal amtRightsRatio) {
        this.amtRightsRatio = amtRightsRatio;
    }

    /**
     * 每派息单位的派息比例（税后）
     */
    public BigDecimal getAmtRightsTaxRatio() {
        return amtRightsTaxRatio;
    }

    /**
     * 每派息单位的派息比例（税后）
     */
    public void setAmtRightsTaxRatio(BigDecimal amtRightsTaxRatio) {
        this.amtRightsTaxRatio = amtRightsTaxRatio;
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
        SecuRights other = (SecuRights) that;
        return (this.getRightsNo() == null ? other.getRightsNo() == null : this.getRightsNo().equals(other.getRightsNo()))
            && (this.getSecuGlobalCode() == null ? other.getSecuGlobalCode() == null : this.getSecuGlobalCode().equals(other.getSecuGlobalCode()))
            && (this.getDeclarationDate() == null ? other.getDeclarationDate() == null : this.getDeclarationDate().equals(other.getDeclarationDate()))
            && (this.getRegisterDate() == null ? other.getRegisterDate() == null : this.getRegisterDate().equals(other.getRegisterDate()))
            && (this.getExDate() == null ? other.getExDate() == null : this.getExDate().equals(other.getExDate()))
            && (this.getLaunchDate() == null ? other.getLaunchDate() == null : this.getLaunchDate().equals(other.getLaunchDate()))
            && (this.getQtyRightsUnitQty() == null ? other.getQtyRightsUnitQty() == null : this.getQtyRightsUnitQty().equals(other.getQtyRightsUnitQty()))
            && (this.getQtyRightsRatio() == null ? other.getQtyRightsRatio() == null : this.getQtyRightsRatio().equals(other.getQtyRightsRatio()))
            && (this.getAmtRightsUnitQty() == null ? other.getAmtRightsUnitQty() == null : this.getAmtRightsUnitQty().equals(other.getAmtRightsUnitQty()))
            && (this.getAmtRightsRatio() == null ? other.getAmtRightsRatio() == null : this.getAmtRightsRatio().equals(other.getAmtRightsRatio()))
            && (this.getAmtRightsTaxRatio() == null ? other.getAmtRightsTaxRatio() == null : this.getAmtRightsTaxRatio().equals(other.getAmtRightsTaxRatio()))
            && (this.getRowVersionNo() == null ? other.getRowVersionNo() == null : this.getRowVersionNo().equals(other.getRowVersionNo()))
            && (this.getLastOperateStaffCode() == null ? other.getLastOperateStaffCode() == null : this.getLastOperateStaffCode().equals(other.getLastOperateStaffCode()))
            && (this.getLastOperateDatetime() == null ? other.getLastOperateDatetime() == null : this.getLastOperateDatetime().equals(other.getLastOperateDatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRightsNo() == null) ? 0 : getRightsNo().hashCode());
        result = prime * result + ((getSecuGlobalCode() == null) ? 0 : getSecuGlobalCode().hashCode());
        result = prime * result + ((getDeclarationDate() == null) ? 0 : getDeclarationDate().hashCode());
        result = prime * result + ((getRegisterDate() == null) ? 0 : getRegisterDate().hashCode());
        result = prime * result + ((getExDate() == null) ? 0 : getExDate().hashCode());
        result = prime * result + ((getLaunchDate() == null) ? 0 : getLaunchDate().hashCode());
        result = prime * result + ((getQtyRightsUnitQty() == null) ? 0 : getQtyRightsUnitQty().hashCode());
        result = prime * result + ((getQtyRightsRatio() == null) ? 0 : getQtyRightsRatio().hashCode());
        result = prime * result + ((getAmtRightsUnitQty() == null) ? 0 : getAmtRightsUnitQty().hashCode());
        result = prime * result + ((getAmtRightsRatio() == null) ? 0 : getAmtRightsRatio().hashCode());
        result = prime * result + ((getAmtRightsTaxRatio() == null) ? 0 : getAmtRightsTaxRatio().hashCode());
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
        sb.append(", rightsNo=").append(rightsNo);
        sb.append(", secuGlobalCode=").append(secuGlobalCode);
        sb.append(", declarationDate=").append(declarationDate);
        sb.append(", registerDate=").append(registerDate);
        sb.append(", exDate=").append(exDate);
        sb.append(", launchDate=").append(launchDate);
        sb.append(", qtyRightsUnitQty=").append(qtyRightsUnitQty);
        sb.append(", qtyRightsRatio=").append(qtyRightsRatio);
        sb.append(", amtRightsUnitQty=").append(amtRightsUnitQty);
        sb.append(", amtRightsRatio=").append(amtRightsRatio);
        sb.append(", amtRightsTaxRatio=").append(amtRightsTaxRatio);
        sb.append(", rowVersionNo=").append(rowVersionNo);
        sb.append(", lastOperateStaffCode=").append(lastOperateStaffCode);
        sb.append(", lastOperateDatetime=").append(lastOperateDatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}