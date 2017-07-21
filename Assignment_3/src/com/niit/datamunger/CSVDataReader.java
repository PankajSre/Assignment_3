package com.niit.datamunger;

import java.io.BufferedReader;
import java.io.FileReader;

public class CSVDataReader extends DataReader {

	BufferedReader bufferedReader;
	String fileName;

	public CSVDataReader(String fileName) {
		this.fileName = fileName;
	}


	@Override
	public String[] getHeaderDataType() {

		return null;
	}
	
	public  String[] getData()
	{
		return null;
	}
	public static boolean isNumeric(String column)
	{
		return false;
	}


	@Override
	public Header getCSVHeader() {
		
		return null;
	}
}
