package jupiter.hello.boot.spring5boot.mybatis;

import jupiter.hello.boot.spring5boot.model.Pds;
import jupiter.hello.boot.spring5boot.model.PdsAttach;
import jupiter.hello.boot.spring5boot.model.PdsComment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PdsMapper {
    int insertPds(Pds p);
    int lastPdsPno();
    int insertPdsAttach(PdsAttach pa);
    List<Pds> selectPds(int stnum);
    Pds selectOnePds(String pno);
    int selectCountPds();
    PdsAttach selectOnePdsAttach(String pno);
    int insertPdsComment(PdsComment pc);

    List<PdsComment> selectPdsComment(String pno);






}
