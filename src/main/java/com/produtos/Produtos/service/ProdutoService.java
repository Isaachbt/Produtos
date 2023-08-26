package com.produtos.Produtos.service;

import com.produtos.Produtos.model.ProdutoModel;
import com.produtos.Produtos.repositorio.ProdutosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProdutoService {

    @Autowired
    private ProdutosRepositorio produtosRepositorio;

    @Transactional
    public ProdutoModel save(ProdutoModel produtoModel)
    {
        return produtosRepositorio.save(produtoModel);
    }


    public List<ProdutoModel> findAll()
    {
        return produtosRepositorio.findAll();
    }

    public Optional<ProdutoModel> getOneproduto(UUID idProduto)
    {
        return produtosRepositorio.findById(idProduto);
    }
}
