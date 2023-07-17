package jupiter.hello.boot.spring5boot.dao;

import jupiter.hello.boot.spring5boot.model.Pds;
import jupiter.hello.boot.spring5boot.model.PdsAttach;
import jupiter.hello.boot.spring5boot.mybatis.PdsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("pdao")
public class PdsDAOImpl implements PdsDAO{
    @Autowired
    private PdsMapper pdsMapper;
    @Override
    public int insertPds(Pds p) {
        int cnt = pdsMapper.insertPds(p);
        if(cnt > 0)
            cnt = pdsMapper.lastPdsPno();


        return cnt;
    }

    @Override
    public int insertPdsAttach(PdsAttach pa) {
        return pdsMapper.insertPdsAttach(pa);
    }


}
