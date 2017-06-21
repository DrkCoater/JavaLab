/**
 * 
 */
package us.csbu.cs540.first;
import java.util.Random;

/**
 * @author JeremyLu
 *
 */
public class InternationalStudent extends Student implements immigrationProcess {
	
	private String nationality;
	private ImmigrationStatus immigrationStatus;

	public InternationalStudent(String fullName, String nationality, ImmigrationStatus status) {
		super(fullName);
		this.nationality = nationality;
		this.immigrationStatus = status;
	}

	public String getNationality() {
		return nationality;
	}

	@Override
	public void changeStatus(ImmigrationStatus newStatus) {
		this.immigrationStatus = newStatus;
	}
	
	public ImmigrationStatus getStatus() {
		return this.immigrationStatus;
	}
	
	public static boolean passBySuccessRate(float rate) {
		Random rand = new Random();
		int randomInt = rand.nextInt(100) + 1; // 1 ~ 100
		if (randomInt >= Math.floor(100 - rate*100)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean applyVisa() {
		// make it 40% success rate
		return InternationalStudent.passBySuccessRate((float) 0.4);
	}
	
	@Override
	public boolean applyWorkPermit() {
		// make it 60% success rate
		return InternationalStudent.passBySuccessRate((float) 0.6);
	}
}
