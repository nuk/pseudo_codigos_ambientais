public class Bathroom {
 
     public void doNumberOne(){
          if (toilet.getCover().isClosed()){
                user.lift(toilet.getCover());
          }
          if (toilet.getSeat().isClosed()){
                user.lift(toilet.getSeat());
          }
          user.doNumberOne(Where.ON_WATER);
          user.shake(user.getThatThing());
          if (environment.isDirty()){
                user.clean(toilet);
          }
          user.flush(toilet,Condition.CUBA_ISEMPTY);
     }

    
     public void doNumberTwo(){
          if (getCover().isClosed()){
                user.lift(toilet.getCover());
          }
          if (!toilet.getSeat().isClosed()){
                user.lift(toilet.getSeat());
          }
          user.doNumberTwo();
          user.clean(getPaper());
          user.throw(getPaper(),trashCan);
          user.flush(toilet,Condition.CUBA_ISEMPTY);
     }

 
     public void beforeExit(){
         user.washHands(sink);
         Paper p1 = paperPot.nextPaper();
         user.dryHands(p1);
         user.throw(p1,trashCan);
         Paper p2 = paperPot.nextPaper();
         user.dryHands(p2);
         user.throw(p2,trashCan);
         user.turnOff(lightSwitch);
         if (environment.hasBadSmell()){
                lightSwitch.turnOn();
         } else {
                lightSwitch.turnOff();
         }
	 user.close(door);
     }
}
