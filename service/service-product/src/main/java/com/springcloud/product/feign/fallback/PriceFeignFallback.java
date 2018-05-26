package com.springcloud.product.feign.fallback;

import com.springcloud.product.feign.PriceFeign;
import lombok.extern.slf4j.Slf4j;

/**
 *价格服务降级处理
 */
@Slf4j
public class PriceFeignFallback implements PriceFeign {
    @Override
    public int getPriceByProductCode(String productCode) {
        log.info("执行降级逻辑开始...");
        return 0;
    }
}
