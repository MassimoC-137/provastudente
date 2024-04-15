package it.prova.provastudente.test;

import it.prova.provastudente.model.Studente;

public class TestStudente {

	public static void main(String[] args) {
		
		Studente stud1 = new Studente ("Aba", "Ere", 28, 17);
		Studente stud2 = new Studente ("Mar", "Puo", 11, 20);
		Studente stud3 = new Studente ("Mar", "Rea", 12, 29);
		Studente stud4 = new Studente ("Jim", "Lio", 68, 25);
		
		Studente corso[] = {stud1, stud2, stud3, stud4}; 
		
		Studente ioStud = new Studente("Massimo", "C", 29, 27); 
		
		Studente altroStudente = new Studente ("Mar", "Mel", 12, 26);
		
		
		
//		System.out.println(ioStud.sonoTuttiPiuGiovaniDiMe(corso));
//		
//		System.out.println(ioStud.almenoUnoHaLaMediaMiglioreDellaMia(corso));
//
//		System.out.println(ioStud.quantiSonoMieiOmonimiMinorenni(corso));
//		
//		System.out.println(ioStud.quantiHannoLaMediaSopraLaSufficienza(corso));
		
		
		Studente[] ret = Studente.studentiScuolaMediaOmonimi(corso, altroStudente);
		
		for (int i = 0; i < ret.length; i++) {
			System.out.println(ret[i].getNome());
			
		}
	}

}
