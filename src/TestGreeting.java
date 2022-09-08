public class TestGreeting {
    public static void main(String[]args){
        Greeting gr = new Greeting();
        gr.greet();
        for( int i = 0; i < 10; i+=2){
            int a = i * 2;
            System.out.println(a);
        }
    }
}
