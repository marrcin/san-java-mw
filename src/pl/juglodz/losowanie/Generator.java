package pl.juglodz.losowanie;

import java.util.ArrayList;
import java.util.List;

public class Generator {
	
	public List<String> generateImiona(int number){
	
	List<String> imiona = new ArrayList<String>();
	imiona.add("Marcin");
	imiona.add("Agnieszka");
	imiona.add("Ala");
	imiona.add("Ola");
	imiona.add("Kazio");
	
	return imiona;
	
	}
	
	public List<String> generateNazwiska(int number){
	List<String> nazwiska = new ArrayList<String>();
	nazwiska.add("Kowalski");
	nazwiska.add("Nowak");
	nazwiska.add("Ryś");
	
	return nazwiska;
	
	}
	
	
	

}
