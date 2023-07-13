package jupiter.hello.boot.spring5boot.mybatis;

import jupiter.hello.boot.spring5boot.model.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BoardMapper {
    boolean insertBoard(Board b);
    List<Board> selectBoard(int stnum);
    Board selectOneBoard(String bno);
    int updateViewBoard(String bno);
    int selectCountBoard();
    List<Board> selectFindBoard(Map<String, Object> params);


}
