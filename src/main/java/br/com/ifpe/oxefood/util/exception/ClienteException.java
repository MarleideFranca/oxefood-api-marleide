package br.com.ifpe.oxefood.util.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//Exceção é uma classe que é subclasse de Exception
//Exceção que é feita e estende de  Exception é uma Exceção checada
//Exceção que é feita e estende de RuntimeException é uma Exceção não checada

@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)//validação de regra de negócio
public class ClienteException extends RuntimeException {
    public static final String  MSG_NOME_DUPLICADO = "Já existe cliente cadastrado para esse nome";

    public ClienteException(String msg) {

	super(String.format(msg));
    }

    
}