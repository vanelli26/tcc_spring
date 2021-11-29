package br.com.spring.tcc.spring.repository;

import br.com.spring.tcc.spring.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, Long> {

    Optional<Product> findByCode(String code);
}

