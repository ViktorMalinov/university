package main.dataaccess.facultydiscipline;

import main.dataaccess.discipline.Discipline;
import main.dataaccess.faculty.Faculty;

public class FacultyDiscipline {

	private Long id;
	
	private Faculty faculty;
	private Discipline discipline;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public Discipline getDiscipline() {
		return discipline;
	}

	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
	}


	
}
