// SubClass.java
public class SubClass extends GeneralClass {

    public void createAndDisplayInnerClasses() {
        // Accessing the private inner class via the method
        PrivateInnerClass privateInner = getPrivateInnerClassInstance();
        privateInner.display();  // This will work now

        // Accessing the protected inner class directly
        ProtectedInnerClass protectedInner = new ProtectedInnerClass();
        protectedInner.display();  // This will work fine
    }

    public static void main(String[] args) {
        SubClass subclass = new SubClass();
        subclass.createAndDisplayInnerClasses();
    }
}
