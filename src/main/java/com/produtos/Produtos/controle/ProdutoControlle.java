package com.produtos.Produtos.controle;

import com.produtos.Produtos.dtos.ProdutoDto;
import com.produtos.Produtos.model.ProdutoModel;
import com.produtos.Produtos.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ProdutoControlle {

    @Autowired
    private ProdutoService produtoService;


    @PostMapping("/produto")
    public ResponseEntity<ProdutoModel> saveProduto(@Valid @RequestBody ProdutoDto produtoDto)
    {
        var produtoModel = new ProdutoModel();
        BeanUtils.copyProperties(produtoDto,produtoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.save(produtoModel));
    }

}
