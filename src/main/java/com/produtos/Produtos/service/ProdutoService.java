package com.produtos.Produtos.service;

import com.produtos.Produtos.model.ProdutoModel;
import com.produtos.Produtos.repositorio.ProdutosRepositorio;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProdutoService {

    private ProdutosRepositorio produtosRepositorio;

    @Transactional
    public ProdutoModel save(ProdutoModel produtoModel)
    {
        return produtosRepositorio.save(produtoModel);
    }
}
