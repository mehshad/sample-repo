package com.mehshad.welcome;

@ManagedBean(name = "welcome", eager = true)
public class WelcomeBean {

	public WelcomeBean() {
        System.out.println("WelcomeBean instantiated");
    }
    public String getMessage() {
        return "I'm alive!";
    }
}
