package com.atguigu.jxc.service.impl;

import com.atguigu.jxc.dao.PurchaseListGoodsDao;
import com.atguigu.jxc.domain.ServiceVO;
import com.atguigu.jxc.entity.PurchaseList;
import com.atguigu.jxc.entity.PurchaseListGoods;
import com.atguigu.jxc.entity.SaleList;
import com.atguigu.jxc.entity.SaleListGoods;
import com.atguigu.jxc.service.PurchaseListGoodsService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description
 */
@Service
public class PurchaseListGoodsServiceImpl implements PurchaseListGoodsService {

    @Autowired
    PurchaseListGoodsDao purchaseListGoodsDao;


    @Override
    public void save(String purchaseNumber, PurchaseList purchaseList, String purchaseListGoodsStr) {

        purchaseList.setUserId(1);


        Gson gson = new Gson();
        List<PurchaseListGoods> purchaseListGoodsList = gson.fromJson(purchaseListGoodsStr, new TypeToken<List<PurchaseListGoods>>() {
        }.getType());
        System.out.println(purchaseListGoodsList);


        purchaseListGoodsList.forEach(purchaseListGoods -> {



            this.purchaseListGoodsDao.savePurchaseListGoods(purchaseListGoods);
        });







    }
}
