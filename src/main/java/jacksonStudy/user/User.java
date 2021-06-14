package jacksonStudy.user;

public class User {

    public int id;
    private String userName;

    public String getUserName() {
        return userName;
    }

//    public String getVersion() {
//        return "1.0";
//    }

    public User(int id, String userName) {
        this.id = id;
        this.userName = userName;
    }



}
