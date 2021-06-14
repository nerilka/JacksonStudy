package jacksonStudy.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

public class UserValueTest {

    @Test
    public void testUserValue() throws JsonProcessingException {
        UserValue userValue = new UserValue(4, "Alex");

        String resultValue = new ObjectMapper().writeValueAsString(userValue);
        System.out.println(resultValue);

        assertThat(resultValue, containsString("UserValue"));

    }

}