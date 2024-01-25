package com.sisdis.seguridad.Controller;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/seguridad/Rol")
public class RolController {

	@Autowired
	private IRolService service;
	
	 @GetMapping()
     public List<Rol> all() {
         return service.all();
     }
	 
	 @GetMapping("{id}")
     public Optional<Rol> findById(@PathVariable Long id) {
         return service.findById(id);
     }
	 
	 @PostMapping
     @ResponseStatus(code = HttpStatus.CREATED)
     public Rol save(@RequestBody Rol rol) {
         return service.save(rol);
     }
	 
	 @PutMapping("{id}")
     @ResponseStatus(code = HttpStatus.OK)
     public void update(@RequestBody Rol rol, @PathVariable Long id) {
         service.update(rol, id);
     }
	 
	 @PutMapping("deleteLogical/{id}")
     @ResponseStatus(code = HttpStatus.OK)
     public void deleteLogical(@PathVariable Long id) {
         service.deleteLogical(id);
     }
	 
	 @DeleteMapping("{id}")
     @ResponseStatus(code = HttpStatus.NO_CONTENT)
     public void deletePhysical(@PathVariable Long id) {
         service.deletePhysical(id);
     }
}
