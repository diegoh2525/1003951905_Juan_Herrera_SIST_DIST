/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Conexion.Conexion;
import Interface.CRUD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author jdher
 */
public class EstudianteM implements CRUD{
    
    Conexion conn = new Conexion();
    private String codigoEstudiante;
    private String programaEstudiante;
    private int idPersona2;
    private int idEstudiante;


    
    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }
    
    public String getProgramaEstudiante() {
        return programaEstudiante;
    }
    
    public int getIdPersona() {
        return idPersona2;
    }
    
    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }
    
    public void setProgramaEstudiante(String programaEstudiante) {
        this.programaEstudiante = programaEstudiante;
    }
      
    public void setIdPersona(int idPersona2) {
        this.idPersona2 = idPersona2;
    }
    
    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }
    
    @Override
    
    public void Agregar() {
    // Establecer la conexión
    conn.conectar();

    PreparedStatement statement = null;

    try {
        // Puedes realizar operaciones en la base de datos aquí, por ejemplo:
        String sql = "INSERT INTO persona (codigo, programa, persona_id) VALUES (?, ?, ?)";
        
        statement = conn.prepareStatement(sql);

        // Establecer los valores de los parámetros
        statement.setString(1, this.getCodigoEstudiante());
        statement.setString(2, this.getProgramaEstudiante());
        statement.setInt(3, this.getIdPersona());

        // Imprime la consulta SQL para depuración
        System.out.println(sql);

        // Ejecutar la actualización
        statement.executeUpdate();

    } catch (SQLException e) {
        e.printStackTrace(); // Manejo de excepciones (puedes personalizarlo según tus necesidades)
    } finally {
        // Cerrar el PreparedStatement en el bloque finally
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace(); // Manejo de excepciones (puedes personalizarlo según tus necesidades)
            }
        }

        // Cerrar la conexión
        conn.cerrarConexion();
    }
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
        String sql = "DELETE FROM estudiante WHERE id = ("+this.getIdEstudiante()+")";
        
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

