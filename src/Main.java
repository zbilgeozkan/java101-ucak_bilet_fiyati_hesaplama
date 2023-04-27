import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int distance, age, type;
        double normalAmount,ageDiscount,discountedAmount, tripDiscount, total;

        Scanner input =new Scanner(System.in);
        System.out.print("Lütfen mesafeyi km türünden giriniz: ");
        distance = input.nextInt();

        System.out.print("Lütfen yaşınızı giriniz: ");
        age = input.nextInt();

        System.out.print("Lütfen yolculuk tipinizi giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        type = input.nextInt();

        if (distance > 0 && age > 0) {
            switch (type) {
                case 1:
                    if (age < 12) {
                        normalAmount = distance * 0.10;
                        ageDiscount = normalAmount * 0.5;
                        discountedAmount = normalAmount - ageDiscount;
                        System.out.println("Toplam Tutar = : " + discountedAmount + " TL");
                    }
                    else if (age < 24) {
                        normalAmount = distance * 0.10;
                        ageDiscount = normalAmount * 0.1;
                        discountedAmount = normalAmount - ageDiscount;
                        System.out.println("Toplam Tutar = " + discountedAmount + " TL");
                    }
                    else if (age <= 65) {
                        normalAmount = distance * 0.10;
                        System.out.println("Toplam Tutar = " + normalAmount + " TL");
                    }
                    else {
                        normalAmount = distance * 0.10;
                        ageDiscount = normalAmount * 0.3;
                        discountedAmount = normalAmount - ageDiscount;
                        System.out.println("Toplam Tutar = " + discountedAmount + " TL");
                    }
                    break;

                case 2:
                    if (age < 12) {
                        normalAmount = distance * 0.10;
                        ageDiscount = normalAmount * 0.5;
                        discountedAmount = normalAmount - ageDiscount;
                        tripDiscount = discountedAmount * 0.20;
                        total = (discountedAmount - tripDiscount) * 2;
                        System.out.println("Toplam Tutar = " + total + " TL");
                    }
                    else if (age < 24) {
                        normalAmount = distance * 0.10;
                        ageDiscount = normalAmount * 0.1;
                        discountedAmount = normalAmount - ageDiscount;
                        tripDiscount = discountedAmount * 0.20;
                        total = (discountedAmount - tripDiscount) * 2;
                        System.out.println("Toplam Tutar = " + total + " TL");
                    }
                    else if (age <= 65) {
                        normalAmount = distance * 0.10;
                        System.out.println("Toplam Tutar = " + normalAmount + " TL");
                    }
                    else {
                        normalAmount = distance * 0.10;
                        ageDiscount = normalAmount * 0.3;
                        discountedAmount = normalAmount - ageDiscount;
                        tripDiscount = discountedAmount * 0.20;
                        total = (discountedAmount - tripDiscount) * 2;
                        System.out.println("Toplam Tutar = " + total + " TL");
                    }
                    break;

                default:
                    System.out.println("Hatalı Veri Girdiniz !");
            }

        }
        else {
            System.out.println("Geçersiz bir değer girdiniz.");
        }


    }
}