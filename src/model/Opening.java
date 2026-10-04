package model;
import java.util.Scanner;

public class Opening extends Patient{
    public static void main(String[] args){
        System.out.print("Welcome.\nAre you new here?\nType Y/N: ");
        Scanner s = new Scanner(System.in);
        String a = s.next();
        if(a.equals("Y")){
            System.out.println("What do you represent as? Choose a number: "
            + "\nPatient -> 1"
            + "\nDoctor -> 2");
            int b = s.nextInt();
            if(b==1){
                //Patient p1 = new Patient();
                Signup s1 = new Signup();
                s1.getInfo();
                User_Inventory users = new User_Inventory();
                users.addUser(s1);
                System.out.println("Hello " + s1.name + "! Welcome to out HRS - Hospital Review System."
                + "\nWant to do a tour?");
            }
        }
        else{
            //System.out.println("jj");

        }
    }
}
