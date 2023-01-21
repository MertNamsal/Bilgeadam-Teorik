package com.mertnamsal;

//Bir sınıfı private olarak tanımlayabilriz ancak bu private sınıf mutlaka bir inner sınıf veya nested sınıf olmak zorundadır.
//Bir private sınıfı ayrı bir top level sınıf tanımlayamayız çünkü bu şekilde anlamsız olur.

public class InnerClassExample {
	
	public class TestSinifi {      			//public de olur
		public void test() {
			System.out.println("test");
		}
	}

	public static void main(String[] args) {
		
		InnerClassExample innerClassExample = new InnerClassExample();
		InnerClassExample.TestSinifi testSinifi = innerClassExample.new TestSinifi();
		testSinifi.test();

	}

}
