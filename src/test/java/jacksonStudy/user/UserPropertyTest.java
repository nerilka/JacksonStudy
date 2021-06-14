package jacksonStudy.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

public class UserPropertyTest {

    @Test
    public void testUserProperty() throws JsonProcessingException {
        UserProperty userProperty = new UserProperty(3, "Petr");

        String resultTest = new ObjectMapper().writeValueAsString(userProperty);

        System.out.println(resultTest);

        assertThat(resultTest, containsString("id"));
        assertThat(resultTest, containsString("name"));

    }

}