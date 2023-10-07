package com.dio.padroesdeprojetoSpring.service.impl;

import com.dio.padroesdeprojetoSpring.model.Cliente;
import com.dio.padroesdeprojetoSpring.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser
 * injetada pelo Spring (via {@link Autowired}, com isso essa classe é um
 * Link service e será tratada como <b>Singleton</b>
 *
 * */

@Service
public class ClienteServiceImpl implements ClienteService {
    @Override
    public Iterable<Cliente> buscarTodos() {
        return null;
    }

    @Override
    public Cliente buscarPorId(Long id) {
        //FIXME Buscar clientes por id
        return null;
    }

    @Override
    public void inserir(Cliente cliente) {
        //FIXME verificar se o endereço do Cliente ja existe(pelo cep)
        //FIXME caso nao exista, integrar com viaCep e persistir o retorno
        //FIXME inserir cliente vinculando o endereço (Novo ou Existinte)
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        //FIXME Buscar Cliente por Id, caso exista
        //FIXME Verificar se o  endereço do cliente ja existe (via Cep)
        //FIXME caso nao exista, integrar com viaCep e persistir o retorno
        //FIXME alterar cliente vinculando o endereço (Novo ou Existinte)

    }

    @Override
    public void deletar(Long id) {
        //FIXME Deletar clinte por ID
    }
}
