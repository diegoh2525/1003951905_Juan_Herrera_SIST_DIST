/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.GrupoM;

/**
 *
 * @author ariel
 */
public class GrupoC {
    public void Agregar(int numeroGrupo){
        //Objeto del modelo
        GrupoM grupoM = new GrupoM();
        grupoM.setNumeroGrupo(numeroGrupo);
        grupoM.Agregar();
    }
    public void Eliminar(int numeroGrupo){
        //Objeto del modelo
        GrupoM grupoM = new GrupoM();
        grupoM.setNumeroGrupo(numeroGrupo);
        grupoM.Eliminar();
    }
    public void Modificar(int numeroGrupo, int modificarGrupo){
        //Objeto del modelo
        GrupoM grupoM = new GrupoM();
        grupoM.setNumeroGrupo(numeroGrupo);
        grupoM.setNumeroGrupo2(modificarGrupo);
        grupoM.Modificar();
    }
}
