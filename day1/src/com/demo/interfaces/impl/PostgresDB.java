package com.demo.interfaces.impl;

import com.demo.interfaces.MyConnection2;

public class PostgresDB implements MyConnection2{

	@Override
	public String getDBConnection() {
		
		return "MySQL DB Connected..";
	}
	
	@Override
	public String getDBVersion() {
		
		return "MySQL 8.1.10";
	}

	@Override
	public String getMetadata() {
		
		return "Metadata Available..";
	}
}
