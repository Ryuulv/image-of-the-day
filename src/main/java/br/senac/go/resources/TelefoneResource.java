package br.senac.go.resources;

import br.senac.go.domain.Telefone;
import br.senac.go.generics.GenericOperationsResource;

import java.util.List;

public class TelefoneResource  implements GenericOperationsResource<Telefone,Integer> {
    @Override
    public Telefone post(Telefone entity) {
        return null;
    }

    @Override
    public List<Telefone> get() {
        return null;
    }

    @Override
    public void put(Telefone entity, Integer id) {

    }

    @Override
    public void patch(Telefone entity, Integer id) {

    }

    @Override
    public void delete(Telefone entity) {

    }

    @Override
    public void deleteById(Integer id) {

    }
}
