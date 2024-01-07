package com.darron.wsmreplica.controller;

import com.darron.wsmreplica.dto.OrderDTO;
import com.darron.wsmreplica.entity.Order;
import com.darron.wsmreplica.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public List<Order> allOrdersList() {
        return orderService.fetchAllOrders();
    }

    @PostMapping("/orders")
    public ResponseEntity<OrderDTO> createOrder(@RequestBody OrderDTO order) {
        log.info("Endpoint /orders -> Creating order");
        log.info("OrderDTO: {}", order);
        OrderDTO saveOrder = orderService.createOrder(order);
        log.info("Order persisted, success");
        return new ResponseEntity<>(saveOrder, HttpStatus.CREATED);
    }
}
