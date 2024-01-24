package org.upn.edu.pe.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.upn.edu.pe.modelo.Productos;
import org.upn.edu.pe.repositorio.IProductos;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
public class ProductosController {
	
	@Autowired
	private IProductos repo;
	
	@GetMapping("/productos")
	public List<Productos> Listar(){
		return repo.findAll();
	}
	
	@GetMapping("/productos/{id}")
	public Optional<Productos> Buscar(@PathVariable int id) {	
		return repo.findById(id);
	}
	
	@PostMapping("/productos")
	public Productos Insertar(@RequestBody Productos ObjP) {
		return repo.save(ObjP);
	}
	
	@PutMapping("/productos/{id}")
	public Productos Modificar(@RequestBody Productos ObjP,@PathVariable int id) {
		return repo.save(ObjP);
	}
	
	@DeleteMapping("/productos/{id}")
	public void Suprimir(@PathVariable int id) {
		repo.deleteById(id);
	}
}
