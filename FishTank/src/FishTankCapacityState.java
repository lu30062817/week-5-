
public class FishTankCapacityState implements State
{

	@Override
	public void doAction(FishTankContext ftc) {
		System.out.println("Filled capacity varies from 5 gallon to 180 gallons");
		ftc.setFishTankState(this);		
	}
	
	public String toString()
	{
		return "Fish Tank Capacity State \n";
	}
}
