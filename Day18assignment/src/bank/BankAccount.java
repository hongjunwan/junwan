package bank;
 
/*
 * ����       : ���� ���¸� �����ϰ�, �Ա� ����� ������ Ŭ����
 * �ۼ���  : ������
 * ���� ����    : 2017-08-11
 */
 
public class BankAccount{
    private String ownerName;       // ���� ������ �̸�
    private String accountNumber;   // ���� ��ȣ
    private String password;        // ��й�ȣ(�������� ������ �ƴϹǷ� int ������� ����)
    private int balance;            // �ܾ� ����
     
    private static final int acNumSeed=11111; // ���¹�ȣ�� �ο��ϱ����� �⺻��
    private static int customerCount=0; // ȸ�� ��
    public static int getCustomerCount(){
        return customerCount;
    }
/////////////////////////////////////////////////////////   
    public BankAccount() {
    	this.accountNumber = (acNumSeed+customerCount)+"";
        customerCount++;
    }
    public BankAccount(String name, String pw, int init_money){
        // ������� �̸�, ��й�ȣ, �ʱ�ݾ��� �Է¹޾Ƽ� ������� ��ü�� ����.
        this.ownerName = name;
        this.password = pw;
        this.balance = init_money;
        this.accountNumber = (acNumSeed+customerCount)+"";
    
    }
    // �Ա� �޼ҵ�
    public boolean deposit(int money){
        if(money>0){
            balance+=money;
            return true;
        }else{
            System.out.println("�Աݾ� ������ �̻��մϴ�.");
            return false;
        }
    }
    // ��� �޼ҵ�
    public boolean withdraw(int money){
        if(balance<money){
            System.out.println("�ܾ׺���");
            return false;
        }else{
            this.balance -= money;
            return true;
        }
    }
    // ��й�ȣ Ȯ�� �޼ҵ�
    public boolean passwordCheck(String password){
        return (this.password.equals(password));
    }
    // �۱� �޼ҵ�
    public void transferTo(BankAccount other, int money){
        if(this.withdraw(money)){
            other.deposit(money);
        }
        System.out.println("�۱� �Ǿ����ϴ�." + "\n�۱� �� �ܾ�: " + balance);
    }

//////getter/setter/////////////////////////////////////////////////////////////    
    public String getOwnerName() {
        return ownerName;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    public void setPassword(String password) {
        this.password = password;
    }
////////////////////////////////////////////////////////////////////////////////
    public void printAccount(){
        System.out.println("***********���� ����**************");
        System.out.println("* ������ : "+ownerName);
        System.out.println("* ���¹�ȣ : "+accountNumber);
        System.out.println("* �ܾ� : "+balance);
        System.out.println("**********************************");
    }
     
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
 
