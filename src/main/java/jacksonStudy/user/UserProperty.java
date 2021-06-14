package jacksonStudy.user;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserProperty {

    public int id;
    @JsonProperty("name")
    private String fName;

    public UserProperty(int id, String fName) {
        this.id = id;
        this.fName = fName;
    }

//    @JsonProperty("firstName")
    public String getfName() {
        return fName;
    }

}
