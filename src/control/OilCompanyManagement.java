/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import java.util.Collections;
import model.OilProduct;
import model.sort.*;

/**
 *
 * @author scheldejonas
 */
public class OilCompanyManagement {
    
    public static void main(String[] args) {
        
        OilProduct op1 = new OilProduct("Oil1", 10, 90);
        OilProduct op2 = new OilProduct("Oil2", 10, 80);
        OilProduct op3 = new OilProduct("Oil3", 20, 70);
        OilProduct op4 = new OilProduct("Oil4", 30, 60);
        OilProduct op5 = new OilProduct("Oil5", 40, 50);
        OilProduct op6 = new OilProduct("Oil6", 50, 40);
        OilProduct op7 = new OilProduct("Oil7", 60, 30);
        OilProduct op8 = new OilProduct("Oil8", 70, 20);
        OilProduct op9 = new OilProduct("Oil9", 80, 20);
        OilProduct op10 = new OilProduct("Oil10", 90, 10);
        OilProduct op11 = new OilProduct("Oil10", 90, 20);
        
        ArrayList<OilProduct> oilList = new ArrayList();
        oilList.add(op1);
        oilList.add(op4);
        oilList.add(op2);
        oilList.add(op3);
        oilList.add(op7);
        oilList.add(op5);
        oilList.add(op6);
        oilList.add(op11);
        oilList.add(op10);
        oilList.add(op8);
        oilList.add(op9);
        oilList.add(op11);
        
        for (OilProduct oilProduct : oilList) {
            System.out.println(oilProduct.toString());
        }
        
        System.out.println("__________________________________________________");
        
        SortProductsByName sortByName = new SortProductsByName();
        SortProductsByPrice sortByPrice = new SortProductsByPrice();
        SortProductsByAmount sortByAmount = new SortProductsByAmount();
        
        Collections.sort(oilList, sortByName); //Sort efter navn
        
        for (OilProduct oilProduct : oilList) {
            System.out.println(oilProduct.toString());
        }
        
        System.out.println("__________________________________________________");
        
        Collections.sort(oilList, sortByPrice); //Sort efter navn
        
        for (OilProduct oilProduct : oilList) {
            System.out.println(oilProduct.toString());
        }
        
        System.out.println("__________________________________________________");
        
        Collections.sort(oilList, sortByAmount); //Sort efter navn
        
        for (OilProduct oilProduct : oilList) {
            System.out.println(oilProduct.toString());
        }
        
        System.out.println("__________________________________________________");
        
        Collections.sort(oilList); //Sort efter navn
        
        for (OilProduct oilProduct : oilList) {
            System.out.println(oilProduct.toString());
        }
        
        System.out.println("__________________________________________________");
        
    }
    
}
