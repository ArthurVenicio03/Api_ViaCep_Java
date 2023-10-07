package com.dio.padroesdeprojetoSpring.controller;

import com.dio.padroesdeprojetoSpring.model.Cliente;
import com.dio.padroesdeprojetoSpring.service.ClienteService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/** esse {@link org.springframework.web.bind.annotation.RestController} representa
 * nossa <b>Facade</b>, pois abstrai toda complexidade
 * de integrações(BANCO DE DADOS H2 E API VIACEP) Em uma interface
 * simples e coesa(API REST)
 * @author ArthurVenicio03
 * */
@RestController
@RequestMapping("clientes")
public class ClienteRestController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity <Iterable<Cliente>> buscarPorId(@PathVariable long id){
        return ResponseEntity.ok(clienteService.buscarTodos());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> bucarPorId(@PathVariable Long id){
        return ResponseEntity.ok(clienteService.buscarPorId(id));
    }
    @PostMapping
    public ResponseEntity<Cliente> inserir(@RequestBody Cliente cliente){
        clienteService.inserir(cliente);
        return ResponseEntity.ok(cliente);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @RequestBody Cliente cliente){
        clienteService.atualizar(id, cliente);
        return ResponseEntity.ok(cliente);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Cliente> deletar(@PathVariable Long id){
        clienteService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
