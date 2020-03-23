package OOP_features;
public class University
{
    public static void main(String[] args)
    {
        Student nameWithoutMiddleName = new Student("Orrko", "Tori");
        Student nameWithMiddleName = new Student("Orrko", "Shwopno", "Tori");

        System.out.println("Student's name without middle name:" +
                           "\nFirst name: " + nameWithoutMiddleName.getFirstName() +
                           "\nLast name: " + nameWithoutMiddleName.getLastName() +
                           "\n" +
                           "\n--  --  --  --  --  --  --  --  --  --  --" +
                           "\n" +
                           "\nStudent's name with middle name:" +
                           "\nFirst name: " + nameWithMiddleName.getFirstName() +
                           "\nMiddle name: " + nameWithMiddleName.getMiddleName() +
                           "\nLast name: " + nameWithMiddleName.getLastName());

        System.out.println("\n----------------------------------------\n" +
                           "\nStudent ID: " + nameWithMiddleName.getStudentID() +
                           "\nDate of birth: " + nameWithMiddleName.getDateOfBirth() +
                           "\nAccess to library: " + nameWithMiddleName.getLibraryAccessInfo() +
                           "\nStudent group " + nameWithMiddleName.studentGroup() +
                           "\nAward(s): " + nameWithMiddleName.award() +
                           "\nGPA: " + nameWithMiddleName.getGPA());
    }
}
