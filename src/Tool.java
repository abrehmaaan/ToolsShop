import java.util.Scanner;

public class Tool {
	private String toolName;
	private String itemCode;
	private int timesBorrowed;
	private boolean onLoan;
	private int cost;
	private int weight;

	public Tool() {}

	public Tool(String toolName, String itemCode, int timesBorrowed, boolean onLoan, int cost, int weight) {
		this.toolName = toolName;
		this.itemCode = itemCode;
		this.timesBorrowed = timesBorrowed;
		this.onLoan = onLoan;
		this.cost = cost;
		this.weight = weight;
	}

	public void readData(Scanner scanner) {
		scanner.useDelimiter(",");
		toolName = scanner.next();
		itemCode = scanner.next();
		timesBorrowed = scanner.nextInt();
		onLoan = Boolean.parseBoolean(scanner.next());
		cost = scanner.nextInt();
		weight = scanner.nextInt();
	}

	//Getters and setters for all fields
	public String getToolName() {
		return toolName;
	}
	public void setToolName(String toolName) {
		this.toolName = toolName;
	}

	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public int getTimesBorrowed() {
		return timesBorrowed;
	}
	public void setTimesBorrowed(int timesBorrowed) {
		this.timesBorrowed = timesBorrowed;
	}

	public boolean isOnLoan() {
		return onLoan;
	}
	public void setOnLoan(boolean onLoan) {
		this.onLoan = onLoan;
	}

	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void printDetails() {
		System.out.println("Tool name: " + toolName + "; code: " + itemCode + "; timesBorrowed: " + timesBorrowed + 
				"; onLoan: " + (onLoan ? "yes" : "no") + "; cost: " + cost + "; weight: " + weight);
	}
}