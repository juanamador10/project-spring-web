/**
 * 
 */
package com.juanamador.projectspringweb.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juanamador.projectspringweb.dao.EmpleadoDAO;
import com.juanamador.projectspringweb.services.SpringService;

/**
 * @author Juan Fernando Amador Mirnada
 *
 */

@Service
public class SpringServiceImpl implements SpringService {
	
	@Autowired
	private EmpleadoDAO empleadoDAOImpl;

	@Override
	public String mostrarNombreEmpresa() {
		
		return "Anotacion Spring y JSF";
	}

	@Override
	public String mostrarNombreEmpleado() {
		
		return this.empleadoDAOImpl.consultarNombreEmpleado();
	}

}
