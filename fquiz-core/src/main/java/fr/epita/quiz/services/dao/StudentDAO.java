package fr.epita.quiz.services.dao;

import java.util.Map;

import fr.epita.quiz.datamodel.Student;

public class StudentDAO extends GenericDAO<Student, Long> {

	@Override
	public String getQuery() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setParameters(Map<String, Object> parameters, Student criteria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Class<Student> getEntityClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSearchQuery() {
		// TODO Auto-generated method stub
		return null;
	}

}
