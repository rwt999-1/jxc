package com.atguigu.jxc.service.impl;

import com.atguigu.jxc.dao.PurchaseListGoodsDao;
import com.atguigu.jxc.dao.ReturnListGoodsDao;
import com.atguigu.jxc.entity.PurchaseList;
import com.atguigu.jxc.entity.PurchaseListGoods;
import com.atguigu.jxc.entity.ReturnList;
import com.atguigu.jxc.entity.ReturnListGoods;
import com.atguigu.jxc.service.PurchaseListGoodsService;
import com.atguigu.jxc.service.ReturnListGoodsService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description
 */
@Service
public class ReturnListGoodsServiceImpl implements ReturnListGoodsService {

    @Autowired
    ReturnListGoodsDao returnListGoodsDao;



    @Override
    public void save(String returnNumber, ReturnList returnList, String returnListGoodsStr) {
        returnList.setUserId(1);


        Gson gson = new Gson();
        List<ReturnListGoods> returnListGoodsList = gson.fromJson(returnListGoodsStr, new TypeToken<List<ReturnListGoods>>() {
        }.getType());
        System.out.println(returnListGoodsList);


        returnListGoodsList.forEach(returnListGoods -> {

            this.returnListGoodsDao.saveReturnListGoods(returnListGoods);
        });
    }
}
