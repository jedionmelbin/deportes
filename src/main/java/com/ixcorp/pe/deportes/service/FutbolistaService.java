package com.ixcorp.pe.deportes.service;

import com.ixcorp.pe.deportes.domain.Futbolista;
import com.ixcorp.pe.deportes.respository.IFutbolistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FutbolistaService {

    @Autowired
    private IFutbolistaRepository futbolistaRepository;


    public void Create(Futbolista futbolista) {
        try {

            futbolistaRepository.save(futbolista);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public List<Futbolista> ListarFutbolista(){

        try {
            return  futbolistaRepository.findAll();
        }catch (Exception ex){
            ex.printStackTrace();
            throw  ex;
        }

    }

    public void  ActualizaFutbolista(Futbolista futbolista)
    {
        try {

            futbolistaRepository.save(futbolista);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw  ex;
        }
    }

    public void  EliminarFutbolista(Futbolista futbolista)
    {
        try {

            futbolistaRepository.delete(futbolista);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw  ex;
        }
    }
}
