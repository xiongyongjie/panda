package com.springcloud.product.dao;

import org.springframework.stereotype.Repository;
import po.Product;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductDao {

    /**
     * 查询商品信息
     * @return
     */
    public List<Product> getProduct() {
        List<Product> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Product product = new Product();
            product.setProductCode("code-" + i);
            product.setProductName("pname-" + i);
            list.add(product);
        }
        return  list;
    }

}
