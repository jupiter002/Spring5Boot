package jupiter.hello.boot.spring5boot.dao;

import jupiter.hello.boot.spring5boot.model.Board;
import jupiter.hello.boot.spring5boot.mybatis.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("bdao")     //autowired할때 사용할 이름 지정
@RequiredArgsConstructor
public class BoardDAOImpl implements BoardDAO {
    // @Autowired없이 DI 구현
    final BoardMapper boardMapper;
    @Override
    public boolean insertBoard(Board b) {
        return boardMapper.insertBoard(b);
    }

    @Override
    public List<Board> selectBoard(int stnum) {

        return boardMapper.selectBoard(stnum);
    }

    @Override
    public Board selectOneBoard(String bno) {
            boardMapper.updateViewBoard(bno);
        return boardMapper.selectOneBoard(bno);
    }

    @Override
    public int selectCountBoard() {
        return boardMapper.selectCountBoard();
    }

}
