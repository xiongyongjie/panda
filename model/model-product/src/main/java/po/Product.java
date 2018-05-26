package po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("商品信息")
public class Product {

    /**
     * 商品名称
     */
    @ApiModelProperty("商品名称")
    private String productName;
    /**
     * 商品编码
     */
    @ApiModelProperty("商品编码")
    private String productCode;


}
