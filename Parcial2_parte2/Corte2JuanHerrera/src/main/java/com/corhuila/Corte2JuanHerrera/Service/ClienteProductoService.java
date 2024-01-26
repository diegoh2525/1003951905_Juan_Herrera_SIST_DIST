package com.corhuila.Corte2JuanHerrera.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.Corte2JuanHerrera.Entity.ClienteProducto;
import com.corhuila.Corte2JuanHerrera.IRepository.IClienteProductoRepository;
import com.corhuila.Corte2JuanHerrera.IService.IClienteProductoService;

@Service
public class ClienteProductoService implements IClienteProductoService{
	
	@Autowired
	private IClienteProductoRepository repository;
	
	@Override
	public List<ClienteProducto> all() {
		return repository.findAll();
	}

	@Override
	public Optional<ClienteProducto> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public ClienteProducto save(ClienteProducto clienteProducto) {		
		return repository.save(clienteProducto);
	}

	@Override
	public void update(ClienteProducto clienteProducto, Long id) {
		//validar si existe.            
        Optional<ClienteProducto> op = repository.findById(id);		
        
        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else {
        	 //Crear nuevo objeto que va a contener los datos que se van actualizar
            ClienteProducto clienteProductoUpdate = op.get();
            clienteProductoUpdate.setClienteId(clienteProducto.getClienteId());
            clienteProductoUpdate.setProductoId(clienteProducto.getProductoId());
            
            //Actualizar el objeto
            repository.save(clienteProductoUpdate);
        }
        
        
	}

	@Override
	public void deletePhysical(Long id) {
		repository.deleteById(id);	
	}	
}
