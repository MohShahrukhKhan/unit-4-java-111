package com.masai;

public class HistoryStudent extends Stundent{



int	historyMarks;
int	civicsMarks;
	

@Override
public String toString() {
	return "HistoryStudent [historyMarks=" + historyMarks + ", civicsMarks=" + civicsMarks +  ", name=" + this.name +  ", address=" + this.address +  "]";
}


public int getHistoryMarks() {
	return historyMarks;
}


public void setHistoryMarks(int historyMarks) {
	this.historyMarks = historyMarks;
}


public int getCivicsMarks() {
	return civicsMarks;
}


public void setCivicsMarks(int civicsMarks) {
	this.civicsMarks = civicsMarks;
}


public HistoryStudent(String name, String address) {
	super(name, address);
	// TODO Auto-generated constructor stub
}


	@Override
	public int getPercentage() {
		float Percentage=(getCivicsMarks()+getHistoryMarks())/2;
		return (int)Percentage;
	}

}
