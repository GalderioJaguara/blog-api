package com.example.blog.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.blog.entidade.Blog;

public interface BlogRepositorio extends JpaRepository<Blog, Long>{

}
