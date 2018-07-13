package physics;

import java.util.List;

import Spaceable.SpaceObjectInterface;

public interface PhysicsModelInterface {
	void setTemp(int t);
	void setSystemObjects(List<SpaceObjectInterface> lObj);
	void nextState();
}
