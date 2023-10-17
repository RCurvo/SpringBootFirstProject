package br.com.rcurvo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rcurvo.domain.Cliente;


@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long>{

}