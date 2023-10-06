package org.pokemon.tcg.controller;

import java.time.LocalTime;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

//./mvnw compile quarkus:dev -Ddebug
// ./mvnw compile quarkus:dev


@Path("/pokemon/tcg/v1/status")
public class StatusController {

	@GET
	public String status() {
		return  "Hora actual del servidor: " + LocalTime.now().toString();
	}
}
