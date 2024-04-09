package Helpers;

import Models.User;

import java.util.ArrayList;

public class Database {
    public static ArrayList<User> fetchUsers() {
        ArrayList<User> users = new ArrayList<>();

        User a = new User("1", "Jessica123", "111");
        User a1 = new User("2", "Joffrey69", "111");
        User a2 = new User("3", "Cersei420", "111");
        User a3 = new User("4", "Drogon42","111");
        User a4 = new User("5", "Test123", "111");
        User a5 = new User("6", "Pikkolo", "111");

        users.add(a);
        users.add(a1);
        users.add(a2);
        users.add(a3);
        users.add(a4);
        users.add(a5);

        return users;
    }
}
