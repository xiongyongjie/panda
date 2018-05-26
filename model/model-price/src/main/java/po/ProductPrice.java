package po;

import lombok.Data;

@Data
public class ProductPrice {
    /**
     * 商品编码
     */
    private String productCode;
    /**
     * 商品价格
     */
    private Integer price;
}
