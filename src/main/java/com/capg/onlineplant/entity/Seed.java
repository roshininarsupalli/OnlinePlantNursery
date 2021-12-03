package com.capg.onlineplant.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seeds")
public class Seed {
		@Id
		@GeneratedValue
	   public Integer getSeedId() {
			return seedId;
		}
		public void setSeedId(Integer seedId) {
			this.seedId = seedId;
		}
		public String getCommonName() {
			return commonName;
		}
		public void setCommonName(String commonName) {
			this.commonName = commonName;
		}
		public String getBloomTime() {
			return bloomTime;
		}
		public void setBloomTime(String bloomTime) {
			this.bloomTime = bloomTime;
		}
		public String getWatering() {
			return watering;
		}
		public void setWatering(String watering) {
			this.watering = watering;
		}
		public String getDifficultyLevel() {
			return difficultyLevel;
		}
		public void setDifficultyLevel(String difficultyLevel) {
			this.difficultyLevel = difficultyLevel;
		}
		public String getTemperature() {
			return temperature;
		}
		public void setTemperature(String temperature) {
			this.temperature = temperature;
		}
		public String getTypeOfSeeds() {
			return typeOfSeeds;
		}
		public void setTypeOfSeeds(String typeOfSeeds) {
			this.typeOfSeeds = typeOfSeeds;
		}
		public String getSeedsDescription() {
			return seedsDescription;
		}
		public void setSeedsDescription(String seedsDescription) {
			this.seedsDescription = seedsDescription;
		}
		public Integer getSeedsStock() {
			return seedsStock;
		}
		public void setSeedsStock(Integer seedsStock) {
			this.seedsStock = seedsStock;
		}
		public double getSeedsCost() {
			return seedsCost;
		}
		public void setSeedsCost(double seedsCost) {
			this.seedsCost = seedsCost;
		}
		public Integer getSeedsPerPacket() {
			return seedsPerPacket;
		}
		public void setSeedsPerPacket(Integer seedsPerPacket) {
			this.seedsPerPacket = seedsPerPacket;
		}
	private Integer seedId;
	   private String commonName;
	   private String bloomTime;
	   private String watering;
	   private String difficultyLevel;
	   private String temperature;
	   private String typeOfSeeds;
	   private String seedsDescription;
	   private Integer seedsStock;
	   private double seedsCost;
	   private Integer seedsPerPacket;
	public Seed(Integer seedId, String commonName, String bloomTime, String watering, String difficultyLevel,
			String temperature, String typeOfSeeds, String seedsDescription, Integer seedsStock, double seedsCost,
			Integer seedsPerPacket) {
		super();
		this.seedId = seedId;
		this.commonName = commonName;
		this.bloomTime = bloomTime;
		this.watering = watering;
		this.difficultyLevel = difficultyLevel;
		this.temperature = temperature;
		this.typeOfSeeds = typeOfSeeds;
		this.seedsDescription = seedsDescription;
		this.seedsStock = seedsStock;
		this.seedsCost = seedsCost;
		this.seedsPerPacket = seedsPerPacket;
	}
	public Seed() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Seed [bloomTime=" + bloomTime + ", watering=" + watering + ", difficultyLevel=" + difficultyLevel
				+ ", temperature=" + temperature + ", typeOfSeeds=" + typeOfSeeds + ", seedsDescription=" + seedsDescription
				+ ", seedsPerPacket=" + seedsPerPacket + "]";
	}
	}


