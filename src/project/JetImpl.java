package project;

public abstract class JetImpl implements Jet {
	public static int jetId = 0;

	private int id;
	private String model;
	private double speed;
	private int range;
	private int capacity;
	private double price;
	private Pilot pilot;

	/**
	 * @param model
	 * @param speed
	 * @param range
	 * @param capacity
	 * @param price
	 * @param pilot
	 */
	public JetImpl(Integer id, String model, double speed, int range, int capacity, double price, Pilot pilot) {
		this.id = id;
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.capacity = capacity;
		this.price = price;
		this.pilot = pilot;
	}

	/**
	 * @param model
	 * @param speed
	 * @param range
	 * @param capacity
	 * @param price
	 * @param pilot
	 */
	public JetImpl(String model, double speed, int range, int capacity, double price, Pilot pilot) {
		this(++jetId, model, speed, range, capacity, price, pilot);
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model
	 *            the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the speed
	 */
	public double getSpeed() {
		return speed;
	}

	/**
	 * @param speed
	 *            the speed to set
	 */
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	/**
	 * @return the range
	 */
	public int getRange() {
		return range;
	}

	/**
	 * @param range
	 *            the range to set
	 */
	public void setRange(int range) {
		this.range = range;
	}

	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity
	 *            the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the pilot
	 */
	public Pilot getPilot() {
		return pilot;
	}

	/**
	 * @param pilot
	 *            the pilot to set
	 */
	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}

	@Override
	public double getSpeedInMach() {
		return Jet.convertToMach(getSpeed());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getClass().getSimpleName() + " [");
		builder.append("Id= " + getId());
		builder.append(", model= " + getModel());
		builder.append(", speed= " + getSpeedInMach() + " Mach");
		builder.append(", range= " + getRange() + " nm");
		builder.append(", capacity= " + getCapacity() + " gal");
		builder.append(", price= $" + getPrice() + " million");
		builder.append(", " + getPilot());
		builder.append("]");
		return builder.toString();
	}

}
