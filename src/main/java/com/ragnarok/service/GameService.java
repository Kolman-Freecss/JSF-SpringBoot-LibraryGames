package com.ragnarok.service;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.ragnarok.entities.Game;
import com.ragnarok.repositories.GameRepository;

/**
 * Here we'll put the Logic that not concerns to querys from code to DB.
 * */
@Named
@ViewScoped
public class GameService implements Serializable{

	private static final long serialVersionUID = 6100062448226311340L;

	@Inject
	private GameRepository gameDao;
	
	private List<Game> games;
	
	//That's will called after the JSF page requested this bean.
	@PostConstruct
	public void init()
	{
		games = gameDao.findAll();
	}
	
	public List<Game> getGames()
	{
		return games;
	}
	
	
}
