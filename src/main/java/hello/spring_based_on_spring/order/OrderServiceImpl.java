package hello.spring_based_on_raw_java.order;

import hello.spring_based_on_raw_java.discount.Discountpolicy;
import hello.spring_based_on_raw_java.discount.FixDiscountPolicy;
import hello.spring_based_on_raw_java.member.Member;
import hello.spring_based_on_raw_java.member.MemberRepository;
import hello.spring_based_on_raw_java.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final Discountpolicy discountpolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountpolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
