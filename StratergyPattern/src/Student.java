/**
 * Created by Asus PC on 1/25/2017.
 */
public class Student {

   protected Study study;

    Student(){
        study = new NoStudy();
    }

    public void getStudyState(){
        study.getStudyState();
    }
}
