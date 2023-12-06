package Pojo;

import java.util.UUID;

public class User {
    private String name;
    private String id;

    public User(String name){
        this.name = name;
        this.id = UUID.randomUUID().toString();
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
