package javaProject;

public class Melon {
	private  String type;
	private  String weight ;
	
	public String getType() {
		return type;
	}
	public String getWeight() {
		return weight;
	}
	/*public Melon( String type,int weight) {
		this.type=type;
		this.weight=weight;
		
	}*/
	public Melon(String type, String weight) {
		
		this.type = type;
		this.weight = weight;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	public boolean equals(Melon obj) {
		//this.type.equals( obj.type);
		//this.weight.equals(this.weight);
		if(this == obj)
		  //return  true;
		return false;
		return false;
	}
	
	  

}
