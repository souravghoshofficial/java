class Instructor {
    private String name;
    private String phoneNumber;

    public void setInstructor(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void viewInstructor() {
        System.out.println("Instructor Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
    }
}

class TextBook {
    private String title;
    private String author;
    private String publisher;

    public void setTextBook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public void viewTextBook() {
        System.out.println("TextBook Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
    }
}

class Course {
    private String courseName;
    private Instructor instructor;
    private TextBook textBook;

    public void setCourse(String courseName, Instructor instructor, TextBook textBook) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textBook = textBook;
    }

    public void viewCourse() {
        System.out.println("Course Name: " + courseName);
        instructor.viewInstructor();
        textBook.viewTextBook();
    }
}

public class CourseProgram {
    public static void main(String[] args) {
        Instructor inst = new Instructor();
        inst.setInstructor("Dr. Sinha", "9876543210");

        TextBook book = new TextBook();
        book.setTextBook("Object-Oriented Programming", "Grady Booch", "Pearson");

        Course course = new Course();
        course.setCourse("BCSE 101 - OOP", inst, book);

        course.viewCourse();
    }
}
