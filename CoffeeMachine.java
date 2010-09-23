public class CoffeeMachine {

    public void makeCoffee(int coffee_count){
                
        if(isTurnOn()){
            turnOff();
        }
        setAmountWater(user.purchaseWater(AMOUNTCUP));
        setCoffeeFilter(user.purchaseCoffeeFilter());
        setAmountPowderCoffee(user.purchasePowder(AMOUNTCUP*coffee_count));
        turnOn();
        user.wait(timeMakeCoffee());
        user.moveFilterToTrash();
        if(vase.isEmpty()){
            turnOff();
        }
        user.getCoffeeCup();
    }
}
