package jacksonStudy.user;

import com.fasterxml.jackson.annotation.JsonValue;

public enum UserValueEnum {

    FIRST_NAME("Ivan"),
    LAST_NAME("Ivanov");

    private String name;

    UserValueEnum(String name) {
        this.name = name;
    }
@JsonValue
    public String getName() {
        return name;
    }
}
