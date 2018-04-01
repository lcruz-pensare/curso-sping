package com.pensare.curso2.DAO;

import com.pensare.curso2.entity.Cliente;

import java.util.List;

public interface IClienteDAO {
    //DAO: Data Object Access
    //Interface contiene el protocolo de comportamiento del DAO
    public List<Cliente> findAll();//
}
