package se.danielk;

public class AppUser {

    private String username;
    private String password;
    private AppRole role;

    public AppUser(String username, String password, AppUser role){

        if (username == null || username.isEmpty())
            throw new IllegalArgumentException("username Required!");

        if (password == null || password.isEmpty())
            throw new IllegalArgumentException("password required!");

        if (role == null)
            throw new IllegalArgumentException("not allowed to be null");

        this.username = username;
        this.password = password;
        this.role = role.getRole();

    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        this.role = role;
    }



}
