package jupiter.hello.boot.spring5boot.service;

import jupiter.hello.boot.spring5boot.dao.PdsDAO;
import jupiter.hello.boot.spring5boot.model.Pds;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@Service("psrv")
@RequiredArgsConstructor
public class PdsServiceImpl implements PdsService {

    final PdsDAO pdao;
    @Override
    public int newPds(Pds p) {
        return pdao.insertPds(p);
    }

    @Override
    public boolean newPdsAttatch(MultipartFile attatch, int pno) {
        return false;
    }


}
