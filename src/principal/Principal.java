/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import Modelo.Feligrese;
import Modelo.Parroquia;
import vista.Vista;
import control.Controlador;

/**
 *
 * @author Usuario
 */
public class Principal {
    
    public static void main(String[] args){
    Vista v=new Vista();
    Feligrese f =new Feligrese();
    Parroquia p=new Parroquia();
   Controlador c=new Controlador(v,f,p);
   v.setVisible(true);
    }
}
