/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Candidato;

/**
 *
 * @author admin
 */
public class CandidatoServicio implements ICandidatoServicio{

      
    
    private static List<Candidato> candidatoList = new ArrayList<>();

    @Override
    public Candidato crear(Candidato candidato) {
        var candidatoBuscado=this.buscarPorCodigo(candidato.getCodigo());
        if(candidatoBuscado==null){
            this.candidatoList.add(candidato);
        }else{
            throw new RuntimeException("El código ingresado ya se encuentra "
                    + "asignado al Candidato: "+candidatoBuscado.getNombre());
        }
        return candidato;
    }

    @Override
    public Candidato modificar(int codigoCandidato, Candidato candidatoNuevo) {
        var posicion=this.buscarPosicion(this.buscarPorCodigo(codigoCandidato));
        this.listar().get(posicion).setCodigo(candidatoNuevo.getCodigo());
        this.listar().get(posicion).setNombre(candidatoNuevo.getNombre());
        this.listar().get(posicion).setApeliido(candidatoNuevo.getApeliido());
        this.listar().get(posicion).setGenero(candidatoNuevo.getGenero());
        this.listar().get(posicion).setTituloUniversitario(candidatoNuevo.getTituloUniversitario());
        this.listar().get(posicion).setDignidad(candidatoNuevo.getDignidad());
        return candidatoNuevo;
    }

    @Override
    public Candidato eliminar(int codigoCandidato) {
        Candidato candidato=this.buscarPorCodigo(codigoCandidato);
        var posicion=this.buscarPosicion(candidato);
        this.listar().remove(posicion);
        return candidato;
    }

    @Override
    public Candidato buscarPorCodigo(int codigoCandidato) {
        Candidato candidato=null;
        for(var c:this.candidatoList){
            if(codigoCandidato==c.getCodigo()){
                candidato=c;
                break;
            }
        }
        return candidato;
    }

    @Override
    public List<Candidato> listar() {
        return this.candidatoList;
    }

    @Override
    public int buscarPosicion(Candidato candidato) {
        int posicion=-1;
        for(var c:this.candidatoList){
            posicion++;
            if(c.getCodigo()==candidato.getCodigo()){
                break;
            }
        }
        return posicion;
    }

}
