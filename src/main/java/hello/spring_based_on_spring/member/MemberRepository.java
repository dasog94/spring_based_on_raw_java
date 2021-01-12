package hello.spring_based_on_spring.member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
