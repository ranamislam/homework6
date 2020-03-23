package OOP_features;
public class Student extends Name implements StudentGroup,Award
{
    public double gpa = 3.83;

    public Student() {}

    public Student(String fName, String lName)
    {
        super(fName, lName);
    }

    public Student(String fName, String mName, String lName)
    {
        super(fName, mName, lName);
    }

    public double getGPA()
    {
        return gpa;
    }

    public String studentGroup()
    {
        return "ESL";
    }

    public String award()
    {
        return "Honors, Dean's list";
    }
}

