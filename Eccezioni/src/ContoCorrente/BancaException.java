package ContoCorrente;

public class BancaException extends Exception {
	public String msg;

	public BancaException(String msg) {
		super(msg);
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "BancaException [msg=" + msg + "]";
	}
	
}
