package com.atguigu.jxc.service;

import com.atguigu.jxc.entity.ReturnList;

public interface ReturnListGoodsService {

     void save(String returnNumber, ReturnList returnList, String returnListGoodsStr);
}
