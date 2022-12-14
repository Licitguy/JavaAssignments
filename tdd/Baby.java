package tdd;

public class Baby {
    private int age;

    private int weightInKg;

    private String name;
    //required constructor
    public Baby(int babyWeightAtBirth){
        weightInKg = babyWeightAtBirth;

    }
    public Baby(String babyNameAtBirth){
        name= babyNameAtBirth;
    }

    public Baby(String babyNameAtBirth, int babyAtWeight) {
        name = babyNameAtBirth;
        weightInKg = babyAtWeight;


    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeightInkg() {
        return weightInKg;
    }
        public Baby(){
    }
}