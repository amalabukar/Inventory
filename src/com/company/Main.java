package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ArrayList<Inventory> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int i = 1;
            for (Inventory item : items) {
                String checkbox = "[" + item.isInStock + "]";

                System.out.println(i + " " + item.text + " " + checkbox);

                i++;
            }

            System.out.println("1.Create item");
            System.out.println("2.Remove Item");
            System.out.println("3.Update Item Quantity");

            String option = scanner.nextLine();

            if (option.equals("1")) {
                System.out.println("Enter your item");
                String text = scanner.nextLine();

                Inventory item = new Inventory(text, 0);
                items.add(item);

            } else if (option.equals("2")) {
                System.out.println("What item do you want to remove");
                int itemNum = Integer.parseInt(scanner.nextLine());
                items.remove(itemNum-1);
                System.out.println("Item Removed");

            } else if (option.equals("3")) {
                System.out.println("What item do you want to update?");
                int itemNum = Integer.parseInt(scanner.nextLine());

                System.out.println("How much do you want to update ?");
                int isInStock = Integer.parseInt(scanner.nextLine());

                Inventory item = items.get(itemNum - 1);
                item.isInStock = isInStock;


            }
        }
    }
}
