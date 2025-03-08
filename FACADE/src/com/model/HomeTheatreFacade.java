package com.model;
public class HomeTheatreFacade {
private DVDPlayer dvdPlayer;
private Projector projector;
private Lights lights;
private SoundSystem soundsystem;

public HomeTheatreFacade(DVDPlayer dvdPlayer, Projector projector, Lights lights, SoundSystem soundsystem) {
	super();
	this.dvdPlayer = dvdPlayer;
	this.projector = projector;
	this.lights = lights;
	this.soundsystem = soundsystem;
	
}
public void watchmovie(String movie)
{
	System.out.println(movie+"Movie is about to start");
	lights.dimlights();
	projector.turnOn();
	soundsystem.turnOn();
	soundsystem.setVolume(6);
	dvdPlayer.turnOn();
	dvdPlayer.playMovie(movie);
	System.out.println(movie+"Movie started ");
}

public void endMovie()
{
	System.out.println("Movie Ended");
	dvdPlayer.turnOff();
	lights.turnOnLights();
	soundsystem.turnOff();
	projector.turnOff();
	System.out.println("Go Home");
}
}
