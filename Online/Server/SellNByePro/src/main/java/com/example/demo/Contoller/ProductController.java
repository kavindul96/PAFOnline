package com.example.demo.Contoller;

import java.util.List;



import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modle.Product;
import com.example.demo.repository.ProductS;


@RequestMapping("/product")
@RestController
public class ProductController {
	
	@Autowired
	ProductS ps;
	
	@PostMapping("/pro")
	public Product save(@Valid @RequestBody Product product)
	{
		return ps.save(product);
	}
	
	@PutMapping("/pro/{Id}")
	public Product updateProduct(@RequestBody Product product)
	{
		ps.save(product);

		return product;
		
		//return ResponseEntity.ok().body(updateProduct);
	}
	
	@GetMapping("/all")
	public List<Product> getAllProducts()
	{
		return ps.findAll();
	}
	
	
	@GetMapping("/by/{Id}")
	public Optional<Product> getProduct(@PathVariable(name="productId")int productId)
	{
		return ps.findById(productId);
		
		/*if(product==null) {
			return ResponseEntity.notFound().build();
		}*/
		
		//return ResponseEntity.ok().body(product);
	}
	
	@DeleteMapping("/pro/{Id}")
	public ResponseEntity deleteproduct(@PathVariable int productId)
	{
		Product product = ps.getOne(productId);
		if(product==null) {
			return ResponseEntity.notFound().build();
		}
		ps.delete(product);
		return ResponseEntity.ok().build();
		
		
	}
}
