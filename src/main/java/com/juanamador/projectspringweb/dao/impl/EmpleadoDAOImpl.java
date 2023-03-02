/**
 * 
 */
package com.juanamador.projectspringweb.dao.impl;

import org.springframework.stereotype.Repository;

import com.juanamador.projectspringweb.dao.EmpleadoDAO;

/**
 * @author Juan Fernando Amador Miranda
 *
 */

@Repository
public class EmpleadoDAOImpl implements EmpleadoDAO {

	@Override
	public String consultarNombreEmpleado() {

		return "Juan Fernando Amador Miranda";
	}

}
