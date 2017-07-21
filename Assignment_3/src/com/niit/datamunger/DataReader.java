package com.niit.datamunger;


public abstract class DataReader {

	public abstract Header getCSVHeader();
	public abstract String [] getHeaderDataType();
	public abstract String[] getData();
}
