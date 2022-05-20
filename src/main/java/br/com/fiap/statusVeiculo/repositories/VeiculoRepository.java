package br.com.fiap.statusVeiculo.repositories;


import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fiap.statusVeiculo.model.Veiculo;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long>  {
	
}
