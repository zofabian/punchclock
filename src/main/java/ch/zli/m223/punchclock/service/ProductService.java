package ch.zli.m223.punchclock.service;

import ch.zli.m223.punchclock.domain.Product;
import ch.zli.m223.punchclock.repository.productRepository;

import java.util.List;

public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(Entry entry) {
        return productRepository.saveAndFlush(entry);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public void deleteProduct(long id){productRepository.deleteById(id);}

    public void  updateProduct(Entry entry) {
        productRepository.save(entry);
    }
}
