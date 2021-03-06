package com.springcloud.product.feign;

import com.springcloud.product.feign.fallback.PriceFeignFallback;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 获取价格服务信息
 */
@Service
@FeignClient(value = "service-price",fallback = PriceFeignFallback.class)
public interface PriceFeign {

    /**
     * 根据productcode获取价格信息
     * @param productCode 商品编码
     * @return 商品价格
     */
    @PostMapping("/api/price/getPriceByProductCode/{productCode}")
    int getPriceByProductCode(@PathVariable("productCode")  String productCode);
}
