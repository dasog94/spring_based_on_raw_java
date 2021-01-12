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
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //설정 정보인 것을 표시
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
