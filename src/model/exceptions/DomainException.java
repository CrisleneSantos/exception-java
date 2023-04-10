package model.exceptions;

// extends exception ou runTimeExeception(Nao é obrigado a tratar a exception
// com o runTime não da arro sem catch sem da

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;  
		
	public DomainException(String msg) {
		super(msg);
	}

}
