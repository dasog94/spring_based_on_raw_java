package hello.spring_based_on_raw_java.member;

public interface MemberService {

    //회원가입
    void join(Member member);

    //회원조회회
   Member findMember(Long memberId);
};
