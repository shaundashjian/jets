package project;

public class BusinessJet extends JetImpl {

	private String owner;

	public BusinessJet(int id, String model, double speed, int range, int capacity, double price, Pilot pilot,
			String owner) {
		super(id, model, speed, range, capacity, price, pilot);
		this.owner = owner;
	}

	public BusinessJet(String model, double speed, int range, int capacity, double price, Pilot pilot, String owner) {
		super(model, speed, range, capacity, price, pilot);
		this.owner = owner;
	}

	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * @param owner
	 *            the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.deleteCharAt(builder.length() - 1);
		builder.append(", owner= " + getOwner());
		builder.append("]");
		return builder.toString();
	}
}
