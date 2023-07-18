package jupiter.hello.boot.spring5boot.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class PdsComment {
    private String cno;
    private String comments;
    private String userid;
    private String regdate;
    private String pno;
    private String ref;
}
