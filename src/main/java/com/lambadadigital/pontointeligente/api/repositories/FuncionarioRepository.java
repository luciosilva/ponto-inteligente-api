package com.lambadadigital.pontointeligente.api.repositories;

import org.springframework.transaction.annotation.Transactional;

import com.lambadadigital.pontointeligente.api.entities.Funcionario;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional(readOnly=true)
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

	Funcionario findByCpf(String cpf);
	
	Funcionario findByEmail(String email);
	
	Funcionario findByCpfOrEmail(String cpf, String email);
	
}
