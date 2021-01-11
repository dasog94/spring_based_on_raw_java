package hello.spring_based_on_raw_java.member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
