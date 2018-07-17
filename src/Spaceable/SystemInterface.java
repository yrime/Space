package Spaceable;

import java.util.List;

import physics.PhysicsModelInterface;

public interface SystemInterface {
	
	List<SpaceBodyInterface> getSystemObjects();
	void setSystemObjects(List<SpaceBodyInterface> lObj);
	void setSystemObjects(SpaceBodyInterface obj) throws Exception;
	void setPhysicMech(PhysicsModelInterface physicsModel);
	
	void setCentre(SpaceBodyInterface obj);
}
