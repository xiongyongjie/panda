package com.springcloud.product.api;

import com.springcloud.product.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vo.ProductVo;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@Api("商品信息API-v1.0")
public class ProductApiController {

    @Autowired
    private ProductService productService;

    /**
     * 获取商品列表
     * @return
     */
    @GetMapping("list/{productId}")
    @ApiOperation(value = "获取商品列表信息")
    @ResponseBody
    public List<ProductVo> getProductList( @PathVariable("productId") String productId) {

        return  productService.queryProductList();

    }

    @GetMapping("getInfo")
    @ApiOperation(value = "获取商品列表信息")
    @ResponseBody
    public String getProductInfo() {

        return   "测试信息";

    }
}
