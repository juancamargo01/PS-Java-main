package br.com.supera.game.store.service;

import br.com.supera.game.store.models.Product;
import br.com.supera.game.store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {


    @Autowired
    ProductRepository productRepository;

    /**
     * Método que busca todos os produtos
     *
     * @return
     */
    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();
        productRepository.findAll().forEach(product -> products.add(product));
        return products;
    }

    /**
     * Método que busca produto por Id
     *
     * @param id
     * @return
     */
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    /**
     * Método que salva um produto
     *
     * @param product
     */
    public void save(Product product) {

        productRepository.save(product);
    }

    /**
     * Método que deleta um produto
     *
     * @param id
     */
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

}



