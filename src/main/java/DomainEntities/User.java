package DomainEntities;

public class User {

    private String name;
    private String password;

    public User(){
        this("Tomeu", "secret");
    }

    public User(String name, String password){
        this.name = name;
        this.password = password;
    }

    public String getName(){
        return name;
    }

    public String getPassword(){
        return password;
    }
}
