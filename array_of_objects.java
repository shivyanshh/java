class demo {
    int rollno;
    String name;
    int marks;
}
public class array_of_objects {
    public static void main(String[] args){
        demo s1 = new demo();
        s1.rollno =1;
        s1.name = "navin";
        s1.marks = 87;

        //System.out.println(s1);
        demo s2= new demo();
        s2.rollno= 2;
        s2.name="akshit";
        s2.marks = 58;

        demo s3 = new demo();
        s3.rollno=3;
        s3.name="heer";
        s3.marks= 78;
        

        //created arrays--------------------------->>>
        //s1= {1,"navin",87}
        //s2={2,"akshit",58}
        //s3={3,"heer",78}

        



        
        demo students[]= new demo[3];

        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name+":"+students[i].marks);
        }

    }
    
}
