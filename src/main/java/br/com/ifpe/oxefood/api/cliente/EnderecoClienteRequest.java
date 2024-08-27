package br.com.ifpe.oxefood.api.cliente;

import br.com.ifpe.oxefood.modelo.cliente.EnderecoCliente;
//import java.time.LocalDate;
import jakarta.validation.constraints.NotBlank;

//import com.fasterxml.jackson.annotation.JsonFormat;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class EnderecoClienteRequest {

   @NotBlank(message = "A rua é de preenchimento obrigatório")
    private String rua;

   private String numero;

   private String bairro;

   private String cep;

   private String cidade;

   private String estado;

   private String complemento;

   public EnderecoCliente build() {

       return EnderecoCliente.builder()
               .rua(rua)
               .numero(numero)
               .bairro(bairro)
               .cep(cep)
               .cidade(cidade)
               .estado(estado)
               .complemento(complemento)
               .build();
   }

    
}
