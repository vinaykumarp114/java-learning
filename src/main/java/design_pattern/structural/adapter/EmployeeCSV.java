/**
 * 
 */
package design_pattern.structural.adapter;

/**
 * @author vinay
 *
 */
public class EmployeeCSV {

	private int id;
	private String fullName;
	private String emailid;
	
	public EmployeeCSV(int id, String fullName, String emailid) {
		this.id = id;
		this.fullName = fullName;
		this.emailid=emailid;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @return the emailid
	 */
	public String getEmailid() {
		return emailid;
	}
}
