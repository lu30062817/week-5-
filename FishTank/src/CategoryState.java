
public class CategoryState implements State
{

	@Override
	public void doAction(FishTankContext ftc) {
		System.out.println("Categories: Small, mid-sized and Large");
		ftc.setFishTankState(this);		
	}
	
	public String toString()
	{
		return "Category State \n";
	}
}
