import java.text.DecimalFormat;

import java.util.*;

import java.io.*;

import javax.swing.JOptionPane;

public class Lab1O {

private double [][] data;

// rows = data.length;

// cols = data[i].length;

public static void main( String [] args )throws IOException

{

Lab1O fileTest = new Lab1O();fileTest.readData();

fileTest.writeData();

}

public void readData() throws IOException {

Scanner console = new Scanner( System.in );

String outMsg = "Enter the input data filename: ";

String inFile = JOptionPane.showInputDialog( outMsg );

File file = new File( inFile ); // connect to the file

Scanner tokens = new Scanner( file ); // buffer the data

int nrows = tokens.nextInt(); // get the number of rows.

int ncols = tokens.nextInt();// 1. get the number of cols.

data=new double[nrows][ncols];// 2. allocate space for the 2-d data

for(int i=0;i<nrows;i++){

for(int j=0;j<ncols;j++){

data[i][j]=tokens.nextDouble();

}

}// 3. write a nested loop to read the data

tokens.close();// 4. close the file:

}// end readData()

public void writeData() throws IOException {

//array instance field:

//data into the data array.

// 1. prompt the user for a file name to write.

// 2. Allocate the file and allow buffering with printf // 3. write the number of rows into the file

// 4. write the number of cols into the file

// 5. //

//

// 6.

// 7. Write your name into the file.

// 8. close the file.

//Format the output using format-elements, numbers should be aligned on the decimal point and rounded to 4 digits to the right of the decimal.

//use a nested loop to write data stored in the data array.

DecimalFormat df = new DecimalFormat("####0.0000");

Scanner console = new Scanner( System.in );

String outMsg = "Enter the output data filename: ";

String inFile = JOptionPane.showInputDialog( outMsg );

FileWriter file = new FileWriter( inFile ); // connect to the file

for(int i=0;i<data.length;i++){

for(int j=0;j<data[i].length;j++){

file.write(df.format(data[i][j])+"");

file.write("\r\n");

}

}// 3. write a nested loop to read the data

file.write("name :");

file.close();

JOptionPane.showMessageDialog(null, "content has writen to output file");

} // end of writeData

} 