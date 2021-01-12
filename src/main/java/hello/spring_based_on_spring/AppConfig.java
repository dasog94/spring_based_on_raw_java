package hello.spring_based_on_spring;

import hello.spring_based_on_spring.discount.DiscountPolicy;
import hello.spring_based_on_spring.discount.FixDiscountPolicy;
import hello.spring_based_on_spring.discount.RateDiscountPolicy;
import hello.spring_based_on_spring.member.MemberRepository;
import hello.spring_based_on_spring.member.MemberService;
import hello.spring_based_on_spring.member.MemberServiceImpl;
import hello.spring_based_on_spring.member.MemoryMemberRepository;
import hello.spring_based_on_spring.order.OrderService;
import hello.spring_based_on_spring.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    private MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
