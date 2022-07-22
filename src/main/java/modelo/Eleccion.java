/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author admin
 */
public class Eleccion {
    
    private int codigo;
    private int votos;
    private int numeroVotante;
    private String descripcion;

    public Eleccion(int codigo, int votos, int numeroVotante, String descripcion) {
        this.codigo = codigo;
        this.votos = votos;
        this.numeroVotante = numeroVotante;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public int getNumeroVotante() {
        return numeroVotante;
    }

    public void setNumeroVotante(int numeroVotante) {
        this.numeroVotante = numeroVotante;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Eleccion{" + "codigo=" + codigo + ", votos=" + votos + ", numeroVotante=" + numeroVotante + ", descripcion=" + descripcion + '}';
    }
    
}
