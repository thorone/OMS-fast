package com.lgy.oms.domain.order;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 订单支付信息表 oms_order_payinfo
 *
 * @author lgy
 * @date 2019-10-22
 */
@Data
@TableName("oms_order_payinfo")
public class OrderPayInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * $column.columnComment
     */
    private Long id;

    /**
     * 订单编码
     */
    @JsonProperty("订单编号")
    private String orderId;

    /**
     * 来源单号
     */
    @JsonProperty("来源单号")
    private String sourceId;

    /**
     * 下单时间
     */
    @JsonProperty("下单时间")
    private String orderTime;

    /**
     * 支付时间
     */
    @JsonProperty("支付时间")
    private String payTime;

    /**
     * 币别
     */
    @JsonProperty("币别")
    private String currency;

    /**
     * 订单金额
     */
    @JsonProperty("订单金额")
    private BigDecimal orderAmount;

    /**
     * 支付金额
     */
    @JsonProperty("支付金额")
    private BigDecimal payAmount;

    /**
     * 实收金额
     */
    @JsonProperty("实收金额")
    private BigDecimal receivedAmount;

    /**
     * 折扣
     */
    @JsonProperty("折扣")
    private BigDecimal discount;

    /**
     * 税额
     */
    @JsonProperty("税额")
    private BigDecimal taxAmount;

    /**
     * 邮费
     */
    @JsonProperty("邮费")
    private BigDecimal post;

    /**
     * 运费
     */
    @JsonProperty("运费")
    private BigDecimal freightAmount;

}
