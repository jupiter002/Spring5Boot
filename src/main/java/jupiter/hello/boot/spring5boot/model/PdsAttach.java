package jupiter.hello.boot.spring5boot.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class PdsAttach {
    private String pano;
    private String pno;
    private String fname;
    private String ftype;
    private String fsize;
    private String fdown;
}
