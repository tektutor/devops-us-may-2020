package org.tektutor;

public class Main {

	public String getModuleName() {
		return "Main Module";
	}

	public static void main ( String[] args ) {

		Frontend fe = new Frontend();
		BusinessLayer be = new BusinessLayer();
		DataAccessLayer dal = new DataAccessLayer();
		Main main = new Main();
		
		System.out.println ( main.getModuleName() );

		System.out.println  ( fe.getModuleName() );
		System.out.println  ( be.getModuleName() );
		System.out.println  ( dal.getModuleName() );
		

	}

}
