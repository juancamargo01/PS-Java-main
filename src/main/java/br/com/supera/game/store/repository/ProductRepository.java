package br.com.supera.game.store.repository;

import br.com.supera.game.store.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long> {

    Product findByNome(String nome);





}
