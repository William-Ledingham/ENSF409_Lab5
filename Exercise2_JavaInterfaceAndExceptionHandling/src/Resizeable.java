
public interface Resizeable {
	
	static double LIMIT = 10;
	public void shrink(double divisor) throws SizeFactorException;
	public void enlarge(double multiplier) throws SizeFactorException;
}
