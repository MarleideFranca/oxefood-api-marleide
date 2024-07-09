package br.com.ifpe.oxefood.api.entregador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifpe.oxefood.api.cliente.ClienteRequest;
import br.com.ifpe.oxefood.modelo.cliente.Cliente;
import br.com.ifpe.oxefood.modelo.entregador.entregador;
import br.com.ifpe.oxefood.modelo.entregador.entregadorService;

import java.util.List;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/entregador")
@CrossOrigin
public class entregadorController {

    @Autowired
    private entregadorService entregadorService;

    @Operation(
        summary = "Serviço responsável por incluir um entregador no sistema.",
        description = "Exemplo de descrição de um endpoint responsável por inserir um entregador no sistema."
    )

    @PostMapping
    public ResponseEntity<entregador> save(@RequestBody entregadorRequest request) {

        entregador entregador = entregadorService.save(request.build());
        return new ResponseEntity<entregador>(entregador, HttpStatus.CREATED);
    }

    @Operation(
        summary = "Serviço responsável por listar um entregador no sistema.",
        description = "Exemplo de descrição de um endpoint responsável por listar um entregador no sistema."
    )

    @GetMapping
    public List<entregador> listarTodos() {
        return entregadorService.listarTodos();
    }

    @GetMapping("/{id}")
    public entregador obterPorID(@PathVariable Long id) {
        return entregadorService.obterPorID(id);
    }

    @Operation(
        summary = "Serviço responsável por alterar um entregador no sistema.",
        description = "Exemplo de descrição de um endpoint responsável por alterar um entregador no sistema."
    )

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> update(@PathVariable("id") Long id, @RequestBody entregadorRequest request) {

        entregadorService.update(id, request.build());
        return ResponseEntity.ok().build();
    }

    @Operation(
        summary = "Serviço responsável por deletar um entregador no sistema.",
        description = "Exemplo de descrição de um endpoint responsável por deletar um entregador no sistema."
    )

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        entregadorService.delete(id);
        return ResponseEntity.ok().build();
    }

}
