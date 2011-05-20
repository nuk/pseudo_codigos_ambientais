public class Intacto {

	public void onExit(){
		if (isAnyOn(this.getLights())){
			this.currentUser.turnOff(this.getLights());
		}
		if (isAnyOn(this.getAirConditioners())){
			this.currentUser.turnOff(this.getAirConditioners());
		}
		if (isAnyOpen(this.getDoors())){
			this.currentUser.close(getDoors());
		}
		this.currentUser.exit();
		this.currentUser.checkFrontDoor();
	}

}
