/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.evaluacion2.service;

import com.example.evaluacion2.model.Trabajador;
import com.example.evaluacion2.repository.TrabajadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Jeanc
 */
@Service
public class TrabajadorService {

    @Autowired
    private TrabajadorRepository repository;

    public List<Trabajador> listarTodos() {
        return repository.findAll();
    }

    public void guardar(Trabajador trabajador) {
        repository.save(trabajador);
    }

    public Optional<Trabajador> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}