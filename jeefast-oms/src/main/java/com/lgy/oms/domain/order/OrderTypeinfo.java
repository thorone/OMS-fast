package com.lgy.oms.domain.order;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lgy.common.core.domain.BaseEntity;

import java.io.Serializable;

/**
 * 订单类型信息表 oms_order_typeinfo
 *
 * @author lgy
 * @date 2019-10-22
 */
@TableName("oms_order_typeinfo")
public class OrderTypeinfo extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * $column.columnComment
     */
    private Long id;

    /**
     * 订单编码
     */
    private String biid;

    /**
     * 来源单号
     */
    private String tid;

    /**
     * 目标单号
     */
    private String aimId;

    /**
     * 来源类型
     */
    private Integer sourceType;

    /**
     * 单据类型(线上订单、线下订单、特殊订单)
     */
    private Integer orderType;

    /**
     * 发货类型(正常发货、第三方发货、刷单发货、刷单不发货)
     */
    private Integer deliveryType;

    /**
     * 出库类型(正常出库、补货出库、换货出库)
     */
    private Integer outboundType;

    /**
     * 货到付款
     */
    private Integer cod;

    /**
     * 发票申请
     */
    private Integer invoice;

    /**
     * 发货级别(正常、加急、特急)
     */
    private Integer level;

    public String getBiid() {
        return biid;
    }

    public void setBiid(String biid) {
        this.biid = biid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getAimId() {
        return aimId;
    }

    public void setAimId(String aimId) {
        this.aimId = aimId;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(Integer deliveryType) {
        this.deliveryType = deliveryType;
    }

    public Integer getOutboundType() {
        return outboundType;
    }

    public void setOutboundType(Integer outboundType) {
        this.outboundType = outboundType;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public Integer getInvoice() {
        return invoice;
    }

    public void setInvoice(Integer invoice) {
        this.invoice = invoice;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}