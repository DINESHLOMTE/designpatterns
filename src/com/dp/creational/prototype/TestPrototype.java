package com.dp.creational.prototype;

public class TestPrototype {
	public static void main(String[] args) {
		User user1 = new User("dlomte", new DBConnection("sybdb"));
		display(user1);
		System.out.println("-------------------------------------------------");
		User user2 = null;
		try {
			user2 = (User) user1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		user2.setName("slomte");
		display(user2);
	}
	
	private static void display(User user) {
		System.out.println("User Details");
		System.out.println("-------------------------------------------------");
		System.out.println("Name:          " + user.getName());
		System.out.println("DB Connection: " + user.getDbConnection().getName());
	}
}