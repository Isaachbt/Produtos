package com.produtos.Produtos.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProdutoDto(@NotBlank @NotNull String nome,
                         @NotBlank @NotNull String dataValidade,
                         @NotNull BigDecimal value,
                         @NotNull int quantidade) {
}
