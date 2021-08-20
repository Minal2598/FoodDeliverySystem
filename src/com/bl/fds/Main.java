package com.bl.fds;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.showUserMenu();
    }

    public void showUserMenu() {
        FoodDataLayer foodDataLayer = new FoodDataLayer();
        int getUserInput = 0;
        while(getUserInput != 4){
        System.out.println("1=>Adding menus \n " + "2=>Delete menus \n " + "3=>Print all menus \n ");
        Scanner scanInput = new Scanner(System.in);
         getUserInput = scanInput.nextInt();
            switch (getUserInput) {
                case 1:
                    foodDataLayer.addFoodItem();
                  break;
                case 2:
                    System.out.print("Enter food name you want to delete :: ");
                    Scanner scanInput1 = new Scanner(System.in);
                    String getUserInput2 = scanInput1.nextLine();
                    FoodItem deleteFood = foodDataLayer.getFoodItem(getUserInput2);
                    foodDataLayer.delete(deleteFood);
                    foodDataLayer.print();
                 break;

                case 3:
                    foodDataLayer.print();
                 break;
            }
        }
    }
}
