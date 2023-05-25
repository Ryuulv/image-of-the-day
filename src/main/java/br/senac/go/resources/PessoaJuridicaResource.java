package br.senac.go.resources;

import br.senac.go.domain.PessoaJuridica;
import br.senac.go.generics.GenericOperationsResource;

import java.util.List;

public class PessoaJuridicaResource implements GenericOperationsResource<PessoaJuridica,Integer> {
    @Override
    public PessoaJuridica post(PessoaJuridica entity) {
        return null;
    }

    @Override
    public List<PessoaJuridica> get() {
        return null;
    }

    @Override
    public void put(PessoaJuridica entity, Integer id) {

    }

    @Override
    public void patch(PessoaJuridica entity, Integer id) {

    }

    @Override
    public void delete(PessoaJuridica entity) {

    }

    @Override
    public void deleteById(Integer id) {

    }
}
