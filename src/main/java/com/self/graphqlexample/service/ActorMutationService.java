package com.self.graphqlexample.service;

import com.self.graphqlexample.model.Actor;

public interface ActorMutationService {

    public Actor updateActor(Integer id, String Address);

}
