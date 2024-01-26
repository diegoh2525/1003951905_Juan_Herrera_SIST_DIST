package com.corhuila.Corte2JuanHerrera.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.corhuila.Corte2JuanHerrera.Entity.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Long>{

}
