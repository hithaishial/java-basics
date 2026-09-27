class University {
    String universityId;
    String name;
    String location;
    String type;
    String deanName;
    String email;
    int ranking;
    int studentCount;
    int facultyCount;
    boolean isActive;

    static int count = 0;

    University(String universityId, String name, String location, String type, String deanName, String email, int ranking, int studentCount, int facultyCount, boolean isActive) {
        this(name, location, type, deanName, email, ranking, studentCount, facultyCount, isActive);
        this.universityId = universityId;
        System.out.println("University ID: " + universityId);
    }

    University(String name, String location, String type, String deanName, String email, int ranking, int studentCount, int facultyCount, boolean isActive) {
        this(type, deanName, email, ranking, studentCount, facultyCount, isActive);
        this.name = name;
        System.out.println("University Name: " + name);
    }

    University(String type, String deanName, String email, int ranking, int studentCount, int facultyCount, boolean isActive) {
        this(email, ranking, studentCount, facultyCount, isActive);
        this.type = type;
        System.out.println("Type: " + type);
    }

    University(String email, int ranking, int studentCount, int facultyCount, boolean isActive) {
        this(ranking, studentCount, facultyCount, isActive);
        this.email = email;
        System.out.println("Email: " + email);
    }

    University(int ranking, int studentCount, int facultyCount, boolean isActive) {
        this(studentCount, facultyCount, isActive);
        this.ranking = ranking;
        System.out.println("Ranking: " + ranking);
    }

    University(int studentCount, int facultyCount, boolean isActive) {
        this(facultyCount, isActive);
        this.studentCount = studentCount;
        System.out.println("Student Count: " + studentCount);
    }

    University(int facultyCount, boolean isActive) {
        this(isActive);
        this.facultyCount = facultyCount;
        System.out.println("Faculty Count: " + facultyCount);
    }

    University(boolean isActive) {
        this();
        this.isActive = isActive;
        System.out.println("Is Active: " + isActive);
    }

    University() {
        System.out.println("constructor: University");
        count++;
    }

    void display() {
        System.out.println("University ID: " + universityId);
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Type: " + type);
        System.out.println("Dean Name: " + deanName);
        System.out.println("Email: " + email);
        System.out.println("Ranking: " + ranking);
        System.out.println("Student Count: " + studentCount);
        System.out.println("Faculty Count: " + facultyCount);
        System.out.println("Is Active: " + isActive);
        System.out.println("Total objects created: " + count);
    }
}