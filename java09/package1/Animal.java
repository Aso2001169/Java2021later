package package1;

public class Animal {
    private String name;
    public int age;
    protected int weight;

    public void testPublic(){
        System.out.println("testPublicが呼ばれました");
    }
    protected void testProtected(){
        System.out.println("testProtectedが呼ばれました");
    }
    private void testPrivate(){
        System.out.println("testPrivateが呼ばれました");
    }
}

