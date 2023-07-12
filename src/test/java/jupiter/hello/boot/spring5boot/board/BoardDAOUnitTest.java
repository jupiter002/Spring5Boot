package jupiter.hello.boot.spring5boot.board;

import jupiter.hello.boot.spring5boot.dao.BoardDAO;
import jupiter.hello.boot.spring5boot.dao.BoardDAOImpl;
import jupiter.hello.boot.spring5boot.model.Board;
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
@Import(BoardDAOImpl.class)
public class BoardDAOUnitTest {
    @Autowired private BoardDAO bdao;

    @Test
    @DisplayName("BoardDAO insert Test")
    void insertBoard(){
        Board b = new Board(null,"","abc123",null,""
                ,"","","");

        boolean result = bdao.insertBoard(b);
        System.out.println(result);
        assertEquals(result, 1);
    }

    @Test
    @DisplayName("BoardDAO select Test")
    void selectBoard(){
        List<Board> results = bdao.selectBoard();
        //System.out.println(results);
        assertNotNull(results);
    }

    @Test
    @DisplayName("BoardDAO selectOneBoard Test")
    void selectOneBoard(){
        Board result = bdao.selectOneBoard("2872");
        System.out.println(result);
        assertNotNull(result);
    }
}
