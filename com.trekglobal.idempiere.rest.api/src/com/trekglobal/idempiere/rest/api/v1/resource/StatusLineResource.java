/**********************************************************************
* This file is part of iDempiere ERP Open Source                      *
* http://www.idempiere.org                                            *
*                                                                     *
* Copyright (C) Contributors                                          *
*                                                                     *
* This program is free software; you can redistribute it and/or       *
* modify it under the terms of the GNU General Public License         *
* as published by the Free Software Foundation; either version 2      *
* of the License, or (at your option) any later version.              *
*                                                                     *
* This program is distributed in the hope that it will be useful,     *
* but WITHOUT ANY WARRANTY; without even the implied warranty of      *
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the        *
* GNU General Public License for more details.                        *
*                                                                     *
* You should have received a copy of the GNU General Public License   *
* along with this program; if not, write to the Free Software         *
* Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,          *
* MA 02110-1301, USA.                                                 *
*                                                                     *
* Contributors:                                                       *
* - BX Service GmbH                                                   *
* - Diego Ruiz                                                        *
**********************************************************************/
package com.trekglobal.idempiere.rest.api.v1.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.trekglobal.idempiere.rest.api.json.QueryOperators;

/**
 * 
 * @author Diego Ruiz
 *
 */
@Path("v1/statuslines")
public interface StatusLineResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	/**
	 * Get available status lines
	 * @param filter
	 * @return JSON array of status lines
	 */
	public Response getStatusLines(@QueryParam(QueryOperators.FILTER) String filter, @QueryParam(QueryOperators.INCLUDE_MSG) boolean includeMsg);

	@Path("{statusLineId}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	/**
	 * Get the resulting message of the status line by id
	 * @param statusLineId
	 * @return JSON representation of message - can be HTML
	 */
	public Response getStatusLineValue(@PathParam("statusLineId") String id);

}
