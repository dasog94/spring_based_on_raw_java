package hello.spring_based_on_raw_java.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
