package jupiter.hello.boot.spring5boot.service;

import jupiter.hello.boot.spring5boot.dao.PdsDAO;
import jupiter.hello.boot.spring5boot.model.Pds;
import jupiter.hello.boot.spring5boot.model.PdsAttach;
import jupiter.hello.boot.spring5boot.utils.PdsUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service("psrv")
@RequiredArgsConstructor
public class PdsServiceImpl implements PdsService {

    final PdsDAO pdao;
    final PdsUtils pdsUtils;
    @Override
    public int newPds(Pds p) {
        int cnt = pdao.insertPds(p);
        return cnt;
    }

    @Override
    public boolean newPdsAttach(MultipartFile attach, int pno) {
        //첨부한 파일을 지정한 위치에 저장후 파일정보 리턴
        PdsAttach pa = pdsUtils.processUpload(attach);
        pa.setPno(pno + "");
        //첨부파일 정보를 DB에 저장
        int pacnt = pdao.insertPdsAttach(pa);
        return (pacnt > 0 ) ? true : false;
    }

    @Override
    public List<Pds> readPds(Integer cpg) {
        return pdao.selectPds(cpg);
    }

    @Override
    public int countPds() {
        return pdao.selectCountPds();
    }

    @Override
    public Pds readOnePds(String pno) {
        return pdao.selectOnePds(pno);
    }


}
