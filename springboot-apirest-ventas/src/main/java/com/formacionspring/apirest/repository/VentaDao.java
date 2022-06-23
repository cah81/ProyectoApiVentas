package com.formacionspring.apirest.repository;

import org.springframework.data.repository.CrudRepository;


import com.formacionspring.apirest.model.entity.Venta;

public interface VentaDao extends CrudRepository<Venta, Long> {

}
