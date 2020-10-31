package com.ixcorp.pe.deportes.controller;

import com.ixcorp.pe.deportes.domain.Futbolista;
import com.ixcorp.pe.deportes.service.FutbolistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/futbolistas")
public class FutbolistaController {

    @Autowired
    private FutbolistaService futbolistaService;

    @PostMapping(value="/crearFutbolista")
    public Boolean saveUser(@RequestBody Futbolista futbolista){
         futbolistaService.Create(futbolista);
        return  true;
    }

    @GetMapping(value="/listaFutbolista")
    public List<Futbolista> listaFutbolista(){
        return  futbolistaService.ListarFutbolista();
    }

    @PutMapping(value="/actualizaFutbolista")
    public  void actualizaFutbolista(@RequestBody Futbolista futbolista){
        futbolistaService.ActualizaFutbolista(futbolista);
    }

    @DeleteMapping(value="/eliminarFutbolista")
    public  void eliminarFutbolista(@RequestBody Futbolista futbolista){
        futbolistaService.EliminarFutbolista(futbolista);
    }
}
