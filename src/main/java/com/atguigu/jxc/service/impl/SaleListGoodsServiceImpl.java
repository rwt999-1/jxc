package com.atguigu.jxc.service.impl;

import com.atguigu.jxc.dao.CustomerDao;
import com.atguigu.jxc.dao.SaleListDao;
import com.atguigu.jxc.dao.SaleListGoodsDao;
import com.atguigu.jxc.dao.UserDao;
import com.atguigu.jxc.domain.ServiceVO;
import com.atguigu.jxc.entity.Customer;
import com.atguigu.jxc.entity.SaleList;
import com.atguigu.jxc.entity.SaleListGoods;
import com.atguigu.jxc.entity.User;
import com.atguigu.jxc.service.SaleListGoodsService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class  SaleListGoodsServiceImpl implements SaleListGoodsService {

    @Autowired
    private SaleListDao saleListDao;

    @Autowired
    private SaleListGoodsDao saleListGoodsDao;

    @Autowired
    private UserDao userDao;

    @Autowired
    private CustomerDao customerDao;


    @Override
    public void save(String saleNumber, SaleList saleList, String saleListGoodsStr) {


           saleList.setUserId(1);
        this.saleListDao.saveSaleList(saleList);


        Gson gson = new Gson();
        List<SaleListGoods> saleListGoodsList = gson.fromJson(saleListGoodsStr, new TypeToken<List<SaleListGoods>>() {
        }.getType());
        System.out.println(saleListGoodsList);


        saleListGoodsList.forEach(saleListGoods -> {
            SaleList saleListEntity = this.saleListDao.selectOne(saleNumber);
            Integer saleListId = saleListEntity.getSaleListId();
            saleListGoods.setSaleListId(saleListId);
            this.saleListGoodsDao.saveSaleListGoods(saleListGoods);
        });
    }

    @Override
    public Map<String, Object> selectSaleList(String saleNumber, Integer customerId, Integer state, String sTime, String eTime) {
        List<SaleList> saleLists = this.saleListDao.selectSaleList(saleNumber, customerId, state, sTime, eTime);


        return null;
    }
}