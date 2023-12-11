package com.demo.interfaces;

import com.demo.interfaces.impl.MySQLDB;

public class MyConnectionMain {

	public static void main(String[] args) {
		MyConnection db= new MySQLDB();
		
		System.out.println(db.getDBConnection());
		
		System.out.println(db.getDBVersion());
		
		System.out.println(db.getDriverDetail());

	}

}
