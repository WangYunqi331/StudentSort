import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SortUtils {
    public Set<Student> sort(ArrayList a){
        TreeSet<Student> s=new TreeSet<>(new StudentComparator());
        s.addAll(a);
        return s;
    }

    public static void main(String[] args){
        Student s1=new Student("11");
        Student s2=new Student("27");
        Student s3=new Student("33");
        Student s4=new Student("1");
        Student s5=new Student("7");
        Student s6=new Student("6");
        Student s7=new Student("14");
        Student s8=new Student("97");
        Student s9=new Student("34");
        Student s10=new Student("227");
        Student s11=new Student("2");
        Student s12=new Student("68");
        Student s13=new Student("9");
        Student s14=new Student("23");
        Student s15=new Student("98");
        Student s16=new Student("42");
        Student s17=new Student("84");
        Student s18=new Student("319");
        Student s19=new Student("4");
        Student s20=new Student("54");
        ArrayList<Student> a=new ArrayList<>();
        a.add(s1);
        a.add(s2);
        a.add(s3);
        a.add(s4);
        a.add(s5);
        a.add(s6);
        a.add(s7);
        a.add(s8);
        a.add(s9);
        a.add(s10);
        a.add(s11);
        a.add(s12);
        a.add(s13);
        a.add(s14);
        a.add(s15);
        a.add(s16);
        a.add(s17);
        a.add(s18);
        a.add(s19);
        a.add(s20);

        SortUtils s=new SortUtils();
        System.out.println(s.sort(a));

    }
}
