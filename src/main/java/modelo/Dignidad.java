/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author admin
 */
public class Dignidad {
    
    private int codigo;
    private String cargoPolitico;
    private int nMesas;
    private String parroquian;
    private String canton;
    private Eleccion eleccion;

    public Dignidad(int codigo, String cargoPolitico, int nMesas, String parroquian, String canton, Eleccion eleccion) {
        this.codigo = codigo;
        this.cargoPolitico = cargoPolitico;
        this.nMesas = nMesas;
        this.parroquian = parroquian;
        this.canton = canton;
        this.eleccion = eleccion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCargoPolitico() {
        return cargoPolitico;
    }

    public void setCargoPolitico(String cargoPolitico) {
        this.cargoPolitico = cargoPolitico;
    }

    public int getnMesas() {
        return nMesas;
    }

    public void setnMesas(int nMesas) {
        this.nMesas = nMesas;
    }

    public String getParroquian() {
        return parroquian;
    }

    public void setParroquian(String parroquian) {
        this.parroquian = parroquian;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public Eleccion getEleccion() {
        return eleccion;
    }

    public void setEleccion(Eleccion eleccion) {
        this.eleccion = eleccion;
    }

    @Override
    public String toString() {
        return "Dignidad{" + "codigo=" + codigo + ", cargoPolitico=" + cargoPolitico + ", nMesas=" + nMesas + ", parroquian=" + parroquian + ", canton=" + canton + ", eleccion=" + eleccion + '}';
    }
        
}
