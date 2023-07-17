package jupiter.hello.boot.spring5boot.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Pds {
    private String pno;
    private String title;
    private String userid;
    private String regdate;
    private String thumbs;
    private String views;
    private String contents;
    private String ipaddr;

    private PdsAttach pa ;
}
