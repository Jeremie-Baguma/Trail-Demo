// GeneralClass.java
public class GeneralClass {

    // Private inner class
    class PrivateInnerClass {
        public void display() {
            System.out.println("This is the PrivateInnerClass");
        }
    }

    // Protected inner class
    protected class ProtectedInnerClass {
        public void display() {
            System.out.println("This is the ProtectedInnerClass");
        }
    }

    // Method to return an instance of the private inner class
    public PrivateInnerClass getPrivateInnerClassInstance() {
        return new PrivateInnerClass();
    }
}

