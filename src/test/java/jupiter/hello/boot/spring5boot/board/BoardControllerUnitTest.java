package jupiter.hello.boot.spring5boot.board;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class BoardControllerUnitTest {
    @Autowired private MockMvc mvc;

    @Test
    @DisplayName("BoardController read Test")
    void readBoard() throws Exception {

        mvc.perform(get("/board/list/1"))

                .andExpect(status().isOk())
                .andDo(print());
    }
    @Test
    @DisplayName("BoardController view Test")
    void view() throws Exception {

        mvc.perform(get("/board/view/1178"))
                .andExpect(status().isOk())
                .andDo(print());
    }
    @Test
    @DisplayName("BoardController write Test")
    @Transactional
    void write() throws Exception {

        mvc.perform(post("/board/write")
                        .param("userid","abc123")
                        .param("title","제목")
                        .param("contents","가나다라마바사아자카타파하")
                        .param("ipaddr","192.168.0.202"))
                .andExpect(status().is3xxRedirection())
                .andDo(print());
    }
    @Test
    @DisplayName("BoardController find Test")
    void findBoard() throws Exception {

        mvc.perform(get("/board/find/1/title/취업자"))

                .andExpect(status().isOk())
                .andDo(print());
    }

}
