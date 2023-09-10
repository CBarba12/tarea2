/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.ArrayList;
/**
 *
 * @author alexb
 */
public class Modelo_PRINCIPAL {
   ArrayList<Vuelo> lista_escalas;
   ArrayList<Ciudad> List_Ciudades;

    public Modelo_PRINCIPAL() {
       lista_escalas=new ArrayList<> ();
       List_Ciudades=new ArrayList<> ();
    }

    public ArrayList<Vuelo> getLista_escalas() {
        return lista_escalas;
    }

    public void setLista_escalas(ArrayList<Vuelo> lista_escalas) {
        this.lista_escalas = lista_escalas;
    }

    public ArrayList<Ciudad> getList_Ciudades() {
        return List_Ciudades;
    }

    public void setList_Ciudades(ArrayList<Ciudad> List_Ciudades) {
        this.List_Ciudades = List_Ciudades;
    }
     
}
