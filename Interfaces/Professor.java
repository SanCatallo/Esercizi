package Esercizi.Interfaces;

class Professor extends CollegePerson implements TeachingPerson{
    private String teachingSubject;

    public Professor(String name, String surname, int collegeId, String teachingSubject){
        super(name, surname, collegeId);
        this.teachingSubject = teachingSubject;
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("Is teaching " + teachingSubject);
    }

}
