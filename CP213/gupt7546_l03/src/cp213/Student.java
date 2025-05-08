package cp213;

import java.time.LocalDate;

/**
 * Student class definition.
 *
 * @author your
 * @version 2022-01-17
 */
public class Student implements Comparable<Student> {

	// Attributes
	private LocalDate birthDate = null;
	private String forename = "";
	private int id = 0;
	private String surname = "";

	/**
	 * Instantiates a Student object.
	 *
	 * @param id        student ID number
	 * @param surname   student surname
	 * @param forename  name of forename
	 * @param birthDate birthDate in 'YYYY-MM-DD' format
	 */
	public Student(int id, String surname, String forename, LocalDate birthDate) {
		this.id = id;
		this.surname = surname;
		this.forename = forename;
		this.birthDate = birthDate;
	}

	/**
	 * Get the student's ID number.
	 *
	 * @return student ID number
	 */
	public int getId() {
		return id;
	}

	/**
	 * Set the student's ID number.
	 *
	 * @param id the new ID number for the student
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Get the student's surname.
	 *
	 * @return student surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * Set the student's surname.
	 *
	 * @param surname the new surname for the student
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * Get the student's forename.
	 *
	 * @return student forename
	 */
	public String getForename() {
		return forename;
	}

	/**
	 * Set the student's forename.
	 *
	 * @param forename the new forename for the student
	 */
	public void setForename(String forename) {
		this.forename = forename;
	}

	/**
	 * Get the student's birthdate.
	 *
	 * @return student birthdate
	 */
	public LocalDate getBirthDate() {
		return birthDate;
	}

	/**
	 * Set the student's birthdate.
	 *
	 * @param birthDate the new birthdate for the student
	 */
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * Creates a formatted string of student data.
	 * 
	 * @return the formatted student data
	 */
	@Override
	public String toString() {
		return String.format("Name:      %s, %s\nID:        %06d\nBirthdate: %s", surname, forename, id, birthDate);
	}

	/**
	 * Compares this student to another student based on surname, then forename, and
	 * finally ID.
	 * 
	 * @param target the other student object to compare to
	 * @return a negative integer, zero, or a positive integer if this student is
	 *         less than, equal to, or greater than the target student.
	 */
	@Override
	public int compareTo(final Student target) {
		int result = this.surname.compareTo(target.surname);
		if (result == 0) {
			result = this.forename.compareTo(target.forename);
		}
		if (result == 0) {
			result = Integer.compare(this.id, target.id);
		}
		return result;
	}
}
