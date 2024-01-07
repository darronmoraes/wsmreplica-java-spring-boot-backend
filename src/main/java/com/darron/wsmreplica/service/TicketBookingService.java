package com.darron.wsmreplica.service;

import com.darron.wsmreplica.dto.TicketBookingDTO;
import com.darron.wsmreplica.entity.Order;
import com.darron.wsmreplica.entity.Vehicle;
import com.darron.wsmreplica.entity.VehicleOrder;
import com.darron.wsmreplica.repository.OrderRepository;
import com.darron.wsmreplica.repository.VehicleOrderRepository;
import com.darron.wsmreplica.repository.VehicleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class TicketBookingService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private VehicleOrderRepository vehicleOrderRepository;

    public List<TicketBookingDTO> ticketBookings() {
        log.info("Fetching All Orders");
        List<Order> orderList = orderRepository.findAll();
        log.info("Success, Fetched all orders");

        //List<Vehicle> vehicleList = vehicleRepository.findAll();
        log.info("Fetching All Vehicle-Orders");
        List<VehicleOrder> vehicleOrderList = vehicleOrderRepository.findAll();
        log.info("Success, Fetched all vehicle-orders");

        log.info("Adding bookings to Ticket Booking DTO layer");
        return orderList.stream()
                .map(order -> {
                    TicketBookingDTO ticketBookingDTO = new TicketBookingDTO();
                    ticketBookingDTO.setOrder(order);

                    // Find associated vehicle-order
                    log.info("Fetching Associated Vehicle Order");
                    VehicleOrder vehicleOrder = findVehicleOrder(vehicleOrderList, order.getId());
                    if (vehicleOrder != null) {
                        log.info("Vehicle-Order: id -> {}", vehicleOrder.getId());
                        log.info("Vehicle-Order: {}", vehicleOrder);
                        ticketBookingDTO.setVehicleOrder(vehicleOrder);

                        // Find associated vehicle
                        //Vehicle vehicle = vehicleRepository.findById(vehicleOrder.getVehicle().getId()).orElse(null);
                        Vehicle vehicle = vehicleOrder.getVehicle();
                        if (vehicle != null) {
                            log.info("Vehicle: id -> {}", vehicle.getId());
                            log.info("Vehicle: {}", vehicle);
                            ticketBookingDTO.setVehicle(vehicle);
                        }
                    }

                    return ticketBookingDTO;
                })
                .collect(Collectors.toList());
    }

    // Function to find vehicle-order
    private VehicleOrder findVehicleOrder(List<VehicleOrder> vehicleOrderList, Integer orderId) {
        return vehicleOrderList.stream()
                .filter(vo -> vo.getOrder().getId().equals(orderId))
                .findFirst()
                .orElse(null);
    }
}
