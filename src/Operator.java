
public enum Operator {
	ADD, SUBTRACT, MULTIPLY, DIVIDE, EXP, SIN, COS, LOG;
	
	@Override
	public String toString(){
		if(this == ADD) {
			return " + ";
		}
		if(this == SUBTRACT) {
			return " - ";
		}
		if(this == MULTIPLY) {
			return " * ";
		}
		if(this == DIVIDE) {
			return " / ";
		}
		if(this == EXP){
			return " e^";
		}
		if(this == SIN){
			return " Sin[";
		}
		if(this == COS){
			return " Cos[";
		}
		if(this == LOG){
			return " Log[";
		}
		return "unknown";
	}

}
