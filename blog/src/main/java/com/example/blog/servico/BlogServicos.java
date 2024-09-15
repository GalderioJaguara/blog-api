package com.example.blog.servico;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.blog.entidade.Blog;
import com.example.blog.repositorio.BlogRepositorio;
@Service
public class BlogServicos {

	private BlogRepositorio blogRepositorio;
	
	public BlogServicos(BlogRepositorio blogRepositorio) {
		this.blogRepositorio = blogRepositorio;
	}
	
	public List<Blog> criar(Blog blog) {
		blogRepositorio.save(blog);
		return listar();
	}
	
	public List<Blog> listar() {
		Sort organizacao = Sort.by("id").ascending();
		return blogRepositorio.findAll();
	}
	
	public List<Blog> atualizar(Blog blog) {
		blogRepositorio.save(blog);
		return listar();
	}
	
	public List<Blog> deletar(Long id) {
		blogRepositorio.deleteById(id);
		return listar();
	}
}
