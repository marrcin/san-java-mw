package pl.juglodz.losowanie;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class zapis {
	public static void saver(List<Osoba> osoby) throws IOException {

		FileOutputStream saveFile = new FileOutputStream("plik.txt");
		
		ObjectOutputStream save = new ObjectOutputStream(saveFile);
		for (Osoba osoba2 : osoby) {

			save.writeUTF(osoba2.getImie() + " ; " + osoba2.getNazwisko());
			
		}

		save.close();

		/*
		 * FileOutputStream saveFileXml = new FileOutputStream("plikXml.xml");
		 * 
		 * ObjectOutputStream saveXml = new ObjectOutputStream(saveFileXml); for
		 * (Osoba osoba2 : osoby) {
		 * 
		 * saveXml.writeUTF("<osoba><imie>" + osoba2.getImie() +
		 * "</imie><nazwisko>" + osoba2.getNazwisko() + "</nazwisko></osoba>");
		 * }
		 * 
		 * saveXml.close();
		 */
	}

}
