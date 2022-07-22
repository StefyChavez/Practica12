/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author admin
 */
public class Candidato {
    
    private int codigo;
    private String nombre;
    private String apeliido;
    private String genero;
    private String tituloUniversitario;
    private Dignidad dignidad;

    public Candidato(int codigo, String nombre, String apeliido, String genero, String tituloUniversitario, Dignidad dignidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apeliido = apeliido;
        this.genero = genero;
        this.tituloUniversitario = tituloUniversitario;
        this.dignidad = dignidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApeliido() {
        return apeliido;
    }

    public void setApeliido(String apeliido) {
        this.apeliido = apeliido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTituloUniversitario() {
        return tituloUniversitario;
    }

    public void setTituloUniversitario(String tituloUniversitario) {
        this.tituloUniversitario = tituloUniversitario;
    }

    public Dignidad getDignidad() {
        return dignidad;
    }

    public void setDignidad(Dignidad dignidad) {
        this.dignidad = dignidad;
    }

    @Override
    public String toString() {
        return "Candidato{" + "codigo=" + codigo + ", nombre=" + nombre + ", apeliido=" + apeliido + ", genero=" + genero + ", tituloUniversitario=" + tituloUniversitario + ", dignidad=" + dignidad + '}';
    }

        
}
