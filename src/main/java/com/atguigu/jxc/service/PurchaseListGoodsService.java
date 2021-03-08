package com.atguigu.jxc.service;

import com.atguigu.jxc.domain.ServiceVO;
import com.atguigu.jxc.entity.PurchaseList;

public interface PurchaseListGoodsService {

     void save(String purchaseNumber, PurchaseList purchaseList, String purchaseListGoodsStr);
}
