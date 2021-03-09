//package com.atguigu.jxc.controller;
//
//import com.atguigu.jxc.domain.ServiceVO;
//import com.atguigu.jxc.domain.SuccessCode;
//import com.atguigu.jxc.entity.CustomerReturnList;
//import com.atguigu.jxc.service.CustomerReturnListGoodsService;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("customerReturnListGoods")
//public class CustomerReturnListGoodsController {
//
//
//    private CustomerReturnListGoodsService customerReturnListGoodsService;
//
//    @RequestMapping("/save")
//    public ServiceVO customerReturnListGoods(@RequestParam String returnNumber,
//                                             CustomerReturnList customerReturnList,
//                                             String customerReturnListGoodsStr){
//
//        this.customerReturnListGoodsService.save(returnNumber,customerReturnList,customerReturnListGoodsStr);
//
//        return new ServiceVO(SuccessCode.SUCCESS_CODE,SuccessCode.SUCCESS_MESS,null);
//    }
//}
