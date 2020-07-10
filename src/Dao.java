
public class Dao {
	double tF;
	double tC;
	double tf;
	double tc;
	public Dao(double tF, double tC, double tf2, double tc2) {
		super();
		this.tF = tF;
		this.tC = tC;
		tf = tf2;
		tc = tc2;
	}
	public double gettF() {
		return tF;
	}
	public void settF(double tF) {
		this.tF = tF;
	}
	public double gettC() {
		return tC;
	}
	public void settC(double tC) {
		this.tC = tC;
	}
	public double getTf() {
		return tf;
	}
	public void setTf(double tf) {
		this.tf = tf;
	}
	public double getTc() {
		return tc;
	}
	public void setTc(double tc) {
		this.tc = tc;
	}
	
	

}
