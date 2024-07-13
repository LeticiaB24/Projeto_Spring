package com.aula.spring.springboot.Controllers;

import java.util.List;

import com.aula.spring.springboot.Entities.Usuario;
import com.aula.spring.springboot.Services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 


@RestController

  @RequestMapping("/usuario")
  public class UsuarioController{

    @Autowired
    private UsuarioService service;

    @GetMapping
    public List<Usuario> procuraTodos() {
      return service.procurarTodos();

    }

    @GetMapping(value = "/{id}")
    public Usuario procuraPorId(@PathVariable Integer id) {
      return service.procurarPorId(id);
    }

    @PostMapping
    public String adicionarUsuario(@RequestBody Usuario usuario) {
      return service.adicionarUsuario(usuario);

    }

    @PutMapping (value = "/{id}")
    public String editarUsuario (@PathVariable Integer id, @RequestBody Usuario usuario){

      String response = service.editarUsuario(id, usuario);
      return response;
    }

    @DeleteMapping(value = "/{id}") 
    public void excluirUsuario( @PathVariable Integer id){
    service.excluirUsuario(id);

  }
}


  