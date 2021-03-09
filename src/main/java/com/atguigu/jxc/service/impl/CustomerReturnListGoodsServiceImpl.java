//package com.atguigu.jxc.service.impl;
//
//import com.atguigu.jxc.dao.CustomerReturnListDao;
//import com.atguigu.jxc.dao.CustomerReturnListGoodsDao;
//import com.atguigu.jxc.domain.ServiceVO;
//import com.atguigu.jxc.entity.CustomerReturnList;
//import com.atguigu.jxc.entity.CustomerReturnListGoods;
//import com.atguigu.jxc.entity.SaleList;
//import com.atguigu.jxc.entity.SaleListGoods;
//import com.atguigu.jxc.service.CustomerReturnListGoodsService;
//import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class CustomerReturnListGoodsServiceImpl implements CustomerReturnListGoodsService {
//    @Autowired
//    private CustomerReturnListDao customerReturnListDao;
//    @Autowired
//    private CustomerReturnListGoodsDao customerReturnListGoodsDao;
//
//
//    @Override
//    public void save(String returnNumber, CustomerReturnList customerReturnList, String customerReturnListGoodsStr) {
//        customerReturnList.setCustomerReturnListId(1);
//        this.customerReturnListDao.saveCustomerReturnList(customerReturnList);
//
//        Gson gson = new Gson();
//        List<CustomerReturnListGoods> customerReturnListGoodsList = gson.fromJson(customerReturnListGoodsStr, new TypeToken<List<CustomerReturnListGoods>>() {
//        }.getType());
//
//        customerReturnListGoodsList.forEach(customerReturnListGoods -> {
//            CustomerReturnList returnList = this.customerReturnListDao.selectOne(returnNumber);
//            Integer customerReturnListId = returnList.getCustomerReturnListId();
//            customerReturnListGoods.setCustomerReturnListId(customerReturnListId);
//            this.customerReturnListGoodsDao.saveCustomerReturnListGoods(customerReturnListGoods);
//        });
//
//
//    }
//}
