package com.corhuila.Corte2JuanHerrera.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.corhuila.Corte2JuanHerrera.Entity.ClienteProducto;

@Repository
public interface IClienteProductoRepository extends JpaRepository<ClienteProducto, Long>{

}
