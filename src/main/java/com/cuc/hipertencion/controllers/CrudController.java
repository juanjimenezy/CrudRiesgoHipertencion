package com.cuc.hipertencion.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cuc.hipertencion.models.Crud;
import com.cuc.hipertencion.repositorys.CrudRepository;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/Api")
public class CrudController {
	
	@Autowired
	private CrudRepository crudRepository;
	
	@PostMapping("/crud")
	public ResponseEntity<?> created(@RequestBody Crud crud){
		Map<String, Object> response = new HashMap<>();
		Crud crudNew = new Crud();
		try {
			crudNew = crudRepository.save(crud);
		} catch (Exception e) {
			response.put("mensaje", "Error al grabar");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Crud>(crudNew, HttpStatus.OK);
	}
	
	@GetMapping("/crud")
	public ResponseEntity<?> show(){
		Map<String, Object> response = new HashMap<>();
		List<Crud> listCrud = new ArrayList<>();
		try {
			listCrud = crudRepository.findAll();
		} catch (Exception e) {
			response.put("mensaje", "Error al consultar");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}		
		return new ResponseEntity<List<Crud>>(listCrud, HttpStatus.OK);
	}

}
