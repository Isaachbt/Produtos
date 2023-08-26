package com.produtos.Produtos.repositorio;

import com.produtos.Produtos.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProdutosRepositorio extends JpaRepository<ProdutoModel, UUID> {
}
