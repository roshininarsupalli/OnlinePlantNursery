package com.capg.onlineplant.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="planters")
public class Planter {
	@Id
	@GeneratedValue
   public Integer getPlanterId() {
		return planterId;
	}
	public void setPlanterId(Integer planterId) {
		this.planterId = planterId;
	}
	public float getPlanterheight() {
		return planterheight;
	}
	public void setPlanterheight(float planterheight) {
		this.planterheight = planterheight;
	}
	public int getPlanterCapacity() {
		return planterCapacity;
	}
	public void setPlanterCapacity(int planterCapacity) {
		this.planterCapacity = planterCapacity;
	}
	public int getDrinageHoles() {
		return drinageHoles;
	}
	public void setDrinageHoles(int drinageHoles) {
		this.drinageHoles = drinageHoles;
	}
	public int getPlanterColor() {
		return planterColor;
	}
	public void setPlanterColor(int planterColor) {
		this.planterColor = planterColor;
	}
	public String getPlanterShape() {
		return planterShape;
	}
	public void setPlanterShape(String planterShape) {
		this.planterShape = planterShape;
	}
	public int getPlanterStock() {
		return planterStock;
	}
	public void setPlanterStock(int planterStock) {
		this.planterStock = planterStock;
	}
	public int getPlanterCost() {
		return planterCost;
	}
	public void setPlanterCost(int planterCost) {
		this.planterCost = planterCost;
	}
   private Integer planterId;
   private float planterheight;
   private int planterCapacity;
   private int drinageHoles;
   private int planterColor;
   private String planterShape;
   private int planterStock;
   private int planterCost;
public Planter(Integer planterId, float planterheight, int planterCapacity, int drinageHoles, int planterColor,
		String planterShape, int planterStock, int planterCost) {
	super();
	this.planterId = planterId;
	this.planterheight = planterheight;
	this.planterCapacity = planterCapacity;
	this.drinageHoles = drinageHoles;
	this.planterColor = planterColor;
	this.planterShape = planterShape;
	this.planterStock = planterStock;
	this.planterCost = planterCost;
}
public Planter() {
	
}
@Override
public String toString() {
	return "Planter [planterheight=" + planterheight + ", planterShape=" + planterShape + ", planterCapacity=" + planterCapacity + ", drainageHoles="
			+ drinageHoles + ", planterColor=" + planterColor + ", getplanterShape()=" + getPlanterShape() + ", getPlanterId()=" + getPlanterId()
			+ ", getplanterCost()=" + getPlanterCost() + ", getPlanterStock()=" + getPlanterStock() + "]";
} 
}
