package v100;

import java.util.StringJoiner;

public class Product {

	@MyField(name = "code", nullable = false)
	private Long id;
	
	@MyField(name = "name")
	private String name;
	
	@MyField(name = "amount", format = "%.2f")
	private double amount;

	@MyField(name = "tradeable")
	private boolean available = true;

	public Product(Long id, String name, double amount) {
		this.id = id;
		this.name = name;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Product.class.getSimpleName() + "[", "]")
				.add("id=" + id)
				.add("name='" + name + "'")
				.add("amount=" + amount)
				.add("available=" + available)
				.toString();
	}
}
