package _case_study.furama_resort.services.custom_management;

import _case_study.furama_resort.controllers.FuramaController;

import java.util.Scanner;

public class CustomerManagement {
    public Scanner input(){
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }
    public void display(){
        while (true){
            System.out.println("-----Menu-----");
            System.out.println("1. Display list customer");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");
            System.out.println("Enter your choice");
            int choice = input().nextInt();
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    new FuramaController().displayMainMenu();
                    break;
            }
        }

    }
}
