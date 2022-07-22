/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Dignidad;

/**
 *
 * @author admin
 */
public class DignidadServicio implements IDignidadServicio{
    
    private static List<Dignidad> dignidadList = new ArrayList<>();

    @Override
    public Dignidad crear(Dignidad dignidad) {
        var dignidadBuscado=this.buscarPorCodigo(dignidad.getCodigo());
        if(dignidadBuscado==null){
            this.dignidadList.add(dignidad);
        }else{
            throw new RuntimeException("El código ingresado ya se encuentra "
                    + "asignado al Cantón: "+dignidadBuscado.getCanton());
        }
        return dignidad;
    }

    @Override
    public Dignidad modificar(int codigoDignidad, Dignidad dignidadNuevo) {
        var posicion=this.buscarPosicion(this.buscarPorCodigo(codigoDignidad));
        this.listar().get(posicion).setCodigo(dignidadNuevo.getCodigo());
        this.listar().get(posicion).setCargoPolitico(dignidadNuevo.getCargoPolitico());
        this.listar().get(posicion).setnMesas(dignidadNuevo.getnMesas());
        this.listar().get(posicion).setParroquian(dignidadNuevo.getParroquian());
        this.listar().get(posicion).setCanton(dignidadNuevo.getCanton());
        this.listar().get(posicion).setEleccion(dignidadNuevo.getEleccion());
        return dignidadNuevo;
    }

    @Override
    public Dignidad eliminar(int codigoDignidad) {
        Dignidad dignidad=this.buscarPorCodigo(codigoDignidad);
        var posicion=this.buscarPosicion(dignidad);
        this.listar().remove(posicion);
        return dignidad;
    }

    @Override
    public Dignidad buscarPorCodigo(int codigoDignidad) {
        Dignidad dignidad=null;
        for(var d:this.dignidadList){
            if(codigoDignidad==d.getCodigo()){
                dignidad=d;
                break;
            }
        }
        return dignidad;
    }

    @Override
    public List<Dignidad> listar() {
        return this.dignidadList;
    }

    @Override
    public int buscarPosicion(Dignidad dignidad) {
        int posicion=-1;
        for(var d:this.dignidadList){
            posicion++;
            if(d.getCodigo()==dignidad.getCodigo()){
                break;
            }
        }
        return posicion;
    }
    
}
