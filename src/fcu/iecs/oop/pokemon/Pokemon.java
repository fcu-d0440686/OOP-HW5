package fcu.iecs.oop.pokemon;

public class Pokemon {
	
	private String name;
	private int cp;
	public Pokemon(){
	}
	public Pokemon(String name,int cp){
		this.name=name;
		this.cp=cp;
	}
	public String getName(){
		return name;
	}
	public void setCp(int Cp){
		this.cp = Cp;
	}
	public int getCp(){
		return cp;
	}
}