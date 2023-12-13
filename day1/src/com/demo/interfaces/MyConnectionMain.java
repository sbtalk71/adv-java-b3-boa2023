package com.demo.interfaces;

import java.util.Optional;

public class MyConnectionMain {

	public static void main(String[] args) {
		Optional<MyConnection> dbOp = DBFactory.getDB("mysql");

		if (dbOp.isPresent()) {
			MyConnection db = dbOp.get();
			System.out.println(db.getDBConnection());

			System.out.println(db.getDBVersion());

			System.out.println(db.getDriverDetail());
		}

	}

}
