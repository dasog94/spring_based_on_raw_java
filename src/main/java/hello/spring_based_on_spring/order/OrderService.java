package hello.spring_based_on_spring.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
