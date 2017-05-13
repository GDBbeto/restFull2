package com.mts.login.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;


@Path("/hola")
public class Hola {

	@GET
	@Path("/beto")
	public DatosPersona getMsg() {
		DatosPersona datosPersona= new DatosPersona();	
		datosPersona.setNombreUsuario("Roberto Antonio");
		datosPersona.setApePaterno("Aguilar");		
		return datosPersona;
	}
	@POST
	@Path("/nombre")
	public String nombre(){
		return "beto";
	}
}
