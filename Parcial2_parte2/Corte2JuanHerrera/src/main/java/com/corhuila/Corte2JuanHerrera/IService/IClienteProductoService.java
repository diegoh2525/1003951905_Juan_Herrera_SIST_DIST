package com.corhuila.Corte2JuanHerrera.IService;

import java.util.List;
import java.util.Optional;

import com.corhuila.Corte2JuanHerrera.Entity.ClienteProducto;

public interface IClienteProductoService {
	
	//Obtener todo
		public List<ClienteProducto> all();
		
		//Obtener por ID
		public Optional<ClienteProducto> findById(Long id);
	 	
		//Crear
		public ClienteProducto save(ClienteProducto clienteProducto);
		
		//Modificar
		public void update(ClienteProducto clienteProducto, Long id);
		
		//Eliminar Físico
		public void deletePhysical(Long id);

}
