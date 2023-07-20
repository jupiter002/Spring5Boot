package jupiter.hello.boot.spring5boot.mybatis;

import jupiter.hello.boot.spring5boot.model.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Mapper
public interface GalleryMapper {
    int insertGallery(Gallery g);
    int insertGalAttach(GalAttach ga);

    List<Gallery> selectGallery(int stnum);
    Gallery selectOneGallery(String pno);
    int selectCountGallery();
    Gallery selectOneGalAttach(String pno);

    /*
    int insertPdsComment(PdsComment pc);
    List<PdsComment> selectPdsComment(String pno);
    int insertPdsReply(PdsComment pc);
    */
}
