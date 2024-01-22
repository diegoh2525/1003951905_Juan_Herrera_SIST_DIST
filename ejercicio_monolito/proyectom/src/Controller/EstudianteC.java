/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.EstudianteM;
/**
 *
 * @author jdher
 */
public class EstudianteC {
    public void Agregar(String codigoEstudiante, String programaEstudiante, int personaId){
        //Objeto del modelo
        EstudianteM estudianteM = new EstudianteM();
        estudianteM.setCodigoEstudiante(codigoEstudiante);
        estudianteM.setProgramaEstudiante(programaEstudiante);
        estudianteM.setIdPersona(idPersona2);
        estudianteM.Agregar();
    }
    public void Eliminar(int idEstudiante){
        //Objeto del modelo
        EstudianteM estudianteM = new EstudianteM();
        estudianteM.setIdEstudiante(idEstudiante);
        estudianteM.Eliminar();
    }
}
