package com.dbs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadSpecies {

	public static void main(String[] args) {

		List<Spacies> spaciesList = new ArrayList<Spacies>();

		try (Scanner scanner = new Scanner(System.in)) {

			try {

				int noOfSpacies = Integer.parseInt(scanner.nextLine());

				String AnimalOrMammal;
				for (int i = 1; i <= noOfSpacies; i++) {

					AnimalOrMammal = scanner.nextLine();

					if (AnimalOrMammal.trim().equalsIgnoreCase("A")) {
						// read Animal name, noOfLegs
						spaciesList.add(new Animal(scanner.nextLine(), Integer.parseInt(scanner.nextLine())));

					} else if (AnimalOrMammal.trim().equalsIgnoreCase("M")) {
						// read Mammal
						readMammal(scanner, spaciesList);
					}

				}

				printSpacies(spaciesList, Animal.class);
				printSpacies(spaciesList, Mammal.class);

			} catch (Exception e) {

				e.printStackTrace();
				System.out.println("Error while reading input content");
			}
		}

	}

	public static interface Spacies {

		String getName();

		int getNumberOfLegs();

		String getType();
	}

	public static class Animal implements Spacies {

		private String name;
		private int noOfLegs;

		public Animal(String name, int noOfLegs) {
			this.name = name;
			this.noOfLegs = noOfLegs;
		}

		public String getName() {
			return name;
		}

		public int getNumberOfLegs() {
			return noOfLegs;
		}

		public String getType() {

			return "ANIMAL";
		}

		@Override
		public String toString() {
			return name + " " + noOfLegs;
		}

	}

	public static class Mammal implements Spacies {

		private String name;
		private int noOfLegs;
		private String mammalType;
		private int totalNoOfDifferentFoods;
		private List<String> foods;

		public Mammal(String name, String type, int totalNoOfDiffFoods, List<String> foods) {
			this.name = name;
			this.noOfLegs = 4;
			this.mammalType = type;
			this.totalNoOfDifferentFoods = totalNoOfDiffFoods;
			this.foods = foods;

		}

		public String getName() {
			return name;
		}

		public int getNumberOfLegs() {
			return noOfLegs;
		}

		public String getType() {
			return mammalType;
		}

		public String getMammalType() {
			return mammalType;
		}

		public int getTotalNoOfDifferentFoods() {
			return totalNoOfDifferentFoods;
		}

		public List<String> getFoods() {
			return foods;
		}

		@Override
		public String toString() {

			return name + " " + noOfLegs + "\n" + getType() + "\n" + totalNoOfDifferentFoods + ": "
					+ String.join(" ", foods);

		}

	}

	public static void readMammal(Scanner scanner, List<Spacies> spaciesList) throws Exception {

		String name = scanner.nextLine();
		String type = scanner.nextLine();
		int totalNoOfDiffFoods = Integer.parseInt(scanner.nextLine());

		List<String> foodList = new ArrayList<String>();
		for (int i = 0; i < totalNoOfDiffFoods; i++) {

			foodList.add(scanner.nextLine());

		}

		spaciesList.add(new Mammal(name, type, totalNoOfDiffFoods, foodList));

	}

	public static void printSpacies(List<Spacies> spaciesList, Class<? extends Spacies> className) {

		for (Spacies spacies : spaciesList) {

			if (className.isInstance(spacies)) {
				System.out.println(spacies);
			}

			System.out.println();
		}
	}

}
