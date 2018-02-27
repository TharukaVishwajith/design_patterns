/**
 * Created by Asus PC on 1/25/2017.
 */
public interface Study {

    void getStudyState();
}

class StudyHard implements Study{

    @Override
    public void getStudyState() {
        System.out.println("I'm Studying hard!");
    }
}

class NoStudy implements Study{

    @Override
    public void getStudyState() {
        System.out.println("I don't study!");
    }
}