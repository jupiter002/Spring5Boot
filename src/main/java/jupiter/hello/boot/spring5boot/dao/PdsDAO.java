package jupiter.hello.boot.spring5boot.dao;

import jupiter.hello.boot.spring5boot.model.Pds;
import jupiter.hello.boot.spring5boot.model.PdsAttach;

public interface PdsDAO {
    int insertPds(Pds p);

    int insertPdsAttach(PdsAttach pa);
}
