    package day9;

    import java.util.Comparator;
    import java.util.TreeSet;

    public class comparatormodified {
        public static void main(String[] args){


            Comparator<Student> byName = 
            (s1,s2) ->s1.name.compareTo(s2.name);

            Comparator<Student> byId = 
            (s1,s2) ->Integer.compare(s1.id, s2.id);

            Comparator<Student> byNameDescending = byName.reversed();
            
           

        TreeSet<Student> students = new TreeSet<>(byName , byId , byNameDescending);
        
            students.add(new Student(103, "John"));
            students.add(new Student(101, "Abin"));
            students.add(new Student(102, "Rahul"));
            students.add(new Student(103, "Jibi"));
            students.add(new Student(104, "Abin"));

            System.out.println(students);

        }
    }

    class Student {
        int id;
        String name;

        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
        
        @Override
        public String toString() {
            return "Student{id=" + id +
                    ", name='" + name + "'}";
        }
    
    }

