package com.atguigu.jxc.service;

import com.atguigu.jxc.domain.ServiceVO;
import com.atguigu.jxc.entity.SaleList;

import java.util.Map;

public interface SaleListGoodsService {
    void save(String saleNumber, SaleList saleList, String saleListGoodsStr);

    Map<String,Object> selectSaleList(String saleNumber, Integer customerId, Integer state, String sTime, String eTime);
}
