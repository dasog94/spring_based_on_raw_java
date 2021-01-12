package hello.spring_based_on_raw_java.discount;

import hello.spring_based_on_raw_java.member.Grade;
import hello.spring_based_on_raw_java.member.Member;

public class FixDiscountPolicy implements Discountpolicy {

    private int discountFixAmount = 1000; //1000원 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }

}
