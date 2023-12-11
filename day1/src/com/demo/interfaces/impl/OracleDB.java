package com.demo.interfaces.impl;

import com.demo.interfaces.MyConnection;

public class OracleDB implements MyConnection{

	@Override
	public String getDBConnection() {
		
		return "Oracle DB Connected..";
	}
	
	@Override
	public String getDBVersion() {
		
		return "Oracle 12C";
	}
}
