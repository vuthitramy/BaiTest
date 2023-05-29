public class Teacher extends People{
    private String level;
    private String experience;
    private String subject;

    public Teacher (String abc, int i, boolean b, int i1, int i2, String ts, int i3, String oop2){
      super();
      this.level = "THS , TS";
      this.experience = " ";
      this.subject = " ";

    }
    public Teacher (){
        super();
        this.level = level;
        this.experience = experience;
        this.subject = subject;


    }

    @Override
    public String toString() {
        return "Teacher{" +
                "level='" + level + '\'' +
                ", experience='" + experience + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
