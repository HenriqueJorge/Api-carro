package com.carro.carro.controller;

import org.springframework.web.bind.annotation.RestController;

import com.carro.carro.model.Carro;
import com.carro.carro.service.CarroService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/carros")
public class CarroController {

    @Autowired
    private CarroService carroService;

    @GetMapping
    public List<Carro> obterTodos(){
        return carroService.obterTodos();
    }

    @GetMapping("/start")
    public String montagemBase(){
        return carroService.montagemBase();
    }

    @GetMapping("/{id}")
    public Optional<Carro> obterUmCarro(@PathVariable Integer id){
        return carroService.obterUmCarro(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id){
        carroService.deletar(id);
    }

    @PutMapping("/{id}")
    public Carro atualizar(@PathVariable Integer id, @RequestBody Carro carro){
        return carroService.atualizar(id,carro);
    }

    @PostMapping
    public Carro adicionar(@RequestBody Carro carro){
        return carroService.adicionar(carro);
    }
    
    
}
