package com.betadesign.registration;

public class User {
	private String email;
    private String name;
    private String phone;

    public User(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    
    public String getName() {
        return name;
    }

    
    public String getEmail() {
        return email;
    }
    
    public String getPhone() {
        return phone;
    }
}
