package br.senac.go.resources;

import br.senac.go.domain.Pessoa;
import br.senac.go.generics.GenericOperationsResource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //Fala que o controlador vai trabalhar com REST
@RequestMapping(path = "/pessoa")
public class PessoaResource implements
        GenericOperationsResource<Pessoa, Integer> {
    /**
     * Consumes é o que o serviço vai receber (json ou xml)
     * Produces é o que o serviço vai entregar (json ou xml)
     * @param entity
     * @return
     */
    @Override
    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE})
    public Pessoa post(@RequestBody Pessoa entity) {
        return null;
    }

    @Override
    public List<Pessoa> get() {
        return null;
    }

    @Override
    public void put(Pessoa entity, Integer id) {

    }

    @Override
    public void patch(Pessoa entity, Integer id) {

    }

    @Override
    public void delete(Pessoa entity) {

    }

    @Override
    public void deleteById(Integer id) {

    }
}
