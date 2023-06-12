package com.comicsmarket.apirest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comicsmarket.apirest.enties.Proveedor;
import com.comicsmarket.apirest.services.ProveedorService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/comicsmarket/proveedores")
public class ProveedorController {

	private ProveedorService proveedorService;

	public ProveedorController(ProveedorService proveedorService) {
		this.proveedorService = proveedorService;
	}
	
	
	@GetMapping("")
	public ResponseEntity <?> getAll(){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(proveedorService.findall());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, Por Favor Intente mas tarde.\"}");
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity <?> getOne(@PathVariable Long id){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(proveedorService.findById(id));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, Por Favor Intente mas tarde.\"}");
		}
	}
	
	@PostMapping("")
	public ResponseEntity <?> save(@RequestBody Proveedor entity){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(proveedorService.save(entity));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, Por Favor Intente mas tarde.\"}");
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity <?> edit(@PathVariable Long id, @RequestBody Proveedor entity){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(proveedorService.update(id, entity));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, Por Favor Intente mas tarde.\"}");
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity <?> delete(@PathVariable Long id){
		try {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(proveedorService.delete(id));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, Por Favor Intente mas tarde.\"}");
		}
	}
}
