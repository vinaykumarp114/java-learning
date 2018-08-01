/**
 * 
 */
package design_pattern.structural.adapter;

/**
 * @author vinay
 *
 */
public class EmployeeDB implements Employee {

	private String id;
	private String firstName;
	private String lastName;
	private String emaiId;

	public EmployeeDB(String id, String fname, String lname, String emailId) {
		this.id = id;
		this.firstName = fname;
		this.emaiId = emailId;
		this.lastName = lname;
	}

	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public String getLastName() {
		return this.lastName;
	}

	@Override
	public String getFirstName() {
		return this.firstName;
	}

	@Override
	public String getEmailId() {
		return this.emaiId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeDB [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emaiId=" + emaiId
				+ "]";
	}

}
