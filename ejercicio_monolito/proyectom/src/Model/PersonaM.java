/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Conexion.Conexion;
import Interface.CRUD;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author jdher
 */
public class PersonaM implements CRUD{
    
    Conexion conn = new Conexion();
    private String tipoDocumento;
    private String numeroDocumento;
    private String nombreCompleto;
    private String direccionCorreo;
    private int idPersona;


    
    public String getTipoDocumento() {
        return tipoDocumento;
    }
    
    public String getDocumento() {
        return numeroDocumento;
    }
    
    public String getNombre() {
        return nombreCompleto;
    }
    
    public String getCorreo() {
        return direccionCorreo;
    }
    
    public int getId() {
        return idPersona;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    
    public void setDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    
    public void setNombre(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    
    public void setCorreo(String direccionCorreo) {
        this.direccionCorreo = direccionCorreo;
    }
    
    public void setId(int idPersona) {
        this.idPersona = idPersona;
    }
    
    @Override
    public void Agregar() {
        // Establecer la conexión
        conn.conectar();
        
         // Puedes realizar operaciones en la base de datos aquí, por ejemplo:
        String sql = "INSERT INTO persona (tipo_documento, documento, nombre_completo, correo) VALUES ('" + this.getTipoDocumento() + "', '" + this.getDocumento() + "', '" + this.getNombre() + "', '" + this.getCorreo() + "')";
        conn.ejecutarUpdate(sql);
        
        // Cerrar la conexión
        conn.cerrarConexion();
    }

    @Override
    public void Modificar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Eliminar() {
        // Establecer la conexión
        conn.conectar();
        
         // Puedes realizar operaciones en la base de datos aquí, por ejemplo:
        String sql = "DELETE FROM persona WHERE id = ("+this.getId()+")";
        
        conn.ejecutarUpdate(sql);
        
        // Cerrar la conexión
        conn.cerrarConexion();
    }

    @Override
    public Object Consultar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
         // Realizar una consulta y obtener datos
        //ResultSet resultSet = conexion.ejecutarQuery("SELECT * FROM grupo");
    }

    @Override
    public Object ConsultarId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

