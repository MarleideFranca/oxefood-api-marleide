package br.com.ifpe.oxefood.util.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//Exceção é uma classe que é subclasse de Exception
//Exceção que é feita e estende de  Exception é uma Exceção checada
//Exceção que é feita e estende de RuntimeException é uma Exceção não checada

@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)//validação de regra de negócio
public class ProdutoException extends RuntimeException {
    public static final String MSG_VALOR_MINIMO_PRODUTO = "Não é permitido inserir produtos com valores inferiores a R$ 10.";

    public ProdutoException(String msg) {

	super(String.format(msg));
    }

    
}
