package br.rafaelSammarco.FirstProject.services;

import br.rafaelSammarco.FirstProject.entities.Product;
import br.rafaelSammarco.FirstProject.repositories.ProductRepository;
import br.rafaelSammarco.FirstProject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
       Optional<Product> obj = repository.findById(id);
       return obj.get();
    }

}
