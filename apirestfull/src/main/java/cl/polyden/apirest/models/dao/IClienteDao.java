package cl.polyden.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import cl.polyden.apirest.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
