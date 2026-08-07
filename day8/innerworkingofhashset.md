This actually shows the test case where the hashset finds dupicate value .

---
Student s1 = new Student(101, "Abin");
Student s2 = new Student(101, "Abin");

System.out.println(s1.equals(s2));

System.out.println(s1.hashCode() == s2.hashCode());

HashSet<Student> set = new HashSet<>();

set.add(s1);
set.add(s2);

System.out.println(set.size());
---
Here's what happens internally : 

s1
 ↓
hashCode()
 ↓
Bucket 5
 ↓
Store

s2
 ↓
hashCode()
 ↓
Bucket 5
 ↓
equals(s1)?
 ↓
true
 ↓
Duplicate
 ↓
Don't store
