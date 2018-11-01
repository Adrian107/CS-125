/* 
 * @author donghan2*/
public class RobotLink {

	private RobotLink next; 	
	private final Robot robot;

	public Robot getRobot() {
		return robot;
	}
	/** Constructs this link.
	 * @param next ; the next item in the chain (null, if there are no more items).
	 * @param robot ; a single robot (never null).
	 */
	public RobotLink(RobotLink next,Robot robot) {
		this.robot = robot;
		this.next = next;
	}

	/**
	 * Returns the number of entries in the linked list.
	 * @return number of entries.
	 */
	public int count() {
		if (next == null)
			return 1; // BASE CASE; no more recursion required!

		// Recursive case:
		return 1 + next.count();
	}
	/**
	 * Counts the number of flying robots in the linked list.
	 * Hint: robot.isFlying is useful here.
	 */
	public int countFlyingRobots() {
		int count = 0;
		if(robot.isFlying()== true){
			count++;
		}
		if(next == null){
			return count;
		}
		else if((next==null)==false){
			return count + next.countFlyingRobots();
	
		}
		else{
			return 0;
		}
	}
	/**
	 * Counts the number of flying robots upto and excluding a sad robot.
	 * (i.e. do not count the sad robot if it is flying).
	 * If there are no sad robots this function will return the same value as countFlyingRobots().
	 * Hint: robot.isHappy() is useful.
	 */
	public int countFlyingRobotsBeforeSadRobot() {
		int count = 0;
		if (next == null){
			return this.countFlyingRobots();
		}
		if(robot.isHappy() == false){
			return count;
		}
		if (robot.isFlying() == true){
			count++;
		}
		return count + next.countFlyingRobotsBeforeSadRobot();
		
		
	}
	/** Creates a new LinkedList entry at the end of this linked list.
	 * Recursively finds the last entry then adds a new link to the end.
	 * @param robot - the robot value of the new last link
	 */
	public void append(Robot robot) {
		if (next == null){
			next = new RobotLink(null, this.getRobot());
		}
		else{
			next.append(this.getRobot());
		}
	}
	/**
	 * Returns the first flying unhappy robot, or null
	 * if there are not robots that are flying and unhappy.
	 * @return
	 */
	public Robot getFirstFlyingUnhappyRobot() {
		if(next ==null){
			return null;
		}
		if (robot.isFlying()==true){
			if (robot.isHappy() == false){
				return this.getRobot();
			}
		}
		
		return next.getFirstFlyingUnhappyRobot();
		
	}
	/**
	 * Returns the last flying unhappy robotn the linked list, or null
	 * if there are not robots that are flying and unhappy.
	 * @return
	 */
	public Robot getLastFlyingUnhappyRobot() {
		if(next ==null){
			return null;
		}
		if(next.getLastFlyingUnhappyRobot()== null){
			if (this.getRobot().isFlying()==true){
				if (this.getRobot().isHappy() == false){
					return this.getRobot();
				}
			}
		}
		return next.getLastFlyingUnhappyRobot();
	}
	/**
	 * Returns a reference to the happy most distant explorer.
	 * Returns null if there are no happy robots
	 * @return reference to the most distant happy robot
	 */
	public Robot findHappyRobotFurthestFromHome() {
        if (next == null){ 
        	return null;
        }
        if(this.getRobot().isHappy()==false){
        	return null;
        }
        if (this.getRobot().isHappy() == true) {
            if(next.getRobot().getDistanceFromHome() < this.getRobot().getDistanceFromHome()){
            	return this.getRobot();
            }
        }
            return next.findHappyRobotFurthestFromHome();
        
    }
        

	/**
	 * Returns true if linked list contains the robot.
	 * Hint: Use robot.equals(other).
	 * @param robot
	 * @return
	 */
	public boolean contains(Robot other) {
		if (next == null){
			if(this.robot.equals(other) == false){
				return false;
			}
			else{
				return true;
			}
		}
	
		if(robot.equals(other)){
			return true;
		}
		else{
			return next.contains(other);
		}
	}

	
}
