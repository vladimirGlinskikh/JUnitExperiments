package core.displayNameAnnotation;

public class SUT {
    public SUT(String ourSystemUnderTest) {

    }

    public SUT() {

    }

    public String hello() {
        return "Hello!";
    }

    public String talk() {
        return "How are you?";
    }

    public String bye() {
        return "Bye!";
    }

    public boolean canReceiveRegularWork() {
        return false;
    }

    public boolean canReceiveAdditionalWork() {
        return true;
    }
}
