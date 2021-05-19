package com.dp.creational.prototype;

public class User implements Cloneable {

	private String name;
	private DBConnection dbConnection;
	
	public User() {
	}
	
	public User(String name) {
		this.name = name;
	}
	
	public User(String name, DBConnection dbConnection) {
		this.name = name;
		this.dbConnection = dbConnection;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DBConnection getDbConnection() {
		return (dbConnection == null) ? 
				dbConnection = new DBConnection("lomte.sybdb") : dbConnection;
	}

	public void setDbConnection(DBConnection dbConnection) {
		this.dbConnection = dbConnection;
	}
}