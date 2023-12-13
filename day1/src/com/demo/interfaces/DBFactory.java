package com.demo.interfaces;

import java.util.Optional;

import com.demo.interfaces.impl.MySQLDB;
import com.demo.interfaces.impl.OracleDB;

public class DBFactory {

	public static Optional<MyConnection> getDB(String dbType) {
		if (dbType.equals("mysql")) {
			return Optional.of(new MySQLDB());
		}else if(dbType.equals("oracle")) {
			return Optional.of(new OracleDB());
		}else {
			return Optional.empty();
		}
	}
}
