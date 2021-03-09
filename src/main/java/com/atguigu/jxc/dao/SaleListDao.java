package com.atguigu.jxc.dao;

import com.atguigu.jxc.entity.SaleList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SaleListDao {
    int saveSaleList(SaleList saleList);


    SaleList selectOne(@Param("saleNumber") String saleNumber);

    List<SaleList> selectSaleList(@Param("saleNumber") String saleNumber,
                                  @Param("customerId") Integer customerId,
                                  @Param("state") Integer state,
                                  @Param("sTime") String sTime,
                                  @Param("eTime") String eTime);
}
