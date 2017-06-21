/**
 * 
 */
package us.csbu.cs540.first;

/**
 * @author JeremyLu
 *
 */
public class InternationalStudent extends Student implements immigrationProcess {
	
	private String nationality;
	private ImmigrationStatus immigrationStatus;

	public InternationalStudent(String fullName) {
		super(fullName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyVisa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeStatus(ImmigrationStatus newStatus) {
		this.immigrationStatus = newStatus;
	}
	
	public ImmigrationStatus getStatus() {
		return this.immigrationStatus;
	}

	@Override
	public void applyWorkPermit() {
		// TODO Auto-generated method stub
		
	}
}
