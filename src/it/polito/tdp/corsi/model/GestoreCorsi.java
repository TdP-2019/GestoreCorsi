package it.polito.tdp.corsi.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import it.polito.tdp.corsi.db.CorsoDAO;
import it.polito.tdp.corsi.db.StudenteDAO;
import it.polito.tdp.corsi.model.Corso;

public class GestoreCorsi {

	public List<Corso> getCorsiByPeriodo(int periodo) {
		CorsoDAO dao = new CorsoDAO();
		
		//Soluzione 1
		/*List<Corso> corsi = dao.listAll();
		List<Corso> result = new ArrayList<Corso>();
		
		for(Corso c : corsi) {
			if(c.getPd() == periodo) {
				result.add(c);
			}
		}*/
		
		//Soluzione 2
		return dao.listCorsiByPD(periodo);
	}
	
	
	public Map<Corso, Integer> getIscrittiCorsi(int periodo){
		CorsoDAO dao = new CorsoDAO();
		return dao.getIscrittiCorsi(periodo);
	}


	public List<Studente> elencaStudenti(String codins) {
		StudenteDAO dao = new StudenteDAO();
		return dao.elencaStudenti(codins);
	}

}
