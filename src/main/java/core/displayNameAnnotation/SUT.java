package core.displayNameAnnotation;

public class SUT {
    private String systemName;
    private boolean isVerified;

    public SUT(String systemName) {
        this.systemName = systemName;
        this.isVerified = false;
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

    public String getSystemName() {
        return systemName;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void verify() {
        this.isVerified = true;
    }
}
