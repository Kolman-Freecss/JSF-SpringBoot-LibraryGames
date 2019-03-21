package com.ragnarok.controller;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.ragnarok.entities.Game;

@Scope(value="session")
@Component(value = "gameController")
@ELBeanName(value = "gameController")
@Join(path = "/", to = "/index.jsf")
public class GameController {

	private Game game = new Game();
	
	public String test()
	{
		return "hello";
	}
	
}
