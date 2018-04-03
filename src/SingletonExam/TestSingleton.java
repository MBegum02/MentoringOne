package SingletonExam;

public class TestSingleton {
    public static void main(String[] args) {
        SingletonP singleton = SingletonP.getInstance();
        singleton.mywork();
    }
}
