package com.carro.carro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carro.carro.model.Carro;
import com.carro.carro.repository.CarroRepository;

@Service
public class CarroService {
    
    @Autowired
    private CarroRepository carroRepository;

    /**
     * Metodo do service responsavel por retornar uma lista com todos os carros
     * @return lista de todos os carros
     */
    public List<Carro> obterTodos(){
        return carroRepository.obterTodos();
    }

    /**
     * Metodo do service responsavel por retorna um modelo especifico de carro
     * @param id do carro
     * @return um carro especifico
     */
    public Optional<Carro> obterUmCarro(Integer id){
        return carroRepository.obterUmCarro(id);
    }

    /**
     * Metodo do service responsavel por adicionar um novo modelo de carro na lista
     * @param carro há ser adicionado
     * @return carro adicionado
     */
    public Carro adicionar(Carro carro){
        return carroRepository.adicionar(carro);
    }

    /**
     * Metodo do service responsavel por deletar um modelo de carro da listagem geral
     * @param id do carro a ser deletado
     */
    public void deletar(Integer id){
        carroRepository.deletar(id);
    }

    /**
     * Metodo do service responsavel por atualizar um registro de um modelo de carro da listagem geral
     * @param id do carro há ser atualizado
     * @param carro que ira ser atualizado
     * @return carro atualizado
     */
    public Carro atualizar(Integer id,Carro carro){
        carro.setId(id);
        return carroRepository.atualizar(carro);
    }

    /**
     * Metodo do service responsavel por criar uma base de dados para teste
     * @return mensagem afirmativa
     */
    public String montagemBase(){
        return carroRepository.montagemBase();
    }


}
