package physics;

import java.util.List;

import Spaceable.SpaceBodyInterface;
import Spaceable.SpaceObjectInterface;

public interface PhysicsModelInterface {
	void setTemp(int t);
	void setSystemObjects(List<SpaceBodyInterface> lObj);
	void nextState();
}
