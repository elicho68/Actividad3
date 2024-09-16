/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

import java.sql.Timestamp;
import java.time.ZonedDateTime;
import java.time.ZoneId;

/**
 *
 * @author Elicho
 */
public class Docente extends Persona {
    private String codigoDocente;
    private double salario;
    private Date fechaIngresoLaborar;
    private Date fechaIngresoRegistro;

    Conexion cn;
    
    // Constructor vacío
    public Docente() {}

    // Constructor con parámetros
    public Docente(String nit, String nombres, String apellidos, String direccion, String telefono, Date fechaNacimiento,
                   String codigoDocente, double salario, Date fechaIngresoLaborar, Date fechaIngresoRegistro) {
        super(nit, nombres, apellidos, direccion, telefono, fechaNacimiento);
        this.codigoDocente = codigoDocente;
        this.salario = salario;
        this.fechaIngresoLaborar = fechaIngresoLaborar;
        this.fechaIngresoRegistro = fechaIngresoRegistro;
    }

    public String getCodigoDocente() {
        return codigoDocente;
    }

    public void setCodigoDocente(String codigoDocente) {
        this.codigoDocente = codigoDocente;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getFechaIngresoLaborar() {
        return fechaIngresoLaborar;
    }

    public void setFechaIngresoLaborar(Date fechaIngresoLaborar) {
        this.fechaIngresoLaborar = fechaIngresoLaborar;
    }

    public Date getFechaIngresoRegistro() {
        return fechaIngresoRegistro;
    }

    public void setFechaIngresoRegistro(Date fechaIngresoRegistro) {
        this.fechaIngresoRegistro = fechaIngresoRegistro;
    }

    @Override
 public DefaultTableModel leer() {
   DefaultTableModel tabla = new DefaultTableModel();
        try {
            cn = new Conexion();
            cn.abrir_conexion();

            String query = "SELECT * FROM db_actividad3.docente_persona;";
            ResultSet consulta = cn.ConexionBD.createStatement().executeQuery(query);

            String encabezado[] = {"NIT", "Nombres", "Apellidos", "Direccion", "Teléfono","Nacimiento","Codigo","Salario","FechaIngreso","FechaCreacion"};
            tabla.setColumnIdentifiers(encabezado);
            String datos[] = new String[10];
            while (consulta.next()) {
                datos[0] = consulta.getString("nit");
                datos[1] = consulta.getString("nombres");
                datos[2] = consulta.getString("apellidos");
                datos[3] = consulta.getString("direccion");
                datos[4] = consulta.getString("telefono");
                datos[5] = consulta.getString("fecha_nacimiento");
                datos[6] = consulta.getString("codigo_docente");                
                datos[7] = consulta.getString("salario");
                datos[8] = consulta.getString("fecha_ingreso_laborar");                
                datos[9] = consulta.getString("fecha_ingreso_registro");                
                tabla.addRow(datos);
            }

            cn.cerrar_conexion();

        } catch (SQLException ex) {
//            cn.cerrar_conexion();
            System.out.println("Error al leer Docentes: " + ex.getMessage());
        }

        return tabla;  
 }

  // Método para obtener la fecha y hora actual con la zona horaria local
    public static Timestamp obtenerFechaHoraActual() {
        // Obtener la fecha y hora actual en la zona horaria del sistema
        ZonedDateTime ahora = ZonedDateTime.now(ZoneId.systemDefault());

        // Convertir a java.sql.Timestamp para la base de datos
        return Timestamp.valueOf(ahora.toLocalDateTime());
    }

    
    
// Métodos CRUD (se implementan en el DAO correspondiente)
    @Override
    public void crear() {
        // Código para crear un docente en la base de datos
    try {
            PreparedStatement parametro;
            cn = new Conexion();

            cn.abrir_conexion();
            String query = "INSERT INTO docente_persona (nit,nombres,apellidos,direccion,telefono,fecha_nacimiento,codigo_docente,salario,fecha_ingreso_laborar,fecha_ingreso_registro) VALUES (?,?,?,?,?,?,?,?,?,?);";
            parametro = (PreparedStatement) cn.ConexionBD.prepareStatement(query);
            parametro.setString(1, getNit());
            parametro.setString(2, getNombres());
            parametro.setString(3, getApellidos());
            parametro.setString(4, getDireccion());
            parametro.setString(5, getTelefono());
            parametro.setDate(6, new java.sql.Date(getFechaNacimiento().getTime()));
            parametro.setString(7, getCodigoDocente());
            parametro.setDouble(8, getSalario());
            parametro.setDate(9, new java.sql.Date(getFechaIngresoLaborar().getTime()));
            parametro.setTimestamp(10, new java.sql.Timestamp(new Date().getTime()));            
            int executar = parametro.executeUpdate();
            System.out.println("Ingreso Exitoso... " + Integer.toString(executar));

            cn.cerrar_conexion();

            
        } catch (SQLException ex) {
            System.out.println("Error al crear empleado: " + ex.getMessage());
        }
        
    }

//    @Override
  //  public void leer() {
        // Código para leer un docente de la base de datos
    //}

    @Override
    public void actualizar() {
        // Código para actualizar un docente en la base de datos
        try {
            PreparedStatement parametro;
            cn = new Conexion();
            
            cn.abrir_conexion( );
            String query ="UPDATE docente_persona SET nombres = ?, apellidos = ?, direccion = ?,telefono = ?, fecha_nacimiento = ?, codigo_docente = ?,salario = ?,fecha_ingreso_laborar = ? WHERE nit = ?;";
            parametro = (PreparedStatement) cn.ConexionBD.prepareStatement(query);
            ///parametro.setString(1, getNit());
            parametro.setString(1, getNombres());
            parametro.setString(2, getApellidos());
            parametro.setString(3, getDireccion());
            parametro.setString(4, getTelefono());
            parametro.setDate(5, new java.sql.Date(getFechaNacimiento().getTime()));
            parametro.setString(6, getCodigoDocente());
            parametro.setDouble(7, getSalario());
            parametro.setDate(8, new java.sql.Date(getFechaIngresoLaborar().getTime()));
            parametro.setString(9, getNit());                        
            int executar = parametro.executeUpdate();
            System.out.println("Actualizacion Exitoso... " + Integer.toString(executar));
            
            cn.cerrar_conexion( );
            
        
        }catch(SQLException ex){
                System.out.println("Error al Actualizar" + ex.getMessage());
        }
    }

    @Override
    public void borrar() {
        // Código para borrar un docente de la base de datos
try {
            PreparedStatement parametro;
            cn = new Conexion();
            
            cn.abrir_conexion( );
            String query ="DELETE FROM docente_persona WHERE nit = ?;";
            parametro = (PreparedStatement) cn.ConexionBD.prepareStatement(query);
            parametro.setString(1, getNit());            
            int executar = parametro.executeUpdate();
            System.out.println("Borrado Exitoso... " + Integer.toString(executar));
            
            cn.cerrar_conexion( );
            
        
        }catch(SQLException ex){
                System.out.println("Error al Borrar" + ex.getMessage());
        }


    }    
    
    
}
