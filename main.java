
import task2.model.Student;
import java.util.*;

class crud
{
    Map<Integer, Student> studentdta=new HashMap<>();
    String add(Student s)
    {
        studentdta.put(s.getId(),s);
        return "Student added sucessfully";
    }

    List read()
    {
        return studentdta.values().stream().toList();
    }

    Student readbyid(int id)
    {
        return studentdta.get(id);
    }

    String update(Student s)
    {
        if(studentdta.containsKey(s.getId()))
        {
            studentdta.put(s.getId(),s);
            return "Data Updated Successfully";
        }
        return "Data not found";
    }

    String delete(int id)
    {
        if(studentdta.containsKey(id))
        {
            studentdta.remove(id);
            return "Data deleted Successfully";
        }
        return "Data not found";
    }
}


public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=1;
        crud c1=new crud();
        while(choice!=6)
        {
                System.out.print("Press 1-Add details,2-Read details,3-Read by id,4-Update Details,5-Delete Details by id,6-Exit:");
                choice=sc.nextInt();
                if (choice==1)
                {
                    System.out.print("Enter your id,name,and marks:");
                    System.out.println(c1.add(new Student(sc.nextInt(),sc.next(),sc.nextInt())));
                } else if (choice==2) {
                    System.out.println(c1.read());
                } else if (choice==3) {
                    System.out.print("Enter your id:");
                    System.out.println(c1.readbyid(sc.nextInt()));
                } else if (choice==4) {
                    System.out.print("Enter your id(id which u want to modify),name,and marks:");
                    System.out.println(c1.add(new Student(sc.nextInt(),sc.next(),sc.nextInt())));
                }
                else if(choice==5){
                    System.out.print("Enter your id:");
                    System.out.println(c1.delete(sc.nextInt()));
                }

        }
    }
}

