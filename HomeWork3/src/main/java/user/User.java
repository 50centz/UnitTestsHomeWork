package user;

public class User {

    private String name;
    private String password;
    private Role role;

    private boolean isAuthenticate = false;

    public User(String name, String password, Role role) {
        this.name = name;
        this.password = password;
        this.role = role;

    }

    //3.6.
    public void authenticate() {
        isAuthenticate = true;
    }

    public boolean isAuthenticate() {
        return isAuthenticate;
    }

    public boolean logOut() {
        if (getRole() == Role.ADMIN){
            return false;
        }else{
            isAuthenticate = false;
        }
        return true;
    }

    private Role getRole() {
        return role;
    }
}