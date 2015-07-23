import java.util.Date;

public class AutoVehicle implements Vehicle{

	private Date productionDate;
	private int engineCapacity;
	private int weight;
	private String name;
	private int maxSpeed;
	
	//return a safe copy of the date
	public Date getProductionDate() {
		return new Date(productionDate.getTime());
	}
	
	//safe copy the date
	public void setProductionDate(Date productionDate) {
		if (productionDate==null) {
			throw new RuntimeException("Nonsense in nullifying the production date ");
		}
		this.productionDate = new Date(productionDate.getTime());
	}
	
	public int getEngineCapacity() {
		return engineCapacity;
	}
	
	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setMaxSpeed(int kmph) {
		//implementation
		if (weight<30) {
			// this is probably a bycicle
			this.maxSpeed = 50;
		} else if (weight>=30 && weight<500) {
			//this is probably a motorcycle
			this.maxSpeed = 350;
		} else {
			//probably a car
			this.maxSpeed = 250;
		}
		
		
	}

	@Override
	public int getMaxSpeed() {
		return this.maxSpeed;
	}
	
}
