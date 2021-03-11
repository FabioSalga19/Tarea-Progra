/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea4pt2;

import helpers.Francia;
import helpers.Mexico;
import helpers.Peru;

/**
 *
 * @author Daysi Vega
 */
public class Hospital {

   
    public static void main(String[] args) {
       
        Francia  f = new Francia();
        Mexico m = new Mexico();
        Peru p = new Peru();
        
        System.out.println(f.getPais());
        System.out.println(f.getDirector());
        
        System.out.println(m.getPais());
        System.out.println(m.getDirector());
        
        System.out.println(p.getPais());
        System.out.println(p.getDirector());
        
        
    }
    
}
