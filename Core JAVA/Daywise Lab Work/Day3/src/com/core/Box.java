package com.core;

public class Box {

  private double width;
  private double depth;
  private double height;

  //Constructors
  public Box() {
    this.width = 10.0;
    this.depth = 20.0;
    this.height = 30.0;
  }

  public Box(double width, double depth, double height) {
    this.width = width;
    this.depth = depth;
    this.height = height;
  }

  public Box(double side) {
    // width = height = depth = side;
    //constructor chaining to Box(double width,double depth,double height)
    this(side, side, side);
  }

  //width, depth and height getter
  public String getBoxDetails() {
    return (
      "Width= " +
      this.width +
      " Depth= " +
      this.depth +
      " Height= " +
      this.height
    );
  }

  //volume
  public double getBoxVolume() {
    return this.width * this.height * this.depth;
  }

  public boolean isEqual(Box anotherBox)
  {
	  return anotherBox.width == this.width && anotherBox.height == this.height && anotherBox.depth == this.depth; 
  }
}
