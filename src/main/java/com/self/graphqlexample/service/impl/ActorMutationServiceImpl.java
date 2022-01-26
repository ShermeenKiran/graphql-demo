package com.self.graphqlexample.service.impl;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLSubscriptionResolver;
import com.self.graphqlexample.model.Actor;
import com.self.graphqlexample.repository.ActorRepository;
import com.self.graphqlexample.service.ActorMutationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActorMutationServiceImpl implements ActorMutationService,
        GraphQLMutationResolver, GraphQLSubscriptionResolver {

    @Autowired
    private ActorRepository actorRepository;

    @Override
    public Actor updateActor(Integer id, String address) {
        Actor actor = actorRepository.findById(id).get();
        actor.setAddress(address);
        return actorRepository.save(actor);
    }

}
