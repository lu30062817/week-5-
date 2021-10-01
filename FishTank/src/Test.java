
public class Test {

	public static void main(String[] args) {
		FishTankContext ctx=new FishTankContext();
		FishTankTypesState types=new FishTankTypesState();
		types.doAction(ctx);
		System.out.println(ctx.getFishTankState().toString());
		
		FishTankCapacityState capacity=new FishTankCapacityState();
		capacity.doAction(ctx);
		System.out.println(ctx.getFishTankState().toString());
		
		CategoryState category=new CategoryState();
		category.doAction(ctx);
		System.out.println(ctx.getFishTankState().toString());

	}

}
