/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Eleccion;
import modelo.Candidato;
import modelo.Dignidad;
import servicio.EleccionServicio;
import servicio.CandidatoServicio;

/**
 *
 * @author admin
 */
public class EleccionControl {
    
    private final EleccionServicio eleccionServicio = new EleccionServicio();
    
    public Eleccion crear(String [] args) throws RuntimeException{
        var eleccion = new Eleccion(this.convertirEntero(args[0]),this.convertirEntero(args[1]),this.convertirEntero(args[2]),args[3]);
        this.eleccionServicio.crear(eleccion);
        return eleccion;
    }
    
    private int convertirEntero(String numero){
        try
        {
            return Integer.valueOf(numero);
        }catch(NumberFormatException e){
            throw new RuntimeException("El campo ingresaso solamente recibe "
                    + "números");
        }catch(Exception e){
            throw new RuntimeException("Error inesperado");
        }
    }
    
    public Eleccion buscarEleccion(String arg){
        return this.eleccionServicio.buscarPorCodigo(Integer.valueOf(arg));
    }
    
    public Eleccion eliminar(String arg)
    {
        return this.eleccionServicio.eliminar(Integer.valueOf(arg));
    }
    
    public Eleccion modificar(String [] args){
        Eleccion eleccionNuevo = new Eleccion(Integer.valueOf(args[0]),Integer.valueOf(args[1]),Integer.valueOf(args[2]),args[3]);
        this.eleccionServicio.modificar(Integer.valueOf(args[0]), eleccionNuevo);
        return eleccionNuevo;
    }
    
    public List<Eleccion> listar(){
        return this.eleccionServicio.listar();
    }
    
}
