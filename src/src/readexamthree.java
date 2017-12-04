package src;

/*问题一：
groundCount、 groundPrice、numberBought 分别代表折扣分之一，价格，应付金额
问题二：
先声明了三个变量：groundCount、 groundPrice、numberBought
再定义了三个方法：setPrice，numberBought，readInput，
三个方法中，前两个用条件语句很全面的防止极端情况出错，第三个用来计算实际金额
 问题三：
 用来放到收银机上给收钱的结账
 */

/**
 * Created by tangxiangru on 16/10/23.
 */
public class readexamthree {
        private double groundPrice;
        private int groundCount;
        private int numberBought;
        private String name;

        public void setName(String newName) {
            name = newName;
        }

        public void setPrice(int count, double costForCount) {
            if ((count <= 0) || (costForCount <= 0)) {
                System.out.println("");
                System.exit(0);
            } else {
                groundCount = count;
                groundPrice = costForCount;
            }
        }

        public void setNumberBought(int number) {
            if (number <= 0) {
                System.out.println("");
                System.exit(0);
            } else
                numberBought = number;
        }

        public void readInput() {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter name of item you are purchasing: ");
            name = keyboard.nextLine();
            System.out.println("Enter price of item as two numbers.");
            System.out.println("For example, 3 for $2.99 is entered as");
            System.out.println("3 2.99");
            System.out.println("Enter price of item as two numbers, now:");
            groundCount = keyboard.nextInt();
            groundPrice = keyboard.nextDouble();
            while (groundCount <= 0 && groundPrice <= 0) {
                System.out.println("Both numvers must be positive. Try again.");
                System.out.println("Enter price of item as two numbers.");
                System.out.println("For example, 3 for $2.99 is entered as");
                System.out.println("3 2.99");
                System.out.println("Enter price of item as two numbers, now:");
                groundCount = keyboard.nextInt();
                groundPrice = keyboard.nextDouble();
            }

            System.out.println("please enter the number bought");
            numberBought = keyboard.nextInt();
            while (numberBought <= 0) {
                System.out.println("");
                System.out.println("");
                numberBought = keyboard.nextInt();
            }
            writeOutput();
        }

        public void writeOutput() {
            System.out.println(numberBought + " " + name);
            System.out.println("at " + groundCount + "for $" + groundPrice);
        }

        public String getName() {
            return name;
        }

        public double getTotalCost() {
            return ((groundPrice / groundCount) * numberBought);
        }

        public double getUnitCost() {
            return (groundPrice / groundCount);
        }

        public int getNumberBought() {
            return numberBought;
        }
    }
}
