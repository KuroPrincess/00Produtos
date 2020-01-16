/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtos;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList <Product> pList = new ArrayList<>();
        System.out.print("Enter the number of Products: ");
        int n = sc.nextInt();
        for (int i = 1; i < n + 1; i++){
            sc.nextLine();
            System.out.printf("\tProduct %d# data:\n",i);
            System.out.print("Common, used or imported (c/u/i)? ");
            String c = sc.nextLine();
            
            System.out.print("Name: ");
            String pName = sc.nextLine();
            
            System.out.print("Price: $");
            Double pPrice = sc.nextDouble();
            Product p;
            switch (c) {
                case "i":
                    System.out.print("Customs fee: $");
                    Double customsFee = sc.nextDouble();
                    p = new ImportedProduct(pName, pPrice, customsFee);
                    break;
                case "u":
                    sc.nextLine();
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    String md = sc.nextLine();
                    p = new UsedProduct (pName, pPrice, md);
                    break;
                default:
                    p = new Product (pName, pPrice);
                    break;
            }
            
            pList.add(p);
        
        }
        System.out.println("PRICE TAGS:");
        for(Product p : pList){
            System.out.println(p.priceTag());
        }
        
        
    }
    
}
