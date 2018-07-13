package Spaceable;

import java.util.List;

import physics.PhysicsModelInterface;

public interface SystemInterface {
	
	List<SpaceObjectInterface> getSystemObjects();
	void setSystemObjects(List<SpaceObjectInterface> lObj);
	void setSystemObjects(SpaceObjectInterface obj) throws Exception;
	void setPhysicMech(PhysicsModelInterface physicsModel);
	
	void setCentre(SpaceObjectInterface obj);
}
