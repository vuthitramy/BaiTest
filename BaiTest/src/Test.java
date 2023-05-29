public class Test {


    public static void main(String[] args) {
        People people = new People();
        System.out.println(people);

        people = new People("tra my", 18, false,1.67,56);
        System.out.println(people);

        Teacher teacher = new Teacher();
        System.out.println(teacher);

        teacher = new Teacher("tú anh", 24, true ,  169, 1, "TS",0, "OPP2");
        System.out.println(teacher);
    }
    }
