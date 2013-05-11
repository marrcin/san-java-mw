package pl.juglodz.losowanie;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.Generated;

public class Generator {

	public List<String> generateImiona(int number) {

		List<String> imiona = new ArrayList<String>();
		imiona.add("Marcin");
		imiona.add("Agnieszka");
		imiona.add("Ala");
		imiona.add("Ola");
		imiona.add("Kazio");

		return imiona;

	}

	public List<String> generateNazwiska(int number) {
		List<String> nazwiska = new ArrayList<String>();
		nazwiska.add("Kowalski");
		nazwiska.add("Nowak");
		nazwiska.add("Ryś");

		return nazwiska;

	}

	private Random losowacz = new Random();

	public List<Osoba> generetaOsoba(int number) {
		List<Osoba> osoby = new ArrayList<Osoba>();
		List<String> imiona = generateImiona(number);
		List<String> nazwiska = generateNazwiska(number);
		for (int i = 0; i < number; i++) {
			Osoba o = new Osoba();
			o.setImie(imiona.get(losowacz.nextInt(imiona.size())));
			o.setNazwisko(nazwiska.get(losowacz.nextInt(nazwiska.size())));

			osoby.add(o);
		}

		return osoby;

	}

	public static void main(String args[]) {
		Generator gr = new Generator();

		List<Osoba> osoby = gr.generetaOsoba(666);
		for (Osoba osoba : osoby) {
			System.out.println(osoba);
			
			
		}
		try {
			zapis.saver(osoby);
		} catch (IOException e) {
			System.out.println("Nie udalo sie zapisac");
			e.printStackTrace();
		}

	}

}
