package com.corhuila.Corte2JuanHerrera.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.corhuila.Corte2JuanHerrera.Entity.Cliente;
import com.corhuila.Corte2JuanHerrera.IService.IClienteService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/Corte2JuanHerrera/Cliente")
public class ClienteController {
	
	@Autowired
	private IClienteService service;
	
	 @GetMapping()
     public List<Cliente> all() {
         return service.all();
     }
	 
	 @GetMapping("{id}")
     public Optional<Cliente> findById(@PathVariable Long id) {
         return service.findById(id);
     }
	 
	 @PostMapping
     @ResponseStatus(code = HttpStatus.CREATED)
     public Cliente save(@RequestBody Cliente cliente) {
         return service.save(cliente);
     }
	 
	 @PutMapping("{id}")
     @ResponseStatus(code = HttpStatus.OK)
     public void update(@RequestBody Cliente cliente, @PathVariable Long id) {
         service.update(cliente, id);
     }
	 
	 
	 @DeleteMapping("{id}")
     @ResponseStatus(code = HttpStatus.NO_CONTENT)
     public void deletePhysical(@PathVariable Long id) {
         service.deletePhysical(id);
     }

}
