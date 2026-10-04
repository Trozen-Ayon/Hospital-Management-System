package model;

import java.util.ArrayList;

public class User_Inventory {
    private ArrayList<User> users;

    public User_Inventory(){
        users = new ArrayList<>();
    }

    public void addUser(User a){
        users.add(a);
    }
}
