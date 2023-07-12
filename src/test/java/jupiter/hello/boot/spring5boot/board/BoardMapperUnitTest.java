package jupiter.hello.boot.spring5boot.board;

import jupiter.hello.boot.spring5boot.model.Board;
import jupiter.hello.boot.spring5boot.mybatis.BoardMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class BoardMapperUnitTest {
    @Autowired private BoardMapper boardMapper;


    @Test
    @DisplayName("BoardMapper insert Test")
    void insertBoard(){
        Board b = new Board(null,"","abc123",
                null,"","","","");

        boolean result = boardMapper.insertBoard(b);
        System.out.println(result);
        assertNotNull(result);
    }
    @Test
    @DisplayName("BoardMapper select Test")
    void selectBoard(){
        List<Board> results = boardMapper.selectBoard();

        System.out.println(results);
        assertNotNull(results);
    }

    @Test
    @DisplayName("BoardMapper selectOneMember Test")
    void selectOneMember(){
        Board result = boardMapper.selectOneBoard("2872");

        System.out.println(result);
        assertNotNull(result);
    }
}
