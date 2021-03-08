package com.atguigu.jxc.controller;


import com.atguigu.jxc.domain.ErrorCode;
import com.atguigu.jxc.domain.ServiceVO;
import com.atguigu.jxc.domain.SuccessCode;
import com.atguigu.jxc.entity.PurchaseList;
import com.atguigu.jxc.service.PurchaseListGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/purchaseListGoods")
public class PurchaseListGoodsController {

    @Autowired
    PurchaseListGoodsService purchaseListGoodsService;


    @PostMapping("/save")
    @ResponseBody
    public ServiceVO save(@RequestParam(value = "purchaseNumber") String purchaseNumber, PurchaseList purchaseList, String purchaseListGoodsStr){

        purchaseListGoodsService.save(purchaseNumber,purchaseList,purchaseListGoodsStr);

        return new ServiceVO(SuccessCode.SUCCESS_CODE,SuccessCode.SUCCESS_MESS,null);


    }
}
