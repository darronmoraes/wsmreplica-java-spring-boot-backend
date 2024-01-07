package com.darron.wsmreplica.service;

import com.darron.wsmreplica.dto.OrderDTO;
import com.darron.wsmreplica.entity.Order;
import com.darron.wsmreplica.repository.OrderRepository;
import com.darron.wsmreplica.utils.dtomapper.OrderMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> fetchAllOrders() {
        log.info("Fetching Orders");
        List<Order> orderList = orderRepository.findAll();
        log.info("Returning Orders List");
        return orderList;
    }

    public OrderDTO createOrder(OrderDTO orderDTO) {
        // Convert OrderDTO to order JPA entity
        Order order = OrderMapper.mapToOrder(orderDTO);
        // Persist Order to Db
        Order saveOrder = orderRepository.save(order);
        // Convert Saved Order to OrderDTO
        OrderDTO savedOrderDTO = OrderMapper.mapToOrderDTO(saveOrder);
        // Return saved OrderDTO
        return savedOrderDTO;
    }
}
