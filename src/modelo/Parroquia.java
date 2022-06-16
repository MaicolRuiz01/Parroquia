/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class Parroquia {

    private ArrayList<Feligrese> feligreses;
    
    

    public Parroquia() {
        feligreses = new ArrayList<>();
    }

    public void agregarFeligrese(Feligrese p) {
        feligreses.add(p);
    }

    public Feligrese buscarFeligrese(String cedula) {
        Feligrese f = new Feligrese();
        for (int i = 0; i < feligreses.size(); i++) {
            if (feligreses.get(i).getCedula().equals(cedula)) {
                f = feligreses.get(i);
            }
        }
        return f;
    }

    public String printFeligreses() {
        StringBuffer sb = new StringBuffer("Feligreses: \n");
        for (int i = 0; i < feligreses.size(); i++) {
            sb.append(feligreses.get(i).toString() + "\n");
        }
        return sb.toString();
    }

    public void eliminarFeligres(String cedula) {

        for (int i = 0; i < feligreses.size(); i++) {
            if (feligreses.get(i).getCedula().equals(cedula)) {
                feligreses.remove(i);

            }
        }

    }

}
