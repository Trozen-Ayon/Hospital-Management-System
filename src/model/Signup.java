package model;

import java.util.Scanner;

public class Signup extends User {
//    private String email;
//    private int phone;
//    private String username;

    Scanner s = new Scanner(System.in);

    public void getInfo(){
        System.out.print("Enter your email address: ");
        email = s.next();
        System.out.print("Enter your Phone number: ");
        phone = s.nextInt();
        s.nextLine();
        System.out.print("Enter your Username: ");
        name = s.nextLine();
    }
}
