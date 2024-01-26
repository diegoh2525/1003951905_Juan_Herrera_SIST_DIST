package com.corhuila.Corte2JuanHerrera.IService;

import java.util.List;
import java.util.Optional;

import com.corhuila.Corte2JuanHerrera.Entity.Cliente;

public interface IClienteService {
	
	//Obtener todo
		public List<Cliente> all();
		
		//Obtener por ID
		public Optional<Cliente> findById(Long id);
	 	
		//Crear
		public Cliente save(Cliente cliente);
		
		//Modificar
		public void update(Cliente cliente, Long id);
		
		//Eliminar Físico
		public void deletePhysical(Long id);

}
