package com.formacionspring.apirest.service;

import java.util.List;


import com.formacionspring.apirest.model.entity.Venta;


public interface VentaService {
	
	public List<Venta> mostrarTodos();
	public Venta mostrarPorId(Long id);
	public Venta guardar(Venta venta);
	public void borrar(Long id);

}