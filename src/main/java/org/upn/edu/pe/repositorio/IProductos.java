package org.upn.edu.pe.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.upn.edu.pe.modelo.Productos;

@Repository
public interface IProductos extends JpaRepository<Productos, Integer>{

}
