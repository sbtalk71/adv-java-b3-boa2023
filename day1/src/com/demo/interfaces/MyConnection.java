package com.demo.interfaces;

public interface MyConnection {

	String releaseVersion="2.0.1";
	
	public String getDBConnection();
	public String getDBVersion();
	
	public default String getDriverDetail() {
		throw new UnsupportedOperationException("Method Not implemented..");
	}
	
}
