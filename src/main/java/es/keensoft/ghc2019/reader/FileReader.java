package es.keensoft.ghc2019.reader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import es.keensoft.ghc2019.model.Photo;

public class FileReader {
	public static List<Photo> readFile(String path) throws IOException {
		List<Photo> photos = new ArrayList<Photo>();
		System.out.println("Reading file '" + path + "'...");

		Scanner scanner = new Scanner(new File(path));
		int lineNumber = 0;
		int expectedNumber = 0;
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			if (lineNumber == 0) {
				expectedNumber = Integer.parseInt(line);
				System.out.println("Expected " + expectedNumber + " photos...");
			} else {
				String[] lineContent = line.split(" ");
				Photo photo = new Photo(lineNumber -1, lineContent);
				photos.add(photo);
				System.out.println("\tAdded: " + photo);
			}
			lineNumber++;
		}
		scanner.close();

		System.out.println(
				"Expected items: '" + expectedNumber + "', lines parsed: '" + lineNumber + "', result items: '" + photos.size() + "'");
		return photos;
	}
}
