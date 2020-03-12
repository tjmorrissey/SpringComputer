package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Computer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private int asset;
	private String brand;
	private String type; //ie Desktop, Laptop, Tablet
	
	public Computer() {
		super();
	}
	
	public Computer(int asset) {
		super();
		this.asset = asset;
	}
	
	public Computer(int asset, String brand, String type) {
		super();
		this.asset = asset;
		this.brand = brand;
		this.type = type;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAsset() {
		return asset;
	}

	public void setAsset(int asset) {
		this.asset = asset;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Computer [id=" + id + ", asset=" + asset + ", brand=" + brand + ", type=" + type + "]";
	}
	
	
	
}
