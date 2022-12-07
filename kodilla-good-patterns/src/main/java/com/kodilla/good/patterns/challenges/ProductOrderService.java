package com.kodilla.good.patterns.challenges;



public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;
    private OrderDelivery orderDelivery;
    private User user;
    private Product product;
    private Seller seller;

    public ProductOrderService(final InformationService informationService, final OrderService orderService, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

/*    public OrderService.OrderDTO process(final OrderService.OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(user.getUserID(), orderRequest.getAmount(), product.getProductID(), seller.getSellerID(), orderRequest.getDeliveryPlace(), orderRequest.getOrderDate());

        if (isOrdered) {
            informationService.inform(user.getUserName(), product.getProductName());
            orderRepository.createOrder(user.getUserID(), product.getProductID(), seller.getSellerID(), orderRequest.getDeliveryPlace(), orderRequest.getAmount());
            orderDelivery.deliverOrder(orderRequest.getDeliveryPlace(), seller.getSellerAddress());

            return new OrderService.OrderDTO(user.getUserID(), true);
        } else {
            return new OrderService.OrderDTO(user.getUserID(), false);
        }
    }*/
}
