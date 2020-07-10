import javax.swing.JOptionPane;

public class DaoImpl implements DaoInterface{


	@Override
	public double CtoF(double tC) {
		// TODO Auto-generated method stub
		
			double tf = tC * 9/5 + 32;
			return tf;
		}
		

	@Override
	public double FtoC(double tF) {
		// TODO Auto-generated method stub
		
			double tc = (tF -32) * 5/9 ;
			double f = Math.round(tc);
			return f;
	}

}
