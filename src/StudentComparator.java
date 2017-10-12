import java.io.Serializable;
        import java.util.Comparator;

public class StudentComparator implements Comparator<Student>,java.io.Serializable{
    public int compare(Student s1,Student s2){
        if(new Integer(s1.getName())>new Integer(s2.getName()))
            return -1;
        else if(new Integer(s1.getName())<new Integer(s2.getName()))
            return 1;
        else
            return 0;
    }
}
