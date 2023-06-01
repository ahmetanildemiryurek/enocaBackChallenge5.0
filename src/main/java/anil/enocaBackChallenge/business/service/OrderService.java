package anil.enocaBackChallenge.business.service;

import anil.enocaBackChallenge.dataAccess.OrderRepository;
import anil.enocaBackChallenge.entitiy.Order;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order createOrder(Order order) {
        // İşlem detayı ekleme
        order.setCreateDate(new Date());
        return orderRepository.save(order);
    }

    public Order updateOrder(Order order) {
        // İşlem detayı güncelleme
        return orderRepository.save(order);
    }

    public void deleteOrder(Long orderId) {
        // İşlem detayı silme
        orderRepository.deleteById(orderId);
    }

    public List<Order> getAllOrders() {
        // İşlem detayı listeleme
        return orderRepository.findAll();
    }
}

