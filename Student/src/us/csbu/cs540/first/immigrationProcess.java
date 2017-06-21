/**
 * 
 */
package us.csbu.cs540.first;

/**
 * @author JeremyLu
 *
 */
public interface immigrationProcess {
	boolean applyVisa();
	boolean applyWorkPermit();
	void changeStatus(ImmigrationStatus newStatus);
}
