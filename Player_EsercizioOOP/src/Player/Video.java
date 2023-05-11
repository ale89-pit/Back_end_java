package Player;

public class Video extends ElMult implements Volume,Luminosita {
	public int vol ;
	public int lum ;
	private int durata = 3;


	public Video(String title,int vol,int lum) {
		super(title);
		this.vol = vol;
		this.lum = lum;
		
		elementiCreati ++;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + "Video [vol=" + vol + ", lum=" + lum + "]";
	}


	@Override
	public void setUpLum() {
		this.lum--;
		
		
	}


	@Override
	public void setDownLum() {
		this.lum--;
		
	}


	@Override
	public void setUpVol() {
		this.vol++;
		
	}


	@Override
	public void setDownVol() {
		this.vol--;
		
	}
	 public int getDurata(){
	        return this.durata;
	    }
	 public void setDurata(int durata){
	        this.durata=durata;
	    }


	public void play() {
		for (int i=0;i<vol;i++) {
			System.out.println("Title" + super.title + this.durata + this.lum + this.vol);
			for(int j=0;j<durata;j++) {
				System.out.println("!");
			}
		}
	}




}	
