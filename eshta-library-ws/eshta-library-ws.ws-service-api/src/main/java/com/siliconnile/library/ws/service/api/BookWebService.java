package com.siliconnile.library.ws.service.api;

import java.util.List;

import com.siliconnile.library.dto.BookDTO;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

/**
 * User: Andrew
 * Date: 6/27/13
 */
@Path("/")
public interface BookWebService {
    
//    @GET
//    @Path("/booklisting/{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public BookDTO getSampleObjectById(@PathParam("id") Long id,
//                                               @Context HttpServletResponse response);

	@GET
	@Path("/getbooklisting")
	@Produces(MediaType.APPLICATION_JSON)
	public List <BookDTO> getBookListing(@FormParam("sparam") String sParam);


}
