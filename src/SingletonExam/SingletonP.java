package SingletonExam;

public class SingletonP {

    private static SingletonP singleton = new SingletonP();

    public static SingletonP getInstance() {
        return singleton;

    }

        public void mywork() {
            System.out.println("This is how singleton work");
        }

}
