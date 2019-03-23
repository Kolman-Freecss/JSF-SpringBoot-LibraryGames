package com.ragnarok.entities;

import javax.inject.Named;


@Named
public class Game {

	private int yearsOld = 1;
	private String name = "APEX";
	
	public int getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String showName()
	{
		return "That's the name of the game: " + this.name;
	}
	
}
