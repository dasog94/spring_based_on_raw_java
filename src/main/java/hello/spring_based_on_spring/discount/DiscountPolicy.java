package hello.spring_based_on_raw_java.discount;

import hello.spring_based_on_raw_java.member.Member;

public interface Discountpolicy {

    /**
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);

}
