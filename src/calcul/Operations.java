package calcul;

public class Operations {
	private float nombre1;
	private float nombre2;
	private String choix ;
	
	public Operations() {
		this.nombre1 =  0.0f;
		this.nombre2 =  0.0f;
		this.choix = "+";
		
	}
	public float getNombre1() {
		return nombre1;
	}
	
	public float getNombre2() {
		return nombre2;
	}
	
	public void setNombre1(float nombre1) {
		this.nombre1 = nombre1;
	}
	
	public void setNombre2(float nombre2) {
		this.nombre2 = nombre2;
	}

	public void setChoix(String choix) {
		this.choix = choix;
	}
	
	public String getChoix() {
		return choix;
	}
	public float addition() {
		return this.nombre1 + this.nombre2;
	}
	
	public float soustraction() {
		return this.nombre1 - this.nombre2;
	}
	
	public float multiplication() {
		return this.nombre1 * this.nombre2;
	}
	
	public float division() {
		return this.nombre1/this.nombre2;
	}
	
	public float calculer() {
		switch (this.choix) {
		case "+": {
			return addition();
		}
		case "-":{
			return soustraction();
		}
		case "*": {
			return multiplication();
		}
		case "/":{
			return division();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + this.choix) ;
		}
	
	}
	
}
