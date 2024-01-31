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

import com.corhuila.Corte2JuanHerrera.Entity.Producto;
import com.corhuila.Corte2JuanHerrera.IService.IProductoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/Corte2JuanHerrera/Producto")
public class ProductoController {
	
	@Autowired
	private IProductoService service;
	
	 @GetMapping()
     public List<Producto> all() {
         return service.all();
     }
	 
	 @GetMapping("{id}")
     public Optional<Producto> findById(@PathVariable Long id) {
         return service.findById(id);
     }
	 
	 @PostMapping
     @ResponseStatus(code = HttpStatus.CREATED)
     public Producto save(@RequestBody Producto producto) {
         return service.save(producto);
     }
	 
	 @PutMapping("{id}")
     @ResponseStatus(code = HttpStatus.OK)
     public void update(@RequestBody Producto producto, @PathVariable Long id) {
         service.update(producto, id);
     }
	 
	 
	 @DeleteMapping("{id}")
     @ResponseStatus(code = HttpStatus.NO_CONTENT)
     public void deletePhysical(@PathVariable Long id) {
         service.deletePhysical(id);
     }

}
