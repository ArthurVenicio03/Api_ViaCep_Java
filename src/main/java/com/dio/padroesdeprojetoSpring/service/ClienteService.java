package com.dio.padroesdeprojetoSpring.service;

import com.dio.padroesdeprojetoSpring.model.Cliente;

/** INTERFACE QUE DEFINE O PADRÃO <b>Strategy</b> no dominio do cliente.
 * Com isso, se necessário podemos ter multiplas implementações
 * da mesma interface
 * @author ArthurVenicio03
 * */

public interface ClienteService {
    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}
