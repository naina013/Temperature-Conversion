

public class conversionValidate {
	public boolean Validateempty(String data) {
		
		return (data.equals("")) ? false : true;
		
		
	}
	public boolean Validateinput(String data) {
		if(data.matches("^[-+]?\\d+(\\.\\d+)?$")){
			return true;
		}
		return false;
	}
	
	public boolean ValidatenC(String inputTemp) {
		
		double ctemp=Double.parseDouble(inputTemp);
	
		if(ctemp >= -273.15 && ctemp <= 100) {
			return true;
		}
		
		return false;	
		}
	public boolean ValidatenF(String inputTemp) {
		
			double ctemp=Double.parseDouble(inputTemp);
			
			if(ctemp > -461 && ctemp <= 212 ) {
				return true;
			}
		
			return false;	
		}
	
	

}
