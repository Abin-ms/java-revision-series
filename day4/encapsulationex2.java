package day4;

class encapsulationex2 {
    public static void main(String[] args){
        person pp = new person();
        pp.setage(20);
        System.out.println("The age is : " +pp.getAge());
    }
}

class person{
    private int age;
    public void setage(int age){
        this.age = age;

    }
    public int getAge(){
        return age;
    }
}
