package com.self.graphqlexample.service;

import com.self.graphqlexample.model.Actor;
import com.self.graphqlexample.model.Film;

import java.util.List;

public interface ActorService {

    public List<Actor> fetchActors();

    public Actor fetchActor(Integer id);

    public Actor fetchActorByName(String name);

    public List<Film> fetchFilms();
}
