/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appdemo01;

import java.text.*;
import java.util.*;

public class Test03 {

    public static void main(String[] args) {
        //fecha del sistema
        Date hoy= new Date();
        DateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
        System.out.println("Fecha de hoy: "+formato.format(hoy));
        
    }
    
}
