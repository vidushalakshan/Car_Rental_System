package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.OrderDTO;
import lk.ijse.spring.entity.Order;
import lk.ijse.spring.repo.OrderRepo;
import lk.ijse.spring.service.OrderService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void saveOrder(OrderDTO orderDTO) {
        if (!orderRepo.existsById(orderDTO.getBookingID())){
            orderRepo.save(modelMapper.map(orderDTO, Order.class));
        }else {
            throw new RuntimeException("Booking Already Exist");
        }
    }

    @Override
    public void deleteOrder(String orderId) {
        if (orderRepo.existsById(orderId)){
            orderRepo.deleteById(orderId);
        }else {
            throw new RuntimeException("Please check the Booking ID.. No Such Payment..!");
        }
    }

    @Override
    public List<OrderDTO> getAllOrders() {
        return modelMapper.map(orderRepo.findAll(), new TypeToken<List<OrderDTO>>(){

        }.getType());
    }
}
