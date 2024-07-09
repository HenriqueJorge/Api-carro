package com.carro.carro.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.carro.carro.model.Carro;

@Repository
public class CarroRepository {

    private List<Carro> carros = new ArrayList<Carro>();
    private Integer ultimoId = 0;

    /**
     * Metodo responsavel por retornar uma lista de carros
     * @return
     */
    public List<Carro> obterTodos(){
        return carros;
    }

    /**
     * Motodo responsavel por retorna um carro especifico da lista
     * @param id do modelo do carro
     * @return um carro especifico
     */
    public Optional<Carro> obterUmCarro(Integer id){
        return carros.stream().filter(carro -> carro.getId() == id).findFirst();
    }

    /**
     * Metodo responsavel por adicionar um modelo de carro a lista 
     * @param carro que ira se adicionado
     * @return
     */
    public Carro adicionar(Carro carro){
        ultimoId++;
        carro.setId(ultimoId);
        carros.add(carro);
        return carro;
    }

    /**
     * Metodo responsavel por deletar um modelo de carro da lista
     * @param id do carro há ser deletado
     */
    public void deletar(Integer id){
        carros.removeIf(carro -> carro.getId() == id);
    }

    /**
     * Metodo responsavel por atualizar um registro de carro na lista geral
     * @param carro que ira se arualizado
     * @return carro atualizado
     */
    public Carro atualizar(Carro carro){
        Optional<Carro> oldCarro = obterUmCarro(carro.getId());
        if(oldCarro.isEmpty()){
            return new Carro();
        } 
        deletar(carro.getId());
        carros.add(carro);
        return carro;
    }

    /**
     * Metodo responsavel por cria uma base de dados para testes
     * @return mensagem afirmativa da criação de base
     */
    public String montagemBase(){
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();

        carro1.setModelo("Fiat uno");
        carro1.setValor(100000.0);
        carro1.setStep(false);
        carro1.setObservacao("É du bom");
        adicionar(carro1);

        carro2.setModelo("Fiat ferrari");
        carro2.setValor(9999999.0);
        carro2.setStep(true);
        carro2.setObservacao("Esse é massa");
        adicionar(carro2);

        carro3.setModelo("Chevete");
        carro3.setValor(15000.0);
        carro3.setStep(true);
        carro3.setObservacao("Ninguem da valor mas é bom");
        adicionar(carro3);

        return "Base de testes criada";

    }
    
}
