package br.com.anderson.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.anderson.bookstore.domain.Livro;

public interface LivroRepository extends JpaRepository<Livro, Integer>{
}