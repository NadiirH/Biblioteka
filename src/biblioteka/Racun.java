package biblioteka;

public class Racun {
	
	// stanja objekta
	private int brojRacuna;
	private String imeMusterije;
	private int brojPosudjenihKnjiga = 0;
	
	// konstruktori
	Racun() {
		
	}
	
	Racun(int brojRacuna, String imeMusterije) {
			this.brojRacuna = brojRacuna;
			this.imeMusterije = imeMusterije;
	}
		
	// getteri, setteri
	@Override
	public String toString() {
		return "Broj racuna = " + brojRacuna + ", ime musterije = " + imeMusterije + ", broj posudjenih knjiga = "
				+ brojPosudjenihKnjiga;
	}

	public void setBrojPosudjenihKnjiga(int brojPosudjenihKnjiga) {
		this.brojPosudjenihKnjiga = brojPosudjenihKnjiga;
	}

	public int getBrojPosudjenihKnjiga() {
		return brojPosudjenihKnjiga;
	}

	public int getBrojRacuna() {
		return brojRacuna;
	}
	
	public static Racun getRacun(int brojRacuna) {
		
		for (int i = 0; i < UI.racuni.size(); i++) {
			if (UI.racuni.get(i).getBrojRacuna() == brojRacuna) 
				return UI.racuni.get(i);
		}
		
		return null;	
	}
}
