package com.kirian.wail.azure.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Temp {

	public static void main(final String[] args) {
		BufferedReader reader;

		try {
			reader = new BufferedReader(new FileReader("C:\\Users\\dawn_treader\\Desktop\\subdomains.txt"));
			String line = reader.readLine();

			while (line != null) {

				if (line.contains("eatoncanada.ca")) {
					System.out.println(line);
				}
				line = reader.readLine();
			}

			reader.close();
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

}
