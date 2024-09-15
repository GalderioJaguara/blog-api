package com.example.blog.controller;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.blog.entidade.Blog;
import com.example.blog.servico.BlogServicos;



@RestController
@RequestMapping("/posts")
public class BlogController {
	
	private BlogServicos blogServicos;
	
	public BlogController(BlogServicos blogServicos) {
		this.blogServicos = blogServicos;
	}
	
	@PostMapping
	List<Blog> criar(@RequestBody Blog blog) {
		System.out.println(blog);
		return blogServicos.criar(blog);
	}
	@GetMapping
	List<Blog> listar() {
		return blogServicos.listar();
	}
	@PutMapping
	List<Blog> atualizar(@RequestBody Blog blog) {
		return blogServicos.atualizar(blog);
	}
	@DeleteMapping("{id}")
	List<Blog> deletar(@PathVariable("id") Long id) {
		return blogServicos.deletar(id);
	}
	
	
	
	
}
