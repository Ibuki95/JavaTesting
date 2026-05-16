package DomainEntities;

import javaTesting.Resources.PasswordUtils;

public class User {

    private String name;
    private String password;
    private String salt;

    public User(){
        this("Tomeu", "secret");
    }

    public User(String name, String password){
        this.name = name;
        this.salt = PasswordUtils.genSalt();
        this.password = PasswordUtils.hashedPassword(password, this.salt);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPassword(String password){
        this.salt = PasswordUtils.genSalt();
        this.password = PasswordUtils.hashedPassword(password, this.salt);
    }

    public boolean verifyPassword(String passwordEntered){
        return PasswordUtils.verifyUserPassword(passwordEntered, this.salt, this.password);
    }
}