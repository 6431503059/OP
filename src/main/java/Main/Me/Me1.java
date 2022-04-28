package Main.Me;
import Main.Car.CarIn;
import Main.Car.Car;
import Main.Menu;

import java.util.Scanner;
import java.util.*;

public class Me1 {

    public void Mee1(){
        Car c = new Car();
        c.DisplayVName();
        Menu xm1 = new Menu();

        Scanner sel = new Scanner(System.in);
        System.out.print("Please select : ");
        String Selector = sel.next();

        if(Selector.equals("1")) {
            CarIn NSX = new CarIn("NSX", "White", "KDO 119", 1000000);
            CarIn Civic = new CarIn("Civic", "White", "AEO 119", 900000);
            CarIn CRX = new CarIn("CR-X VTEC", "White", "LUV 119", 500000);

            System.out.println("\n/////////////////////////////////////////////");
            System.out.println(NSX.toString());
            System.out.println("\n/////////////////////////////////////////////");
            System.out.println(Civic.toString());
            System.out.println("\n/////////////////////////////////////////////");
            System.out.println(CRX.toString());
            System.out.println("\n/////////////////////////////////////////////");

            Scanner sel1 = new Scanner(System.in);
            System.out.print("Select Car 1-4 OR 4 to go Back : ");
            String Se1= sel1.next();
            if(Se1=="1"){
                System.out.println("\n\t You select  NSX !!!!");
                System.out.println("\n\t TYPE YES to Confirm Or TYPE NO to Cancle ");
                Scanner comf1 = new Scanner(System.in);
                System.out.print("Select Car 1-4 OR 4 to go Back : ");
                String Cm1= comf1.next();
                if(Cm1=="YES"){

                }else if(Cm1=="NO"){
                    Mee1();
                }else {
                    System.out.println("You need to TYPE Yes or No Only ");
                }
            }
            else if(Se1=="2"){
                System.out.println("\n\t You select  Civic !!!!");
                System.out.println("\n\t TYPE YES to Confirm Or TYPE NO to Cancle ");
                Scanner comf2 = new Scanner(System.in);
                System.out.print("Select Car 1-4 OR 4 to go Back : ");
                String Cm2= comf2.next();
                if(Cm2=="YES"){

                }else if(Cm2=="NO"){
                    Mee1();
                }else {
                    System.out.println("You need to TYPE Yes or No Only ");
                }
            }
            else if(Se1=="3"){
                System.out.println("\n\t You select  CR-X VTEC !!!!");
                System.out.println("\n\t TYPE YES to Confirm Or TYPE NO to Cancle ");
                Scanner comf3 = new Scanner(System.in);
                System.out.print("Select Car 1-4 OR 4 to go Back : ");
                String Cm3= comf3.next();
                if(Cm3=="YES"){

                }else if(Cm3=="NO"){
                    Mee1();
                }else {
                    System.out.println("You need to TYPE Yes or No Only ");
                }
            }else if(Se1=="4"){
                Mee1();
            }



        }else if(Selector.equals("2")){
            CarIn Supra = new CarIn("Supra", "Blue", "SPA 999", 1000000);
            CarIn Prius = new CarIn("Prius", "Blue", "SPA 999", 1000000);
            System.out.println("\n/////////////////////////////////////////////");
            System.out.println(Supra.toString());
            System.out.println("\n/////////////////////////////////////////////");
            System.out.println(Prius.toString());
            System.out.println("\n/////////////////////////////////////////////");
            Scanner sel1 = new Scanner(System.in);
            System.out.print("Select Car 1-4 OR 4 to go Back : ");
            String Sel2= sel.next();
            if(Sel2=="1"){
                System.out.println("\n\t You select  SUPRA !!!!");
                System.out.println("\n\t TYPE YES to Confirm Or TYPE NO to Cancle ");
                Scanner comf1 = new Scanner(System.in);
                System.out.print("Select Car 1-4 OR 4 to go Back : ");
                String Cm1= comf1.next();
                if(Cm1=="YES"){

                }else if(Cm1=="NO"){
                    Mee1();
                }else {
                    System.out.println("You need to TYPE Yes or No Only ");
                }
            }
            if(Sel2=="2"){
                System.out.println("\n\t You select  PRIUS !!!!");
                System.out.println("\n\t TYPE YES to Confirm Or TYPE NO to Cancle ");
                Scanner comf2 = new Scanner(System.in);
                System.out.print("Select Car 1-3 OR 3 to go Back : ");
                String Cm2= comf2.next();
                if(Cm2=="YES"){

                }else if(Cm2=="NO"){
                    Mee1();
                }else {
                    System.out.println("You need to TYPE Yes or No Only ");
                }
            } if(Sel2=="3"){
                Mee1();
        }


        }else if(Selector.equals("3")){
            CarIn Mustang = new CarIn("Ford Mustang","Black","FOD 412", 1000000);
            CarIn GT = new CarIn("Ford GT","Blue","GTT 124", 1000000);
            System.out.println("\n/////////////////////////////////////////////");
            System.out.println(Mustang.toString());
            System.out.println("\n/////////////////////////////////////////////");
            System.out.println(GT.toString());
            System.out.println("\n/////////////////////////////////////////////");
            Scanner sel1 = new Scanner(System.in);
            System.out.print("Select Car 1-4 OR 4 to go Back : ");
            String Sel3= sel.next();
            if(Sel3=="1"){
                System.out.println("\n\t You select  Ford Mustang !!!!");
                System.out.println("\n\t TYPE YES to Confirm Or TYPE NO to Cancle ");
                Scanner comf1 = new Scanner(System.in);
                System.out.print("Select Car 1-4 OR 4 to go Back : ");
                String Cm1= comf1.next();
                if(Cm1=="YES"){

                }else if(Cm1=="NO"){
                    Mee1();
                }else {
                    System.out.println("You need to TYPE Yes or No Only ");
                }
            }
            if(Sel3=="2"){
                System.out.println("\n\t You select  Ford GT !!!!");
                System.out.println("\n\t TYPE YES to Confirm Or TYPE NO to Cancle ");
                Scanner comf2 = new Scanner(System.in);
                System.out.print("Select Car 1-4 OR 4 to go Back : ");
                String Cm2= comf2.next();
                if(Cm2=="YES"){

                }else if(Cm2=="NO"){
                    Mee1();
                }else {
                    System.out.println("You need to TYPE Yes or No Only ");
                }
            } if(Sel3=="4"){
            Mee1();
        }

        }else if(Selector.equals("4")){
            System.out.println("\n\n: Back :");
            xm1.MeSelect();
        }else {
            System.out.println("\n\n!!! Please Select Only 1-4 !!!");
        }
    }
}