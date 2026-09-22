package com.exemplo.fornecedoresservice.client;

import com.exemplo.fornecedoresservice.dto.ProdutoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "produtos-service")
public interface ProdutoClient {

    @GetMapping("/produtos")
    List<ProdutoDTO> listarTodos();

    @GetMapping("/produtos/{id}")
    ProdutoDTO buscarPorId(@PathVariable Long id);
}
