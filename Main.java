
public class Main {

	public static void main(String[] args) {

		Courses course1 = new Courses(1, "Yazilim Gelistirici Yetistirme Kampi (C# + ANGULAR)", 0, "Engin Demirog");

		Courses course2 = new Courses(2, "Yazilim Gelistirici Yetistirme Kampi (JAVA + REACT)", 0, "Engin Demirog"); 

		Courses course3 = new Courses(3, "Programlamaya Giris icin Temel Kurs", 0, "Engin Demirog"); 
		
		
		
	Courses[] courses = {course1,course2,course3};
		
		//Kurslarin isimlerini yazdirir..
		for (Courses course : courses) {
			
			System.out.println(course.name);
		}
		
		
		Category category1 = new Category(1, "C#");

		Category category2 = new Category(2, "JAVA");
		
		Category category3 = new Category(3, "Temel Kurslar");
		
		
		Category[] category = {category1,category2,category3};

		
		//Kurslarin hangi kategoride oldugunu yazdirir..
		for (Category categories : category) {
			
			System.out.println(categories.name);

		}


			// Kurslarin her birini sepete ekler..
			CourseManager CourseManager = new CourseManager();
			
			CourseManager.addToCart(course1);
	
			CourseManager.addToCart(course2);

			CourseManager.addToCart(course3);

			// Kurslarin her birinin satin almasi gerceklestirilir..
			CourseManager BuymentManager = new CourseManager();
						
			BuymentManager.buymentComplete(course1);
				
			BuymentManager.buymentComplete(course2);

			BuymentManager.buymentComplete(course3);

	}
	

}
