package com.udemy.api;

import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/clientes")
public class MeuResource {

    @PostMapping
    public ResponseEntity salvar(@RequestBody Cliente cliente) {
        //service.save(cliente);
        return new ResponseEntity(cliente, HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        //servico.buscarPorId()
        //servico.delete()
    }

    @PutMapping("{id}")
    public Cliente atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
        //servico.buscaPorId(id);
        //servico.update(cliente);
        return cliente;
    }
    //    @RequestMapping( value = "/api/clientes/{id}", method = RequestMethod.GET)
    @GetMapping("{id}")
    public Cliente obterDadosCliente(@PathVariable Long id) {
        System.out.println(String.format("Id recebido via url: %d", id));
        Cliente cliente = new Cliente("fulana","000.000.000-00");
        return cliente;

    }
}
