package com.self.graphqlexample.repository;

import com.self.graphqlexample.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Integer> {

    public Actor findByFirstNameLike(String name);

}
