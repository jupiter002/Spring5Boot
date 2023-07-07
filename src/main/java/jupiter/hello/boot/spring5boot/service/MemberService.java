package jupiter.hello.boot.spring5boot.service;


import jupiter.hello.boot.spring5boot.model.Member;

import java.util.List;

public interface MemberService {
    boolean saveMember(Member m);

    List<Member> readMember();
}
