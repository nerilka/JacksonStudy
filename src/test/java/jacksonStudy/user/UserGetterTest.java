package jacksonStudy.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.containsString;

public class UserGetterTest {

    @Test
    public void testUserGetter() throws JsonProcessingException {
        UserGetter userGetter = new UserGetter(2, "Nikola");

        String jsonResult = new ObjectMapper().writeValueAsString(userGetter);

        System.out.println(jsonResult);

        assertThat(jsonResult, containsString("id"));
        assertThat(jsonResult, containsString("name"));


    }

}