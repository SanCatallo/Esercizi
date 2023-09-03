package Esercizi.Interfaces;

interface LearningPerson{
    void studyAtHome();
}

interface TeachingPerson{
    void teachToOtherPeople();
}

class CollegePerson {
    private String name;
    private String surname;
    private int collegeId;

    public CollegePerson(String name, String surname, int collegeId){
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
    }
    public void goToCollege(){
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("CollegeId: " + collegeId);
    }
}
