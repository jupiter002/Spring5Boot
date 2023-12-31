package jupiter.hello.boot.spring5boot.dao;

import jupiter.hello.boot.spring5boot.model.Member;

import jupiter.hello.boot.spring5boot.model.Zipcode;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import jupiter.hello.boot.spring5boot.mybatis.MemberMapper;

import java.util.List;
@Repository("mdao")
@RequiredArgsConstructor
public class MemberDAOImpl implements MemberDAO{
    // mybatis를 사용하기 위해 필요한 객체 DI
    // 단, 생성자 주입 방식 사용
    final MemberMapper memberMapper;

    @Override
    public int insertMember(Member m) {

        // insert(insert관련 맵핑, 매개변수)
        // sqlSession.insert("insertMember",m) 로 사용하는 방식보다는 편리함
        //return sqlSession.insert("MemberMapper.insertMember",m);
        return memberMapper.insertMember(m);
    }

    @Override
    public List<Member> selectMember() {
        List<Member> result = memberMapper.selectMember();
        return result;
    }

    @Override
    public List<Zipcode> selectzip(String dong) {

        return memberMapper.findZipcode(dong);
    }

    @Override
    public int selectOneUserid(String uid) {
        return memberMapper.selectOneUserid(uid);
    }

    @Override
    public Member selectOneMember(Member m) {
        return memberMapper.selectOneMember(m);
    }
}
