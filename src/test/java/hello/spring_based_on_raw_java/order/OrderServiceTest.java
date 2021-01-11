package hello.spring_based_on_raw_java.order;

import hello.spring_based_on_raw_java.member.Grade;
import hello.spring_based_on_raw_java.member.Member;
import hello.spring_based_on_raw_java.member.MemberService;
import hello.spring_based_on_raw_java.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
