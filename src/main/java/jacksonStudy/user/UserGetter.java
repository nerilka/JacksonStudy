package jacksonStudy.user;

import com.fasterxml.jackson.annotation.JsonGetter;

public class UserGetter {

    public int id;
    private String firstName;

    public UserGetter(int id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    @JsonGetter("name")//изменение названия поля
    public String getFirstName() {
        return firstName;
    }


    @JsonGetter("family")
    public /*static*/ String getLastName(){
        return "Ivanov";
    }
}
