/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Eleccion;

/**
 *
 * @author admin
 */
public interface IEleccionServicio {
    
    public Eleccion crear(Eleccion eleccion);
    public Eleccion modificar(int codigoEleccion, Eleccion eleccionNuevo);
    public Eleccion eliminar(int codigoEleccion);
    public Eleccion buscarPorCodigo(int codigoEleccion);
    public int buscarPosicion(Eleccion eleccion);
    public List<Eleccion> listar(); 
    
}
