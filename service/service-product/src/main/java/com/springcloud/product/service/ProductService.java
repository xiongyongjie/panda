package com.springcloud.product.service;

import com.springcloud.product.dao.ProductDao;
import com.springcloud.product.feign.PriceFeign;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.Product;
import vo.ProductVo;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;
    @Autowired
    private PriceFeign priceFeign;

    /**
     * 获取商品列表
     * @return
     */
    public List<ProductVo> queryProductList() {

        List<Product> productList = productDao.getProduct();
        List<ProductVo> voList = new ArrayList<>();
        productList.forEach(product -> {
            ProductVo productVo = new ProductVo();
            BeanUtils.copyProperties(product,productVo);
            //获取价格信息
            productVo.setPrice(priceFeign.getPriceByProductCode(product.getProductCode()));
            voList.add(productVo);
        });
        return voList;
    }


}
