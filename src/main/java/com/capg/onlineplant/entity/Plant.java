package com.capg.onlineplant.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="plants")
public class Plant{
	@Id
	@GeneratedValue
  private Integer plantId;
  private Integer plantHeight;
  private String plantSpread;
  private String commonName;
  private String bloomTime;
  private String medicinalOrCulinaryUse;
  private String difficultyLevel;
  private String temperature;

public Plant(Integer plantId, Integer plantHeight, String plantSpread, String commonName, String bloomTime,
		String medicinalOrCulinaryUse, String difficultyLevel, String temparature, String typeOfPlant,
		String plantDescription, Integer plantStock, double plantCost) {
	super();
	this.plantId = plantId;
	this.plantHeight = plantHeight;
	this.plantSpread = plantSpread;
	this.commonName = commonName;
	this.bloomTime = bloomTime;
	this.medicinalOrCulinaryUse = medicinalOrCulinaryUse;
	this.difficultyLevel = difficultyLevel;
	this.temperature = temperature;
	this.typeOfPlant = typeOfPlant;
	this.plantDescription = plantDescription;
	this.plantStock = plantStock;
	this.plantCost = plantCost;
}
public Integer getPlantId() {
	return plantId;
}
public void setPlantId(Integer plantId) {
	this.plantId = plantId;
}
public Integer getPlantHeight() {
	return plantHeight;
}
public void setPlantHeight(Integer plantHeight) {
	this.plantHeight = plantHeight;
}
public String getPlantSpread() {
	return plantSpread;
}
public void setPlantSpread(String plantSpread) {
	this.plantSpread = plantSpread;
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
public String getMedicinalOrCulinaryUse() {
	return medicinalOrCulinaryUse;
}
public void setMedicinalOrCulinaryUse(String medicinalOrCulinaryUse) {
	this.medicinalOrCulinaryUse = medicinalOrCulinaryUse;
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
public String getTypeOfPlant() {
	return typeOfPlant;
}
public void setTypeOfPlant(String typeOfPlant) {
	this.typeOfPlant = typeOfPlant;
}
public String getPlantDescription() {
	return plantDescription;
}
public void setPlantDescription(String plantDescription) {
	this.plantDescription = plantDescription;
}
public Integer getPlantStock() {
	return plantStock;
}
public void setPlantStock(Integer plantStock) {
	this.plantStock = plantStock;
}
public double getPlantCost() {
	return plantCost;
}
public void setPlantCost(double plantCost) {
	this.plantCost = plantCost;
}
  private String typeOfPlant;
  private String plantDescription;
  private Integer plantStock;
  private double plantCost;
public Plant() {
	
}
  
@Override
public String toString() {
return "Plant [plantHeight=" + plantHeight + ", plantSpread=" + plantSpread + ", bloomTime=" + bloomTime
			+ ", medicinalOrCulinaryUse=" + medicinalOrCulinaryUse + ", difficultyLevel=" + difficultyLevel
			+ ", temperature=" + temperature + ", typeOfPlant=" + typeOfPlant + ", plantDescription=" + plantDescription
			+ "]";
  }
}




