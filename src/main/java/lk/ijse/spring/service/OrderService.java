package lk.ijse.spring.service;

import lk.ijse.spring.dto.OrderDTO;

import java.util.List;

public interface OrderService {

    void  saveOrder(OrderDTO orderDTO);

    void deleteOrder(String orderId);

    List<OrderDTO> getAllOrders();

}
