package jupiter.hello.boot.spring5boot.mybatis;

import jupiter.hello.boot.spring5boot.model.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    boolean insertBoard(Board b);
    List<Board> selectBoard();
    Board selectOneBoard(String bno);
}
