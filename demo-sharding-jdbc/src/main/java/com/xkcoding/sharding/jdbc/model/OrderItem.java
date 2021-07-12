package com.xkcoding.sharding.jdbc.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019-03-26 13:35
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName(value = "t_order_item")
public class OrderItem {
    /**
     * 主键
     */
    private Long id;
    /**
     * 用户id
     */
    private Long userId;

    /**
     * 订单id
     */
    private Long orderId;
    /**
     * 备注
     */
    private String remark;
}
