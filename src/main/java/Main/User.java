package Main;
import java.util.*;
import java.util.Scanner;

public class User {
    private int price;
    private String Username;
    private String Password;
    private String name;

    public User() {
        this.Password="1";
        this.Username="1";
        this.name="";
    }

    public int getPrice() {
        return price;
    }
    public String getUsername() {
        return Username;
    }
    public String getPassword() {
        return Password;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setUsername(String username) {
        this.Username = username;
    }
    public void setPassword(String password) {
        this.Password = password;
    }
    public void Login() {
        System.out.println("\n\t\t\tWelcome to our Shop !!");
        do{
            Scanner input1 = new Scanner(System.in);
            System.out.print("Enter Username : ");
            String username = input1.next();

            Scanner input2 = new Scanner(System.in);
            System.out.print("Enter Password : ");
            String password = input2.next();

            if (username.equals(Username) && password.equals(Password)) {

                System.out.println("Access Granted! Welcome!");


                break;
            }
            else if (username.equals(Username)) {
                System.out.println("Invalid Password!");
            } else if (password.equals(Password)) {
                System.out.println("Invalid Username!");
            } else {
                System.out.println("Invalid Username & Password!");
            }
        }while(Username.equals(Username)&& Password.equals(Password));

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Name : ");
        name = keyboard.nextLine();

    }

}


