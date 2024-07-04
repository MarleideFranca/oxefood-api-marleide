package br.com.ifpe.oxefood.api.entregador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifpe.oxefood.modelo.entregador.entregador;
import br.com.ifpe.oxefood.modelo.entregador.entregadorService;

@RestController
@RequestMapping("/api/entregador")
@CrossOrigin
public class entregadorController {

   @Autowired
   private entregadorService entregadorService;

   @PostMapping
   public ResponseEntity<entregador> save(@RequestBody entregadorRequest request) {

       entregador entregador = entregadorService.save(request.build());
       return new ResponseEntity<entregador>(entregador, HttpStatus.CREATED);
   }
}
