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

import com.comicsmarket.apirest.enties.Factura;
import com.comicsmarket.apirest.services.FacturaService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/comicsmarket/facturas")
public class FacturaController {

	private FacturaService facturaService;

	public FacturaController(FacturaService facturaService) {
		this.facturaService = facturaService;
	}
	
	
	@GetMapping("")
	public ResponseEntity <?> getAll(){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(facturaService.findall());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, Por Favor Intente mas tarde.\"}");
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity <?> getOne(@PathVariable Long id){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(facturaService.findById(id));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, Por Favor Intente mas tarde.\"}");
		}
	}
	
	@PostMapping("")
	public ResponseEntity <?> save(@RequestBody Factura entity){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(facturaService.save(entity));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, Por Favor Intente mas tarde.\"}");
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity <?> edit(@PathVariable Long id, @RequestBody Factura entity){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(facturaService.update(id, entity));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, Por Favor Intente mas tarde.\"}");
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity <?> delete(@PathVariable Long id){
		try {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(facturaService.delete(id));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, Por Favor Intente mas tarde.\"}");
		}
	}
}
