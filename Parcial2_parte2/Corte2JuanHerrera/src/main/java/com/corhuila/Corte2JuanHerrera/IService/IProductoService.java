package com.corhuila.Corte2JuanHerrera.IService;

import java.util.List;
import java.util.Optional;

import com.corhuila.Corte2JuanHerrera.Entity.Producto;

public interface IProductoService {
	
	//Obtener todo
		public List<Producto> all();
		
		//Obtener por ID
		public Optional<Producto> findById(Long id);
	 	
		//Crear
		public Producto save(Producto producto);
		
		//Modificar
		public void update(Producto producto, Long id);
		
		//Eliminar Físico
		public void deletePhysical(Long id);
			

}
