/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Modelo.Feligrese;
import Modelo.Parroquia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Vista;

/**
 *
 * @author estudiante
 */
public class Controlador implements ActionListener{
    
    private Vista vista;
    private Feligrese fel;
    private Parroquia parr;

    public Controlador(Vista vista, Feligrese fel, Parroquia parr) {
        this.vista = vista;
        this.fel = fel;
        this.parr = parr;
        ActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
    if(e.getActionCommand().equals("Guardar")){
    fel.setCedula(vista.txtCedula.getText());
    fel.setNombre(vista.txtNombre.getText());
    fel.setDireccion(vista.txtDireccion.getText());
    fel.setTelefono(vista.txtTelefono.getText());
    fel.setEstrato(vista.txtEstrato.getText());
    fel.setEstado(vista.txtEstado.getText());
    Feligrese f=new Feligrese(fel.getCedula(), fel.getNombre(), fel.getDireccion(), fel.getTelefono(), fel.getEstrato(), fel.getEstado());
    parr.agregarFeligrese(f);
    }
    if(e.getActionCommand().equals(vista.btnEliminar)){
        parr.eliminarFeligres(vista.txtCedula.getText());
    }
    if(e.getActionCommand().equals(vista.btnBuscar)){
        Feligrese feli= parr.buscarFeligrese(vista.txtCedula.getText());
            vista.txtNombre.setText(feli.getNombre());
            vista.txtTelefono.setText(feli.getTelefono());
            vista.txtEstrato.setText(feli.getEstrato());
            vista.txtEstado.setText(feli.getEstado());
            vista.txtDireccion.setText(feli.getDireccion());
    }
    if(e.getActionCommand().equals(vista.btnActualizar)){
        Feligrese feli= parr.buscarFeligrese(vista.txtCedula.getText());
            String cedula=vista.txtCedula.getText();
            String nombre=vista.txtNombre.getText();
            String direccion=vista.txtDireccion.getText();
            String telefono=vista.txtTelefono.getText();
            String estrato=vista.txtEstrato.getText();
            String estado=vista.txtEstado.getText();
            feli.actualizar(cedula, nombre, direccion, telefono, estrato, estado);
    }
    if(e.getActionCommand().equals("Consultar")){
            Feligrese feli= parr.buscarFeligrese(vista.txtCedula.getText());
            String diezmo= String.valueOf(feli.getDiesmo());
            vista.txtDiezmo.setText(diezmo);
            
        }
        if(e.getActionCommand().equals("Pagar")){
            Feligrese feli=parr.buscarFeligrese(vista.txtCedula.getText());
            vista.area.setText(feli.pagarDiezmo());
        }
        if(e.getActionCommand().equals("Totalizar")){
            vista.area.setText(fel.totalizar(vista.txtCedula.getText()));
        }
    }

    private void ActionListener(Controlador control) {
        vista.btnGuardar.addActionListener(control);
        vista.btnBuscar.addActionListener(control);
        vista.btnConsultar.addActionListener(control);
        vista.btnTotalizar.addActionListener(control);
        vista.btnPagar.addActionListener(control);
        vista.btnEliminar.addActionListener(control);
        vista.btnActualizar.addActionListener(control);
        vista.btnEliminar.addActionListener(control);
    }
}
