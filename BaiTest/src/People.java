public class People {
    private String name;
    private int age;
    private boolean sex;
    private double hieght;
    private  double weight;

    public People(){

    }
    public People(String name, int age, boolean sex,double hieght, double weight){
        this.name = "name";
        this.age = age;
        this.sex = sex;
        this.hieght = hieght;
        this.weight = weight;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public double getHieght() {
        return hieght;
    }

    public void setHieght(double hieght) {
        this.hieght = hieght;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", hieght=" + hieght +
                ", weight=" + weight +
                '}';
    }
}

