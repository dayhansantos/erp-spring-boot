package br.com.dayhan.cursomc.repositories;

import br.com.dayhan.cursomc.domain.Cidade;
import br.com.dayhan.cursomc.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
