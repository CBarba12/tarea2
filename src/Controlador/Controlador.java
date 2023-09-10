/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import static Controlador.Controlador.modelo;
import static Controlador.Controlador.ventana;
import Modelo.*;
import Vista.*;
import javax.swing.JOptionPane;

/**
 *
 * @author alexb
 */
public class Controlador {

    public static Ventana_1_ciudad ventana = new Ventana_1_ciudad();
     public static Ventana_2_vuelo ventana2 = new Ventana_2_vuelo();
    public static Modelo_PRINCIPAL modelo = new Modelo_PRINCIPAL();

    public static void mostrar() {ventana.setVisible(true);}
     public static void mostrar2() {ventana2.setVisible(true);}
    public static void ocultar() {ventana.setVisible(false);}

    ;

    public Controlador() {
        ventana.setLocationRelativeTo(null);
        ventana.setBounds(500, 500, 500, 500);
        ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
    }

    public static void AGREGAR_ciudad() {

        String Id = ventana.getId_ciudad().getText();
        String Nombre = ventana.getNombre_ciudad().getText();
        String seleccion = (String) ventana.getComvobox_GMT().getSelectedItem();

        Ciudad generica = new Ciudad(Id, Nombre, seleccion);
        modelo.getList_Ciudades().add(generica);
        
        
        ventana2.getCombox_origen_ventana2().addItem(Nombre+"("+seleccion+"gmt)");
        ventana2.getCombox_destino_ventana2().addItem(Nombre+"("+seleccion+"gmt)");
        
        Object[] columna = new Object[ventana.getModelito().getColumnCount()];
        columna[0] = Id;
        columna[1] = Nombre;
        columna[2] = seleccion;

        ventana.getModelito().addRow(columna);
        ventana.getTabla_ciudad().setModel(ventana.getModelito());
        
        

    }

    public static void busqueda_ciudad() {

        String cadena;
        boolean bandera;
        bandera = false;

        for (int i = 0; i < ventana.getTabla_ciudad().getRowCount(); i++) {
            cadena = (String) ventana.getTabla_ciudad().getValueAt(i, 0);

            if (cadena.equals(ventana.getBusquedad_ciudad().getText())) {
                ventana.getTabla_ciudad().changeSelection(i, 0, true, false);
                ventana.getBusquedad_ciudad().setText("");
                bandera = true;
                break;
            }
        }
        if (bandera == false) {
            JOptionPane.showMessageDialog(null, "Este registro no existe", "ERROR", JOptionPane.ERROR_MESSAGE);
            ventana.getBusquedad_ciudad().setText("");

        }
    }

    public static void clickTabla(java.awt.event.MouseEvent evt) {

        if (evt.getClickCount() == 1) { // Detectar un solo clic

            int selectedRow = ventana.getTabla_ciudad().getSelectedRow();
            if (selectedRow >= 0) {

                String id = (String) ventana.getTabla_ciudad().getValueAt(selectedRow, 0);
                String nombre = (String) ventana.getTabla_ciudad().getValueAt(selectedRow, 1);
                String gmt = (String) ventana.getTabla_ciudad().getValueAt(selectedRow, 2);

                ventana.getNombre_ciudad().setText(nombre);
                ventana.getId_ciudad().setText(id);

                

            }

        }
    }

    public static void actualizar() {
        if (ventana.getTabla_ciudad().getSelectedRow() >= 0) {
            // Seleccionar una fila existente para editar
            int selectedRow = ventana.getTabla_ciudad().getSelectedRow();
            // Modificar los valores de la fila seleccionada
            
            String seleccion = (String) ventana.getComvobox_GMT().getSelectedItem();
            
            
            
            ventana.getTabla_ciudad().setValueAt(ventana.getId_ciudad().getText(), selectedRow, 0);
            ventana.getTabla_ciudad().setValueAt(ventana.getNombre_ciudad().getText(), selectedRow, 1);
            ventana.getTabla_ciudad().setValueAt(seleccion, selectedRow, 2);
             
                
            for (int i = 0; i < modelo.getList_Ciudades().size(); i++) {
                   if(modelo.getList_Ciudades().get(i).getId_Ciudad().equals(ventana.getId_ciudad().getText())){
                       modelo.getList_Ciudades().get(i).setNombre_vuelo(ventana.getNombre_ciudad().getText());
                       
                   }
                }
        }
    }
    
     public static void AGREGAR_Vuelo() {
     int identificador;
     String Ciudad_Orige;
     String Ciudad_Destino;
     int horaSalida;
     int hora_llegada;// horas local
     

        String Id = ventana.getId_ciudad().getText();
        String Nombre = ventana.getNombre_ciudad().getText();
        String seleccion = (String) ventana.getComvobox_GMT().getSelectedItem();

        Ciudad generica = new Ciudad(Id, Nombre, seleccion);
        modelo.getList_Ciudades().add(generica);
        
        

        Object[] columna = new Object[ventana.getModelito().getColumnCount()];
        columna[0] = Id;
        columna[1] = Nombre;
        columna[2] = seleccion;

        ventana.getModelito().addRow(columna);
        ventana.getTabla_ciudad().setModel(ventana.getModelito());
        
        

    }

}



// --------------------------------------------------ventana 2----------------------------------------------------------




