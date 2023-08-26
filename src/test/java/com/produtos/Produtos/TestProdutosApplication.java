package com.produtos.Produtos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestProdutosApplication {

	public static void main(String[] args) {
		SpringApplication.from(ProdutosApplication::main).with(TestProdutosApplication.class).run(args);
	}

}
