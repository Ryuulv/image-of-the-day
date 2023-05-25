package br.senac.go.resources;

import br.senac.go.domain.Contato;
import br.senac.go.generics.GenericOperationsResource;

import java.util.List;

public class ContatoResource implements GenericOperationsResource<Contato,Integer> {
    @Override
    public Contato post(Contato entity) {
        return null;
    }

    @Override
    public List<Contato> get() {
        return null;
    }

    @Override
    public void put(Contato entity, Integer id) {

    }

    @Override
    public void patch(Contato entity, Integer id) {

    }

    @Override
    public void delete(Contato entity) {

    }

    @Override
    public void deleteById(Integer id) {

    }
}
