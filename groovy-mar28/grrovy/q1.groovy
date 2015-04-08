public class Person {
     String name;
    int age
    char gender
    String address
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

     public void setAddress(String name) {
        this.address = name;
    }

    public String getAddress() {
        return address;
    }

     public void setAge(int a) {
        this.age = a;
    }

    public int getAge() {
        return age;
    }
 public void setGender(char c) {
        this.gender = c;
    }

    public char getGender() {
        return gender;
    }
 }
         Person ob = new Person()
        ob.setAddress("abc")
        print(ob.getAddress()) 
        ob.address="xyz"
        println ob.address
