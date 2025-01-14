package com.example.blog.entidade;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "blog")
public class Blog {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String titulo;
private String autor;
private String conteudo;
public Blog(Long id, String titulo, String autor, String conteudo) {
	super();
	this.id = id;
	this.titulo = titulo;
	this.autor = autor;
	this.conteudo = conteudo;
}
public Blog() {
	
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public String getConteudo() {
	return conteudo;
}
public void setConteudo(String conteudo) {
	this.conteudo = conteudo;
}
	

	
}
