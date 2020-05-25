package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uca.capas.dao.EstudianteDAO;
import com.uca.capas.domain.Estudiante;

@Service
public class EstudianteServiceImpl implements EstudianteService{
	
	@Autowired
	EstudianteDAO estudianteDAO;

	@Override
	public List<Estudiante> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return estudianteDAO.findAll();
	}

	@Override
	@Transactional
	public void insert(Estudiante estudiante) throws DataAccessException {
		// TODO Auto-generated method stub
		estudianteDAO.insert(estudiante);
		
	}

	@Override
	@Transactional
	public void delete(Integer c_usuario) throws DataAccessException {
		// TODO Auto-generated method stub
		estudianteDAO.delete(c_usuario);
		
	}

}
