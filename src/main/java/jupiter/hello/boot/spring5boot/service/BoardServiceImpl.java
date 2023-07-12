package jupiter.hello.boot.spring5boot.service;

import jupiter.hello.boot.spring5boot.dao.BoardDAO;
import jupiter.hello.boot.spring5boot.model.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("bsrv")
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    final BoardDAO bdao;
    @Override
    public boolean saveBoard(Board b) {
        return bdao.insertBoard(b);
    }

    @Override
    public List<Board> readBoard() {
        return bdao.selectBoard();
    }

    @Override
    public Board readOneBoard(String bno) {
        return bdao.selectOneBoard(bno);
    }
}
