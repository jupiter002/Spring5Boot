package jupiter.hello.boot.spring5boot.dao;

import jupiter.hello.boot.spring5boot.model.Board;

import java.util.List;

public interface BoardDAO {
    boolean insertBoard(Board b);
    List<Board> selectBoard(int stnum);
    Board selectOneBoard(String bno);
    int selectCountBoard();

}
