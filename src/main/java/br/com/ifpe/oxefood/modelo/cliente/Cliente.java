package br.com.ifpe.oxefood.modelo.cliente;

import java.time.LocalDate;
import org.hibernate.annotations.SQLRestriction;

import br.com.ifpe.oxefood.util.entity.EntidadeAuditavel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Cliente")
@SQLRestriction("habilitado = true")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Cliente extends EntidadeAuditavel  {

    @OneToMany(mappedBy = "cliente", orphanRemoval = true, fetch = FetchType.EAGER)
   private List<EnderecoCliente> enderecos;

  //validações de banco de dados são colocadas nas entidades de estruturas e dentro do @Column
    @Column (nullable = false, length = 100)//O campo nome não poderá ser nulo e não pode pode ter mais que 100 caracteres ao ser salvo no banco de dados.
    private String nome;
 
    @Column
    private LocalDate dataNascimento;
 
    @Column (unique = true)//O campo cpf é único no banco de dados, ou seja, não poderá ser salvo um cliente com um CPF que já exista em algum outro cliente no banco de dados.
    private String cpf;
 
    @Column
    private String foneCelular;
 
    @Column
    private String foneFixo;
 

}


