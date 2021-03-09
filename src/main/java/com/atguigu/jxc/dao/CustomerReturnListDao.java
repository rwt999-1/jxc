package com.atguigu.jxc.dao;

import com.atguigu.jxc.entity.CustomerReturnList;
import org.apache.ibatis.annotations.Param;

public interface CustomerReturnListDao {
    int saveCustomerReturnList(CustomerReturnList customerReturnList);
    CustomerReturnList selectOne(@Param("returnNumber") String returnNumber);

}
