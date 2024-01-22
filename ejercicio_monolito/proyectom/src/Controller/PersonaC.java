/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.PersonaM;
/**
 *
 * @author jdher
 */
public class PersonaC {
    public void Agregar(String tipoDocumento, String numeroDocumento, String nombreCompleto, String direccionCorreo){
        //Objeto del modelo
        PersonaM personaM = new PersonaM();
        personaM.setTipoDocumento(tipoDocumento);
        personaM.setDocumento(numeroDocumento);
        personaM.setNombre(nombreCompleto);
        personaM.setCorreo(direccionCorreo);
        personaM.Agregar();
    }
    public void Eliminar(int idPersona){
        //Objeto del modelo
        PersonaM personaM = new PersonaM();
        personaM.setId(idPersona);
        personaM.Eliminar();
    }
}
