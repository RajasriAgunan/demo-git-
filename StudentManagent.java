public class StudentManagent {
    private int rollno;
    private String name;
    private int age;

    public   StudentManagent(int rollno, String name, int age) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollno = rollno;
        if (!isValidName(name))
            throw new NameNotValidException("Name contains number or special character,Please provide a valid name");
        this.name = name;
        if (!isValidAge(age))
            throw new AgeNotWithinRangeException("Number should be between 15 and 21,Please provide a valid age");
        this.age = age;
    }
        private boolean isValidAge(int age) {
            return age >=15 && age<= 21;
        }
        private boolean isValidName (String name){
            if (name.matches("[a-z A-Z]")) return true;
            else return false;
        }
        public static void main(String[] args) throws AgeNotWithinRangeException, NameNotValidException {
            try {
                StudentManagent studentManagent = new StudentManagent(01, "Petr2@_", 26);
            System.out.println(studentManagent.isValidAge(15));
            }catch (NameNotValidException e)
            {
                System.out.println(e.getMessage());
            }
            try
            {
               StudentManagent studentManagent1=new StudentManagent(02,"Sara",19);
                System.out.println(studentManagent1.isValidName("petr2@"));
            }catch (AgeNotWithinRangeException e1){
System.out.println(e1.getMessage());
            }
        }
}