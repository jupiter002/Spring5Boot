package jupiter.hello.boot.spring5boot.service;

import jupiter.hello.boot.spring5boot.model.Pds;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface PdsService {
    int newPds(Pds p);
    boolean newPdsAttatch(MultipartFile attatch, int pno);



}
