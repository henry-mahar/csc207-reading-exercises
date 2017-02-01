public class Student {
	private String firstName;
	private String lastName;
	private int id;
	private int age;

	public Student(String firstName, String lastName, int id, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.age = age;
	}
	
	/**
	* Sets the first name of the student. This must not be a null string.
	*
	* @param value the new, non-null value the firstName.
	* @throws IllegalArgumentException if a null value is given.
	*/
	public void setFirstName(String firstName) {
		if (firstName == null) {
			throw new IllegalArgumentException();
		} else {
			this.firstName = firstName;
		}
	}
	
	/**
	* Sets the last name of the student. This must not be a null string.
	*
	* @param value the new, non-null value the lastName.
	* @throws IllegalArgumentException if a null value is given.
	*/
	public void setLastName(String lastName) {
		if (lastName == null) {
			throw new IllegalArgumentException();
		} else {
			this.lastName = lastName;
		}
	}
	
	/**
	* Sets the age of the student. This must not be a negative number
	*
	* @param value the new, non-negative age.
	* @throws IllegalArgumentException if a negative value is given.
	*/
	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	/**
	* Sets the id of the student. This must not be a negative number
	*
	* @param value the new, non-negative id.
	* @throws IllegalArgumentException if a negative value is given.
	*/
	public void setID(int id) {
		if (id > 0) {
			this.id = id;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	/**
	* Returns the first name of the student
	*/
	public String getFirstName() {
		return this.firstName;
	}
	
	/**
	* Returns the last name of the student
	*/
	public String getLastName() {
		return this.lastName;
	}
	
	/**
	* Returns the age of the student
	*/
	public int getAge() {
		return this.age;
	}
	
	/**
	* Returns the id of the student
	*/
	public int getID() {
		return this.id;
	}
}