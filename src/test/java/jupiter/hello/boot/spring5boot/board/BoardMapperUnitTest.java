package jupiter.hello.boot.spring5boot.board;

import jupiter.hello.boot.spring5boot.model.Board;
import jupiter.hello.boot.spring5boot.mybatis.BoardMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class BoardMapperUnitTest {
    @Autowired private BoardMapper boardMapper;

    @Test
    @DisplayName("BoardMapper insert Test")
    @Transactional
    void insertBoard(){
        Board b = new Board();
        b.setUserid("abc123");
        b.setTitle("테스트");
        b.setContents("테스트");
        b.setIpaddr("127.0.0.1");

        boolean result = boardMapper.insertBoard(b);
        System.out.println(result);
        assertEquals(result,true);
    }
    @Test
    @DisplayName("BoardMapper select Test")
    void selectBoard(){
        int cpg = 1;
        int stnum = (cpg - 1)*25;
        List<Board> results = boardMapper.selectBoard(stnum);

        System.out.println(results);
        assertNotNull(results);
    }
    @Test
    @DisplayName("BoardMapper selectOne Test")
    void selectOneBoard(){
        String bno = "600";
        Board result = boardMapper.selectOneBoard(bno);

        assertNotNull(result);
    }
    @Test
    @DisplayName("BoardMapper update Test")
    @Transactional
    void updateOneBoard(){
        String bno = "1478";

        int result = boardMapper.updateViewBoard(bno);
        System.out.println(result);
        assertEquals(result,1);
    }
    @Test
    @DisplayName("BoardMapper countPage Test")
    void countPageBoard(){
        int result = boardMapper.selectCountBoard();
        assertEquals(result,59);
    }
    @Test
    @DisplayName("BoardMapper findBoard Test")
    void selectFindBoard(){
        Map<String, Object> params = new HashMap<>();
        params.put("findtype","title");
        params.put("findkey","취업자");
        params.put("stnum",25);
        List<Board>results = boardMapper.selectFindBoard(params);
        assertNotNull(results);
    }
    @Test
    @DisplayName("BoardMapper countfindBoard Test")
    void countFindBoard(){
        Map<String, Object> params = new HashMap<>();
        params.put("findtype","title");
        params.put("findkey","전세보다");
        int result = boardMapper.countFindBoard(params);
        assertNotNull(result);
    }
}
