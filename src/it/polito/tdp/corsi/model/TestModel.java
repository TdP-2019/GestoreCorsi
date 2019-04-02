package it.polito.tdp.corsi.model;

import java.util.Map;
import java.util.Map.Entry;

public class TestModel {

	public void run() {
		GestoreCorsi model = new GestoreCorsi();
		
		Map<Corso,Integer> res = model.getIscrittiCorsi(1);
		
		for(Entry entry : res.entrySet()) {
			System.out.println(((Corso)entry.getKey()).getNome() + "=" + entry.getValue());
		}
	}
	
	public static void main(String[] args) {
		TestModel main = new TestModel();
		main.run();
	}

}
