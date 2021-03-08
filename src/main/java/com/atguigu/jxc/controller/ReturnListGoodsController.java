package com.atguigu.jxc.controller;


import com.atguigu.jxc.domain.ServiceVO;
import com.atguigu.jxc.domain.SuccessCode;
import com.atguigu.jxc.entity.PurchaseList;
import com.atguigu.jxc.entity.ReturnList;
import com.atguigu.jxc.service.PurchaseListGoodsService;
import com.atguigu.jxc.service.ReturnListGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/returnListGoods")
public class ReturnListGoodsController {

    @Autowired
    ReturnListGoodsService returnListGoodsService;


    @PostMapping("/save")
    @ResponseBody
    public ServiceVO save(@RequestParam(value = "returnNumber") String returnNumber, ReturnList returnList, String returnListGoodsStr){

        returnListGoodsService.save(returnNumber,returnList,returnListGoodsStr);

        return new ServiceVO(SuccessCode.SUCCESS_CODE,SuccessCode.SUCCESS_MESS,null);


    }
}
