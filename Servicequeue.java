package servicequeue;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class Servicequeue {
    public static void main(String[] args) {
     Scanner scanjen = new Scanner(System.in);

        Queue<String> students = new LinkedList<>();       
        for (int i = 0; i < 3; i++) {
         System.out.print("Enter student name " + (i + 1) + ": ");
        String name = scanjen.nextLine();
        students.offer(name);
        }
         System.out.print("\nService Order: ");
        int count = 0;
        for (String student : students) {
         System.out.print(student);

        
        if (count < students.size() - 1) {
         System.out.print(", ");
        }
        count++;
        }
         System.out.println();      
  
        if (!students.isEmpty()) {
         System.out.println("Serving: " + students.poll());
        }        
         System.out.print("\nEnter new student: ");
        String newStudent = scanjen.nextLine();
        students.offer(newStudent);
          
        
        
        while (!students.isEmpty()) {
         System.out.println("Update Service Order: " + students.poll());
        }

         System.out.println("QUEUE IS EMPTY!.");

        scanjen.close();
    }
}