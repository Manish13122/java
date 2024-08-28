package com.room;

public class Room {
	private static final boolean False = false;
	int roomNo;
	String roomType;
	double roomArea;
	boolean AcMachine;
	public void setData(int rno, String rtype, double rArea,boolean Ac ) {
		roomNo=rno;
		roomType=rtype;
		roomArea=rArea;
		AcMachine=Ac;
	}
	public void displayData()
	{
	  System.out.println("the Room number is: "+roomNo);
	  System.out.println("the Room Type is: "+roomType);
	  System.out.println("the Room Area is: "+roomArea);
	  System.out.println("Is Ac is Available: "+AcMachine);
	}
		public static void main(String args[]) {
			Room r=new Room();
			r.setData(202,"twoBhk", 250.00, False);
			r.displayData();
	}
	
}

