package br.com.ifpe.oxefood.modelo.cliente;

//import java.time.LocalDate;
import org.hibernate.annotations.SQLRestriction;

import br.com.ifpe.oxefood.util.entity.EntidadeAuditavel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "EnderecoCliente")
@SQLRestriction("habilitado = true")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

//Exemplo de relacionamento Bidirecional 1-N
public class EnderecoCliente extends EntidadeAuditavel {

   @JsonIgnore //Permite que quando carregue o endereço do cliente não carregue os dados de cliente.
   @ManyToOne
   private Cliente cliente;

   @Column
   private String rua;

   @Column
   private String numero;

   @Column
   private String bairro;
   
   @Column
   private String cep;

   @Column
   private String cidade;

   @Column
   private String estado;

   @Column
   private String complemento;

    
}