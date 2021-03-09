package com.atguigu.jxc.dao;

import com.atguigu.jxc.entity.SaleListGoods;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface SaleListGoodsDao {
    int saveSaleListGoods(SaleListGoods saleListGoods);

}
