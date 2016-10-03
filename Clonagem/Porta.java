
public class Porta implements Cloneable {
	private double altura, largura;
	private boolean aberta;
	
	public Porta(double altura, double largura){
		this.altura = altura;
		this.largura = largura;
	}
	public void abrir(){
		this.aberta = true;
	}
	
	public void fechar(){
		this.aberta = false;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
	public boolean isAberta() {
		return aberta;
	}
	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}
}
