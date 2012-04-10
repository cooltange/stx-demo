package com.stx.s1.p291jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		Properties ptes = new Properties();
		ptes.load(new FileReader("d:\\dbcfg.properties"));
		System.out.println(ptes.getProperty("driver"));
	}

}
