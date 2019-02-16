package studentInfoApp;

public class modExtraCurricular extends extraCurricular {

	double regFee=200;
	public double extraCurricular(double music, double dance) {
		double total=music+dance+regFee;
		return total;
		
	}
	
	public double extraCurricular(double music, double dance, double chess) {
		double total=music+dance+chess+regFee;
		return total;
}
	public double extraCurricular(double music, double dance, double chess, double swimming) {
		double total=music+dance+chess+swimming+regFee;
		return total;	
}
}
