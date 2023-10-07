package com.dio.padroesdeprojetoSpring.service;

import com.dio.padroesdeprojetoSpring.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/** Cliente criado com <b>OpenFeign</b> para Consumo da API do
 * <b>ViaCep</b>
 * @author ArthurVenicio03
 * */
@FeignClient(name = "viacep", url = "viacep.com.br/ws")
public interface ViaCepService{

    @GetMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep")String cep);
}
