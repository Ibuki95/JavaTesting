package DomainEntities;

public class User {

    public String name;
    public String password;

    public User(){
        name = "Tomeu";
        password = "secret";
    }

    public String getName(){
        return name;
    }

    public String getPassword(){
        return password;
    }
}
