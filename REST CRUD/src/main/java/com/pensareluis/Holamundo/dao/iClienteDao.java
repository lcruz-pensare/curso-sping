package com.pensareluis.Holamundo.dao;

import com.pensareluis.Holamundo.modelsEntity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface iClienteDao extends CrudRepository<Cliente,Long> {//La clase que mapea la tabla y el otro es el tipo de dato del id

}
