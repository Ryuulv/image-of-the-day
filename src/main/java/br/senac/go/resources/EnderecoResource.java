package br.senac.go.resources;

import br.senac.go.domain.Endereco;
import br.senac.go.generics.GenericOperationsResource;

import java.util.List;

public class EnderecoResource implements GenericOperationsResource<Endereco,Integer> {
    @Override
    public Endereco post(Endereco entity) {
        return null;
    }

    @Override
    public List<Endereco> get() {
        return null;
    }

    @Override
    public void put(Endereco entity, Integer id) {

    }

    @Override
    public void patch(Endereco entity, Integer id) {

    }

    @Override
    public void delete(Endereco entity) {

    }

    @Override
    public void deleteById(Integer id) {

    }
}
