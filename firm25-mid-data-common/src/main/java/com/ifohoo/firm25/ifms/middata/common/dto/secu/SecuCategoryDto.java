package com.ifohoo.firm25.ifms.middata.common.dto.secu;

import java.io.Serializable;
import java.util.Date;

/**
 * 证券类别表
 * @TableName SECU_CATEGORY
 */

public class SecuCategoryDto implements Serializable {
    /**
     * 证券类别代码
     */

    private String secuCategoryCode;

    /**
     * 证券类别名称
     */
    private String secuCategoryName;

    /**
     * 上级证券类别代码
     */
    private String parentSecuCategoryCode;

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
     * 证券类别名称
     */
    public String getSecuCategoryName() {
        return secuCategoryName;
    }

    /**
     * 证券类别名称
     */
    public void setSecuCategoryName(String secuCategoryName) {
        this.secuCategoryName = secuCategoryName;
    }

    /**
     * 上级证券类别代码
     */
    public String getParentSecuCategoryCode() {
        return parentSecuCategoryCode;
    }

    /**
     * 上级证券类别代码
     */
    public void setParentSecuCategoryCode(String parentSecuCategoryCode) {
        this.parentSecuCategoryCode = parentSecuCategoryCode;
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
        SecuCategoryDto other = (SecuCategoryDto) that;
        return (this.getSecuCategoryCode() == null ? other.getSecuCategoryCode() == null : this.getSecuCategoryCode().equals(other.getSecuCategoryCode()))
            && (this.getSecuCategoryName() == null ? other.getSecuCategoryName() == null : this.getSecuCategoryName().equals(other.getSecuCategoryName()))
            && (this.getParentSecuCategoryCode() == null ? other.getParentSecuCategoryCode() == null : this.getParentSecuCategoryCode().equals(other.getParentSecuCategoryCode()))
            && (this.getDisplayOrderNo() == null ? other.getDisplayOrderNo() == null : this.getDisplayOrderNo().equals(other.getDisplayOrderNo()))
            && (this.getRowVersionNo() == null ? other.getRowVersionNo() == null : this.getRowVersionNo().equals(other.getRowVersionNo()))
            && (this.getLastOperateStaffCode() == null ? other.getLastOperateStaffCode() == null : this.getLastOperateStaffCode().equals(other.getLastOperateStaffCode()))
            && (this.getLastOperateDatetime() == null ? other.getLastOperateDatetime() == null : this.getLastOperateDatetime().equals(other.getLastOperateDatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSecuCategoryCode() == null) ? 0 : getSecuCategoryCode().hashCode());
        result = prime * result + ((getSecuCategoryName() == null) ? 0 : getSecuCategoryName().hashCode());
        result = prime * result + ((getParentSecuCategoryCode() == null) ? 0 : getParentSecuCategoryCode().hashCode());
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
        sb.append(", secuCategoryCode=").append(secuCategoryCode);
        sb.append(", secuCategoryName=").append(secuCategoryName);
        sb.append(", parentSecuCategoryCode=").append(parentSecuCategoryCode);
        sb.append(", displayOrderNo=").append(displayOrderNo);
        sb.append(", rowVersionNo=").append(rowVersionNo);
        sb.append(", lastOperateStaffCode=").append(lastOperateStaffCode);
        sb.append(", lastOperateDatetime=").append(lastOperateDatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}