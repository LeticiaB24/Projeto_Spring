package com.aula.spring.springboot.Repositories;

import com.aula.spring.springboot.Entities.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository< Usuario, Integer> {

}