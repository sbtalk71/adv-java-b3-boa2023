package com.demo.interfaces.impl;

import com.demo.interfaces.MyConnection;

public class MySQLDB implements MyConnection{

	@Override
	public String getDBConnection() {
		
		return "MySQL DB Connected..";
	}
	
	@Override
	public String getDBVersion() {
		
		return "MySQL 8.1.10";
	}
}
