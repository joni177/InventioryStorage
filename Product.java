package proj;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
//import currentDateTime checker to check if holidays are coming up
public class Product implements Serializable{
	 private static final long serialVersionUID = 1L;
	String name;
	 String expDate; //Changed date to string value,later improve with string patterns to check correct dates
	 int quant;
	 double value;

	/*static ArrayList<String> inv = new ArrayList<>();
	static ArrayList<String> inv1 = new ArrayList<>();*/
	Product(String name, String expDate, int quant, int value) {
		this.name = name;
		this.expDate = expDate;
		this.quant = quant;
		this.value = value;
	}

	//generated the getters and setter again for the class attributes
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getExpDate() {
		return expDate;
	}


	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	

	//Modified toString method
	public String toString() {
		return getName() + ", " + getExpDate()+", "+getQuant()+", "+getValue();
	}
}
