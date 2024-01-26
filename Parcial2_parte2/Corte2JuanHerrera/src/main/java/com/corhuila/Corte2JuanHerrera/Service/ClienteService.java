package com.corhuila.Corte2JuanHerrera.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.Corte2JuanHerrera.Entity.Cliente;
import com.corhuila.Corte2JuanHerrera.IRepository.IClienteRepository;
import com.corhuila.Corte2JuanHerrera.IService.IClienteService;

@Service
public class ClienteService implements IClienteService{
	
	@Autowired
	private IClienteRepository repository;
	
	@Override
	public List<Cliente> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Cliente> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public Cliente save(Cliente cliente) {		
		return repository.save(cliente);
	}

	@Override
	public void update(Cliente cliente, Long id) {
		//validar si existe.            
        Optional<Cliente> op = repository.findById(id);		
        
        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else {
        	 //Crear nuevo objeto que va a contener los datos que se van actualizar
            Cliente clienteUpdate = op.get();
            clienteUpdate.setNombre(cliente.getNombre());
            clienteUpdate.setCorreo(cliente.getCorreo());
            clienteUpdate.setTelefono(cliente.getTelefono());
            clienteUpdate.setDireccion(cliente.getDireccion());
            
            //Actualizar el objeto
            repository.save(clienteUpdate);
        }
        
        
	}

	@Override
	public void deletePhysical(Long id) {
		repository.deleteById(id);	
	}	
}
