public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        // Drop your getters and setters below for the Student class.
        public String getName() {
                return this.name;
        }
        public void setName (String aName) {
                name = aName;
        }

        public int getStudentID() {
                return studentId;
        }
        public void setStudentId (int ID) {
                studentId = ID;
        }

        public int getNumberOfCredits() {
                return numberOfCredits;
        }

        public void setNumberOfCredits(int numberOfCredits) {
                this.numberOfCredits = numberOfCredits;
        }

        public void setGpa(double gpa) {
                this.gpa = gpa;
        }

        public double getGpa() {
                return gpa;
        }

        public Student(String aName, int aID, int aCredits, double aGPA) {
                name = aName;
                studentId = aID;
                numberOfCredits = aCredits;
                gpa = aGPA;
        }
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

}
