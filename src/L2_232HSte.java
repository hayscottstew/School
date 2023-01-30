public class L2_232HSte {

   public String title;
   public String department;
   public int courseNumber;
   public int capacity;

   public L2_232HSte (String str1, String str2, int num1, int num2) {
      title = str1;
      department = str2;
      courseNumber = num1;
      capacity = num2;
   }
   public L2_232HSte () {
      title = "TBD";
      department = "TBD";
      courseNumber = 0;
      capacity = -1;
   }
   public String getTitle() {
      return title;
   }
   public String getDepartment() {
      return title;
   }
   public int getCourseNumber() {
      return courseNumber;
   }
   public int getCapacity() {
      return capacity;
   }
   public void setTitle(String title1) {
      title = title1;
   }
   public void setDepartment(String department1) {
      department = department1;
   }
   public void setCourseNumber(int courseNumber1) {
      courseNumber = courseNumber1;
   }
   public void setCapacity(int capacity1) {
      capacity = capacity1;
   }

   public static void main(String[] args) {

   }



}
