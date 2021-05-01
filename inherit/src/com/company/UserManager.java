package com.company;

public class UserManager {
    public static void logIn(){
        System.out.println("Giriş yapıldı!");
    }
    public static void logOut(){
        System.out.println("Logged out");
    }
    public static void addComment(){
        System.out.println("Yorum eklendi");

    }
    public static void add(User user){
        System.out.println(user.getFirstname()+" eklendi!");
    }
    public static void addMultiple(User[] users){
        for (User user: users
        ) {
            add(user);
        }
    }
}
