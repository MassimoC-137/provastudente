package it.prova.provastudente.model;

public class Studente {

	private String nome;
	private String cognome;
	private int eta;
	private int mediaScolastica;

	public Studente() {

	}

	public Studente(String nome, String cognome, int eta, int mediaScolastica) {

		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.mediaScolastica = mediaScolastica;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public int getMediaScolastica() {
		return mediaScolastica;
	}

	public void setMediaScolastica(int mediaScolastica) {
		this.mediaScolastica = mediaScolastica;
	}

	public boolean sonoTuttiPiuGiovaniDiMe(Studente[] corso) {

		for (int i = 0; i < corso.length; i++) {
			if (this.eta < corso[i].getEta()) {
				return false;
			}
		}
		return true;
	}

	public boolean almenoUnoHaLaMediaMiglioreDellaMia(Studente[] corso) {

		for (int i = 0; i < corso.length; i++) {
			if (this.mediaScolastica < corso[i].getMediaScolastica()) {
				return true;
			}
		}
		return false;
	}

	public int quantiSonoMieiOmonimiMinorenni(Studente[] corso) {

		int quantiStudenti = 0;
		for (int i = 0; i < corso.length; i++) {
			if (this.nome.charAt(0) == corso[i].getNome().charAt(0)) {
				if (18 > corso[i].getEta()) {
					quantiStudenti++;
				}
			}
		}
		return quantiStudenti;
	}

	public int quantiHannoLaMediaSopraLaSufficienza(Studente[] corso) {

		int quantiStudenti = 0;
		for (int i = 0; i < corso.length; i++) {
			if (corso[i].getMediaScolastica() > 18) {
				quantiStudenti++;
			}
		}
		return quantiStudenti;
	}

	public static Studente[] studentiScuolaMediaOmonimi(Studente[] corso, Studente altroStudente) {
		 
		int lunghezza = 0; 
		for (int i = 0; i < corso.length; i++) {
			if (corso[i].getEta() > 10 && corso[i].getEta() < 14 && corso[i].getNome().equals(altroStudente.getNome())) {
				lunghezza ++; 
				}
			}
		
		int index = 0; 
		Studente[] quantiStudenti = new Studente[lunghezza];
		for (int i = 0; i < corso.length; i++) {
			if (corso[i].getEta() > 10 && corso[i].getEta() < 14 && corso[i].getNome().equals(altroStudente.getNome())) {
				quantiStudenti[index] = corso[i]; 
				index ++; 
			}
			
		}
		return quantiStudenti; 
		
	}
	
}







