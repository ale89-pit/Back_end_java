package Player;

public class Audio extends ElMult implements Volume{
	protected int vol ;
	private int durata;
	public Audio(String title,int v) {
		super(title);
		this.vol = v;
		elementiCreati++;
	}
	@Override
	public String toString() {
		return super.toString() + "Audio [vol=" + vol + "]";
	}
	@Override
	public void setUpVol() {
		this.vol--;
		
	}
	@Override
	public void setDownVol() {
		this.vol++;
		
	}
	 public int getDurata(){
	        return this.durata;
	    }
	public void setDurata(int durata){
	        this.durata=durata;
	    }
	
	public void play() {
		for (int i=0;i<vol;i++) {
			System.out.println("Title" + super.title + this.vol + this.vol);
			for(int j=0;j<durata;j++) {
				System.out.println("!");
			}
		}

	}
}
