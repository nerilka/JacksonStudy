package jacksonStudy.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void testUser() throws JsonProcessingException {
        User user = new User(1, "Ivan");

        String resultJson = new ObjectMapper().writeValueAsString(user);
        System.out.println(resultJson);

        assertThat(resultJson, containsString("id"));
        assertThat(resultJson, containsString("userName"));

    }

}