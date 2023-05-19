package entity;

import javax.persistence.Entity;

@Entity

public class PartitaDiCalcio extends Evento {
	
	private String squadraCasa; 
	private String squadraOspite; 
	private String SquadraVincente = null;  
	private Integer numeroGolSquadraCasa = 0;
	private Integer numeroGolSquadraOspite = 0;
	
	public PartitaDiCalcio(String squadraCasa, String squadraOspite, String squadraVincente,
			Integer numeroGolSquadraCasa, Integer numeroGolSquadraOspite) {
		super();
		this.squadraCasa = squadraCasa;
		this.squadraOspite = squadraOspite;
		SquadraVincente = squadraVincente;
		this.numeroGolSquadraCasa = numeroGolSquadraCasa;
		this.numeroGolSquadraOspite = numeroGolSquadraOspite;
	}
	
	
	public PartitaDiCalcio() {
		super();
	}


	public String getSquadraCasa() {
		return squadraCasa;
	}



	public void setSquadraCasa(String squadraCasa) {
		this.squadraCasa = squadraCasa;
	}



	public String getSquadraOspite() {
		return squadraOspite;
	}



	public void setSquadraOspite(String squadraOspite) {
		this.squadraOspite = squadraOspite;
	}



	public String getSquadraVincente() {
		return SquadraVincente;
	}



	public void setSquadraVincente(String squadraVincente) {
		SquadraVincente = squadraVincente;
	}



	public Integer getNumeroGolSquadraCasa() {
		return numeroGolSquadraCasa;
	}



	public void setNumeroGolSquadraCasa(Integer numeroGolSquadraCasa) {
		this.numeroGolSquadraCasa = numeroGolSquadraCasa;
	}



	public Integer getNumeroGolSquadraOspite() {
		return numeroGolSquadraOspite;
	}



	public void setNumeroGolSquadraOspite(Integer numeroGolSquadraOspite) {
		this.numeroGolSquadraOspite = numeroGolSquadraOspite;
	}

	@Override
	public String toString() {
		return "PartitaDiCalcio [squadraCasa=" + squadraCasa + ", squadraOspite=" + squadraOspite + ", SquadraVincente="
				+ SquadraVincente + ", numeroGolSquadraCasa=" + numeroGolSquadraCasa + ", numeroGolSquadraOspite="
				+ numeroGolSquadraOspite + "]";
	}




	
	
	
	
}
