package com.springcloud.product.api;

import com.springcloud.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vo.ProductVo;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductApiController {

    @Autowired
    private ProductService productService;

    /**
     * 获取商品列表
     * @return
     */
    @GetMapping("list")
    public List<ProductVo> getProductList() {

        return  productService.queryProductList();
    }

}
