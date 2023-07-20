package jupiter.hello.boot.spring5boot.service;

import jupiter.hello.boot.spring5boot.model.Gallery;

import java.util.List;

public interface GalleryService {
    List<Gallery> readGallery(Integer cpg);

    int countGallery();
}
