
public class FishTankTypesState implements State
{

	@Override
	public void doAction(FishTankContext ftc) {
		System.out.println("Types: ColdWaterTank, Tropical Freshwater tank, Reef tank, Brackish tank etc..");
		ftc.setFishTankState(this);		
	}
	
	public String toString()
	{
		return "Fish Tank Types State \n";
	}
}
