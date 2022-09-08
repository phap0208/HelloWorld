

public class Account {
    int id;
    String name;
    int balance;
    //Hàm khởi tạo với số dư = 0
    public Account(int id, String name){
        this.id = id;
        this.name = name;
        this.balance = 0;
    }
    //Hàm khởi tạo có số dư
    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    void display(){
        System.out.println("STK:" + id +",  Ten TK:" + name + ", So du:"+ balance);
    }
    public static void main(String[]args){
        Account tk1 = new Account(92,"Hong Tam");
        Account tk2 = new Account(232, "Sinh Duc", 1000000);
        tk1.display();
        tk2.display();
    }
}
