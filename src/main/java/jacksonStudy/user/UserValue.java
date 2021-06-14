package jacksonStudy.user;

import com.fasterxml.jackson.annotation.JsonValue;

public class UserValue {

    public int id;
    private String name;

    public UserValue(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

     @JsonValue
    public String jsonValue() {
        return toString();
    }

    @Override
    public String toString() {
        return "UserValue{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
