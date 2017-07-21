3 Assignment 3

## Objectives
	1. Create a dataReader abstract class with getHeader,getColumnType and getDataRow methods
	
	2. Extend this abstract class to create a CSVDataReader that implements these methods for CSV files
	   The constructor of this class takes the filename to be read
	   
	3. Implement the getHeader method to return a Header object that in turn extends array.
	   Change the dataMunger code to get the header object from the CSVdataReader and print it
	   
	4. Implement exception handling for the DataReader
	
	5. Implement the getColumnType method. getColumnType is useful to understand the type system. The intent is 
    	that when file reader reads a value, it is as a string, but then needs to be cast to the appropriate type for operations such as sum etc.
	   We can read the first line after the header and figure out the type of each column by testing against the type