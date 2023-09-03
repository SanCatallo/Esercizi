package Esercizi.Interfaces;

public class CollegeTester {
    public static void main(String[] args) {
        Student student = new Student("Aaaaaa", "Aaaaa", 1111, 3);
        Professor professor = new Professor("Bbbbbb", "Bbbb", 2222, "Math");
        Assistant assistant = new Assistant("Cccccc", "cccc", 3333, true);

        System.out.println("Student:");
        student.goToCollege();
        System.out.println();

        System.out.println("Student is studying at home:");
        student.studyAtHome();
        System.out.println();


        System.out.println("Professor:");
        professor.goToCollege();
        System.out.println();

        System.out.println("Professor is teaching:");
        professor.teachToOtherPeople();
        System.out.println();


        System.out.println("Assistant:");
        assistant.goToCollege();
        System.out.println();

        System.out.println("Assistant is studying and teaching:");
        assistant.studyAtHome();
        assistant.teachToOtherPeople();
    }
}
