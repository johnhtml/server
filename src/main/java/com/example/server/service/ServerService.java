package com.example.server.service;

import com.example.server.model.Server;

import java.io.IOException;
import java.util.Collection;

public interface ServerService {

    Server create(Server server);

    //To limit the amount of server listed
    //this is gonna the first "limit number"
    Collection<Server> list(int limit);

    Server ping(String ipAddress) throws IOException;

    Server get(Long id);

    Server update(Server server);

    Boolean delete(Long id);
}
