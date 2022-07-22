/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Eleccion;

/**
 *
 * @author admin
 */
public class EleccionServicio implements IEleccionServicio{
    
    private static List<Eleccion> eleccionList = new ArrayList<>();

    @Override
    public Eleccion crear(Eleccion eleccion) {
        var eleccionBuscado=this.buscarPorCodigo(eleccion.getCodigo());
        if(eleccionBuscado==null){
            this.eleccionList.add(eleccion);
        }else{
            throw new RuntimeException("El código ingresado ya se encuentra "
                    + "asignado ");
        }
        return eleccion;
    }

    @Override
    public Eleccion modificar(int codigoEleccion, Eleccion eleccionNuevo) {
        var posicion=this.buscarPosicion(this.buscarPorCodigo(codigoEleccion));
        this.listar().get(posicion).setCodigo(eleccionNuevo.getCodigo());
        this.listar().get(posicion).setVotos(eleccionNuevo.getVotos());
        this.listar().get(posicion).setNumeroVotante(eleccionNuevo.getNumeroVotante());
        this.listar().get(posicion).setDescripcion(eleccionNuevo.getDescripcion());
        return eleccionNuevo;
    }

    @Override
    public Eleccion eliminar(int codigoEleccion) {
        Eleccion eleccion=this.buscarPorCodigo(codigoEleccion);
        var posicion=this.buscarPosicion(eleccion);
        this.listar().remove(posicion);
        return eleccion;
    }

    @Override
    public Eleccion buscarPorCodigo(int codigoEleccion) {
        Eleccion eleccion=null;
        for(var e:this.eleccionList){
            if(codigoEleccion==e.getCodigo()){
                eleccion=e;
                break;
            }
        }
        return eleccion;
    }

    @Override
    public List<Eleccion> listar() {
        return this.eleccionList;
    }

    @Override
    public int buscarPosicion(Eleccion eleccion) {
        int posicion=-1;
        for(var e:this.eleccionList){
            posicion++;
            if(e.getCodigo()==eleccion.getCodigo()){
                break;
            }
        }
        return posicion;
    }
    
}
