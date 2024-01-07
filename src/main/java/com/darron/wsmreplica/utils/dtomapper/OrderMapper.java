package com.darron.wsmreplica.utils.dtomapper;

import com.darron.wsmreplica.dto.OrderDTO;
import com.darron.wsmreplica.entity.Order;

public class OrderMapper {

    // Convert Order to OrderDTO
    public static OrderDTO mapToOrderDTO(Order order) {
        OrderDTO orderDTO = new OrderDTO(
                order.getId(),
                order.getSerialNo(),
                order.getPax(),
                order.getAmount(),
                order.getPaymentMethod(),
                order.getCreatedAt()
        );

        return orderDTO;
    }

    public static Order mapToOrder(OrderDTO orderDTO) {
        return new Order(
                orderDTO.getId(),
                orderDTO.getSerialNo(),
                orderDTO.getPax(),
                orderDTO.getAmount(),
                orderDTO.getPaymentMethod()
        );
    }
}
