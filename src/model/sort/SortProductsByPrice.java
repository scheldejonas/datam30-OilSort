/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.sort;

import java.util.Comparator;
import model.OilProduct;

/**
 *
 * @author scheldejonas
 */
public class SortProductsByPrice implements Comparator<OilProduct> {

    @Override
    public int compare(OilProduct o1, OilProduct o2) {
        if (o1.getPrice() < o2.getPrice()) {
            return -1;
        }
        else if (o1.getPrice() > o2.getPrice()) {
            return 1;
        }
        else {
            return 0;
        }
    }

}
