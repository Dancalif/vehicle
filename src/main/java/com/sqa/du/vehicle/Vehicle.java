package com.sqa.du.vehicle;

import com.sqa.du.util.helper.RequestInput;

public class Vehicle {

	private String name;

	private String type;
	private String color;

	private int numWheels;
	private boolean waterProof;
	private boolean fly;
	private boolean useGas;

	public Vehicle() {
		this(RequestInput.getString("What is the name of vehicle? "),
				RequestInput.getString("What is the type of vehicle? ", "car", "train", "plane", "bike"),
				RequestInput.getString("What is the color of vehicle? "));
	}

	public Vehicle(String name, String type, String color) {

		super();
		this.setName(name);
		this.setType(type);
		this.setColor(color);
		switch (type.toLowerCase()) {
		case "car":
			this.setNumWheels(4);
			this.setWaterProof(false);
			this.setFly(false);
			this.setUseGas(true);
		case "plane":
			this.setNumWheels(3);
			this.setWaterProof(false);
			this.setFly(true);
			this.setUseGas(true);
		case "train":
			this.setNumWheels(0);
			this.setWaterProof(false);
			this.setFly(false);
			this.setUseGas(false);
		case "bike":
			this.setNumWheels(2);
			this.setWaterProof(false);
			this.setFly(false);
			this.setUseGas(false);
		default:
			this.setNumWheels(0);
			this.setWaterProof(false);
			this.setFly(false);
			this.setUseGas(false);
		}
	}

	public String getColor() {
		return color;
	}

	public String getName() {
		return name;
	}

	public int getNumWheels() {
		return numWheels;
	}

	public String getType() {
		return type;
	}

	public boolean isFly() {
		return fly;
	}

	public boolean isUseGas() {
		return useGas;
	}

	public boolean isWaterProof() {
		return waterProof;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setFly(boolean fly) {
		this.fly = fly;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setUseGas(boolean useGas) {
		this.useGas = useGas;
	}

	public void setWaterProof(boolean waterProof) {
		this.waterProof = waterProof;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vehicle [name=");
		builder.append(name);
		builder.append(", type=");
		builder.append(type);
		builder.append(", color=");
		builder.append(color);
		builder.append(", numWheels=");
		builder.append(numWheels);
		builder.append(", waterProof=");
		builder.append(waterProof);
		builder.append(", fly=");
		builder.append(fly);
		builder.append(", useGas=");
		builder.append(useGas);
		builder.append("]");
		return builder.toString();
	}

}
