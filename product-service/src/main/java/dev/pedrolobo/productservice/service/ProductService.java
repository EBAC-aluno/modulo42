package dev.pedrolobo.productservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.pedrolobo.productservice.dto.ProductRequest;
import dev.pedrolobo.productservice.dto.ProductResponse;
import dev.pedrolobo.productservice.model.Product;
import dev.pedrolobo.productservice.repository.IProductRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {

  private final IProductRepository productRepository;

  public void createProduct(ProductRequest productRequest) {
    Product product = Product.builder()
        .name(productRequest.getName())
        .description(productRequest.getDescription())
        .price(productRequest.getPrice()).build();

    productRepository.save(product);
    log.info("Product id=" + product.getId() + " resgistered");
  }

  public List<ProductResponse> getAllProducts() {
    List<Product> products = productRepository.findAll();
    return products.stream().map(product -> mapToResponse(product)).toList();
  }

  public ProductResponse getById(Long id) {
    return mapToResponse(productRepository.findById(id).get());
  }

  public void deleteById(Long id) {
    productRepository.deleteById(id);
  }

  private ProductResponse mapToResponse(Product product) {
    return ProductResponse.builder()
        .id(product.getId())
        .name(product.getName())
        .description(product.getDescription())
        .price(product.getPrice())
        .build();
  }

  public boolean existsById(Long id) {
    return productRepository.existsById(id);
  }

  public void update(@Valid ProductRequest productRequest, Long id) {
    productRepository.save(mapProductToEntity(productRequest, id));
  }

  private Product buildProduct(ProductRequest productRequest) {
    Product product = Product.builder()
        .name(productRequest.getName())
        .description(productRequest.getDescription())
        .price(productRequest.getPrice())
        .build();
    return product;
  }

  private Product mapProductToEntity(ProductRequest productRequest, Long id) {
    Product product = buildProduct(productRequest);
    product.setId(id);
    return product;
  }

}
