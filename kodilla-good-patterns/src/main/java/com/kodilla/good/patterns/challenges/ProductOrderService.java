package com.kodilla.good.patterns.challenges;



/*public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService, final OrderService orderService, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

*//*    public OrderDTO process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getAmount(), orderRequest.getProduct(), orderRequest.getSeller(), orderRequest.getDeliveryPlace(), orderRequest.getOrderDate());

        if (isOrdered) {
            informationService.inform(orderRequest.getUser(), orderRequest.getProduct);
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getSeller(), orderRequest.getDeliveryPlace, orderRequest.amount);
            orderDelivery;

            return new OrderDTO(orderRequest.getUser(), true);
        } else {
            return new OrderDTO(orderRequest.getUser(), false);*//*
        }
    }
}*/
