package day11.generics;

public class multiplepara {
    public static void main(String[] args){
        
        Pair<Integer, String> p1 = new Pair<>(101,"Abin");
        Pair<String, Integer> p2  = new Pair<>("Jibin" , 102);
        p1.display();
        p2.display();
        
    }
   
}
 class Pair<K , V>{
        K key;
        V value;

        Pair(K key , V value){
            this.key = key;
            this.value = value;

        }

        void display()
        {
            System.out.println("key"+key+", value : "+value);
        }
    }
  