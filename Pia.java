public class Pia {

	public void insertItem(Item newItem){
		if (newItem.isDirty()){
			this.currentUser.wash(newItem);
			this.currentUser.put(newItem,this.dryer);
			this.currentUser.perform(this.getSinkOrganizationMethod());
		}else{
			this.currentUser.put(this.findRightSpot(newItem));
		}
		if (this.getCoffeMachine().hasLittleAmount() &&
			this.getCoffeMachine().isOn()){
			this.getCoffeMachine().turnOff()
		}
	}

}
