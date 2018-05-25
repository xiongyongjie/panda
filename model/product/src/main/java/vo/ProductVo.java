package vo;

import lombok.Data;

@Data
public class ProductVo {

    /**
     * 商品名称
     */
    private String productName;
    /**
     * 商品编码
     */
    private String productCode;
    /**
     * 商品价格
     */
    private Integer price;

}
