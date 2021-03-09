package com.atguigu.jxc.controller;

import com.atguigu.jxc.domain.ServiceVO;
import com.atguigu.jxc.domain.SuccessCode;
import com.atguigu.jxc.entity.SaleList;
import com.atguigu.jxc.entity.SaleListGoods;
import com.atguigu.jxc.service.SaleListGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/saleListGoods")
public class SaleListGoodsController {
    @Resource
    private SaleListGoodsService saleListGoodsService;

    @RequestMapping("/save")
    public ServiceVO saveSaleListGoods(@RequestParam String  saleNumber,
                                       SaleList saleList, String saleListGoodsStr){
       this.saleListGoodsService.save(saleNumber,saleList,saleListGoodsStr);
        return new ServiceVO(SuccessCode.SUCCESS_CODE,SuccessCode.SUCCESS_MESS,null);
    }


    @RequestMapping("/list")
    public Map<String,Object> selectSaleList(String saleNumber, Integer customerId, Integer state, String sTime, String eTime){
        Map<String, Object> map = this.saleListGoodsService.selectSaleList(saleNumber, customerId, state, sTime, eTime);

        return map;
    }
}
