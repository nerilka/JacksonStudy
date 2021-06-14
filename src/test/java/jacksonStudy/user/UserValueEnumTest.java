package jacksonStudy.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class UserValueEnumTest {

    @Test
    public void testUserValueEnum() throws JsonProcessingException {
        String jsonResult = new ObjectMapper().writeValueAsString(UserValueEnum.FIRST_NAME);
        System.out.println(jsonResult);

        assertThat(jsonResult, is("\"Ivan\""));
    }

}