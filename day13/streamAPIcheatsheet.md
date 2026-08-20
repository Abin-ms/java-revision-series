Stream API
├── stream()                    
├── filter()                    
├── map()                       
├── filter + map                
├── sorted()                    
├── distinct()                  
├── skip()                      
├── limit()                     
└── Terminal operations
    ├── forEach()               
    ├── count()                 
    ├── collect()               
    └── reduce()             


---
###   Collectors.toSet()

# It's very similar to toList(), but the result is a Set, so duplicates are removed.

List<Integer> numbers =
        Arrays.asList(10, 20, 10, 30, 20, 40);

Set<Integer> result = numbers.stream()
        .collect(Collectors.toSet());

System.out.println(result);

---
The result contains:
[10, 20, 30, 40]

---

The key difference:

Collectors.toList()
       ↓
List → duplicates allowed

Collectors.toSet()
       ↓
Set → duplicates removed
