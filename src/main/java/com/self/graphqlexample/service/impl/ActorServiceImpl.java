package com.self.graphqlexample.service.impl;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.self.graphqlexample.model.Actor;
import com.self.graphqlexample.model.Film;
import com.self.graphqlexample.repository.ActorRepository;
import com.self.graphqlexample.repository.FilmRepository;
import com.self.graphqlexample.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ActorServiceImpl implements ActorService, GraphQLQueryResolver {

    @Autowired
    private ActorRepository actorRepository;
    @Autowired
    private FilmRepository filmRepository;

    @Override
    public List<Actor> fetchActors() {
        return actorRepository.findAll();
    }

    @Override
    public Actor fetchActor(Integer id) {
        return actorRepository.findById(id).get();
    }

    @Override
    public Actor fetchActorByName(String name) {
        return actorRepository.findByFirstNameLike(name);
    }

    @Override
    public List<Film> fetchFilms() {
        return filmRepository.findAll();
    }

}
