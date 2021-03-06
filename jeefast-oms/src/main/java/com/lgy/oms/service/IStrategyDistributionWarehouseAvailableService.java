package com.lgy.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lgy.oms.domain.StrategyDistributionWarehouseAvailable;

import java.util.List;

/**
 * 配货策略分仓可用仓库 服务层
 *
 * @author lgy
 * @date 2020-02-01
 */
public interface IStrategyDistributionWarehouseAvailableService extends IService<StrategyDistributionWarehouseAvailable> {

    /**
     * 根据策略编码获取策略
     *
     * @param gco 策略编码
     * @return
     */
    List<StrategyDistributionWarehouseAvailable> getStrategyByGco(String gco);

    /**
     * 调整可用仓库优先级顺序
     *
     * @param id id
     * @param i  序号
     * @return
     */
    boolean updatePrePriority(Long id, int i);

    /**
     * 更新字段值
     *
     * @param id
     * @param field
     * @param value
     * @return
     */
    boolean changeField(Long id, String field, int value);

    /**
     * 获取可用仓库列表
     * @param gco 策略编码
     * @return 可用仓库列表
     */
    List<String> getAvailableWarehouse(String gco);
}