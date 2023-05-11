package Player;



public class Img extends ElMult implements Luminosita {

 public int lum  ;
 
 
	public Img(String title,int l) {
		super(title);
		this.lum = l;
		elementiCreati++;		
	}

@Override
	public String toString() {
		return super.toString() + "Img [lum=" + lum + "]";
	}

@Override
public void setUpLum() {
	this.lum++;
	
}

@Override
public void setDownLum() {
	this.lum--;
	
}
public void show() {
	System.out.println("Title" + super.title+ this.lum);
	for (int i=0;i<lum;i++) {
		
		
			System.out.println("*");
		}
	}
}
