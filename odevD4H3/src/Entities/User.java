package Entities;

public class User {
    private String userId;
    private String userName;
    private String userLastName;
    private int userBirthday;

    public User(String userId, String userName, String userLastName, int userBirthday) {
        this.userId = userId;
        this.userName = userName;
        this.userLastName = userLastName;
        this.userBirthday = userBirthday;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public int getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(int userBirthday) {
        this.userBirthday = userBirthday;

    }

    @Override
    public String toString() {
        return
                "   KULLANICI BİLGİLERİ "+ '\n' +
                "Tc= " + userId + '\n' +
                "ad= " + userName + '\n' +
                "soyad= " + userLastName + '\n' +
                "doğum yılı= " + userBirthday+ '\n'  ;
    }
}
