package Main.Car;

import Main.User;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Car extends User {
    public void DisplayVName() {
        System.out.println("Please select car that you want to rental.");
        Collection<String> list  = new ArrayList<String>();
        list.add("1.Toyota");
        list.add("2.Honda");
        list.add("3.Ford");
        System.out.println(list);
    }
}