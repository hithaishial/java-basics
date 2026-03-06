class Student{
  
  String studentId;
  String name;
  int age; 
  String gender;
  char grade; 
  float marks; 
  double attendance; 
  String email;
  long phoneNumber; 
  String address;
  
  static int count = 0;
  
  Student(){
    
	  System.out.println("constructor: Student");
	  count++;
  }
  
  Student(String studentId, String name, int age, String gender, char grade, float marks, double attendance, String email, long phoneNumber, String address){
    
	  this(name, age, gender, grade, marks, attendance, email, phoneNumber, address);
	  this.studentId = studentId;
	  System.out.println("studentId: " + studentId + ", name: " + name + ", age: " + age + ", gender: " + gender + ", grade: " + grade + ", marks: " + marks + ", attendance: " + attendance + ", email: " + email + ", phone number: " + phoneNumber + ", address: " + address);
      
  
  }
  
  Student(String name, int age, String gender, char grade, float marks, double attendance, String email, long phoneNumber, String address){
     
	  this(age, gender, grade, marks, attendance, email, phoneNumber, address);
	  this.name = name;
	  System.out.println("name: " + name + ", age: " + age + ", gender: " + gender + ", grade: " + grade + ", marks: " + marks + ", attendance: " + attendance + ", email: " + email + ", phone number: " + phoneNumber + ", address: " + address); 
      
  }
  
  Student(int age, String gender, char grade, float marks, double attendance, String email, long phoneNumber, String address){
	  
	  this(gender, grade, marks, attendance, email, phoneNumber, address);
	  this.age = age;
	  System.out.println("age: " + age + ", gender: " + gender + ", grade: " + grade + ", marks: " + marks + ", attendance: " + attendance + ", email: " + email + ", phone number: " + phoneNumber + ", address: " + address);
	    
  }
  
  Student(String gender, char grade, float marks, double attendance, String email, long phoneNumber, String address){
	  
	  this(grade, marks, attendance, email, phoneNumber, address);
      this.gender = gender;
	  System.out.println("gender: " + gender + ", grade: " + grade + ", marks: " + marks + ", attendance: " + attendance + ", email: " + email + ", phone number: " + phoneNumber + ", address: " + address);
	    
  }
  
   Student(char grade, float marks, double attendance, String email, long phoneNumber, String address){
	   
	   this(marks, attendance, email, phoneNumber, address);
	   this.grade = grade;
	   System.out.println("grade: " + grade + ", marks: " + marks + ", attendance: " + attendance + ", email: " + email + ", phone number: " + phoneNumber + ", address: " + address);
	   
   }
   
   Student(float marks, double attendance, String email, long phoneNumber, String address){
	   
	   this(attendance, email, phoneNumber, address);
	   this.marks = marks;
	   System.out.println("marks: " + marks + ", attendance: " + attendance + ", email: " + email + ", phone number: " + phoneNumber + ", address: " + address);
	   
   }
   
   Student(double attendance, String email, long phoneNumber, String address){
	   
	   this(email, phoneNumber, address);
	   this.attendance = attendance;
	   System.out.println("attendance: " + attendance + ", email: " + email + ", phone number: " + phoneNumber + ", address: " + address);
	   
   }  
   
   Student(String email, long phoneNumber, String address){
	   
	   this(phoneNumber, address);
	   this.email = email;
	   System.out.println("email: " + email + ", phone number: " + phoneNumber + ", address: " + address);
	   
   }

   Student(long phoneNumber, String address){
	   
	   this(address);
	   this.phoneNumber = phoneNumber;
	   System.out.println("phone number: " + phoneNumber + ", address: " + address);
	   
   }   
   
    Student(String address){
	   
	   this();
	   System.out.println("address: " + address);
	   
   }  
    void display(){
		System.out.println("student Id is: "+ studentId);
		System.out.println("name is: "+ name);
		System.out.println("age is: "+ age);
		System.out.println("gender is: "+ gender);
		System.out.println("grade is: "+ grade);
		System.out.println("marks scored is: "+ marks);
		System.out.println("attendance is: "+ attendance);
		System.out.println("email is: "+ email);
		System.out.println("phone number is: "+ phoneNumber);
		System.out.println("address is: "+ address);
		System.out.println("count of objects created: " + count);
	}   
  
 
 
}