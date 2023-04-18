package aplication;

import java.util.Locale;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = input.nextLine();

		System.out.print("Price: ");
		double price = input.nextDouble();

		System.out.print("Quantity: ");
		int quantity = input.nextInt();

		Product product = new Product(name, price, quantity);

		System.out.println(product);

		System.out.print("Enter the number of products to be added in stock: ");
		product.adicionarProduto(input.nextInt());

		System.out.println(product);

		System.out.print("Enter the number of products to be removed from stock: ");
		product.removerProduto(input.nextInt());

		System.out.println(product);

		input.close();

	}

}
