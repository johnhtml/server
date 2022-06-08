package com.example.server.repo;

import com.example.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepo extends JpaRepository<Server, Long> {
    // It is important to name these methods to get certain SQL queries
    // this is done (interpreted) by JpaRepository automatically
    Server findByIpAddress(String ipAddress);



}
