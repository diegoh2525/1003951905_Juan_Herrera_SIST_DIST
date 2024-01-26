package com.corhuila.Corte2JuanHerrera.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.Corte2JuanHerrera.Entity.Producto;
import com.corhuila.Corte2JuanHerrera.IRepository.IProductoRepository;
import com.corhuila.Corte2JuanHerrera.IService.IProductoService;

@Service
public class ProductoService implements IProductoService{
	
	@Autowired
	private IProductoRepository repository;
	
	@Override
	public List<Producto> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Producto> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public Producto save(Producto producto) {		
		return repository.save(producto);
	}

	@Override
	public void update(Producto producto, Long id) {
		//validar si existe.            
        Optional<Producto> op = repository.findById(id);		
        
        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else {
        	 //Crear nuevo objeto que va a contener los datos que se van actualizar
            Producto productoUpdate = op.get();
            productoUpdate.setNombre(producto.getNombre());
            productoUpdate.setDescripcion(producto.getDescripcion());
            
            //Actualizar el objeto
            repository.save(productoUpdate);
        }
        
        
	}

	@Override
	public void deletePhysical(Long id) {
		repository.deleteById(id);	
	}	
}
