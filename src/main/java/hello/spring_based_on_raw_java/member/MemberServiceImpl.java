package hello.spring_based_on_raw_java.member;

public class MemberServiceImpl implements MemberService {

    // DIP 위반함
   private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
