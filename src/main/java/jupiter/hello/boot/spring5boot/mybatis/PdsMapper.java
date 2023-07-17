package jupiter.hello.boot.spring5boot.mybatis;

import jupiter.hello.boot.spring5boot.model.Pds;
import jupiter.hello.boot.spring5boot.model.PdsAttach;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PdsMapper {
    int insertPds(Pds p);
    int lastPdsPno();
    int insertPdsAttach(PdsAttach pa);



}
