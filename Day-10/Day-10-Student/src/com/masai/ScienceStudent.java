package com.masai;

public class ScienceStudent extends Stundent{
	
	public ScienceStudent(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
	int	phisicsMarks;
	int	chemistryMarks;
	int mathsMarks;
	
	@Override
	public String toString() {
		return "ScienceStudent [phisicsMarks=" + phisicsMarks + ", chemistryMarks=" + chemistryMarks + ", mathsMarks=" + mathsMarks +  ", name=" + this.name +  ", address=" + this.address + "]";
	}
	public int getPhisicsMarks() {
		return phisicsMarks;
	}
	public void setPhisicsMarks(int phisicsMarks) {
		this.phisicsMarks = phisicsMarks;
	}
	public int getChemistryMarks() {
		return chemistryMarks;
	}
	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}
	public int getMathsMarks() {
		return mathsMarks;
	}
	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}
	@Override
	public int getPercentage() {
		// TODO Auto-generated method stub
		float Percentage=(getPhisicsMarks()+ getChemistryMarks()+ getMathsMarks() )/3;
		return (int)Percentage;
	}

}
