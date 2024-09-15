/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elicho
 */
abstract class Persona {
    private String nit;
    private String nombres;
    private String apellidos;
    private String direccion;  // Lugar de residencia
    private String telefono;
    private Date fechaNacimiento;

    // Constructor vacío
    public Persona() {}

    // Constructor con parámetros
    public Persona(String nit, String nombres, String apellidos, String direccion, String telefono, Date fechaNacimiento) {
        this.nit = nit;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

// Métodos CRUD (deberás implementarlos en tu clase DAO)
    protected void crear() {
        // Código para crear una persona
    }

    protected DefaultTableModel leer() {
        // Código para leer una persona
        return null;
    }

    protected void actualizar() {
        // Código para actualizar una persona
    }

    protected void borrar() {
        // Código para borrar una persona
    }    


    
}
