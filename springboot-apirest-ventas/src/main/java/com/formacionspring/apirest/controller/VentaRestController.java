package com.formacionspring.apirest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formacionspring.apirest.service.ClienteService;
import com.formacionspring.apirest.service.ProductoService;

@RestController
@RequestMapping("/venta")
public class VentaRestController {
	@Autowired
	private ClienteService servicio;
	@Autowired
	private ProductoService productos;
	
	
	

}
