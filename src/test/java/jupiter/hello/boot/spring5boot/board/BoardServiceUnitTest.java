package jupiter.hello.boot.spring5boot.board;

import jupiter.hello.boot.spring5boot.dao.BoardDAOImpl;
import jupiter.hello.boot.spring5boot.model.Board;
import jupiter.hello.boot.spring5boot.service.BoardService;
import jupiter.hello.boot.spring5boot.service.BoardServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.context.annotation.Import;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import({BoardServiceImpl.class, BoardDAOImpl.class})
public class BoardServiceUnitTest {
    @Autowired private BoardService bsrv;

    @Test
    @DisplayName("BoardService save Test")
    void saveBoard(){
        Board b = new Board(null,"","abc123"
                ,null,"","","","");

        boolean result = bsrv.saveBoard(b);
        System.out.println(result);
        assertEquals(result, true);
    }

    @Test
    @DisplayName("BoardService read Test")
    void readMember(){
        List<Board> results = bsrv.readBoard();
        assertNotNull(results);
    }
    @Test
    @DisplayName("MemberService readOneMember Test")
    void readOneMember(){
    }
}
