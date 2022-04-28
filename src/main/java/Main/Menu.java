package Main;
import Main.Me.Me1;
import Main.Me.Me2;
import Main.Me.Me3;
import Main.Me.Me4;

import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class Menu {

    private String Menu1, Menu2, Menu3, Menu4;

    public Menu() {
        this.Menu1 = "1";
        this.Menu2 = "2";
        this.Menu3 = "3";
        this.Menu4 = "4";

    }
    //Set

    public void setMenu1(String Menu1) {
        this.Menu1 = Menu1;
    }

    public void setMenu2(String Menu2) {
        this.Menu2 = Menu2;
    }

    public void setMenu3(String Menu3) {
        this.Menu3 = Menu3;
    }

    public void setMenu4(String Menu4) {
        this.Menu4 = Menu4;
    }

    //Get

    public String getMenu1() {
        return Menu1;
    }

    public String getMenu2() {
        return Menu2;
    }

    public String getMenu3() {
        return Menu3;
    }

    public String getMenu4() {
        return Menu4;
    }
    public void MeSelect() {


        Me1 xe1 = new Me1();
        Me2 xe2 = new Me2();
        Me3 xe3 = new Me3();
        Me4 xe4 = new Me4();

        do {
            System.out.println("1.Rent Car : ");
            System.out.println("2.Rent : ");
            System.out.println("3.Car : ");
            Scanner input3 = new Scanner(System.in);
            System.out.print("Please select : ");
            String menu = input3.next();

            if (menu.equals(Menu1)) {

                xe1.Mee1();
                break;
            } else if (menu.equals(Menu2)) {
                xe2.Mee2();

                break;
            } else if (menu.equals(Menu3)) {
                xe3.Mee3();

                break;
            } else if (menu.equals(Menu4)) {
                System.out.println("You select mai ru");
                xe4.Mee4();

                break;
            } else {
                System.out.println("Invalid Menu");
            }
        } while (Menu1.equals(Menu1) && Menu2.equals(Menu2) && Menu3.equals(Menu3) && Menu4.equals(Menu4));

    }
}

