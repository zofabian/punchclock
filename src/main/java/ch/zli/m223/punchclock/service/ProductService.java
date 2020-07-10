package ch.zli.m223.punchclock.service;

import ch.zli.m223.punchclock.domain.Product;
import ch.zli.m223.punchclock.repository.ProductRepository;

import java.util.List;

public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(Product product) {
        return productRepository.saveAndFlush(product);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public void deleteProduct(long id){productRepository.deleteById(id);}

    public void  updateProduct(Product product) {
        productRepository.save(product);
    }
}
