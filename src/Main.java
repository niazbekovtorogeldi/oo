import java.util.Scanner;

                public class Main {
                    public static void main(String[] args) {
                        //TODO HomeWork#11
                        while (true) {
                            System.out.println("Аккаунтарды коруу учун * басыныз.");
                            char a = new Scanner(System.in).next().charAt(0);
                            if (a == '*') {
                                Account account1 = new Account();
                                account1.name = "Azat";
                                account1.balance = 1000;

                                Account account2 = new Account();
                                account2.name = "Jyldyz";
                                account2.balance = 220;

                                Account account3 = new Account();
                                account3.name = "Bakyt";
                                account3.balance = 3000;
                                Account[] mas = {account1, account2, account3};
                                for (int i = 0; i < mas.length; i++) {
                                    System.out.println(mas[i].name + " " + mas[i].balance);
                                }
                                System.out.println("Депозит кылуу учун + басыныз");
                                System.out.println("Акча чыгаруу учун - басыныз");
                                System.out.println("Акча которуу учун > басыныз");
                                char b = new Scanner(System.in).next().charAt(0);
                                if (b == '+') {
                                    System.out.println("Акаунту танданыз(1,2,3):");
                                    int c = new Scanner(System.in).nextInt();
                                    if (c == 1) {
                                        System.out.println("Deposit kyla turgan baany jazynyz: ");
                                        account1.deposit(new Scanner(System.in).nextDouble());
                                        System.out.println(account1.name + "tyn balansynda " + account1.balance + " bar");
                                    } else if (c == 2) {
                                        System.out.println("Deposit kyla turgan baany jazynyz: ");
                                        account1.deposit(new Scanner(System.in).nextDouble());
                                        System.out.println(account2.name + "dyn balansynda " + account1.balance + " bar");
                                    } else if (c == 3) {
                                        System.out.println("Deposit kyla turgan baany jazynyz: ");
                                        account1.deposit(new Scanner(System.in).nextDouble());
                                        System.out.println(account3.name + "tyn balansynda " + account1.balance + " bar");
                                    } else {
                                        System.out.println("Error");
                                    }
                                } else if (b == '-') {
                                    System.out.println("Accountu tandanyz(1,2,3): ");
                                    int c = new Scanner(System.in).nextInt();
                                    if (c == 1) {
                                        System.out.println("Akch chygara turgan baany jazynyz: ");
                                        account1.withdrawal(new Scanner(System.in).nextDouble());
                                        System.out.println(account1.name + "tyn balansynda " + account1.balance + " bar");
                                    } else if (c == 2) {
                                        System.out.println("Akch chygara turgan baany jazynyz: ");
                                        account2.withdrawal(new Scanner(System.in).nextDouble());
                                        System.out.println(account2.name + "dyn balansynda " + account1.balance + " bar");
                                    } else if (c == 3) {
                                        System.out.println("Akch chygara turgan baany jazynyz: ");
                                        account1.withdrawal(new Scanner(System.in).nextDouble());
                                        System.out.println(account3.name + "tyn balansynda " + account1.balance + " bar");
                                    } else {
                                        System.out.println("Error");
                                    }
                                } else if (b == '>') {
                                    System.out.println("Accountu tandanyz(1,2,3): ");
                                    int z = new Scanner(System.in).nextInt();
                                    if (z == 1) {
                                        System.out.println("Kotoro turgan summa: " + account1.transfer() + "\n" +
                                                "Azattyn  balansydan Jyldyzdyn balansyga kotoruldu.");
                                        account1.balance -= account1.transfer();
                                        account2.balance += account1.transfer();
                                        System.out.println(account1.name + "tyn balansynda " + account1.balance + " bar");
                                        System.out.println(account2.name + "dyn balansynda " + account2.balance + " bar");
                                    } else if (z == 2) {
                                        System.out.println("Kotoro turgan summa: " + account2.transfer() + "\n" +
                                                "Jyldyzdyn  balansydan Bakyttyn balansyga kotoruldu.");
                                        account2.balance -= account2.transfer();
                                        account3.balance += account3.transfer();
                                        System.out.println(account2.name + "dyn balansynda " + account2.balance + " bar");
                                        System.out.println(account3.name + "tyn balansynda " + account3.balance + " bar");
                                    } else if (z == 3) {
                                        System.out.println("Kotoro turgan summa: " + account3.transfer() + "\n" +
                                                "Bakyttyn  balansydan Azattyn balansyga kotoruldu.");
                                        account3.balance -= account3.transfer();
                                        account1.balance += account1.transfer();
                                        System.out.println(account3.name + "tyn balansynda " + account3.balance + " bar");
                                        System.out.println(account1.name + "tyn balansynda " + account1.balance + " bar");
                                    } else {
                                        System.out.println("Error");
                                    }
                                }
                            }
                        }


                    }


                }











