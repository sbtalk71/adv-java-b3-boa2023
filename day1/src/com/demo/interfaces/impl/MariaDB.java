package com.demo.interfaces.impl;

import com.demo.interfaces.MyConnection;
import com.demo.interfaces.MyConnectionExt;

public class MariaDB implements MyConnection,MyConnectionExt{

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
