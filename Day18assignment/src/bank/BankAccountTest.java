package bank;
 
import java.util.LinkedList;
import java.util.Scanner;
 
public class BankAccountTest {
    public static void main(String[] args) {
        // ���α׷� ���࿡ �ʿ��� ���� ����
        String name;
        String pw;
        String accountNumber;
        String otAccountNumber;
        String check;
        int initMoney;
        int money;
        int count = 0;
 
        LinkedList<BankAccount> bankA = new LinkedList<>();
        //BankAccount[] bankA = new BankAccount[100];
 
        Scanner input = new Scanner(System.in);
 
        while (true) {
            System.out.println("\n -- 1:���� 2:�Ա� 3:��� 4:�۱� 5:������ȸ 6:�������� -1:���� -- ");
            System.out.print(" -- select >");
            int select = input.nextInt();
 
            if (select == -1)
                break;
 
            switch (select) {
            case 1: // ����
                System.out.print("�̸��� �Է��Ͻÿ�: ");
                name = input.next();
                System.out.print("��й�ȣ�� �Է��Ͻÿ�: ");
                pw = input.next();
                System.out.print("�ʱ� �ݾ��� �Է��Ͻÿ�: ");
                initMoney = input.nextInt();
                bankA.add(new BankAccount(name, pw, initMoney));
                bankA.get(bankA.size() - 1).printAccount();
                break;
            case 2: // �Ա�
                System.out.print("������ ���¹�ȣ�� �Է��Ͻÿ�: ");
                accountNumber = input.next();
                for (int x = 0; x < bankA.size(); x++) {
                    if (bankA.get(x).getAccountNumber().equals(accountNumber)) {
                        System.out.print("��� ��ȣ�� �Է��Ͻÿ�: ");
                        pw = input.next();
                        if (true == bankA.get(x).passwordCheck(pw)) {
                            System.out.println("***��й�ȣ Ȯ�� �Ϸ�***");
                            System.out.print("�Ա��� �ݾ��� �Է��Ͻÿ�: ");
                            money = input.nextInt();
                            bankA.get(x).deposit(money);
                            System.out.println("�Ա� �� �ܾ�: " + bankA.get(x).getBalance());
                        } else {
                            count = 0;
                            while (true) {
                                System.out.println("�߸��� ��й�ȣ �Դϴ�.�ٽ� �Է��ϼ���");
                                System.out.print("��� ��ȣ�� �Է��Ͻÿ�: ");
                                pw = input.next();
                                if (true == bankA.get(x).passwordCheck(pw)) {
                                    System.out.println("***��й�ȣ Ȯ�� �Ϸ�***");
                                    System.out.print("�Ա��� �ݾ��� �Է��Ͻÿ�: ");
                                    money = input.nextInt();
                                    bankA.get(x).deposit(money);
                                    System.out.println("�Ա� �� �ܾ�: " + bankA.get(x).getBalance());
                                    break;
                                }
                                count++;
                                if (count == 4) {
                                    System.out.println("��й�ȣ �Է� �ʰ�.");
                                    break;
                                }
                            }
                        }
                        break;
                    } else if (x == bankA.size() - 1
                            && bankA.get(x).getAccountNumber() != accountNumber) {
                        System.out.println("�߸��� ���¹�ȣ �Դϴ�.");
                    }
                }
                break;
            case 3: // ���
                System.out.print("������ ���¹�ȣ�� �Է��Ͻÿ�: ");
                accountNumber = input.next();
                for (int x = 0; x < bankA.size(); x++) {
                    if (bankA.get(x).getAccountNumber().equals(accountNumber)) {
                        System.out.print("��� ��ȣ�� �Է��Ͻÿ�: ");
                        pw = input.next();
                        if (true == bankA.get(x).passwordCheck(pw)) {
                            System.out.println("***��й�ȣ Ȯ�� �Ϸ�***");
                            System.out.print("����� �ݾ��� �Է��Ͻÿ�: ");
                            money = input.nextInt();
                            bankA.get(x).withdraw(money);
                            System.out.println("��� �� �ܾ�: " + bankA.get(x).getBalance());
                        } else {
                            count = 0;
                            while (true) {
                                System.out.println("�߸��� ��й�ȣ �Դϴ�.�ٽ� �Է��ϼ���");
                                System.out.print("��� ��ȣ�� �Է��Ͻÿ�: ");
                                pw = input.next();
                                if (true == bankA.get(x).passwordCheck(pw)) {
                                    System.out.println("***��й�ȣ Ȯ�� �Ϸ�***");
                                    System.out.print("����� �ݾ��� �Է��Ͻÿ�: ");
                                    money = input.nextInt();
                                    bankA.get(x).withdraw(money);
                                    System.out.println("��� �� �ܾ�: " + bankA.get(x).getBalance());
                                    break;
                                }
                                count++;
                                if (count == 4) {
                                    System.out.println("��й�ȣ �Է� �ʰ�.");
                                    break;
                                }
                            }
                        }
                        break;
                    } else if (x == bankA.size() - 1
                            && bankA.get(x).getAccountNumber() != accountNumber) {
                        System.out.println("�߸��� ���¹�ȣ �Դϴ�.");
                    }
                }
                break;
            case 4: // �۱�
                System.out.print("������ ���� ���¹�ȣ�� �Է��Ͻÿ�: ");
                accountNumber = input.next();
                for (int x = 0; x < bankA.size(); x++) {
                    if (bankA.get(x).getAccountNumber().equals(accountNumber)) {
                        System.out.print("��� ��ȣ�� �Է��Ͻÿ�: ");
                        pw = input.next();
                        if (true == bankA.get(x).passwordCheck(pw)) {
                            System.out.println("***��й�ȣ Ȯ�� �Ϸ�***");
                            System.out.print("�޴� ���� ���¹�ȣ�� �Է��Ͻÿ�: ");
                            otAccountNumber = input.next();
                            for (int y = 0; y < bankA.size(); y++) {
                                if (bankA.get(y).getAccountNumber().equals(otAccountNumber)) {
                                    System.out.println("���� ��ȣ Ȯ�� �Ϸ�");
                                    System.out.println("�޴� ���� ����: " + bankA.get(y).getOwnerName());
                                    System.out.print("�½��ϱ� (YorN): ");
                                    check = input.next();
                                    if (check.charAt(0) == 'Y') {
                                        System.out.print("�۱��� �ݾ��� �Է��Ͻÿ�: ");
                                        money = input.nextInt();
                                        bankA.get(x).transferTo(bankA.get(y), money);
                                    } else {
                                        System.out.println("���� �Ǿ����ϴ�.");
                                    }
                                    break;
                                } else if (y == bankA.size() - 1
                                        && bankA.get(y).getAccountNumber() != otAccountNumber) {
                                    System.out.println("�߸��� ���¹�ȣ �Դϴ�.");
                                }
                            }
                        } else {
                            count = 0;
                            while (true) {
                                System.out.println("�߸��� ��й�ȣ �Դϴ�.�ٽ� �Է��ϼ���");
                                System.out.print("��� ��ȣ�� �Է��Ͻÿ�: ");
                                pw = input.next();
                                if (true == bankA.get(x).passwordCheck(pw)) {
                                    System.out.println("***��й�ȣ Ȯ�� �Ϸ�***");
                                    System.out.print("�޴� ���� ���¹�ȣ�� �Է��Ͻÿ�: ");
                                    otAccountNumber = input.next();
                                    for (int y = 0; y < bankA.size(); y++) {
                                        if (bankA.get(y).getAccountNumber().equals(otAccountNumber)) {
                                            System.out.println("���� ��ȣ Ȯ�� �Ϸ�");
                                            System.out.println("�޴� ���� ����: " + bankA.get(y).getOwnerName());
                                            System.out.print("�½��ϱ� (YorN): ");
                                            check = input.next();
                                            if (check.charAt(0) == 'Y') {
                                                System.out.print("�۱��� �ݾ��� �Է��Ͻÿ�: ");
                                                money = input.nextInt();
                                                bankA.get(x).transferTo(bankA.get(y), money);
                                            } else {
                                                System.out.println("���� �Ǿ����ϴ�.");
                                            }
                                            break;
                                        } else if (y == bankA.size() - 1
                                                && bankA.get(y).getAccountNumber() != otAccountNumber) {
                                            System.out.println("�߸��� ���¹�ȣ �Դϴ�.");
                                        }
 
                                    }
                                }
                                count++;
                                if (count == 4) {
                                    System.out.println("��й�ȣ �Է� �ʰ�.");
                                    break;
                                }
                            }
                        }
                        break;
                    } else if (x == bankA.size() - 1
                            && bankA.get(x).getAccountNumber() != accountNumber) {
                        System.out.println("�߸��� ���¹�ȣ �Դϴ�.");
                    }
                }
                break;
            case 5: // ���� ��ȸ
                System.out.print("�ܾ� ��ȸ �� ���¸� �Է��ϼ���: ");
                accountNumber = input.next();
                for (int x = 0; x < bankA.size(); x++) {
                    if (bankA.get(x).getAccountNumber().equals(accountNumber)) {
                        bankA.get(x).printAccount();
                        break;
                    } else if (x == bankA.size() - 1
                            && bankA.get(x).getAccountNumber() != accountNumber) {
                        System.out.println("�߸��� ���¹�ȣ �Դϴ�.");
                    }
                }
                break;
            case 6: // ���� ����
                System.out.println("������ ���¸� �Է��ϼ���.");
                accountNumber = input.next();
                for (int x = 0; x < bankA.size(); x++) {
                    if (bankA.get(x).getAccountNumber().equals(accountNumber)) {
                        bankA.remove(x);
                        System.out.println("���°� �����Ǿ����ϴ�.");
                    }
                    else {
                        System.out.println("�߸��� ���¹�ȣ �Դϴ�.");
                    }
                }
                break;
            default:
                System.out.println("�Է��� �߸��Ǿ����ϴ�.");
                break;
            }
        }
    }
}