public class Flow {
    public void methodA(){
        System.out.print("J");
        methodB();
    }
    public void methodB(){
        System.out.print("a");
        methodC();
    }
    public void methodC(){
        System.out.print("v");
        methodD();
    }
    public void methodD(){
        System.out.print("a ");
        System.out.print("e");
        System.out.print("r ");
        System.out.print("s");
        System.out.print("j");
        System.out.print("o");
        System.out.print("v");
        System.out.print("t");
    }
}
