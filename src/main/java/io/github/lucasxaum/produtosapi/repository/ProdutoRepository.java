package io.github.lucasxaum.produtosapi.repository;

import io.github.lucasxaum.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

}
