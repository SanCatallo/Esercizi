package Esercizi.Interfaces;

class Assistant extends CollegePerson implements LearningPerson, TeachingPerson{

    private boolean isGoingToBeAPhD;
    public Assistant(String name, String surname, int collegeId, boolean willBeAPhD){
        super(name, surname, collegeId);
        this.isGoingToBeAPhD = willBeAPhD;
    }

    @Override
    public void studyAtHome() {
        String phDMessage = isGoingToBeAPhD ? " and preparing for a Ph.D." : "";
        System.out.println("Is studying at home" + phDMessage);
    }

    @Override
    public void teachToOtherPeople() {
        String phDMessage = isGoingToBeAPhD ? " and preparing for a Ph.D." : "";
        System.out.println("Is studying at home" + phDMessage);
    }
}
