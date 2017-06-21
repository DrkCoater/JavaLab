/**
 * 
 */
package us.csbu.cs540.first;

/**
 * @author JeremyLu
 *
 */
public interface immigrationProcess {
	void applyVisa();
	void changeStatus(ImmigrationStatus newStatus);
	void applyWorkPermit();
}
