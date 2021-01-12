package hello.spring_based_on_spring.order;

import hello.spring_based_on_spring.discount.DiscountPolicy;
import hello.spring_based_on_spring.member.Member;
import hello.spring_based_on_spring.member.MemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountpolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountpolicy) {
        this.memberRepository = memberRepository;
        this.discountpolicy = discountpolicy;
    }


    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountpolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
