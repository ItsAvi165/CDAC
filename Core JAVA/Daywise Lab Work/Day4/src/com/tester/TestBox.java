package com.tester;

import com.core.Box;
import java.util.Scanner;

class TestBox {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dimension of Cuboid: (width,depth,height) ");
		Box cuboid = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		System.out.println("Cuboid dimension: " + cuboid.getBoxDetails());
		System.out.println("Cuboid volume: " + cuboid.getBoxVolume());

		System.out.println("Enter side of cube: ");
		Box cube = new Box(sc.nextDouble());
		System.out.println("Cube dimension: " + cube.getBoxDetails());
		System.out.println("Cube volume: " + cube.getBoxVolume());

		Box cuboid1, cuboid2;

		System.out.println("Enter dimension of Cuboid 1: (width,depth,height) ");
		cuboid1 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		System.out.println("Enter dimension of Cuboid 2: (width,depth,height) ");
		cuboid2 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		System.out.println(cuboid1.isEqual(cuboid2) ? "Equal" : "Not equal");
		
		
		System.out.println("Width updation of box1= "+cuboid1.doubleWidth());
		System.out.println("Width updation box2 = "+cuboid2.doubleWidth());

		sc.close();
	}
}
