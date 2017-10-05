public class person {
    private String name;
    private int age;
    private double height;

  public person(){
      this("Oliver Twist",27,1.8);
  }
    public person(String name,int age,double height){
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}