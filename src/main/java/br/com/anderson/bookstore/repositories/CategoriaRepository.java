package br.com.anderson.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.anderson.bookstore.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}