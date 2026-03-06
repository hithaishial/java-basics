class MainRunner{
	//Burger burger= new Burger();

  public static void main(String[] args){
  
    Student student = new Student("STU1023", "Hithaishi", 19, "Female", 'A', 89.5f, 92.3, "hithaishi.23@gamil.com", 9876543210L, "Bengaluru, Karnataka, India");
	Student student1 = new Student("Female", 'A', 89.5f, 92.3, "hithaishi.23@gamil.com", 9876543210L, "Bengaluru, Karnataka, India");
	Student student2 = new Student(9876543210L, "Bengaluru, Karnataka, India");
	student.display();
	student1.display();
	student2.display();
	
    
	
	System.out.println(" ");
    
	BankAccount acc = new BankAccount("ACC2026", "hithaishi", "Savings", 45230.75, "MG Road Branch", "HDFC0001234", "hithaishi.23@gamil.com", 9876543210L, true, "01-03-2024");
    BankAccount acc1= new BankAccount(45230.75, "MG Road Branch", "HDFC0001234", "hithaishi.23@gamil.com", 9876543210L, true, "01-03-2024");
	acc.display();
	acc1.display();
	System.out.println(" ");
	
	Laptop lap  = new Laptop("Dell", "Intel i7", 16, 512, 75000.0f, "Windows 11", true, 15.6, "Silver", 2);
	Laptop lap1  = new Laptop(512, 75000.0f, "Windows 11", true, 15.6, "Silver", 2);
	Laptop lap2  = new Laptop(true, 15.6, "Silver", 2);
	lap.display();
	lap1.display();
	lap2.display();
	
	System.out.println(" ");
	
	Car car  = new Car( 2022, "Petrol", 18.5, "Automatic", 1500000.0f, "White", 5, false);
	Car car1  = new Car( 18.5, "Automatic", 1500000.0f, "White", 5, false);
	Car car2  = new Car( "White", 5, false);
	Car car3  = new Car("Automatic", 1500000.0f, "White", 5, false);
	Car car4  = new Car(false);
	car.display();
	car1.display();
	car2.display();
	car3.display();
	car4.display();
    
	System.out.println(" ");
	
	Restaurant r  = new Restaurant("RES101", "Spice Garden", "Bengaluru", "Indian", 120, 4.5f, "080-23456789", true, "Arjun Mehta", 2005);
	Restaurant r1  = new Restaurant("Indian", 120, 4.5f, "080-23456789", true, "Arjun Mehta", 2005);
	r.display();
	r1.display();
	
	System.out.println(" ");
	
  
   Burger burger= new Burger(4, 600, "crispy chicken", 400, 650);
   burger.display();
   System.out.println(" ");
   
   Hospital h = new Hospital("HSP101", "CityCare", "Bengaluru", "Cardiology", "9876543210", 500, 100, 300, 4.7f, true);
   Hospital h2 = new Hospital("HSP102", "LifeLine", "Mysuru", "Neurology", "9123456780", 300, 80, 200, 4.5f, false);
   h.display();
   h2.display();
   
   System.out.println(" ");
   
   Mobile mobile = new Mobile("MOB101", "Samsung", "Galaxy S25", "Android", "Black", 12, 256, 5000, 79999.0, 2026);
   mobile.display();
   
   System.out.println(" ");
   
   University uni = new University(95, false);
   University uni1 = new University();
   uni.display();
   uni1.display();
   
   System.out.println(" ");
   
   Movie m = new Movie("MOV101", "The Great Adventure", "John Smith", "Action", "English", "ABC Productions", 2025, 150, 8.7, true);
   Movie m1 = new Movie("MOV102", "Romantic Saga", "Jane Doe", "Romance", "Hindi", "XYZ Studios", 2026, 120, 7.9, false);
   m.display();
   m1.display();
   
   System.out.println(" ");
   
   Employee emp = new Employee("EMP101", "Hithaishi", "Engineering", "Software Developer", "hithaishi@company.com", 25, 75000.0, 9876543210L,"Bengaluru, India", true);
   emp.display();
   
   System.out.println(" ");
   
   SmartWatch sw1 = new SmartWatch("SW101", "Apple", "Watch Series 10", "watchOS", "Black", "Heart Rate, GPS, Sleep Tracking", 24, 2026, 49999.0, true);
   SmartWatch sw2 = new SmartWatch("SW102", "Samsung", "Galaxy Watch 8", "WearOS", "Silver", "Fitness Tracking, Notifications, ECG", 36, 2026, 39999.0, false);
   SmartWatch sw3 = new SmartWatch("SW103", "Garmin", "Forerunner 965", "GarminOS", "Blue", "Running Metrics, VO2 Max, GPS", 48, 2025, 45999.0, true);
   SmartWatch sw4 = new SmartWatch("SW104", "Fitbit", "Versa 5", "FitbitOS", "Pink", "Sleep Tracking, Heart Rate, Steps", 30, 2024, 29999.0, true);
   SmartWatch sw5 = new SmartWatch("SW105", "Huawei", "Watch GT 5", "HarmonyOS", "Green",  "Health Monitoring, GPS, Notifications", 40, 2026, 34999.0, true);
   sw1.display();
   sw2.display();
   sw3.display();
   sw4.display();
   sw5.display();
   
   System.out.println(" ");
   
   Book b1 = new Book("B101", "Java Programming", "James Gosling", "TechPress", "Education", "English", 500, 2020, 799.0, true);
   Book b2 = new Book("Education", "English", 350, 2018, 599.0, true);
   Book b3 = new Book();
   b1.display();
   b2.display();
   b3.display();
   
   System.out.println(" ");
   
   Flight f1 = new Flight("FL101", "AI202", "Air India", "Bengaluru", "Delhi", "Domestic", 180, 150, 5999.0, true);
   Flight f2 = new Flight("FL102", "EK501", "Emirates", "Dubai", "London", "International", 300, 420, 45999.0, true);
   Flight f3 = new Flight("FL103", "SG401", "SpiceJet", "Mumbai", "Chennai", "Domestic", 200, 90, 3999.0, true);
   Flight f4 = new Flight("FL104", "BA301", "British Airways", "London", "New York",  "International", 350, 480, 55999.0, false);
   Flight f5 = new Flight("FL105", "QF101", "Qantas", "Sydney", "Melbourne", "Domestic", 220, 60, 2999.0, true);
   f1.display();
   f2.display();
   f3.display();
   f4.display();
   f5.display();

   


   
   
}}
