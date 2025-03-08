package com.test;

import com.model.DVDPlayer;
import com.model.HomeTheatreFacade;
import com.model.Lights;
import com.model.Projector;
import com.model.SoundSystem;

public class FacadeTest {
	public static void main(String[] args) {
		DVDPlayer dvdPlayer = new DVDPlayer();
		Projector projector = new Projector();
		SoundSystem soundsystem = new SoundSystem();
		Lights lights = new Lights();
		
		HomeTheatreFacade homeTheatre = new HomeTheatreFacade(dvdPlayer,projector,lights,soundsystem);
		homeTheatre.watchmovie("Chhava");
		homeTheatre.endMovie();
	}

}
