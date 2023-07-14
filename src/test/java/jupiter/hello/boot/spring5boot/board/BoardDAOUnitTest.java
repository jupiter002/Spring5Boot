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
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import(BoardDAOImpl.class)
public class BoardDAOUnitTest {
    @Autowired private BoardDAO bdao;

    @Test
    @DisplayName("BoardDAO insert Test")
    @Transactional
    void insertBoard(){
        Board b = new Board();
        b.setUserid("abc123");
        b.setTitle("테스트");
        b.setContents("테스트");
        b.setIpaddr("127.0.0.1");

        boolean result = bdao.insertBoard(b);
        System.out.println(result);
        assertEquals(result,true);
    }


    @Test
    @DisplayName("BoardDAO select Test")
    void selectBoard(){
        int cpg = 1;
        int stnum = (cpg - 1)*25;
        List<Board> results = bdao.selectBoard(stnum);
        //System.out.println(results);
        assertNotNull(results);
    }

    @Test
    @DisplayName("BoardDAO selectOneBoard Test")
    void selectOneBoard(){
        String bno = "110";
        Board result = bdao.selectOneBoard(bno);
        assertNotNull(result);
    }
    @Test
    @DisplayName("BoardDAO count Test")
    void selectCountBoard(){
        int result = bdao.selectCountBoard();
        System.out.println(result);
        assertEquals(result,59);
    }
    @Test
    @DisplayName("BoardDAO findBoard Test")
    void selectFindBoard(){
        Map<String, Object> params = new HashMap<>();
        params.put("findtype","titcont");
        params.put("findkey","SRBM");
        params.put("stnum",25);
        List<Board>results = bdao.selectFindBoard(params);
        assertNotNull(results);
    }
    @Test
    @DisplayName("BoardDAO countFindBoard Test")
    void countFindBoard(){
        Map<String, Object> params = new HashMap<>();
        params.put("findtype","titcont");
        params.put("findkey","취업자");
        int result = bdao.countFindBoard(params);
        assertNotNull(result);
    }
}
