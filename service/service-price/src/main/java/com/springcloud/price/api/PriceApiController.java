package com.springcloud.price.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/price")
@Api("价格信息API-v1.0")
public class PriceApiController {


    /**
     * 获取商品列表
     * @return
     */
    @PostMapping("getPriceByProductCode/{productCode}")
    @ApiOperation(value = "获取商品价格信息")
    @ResponseBody
    public Integer getProductPriceInfo(@ApiParam(value = "商品价格",required = true) @PathVariable("productCode") String productCode) {

        return  12;

    }

}
