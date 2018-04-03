package EnumPractice;

public class Drink {
    LatteDrink latte;
    public Drink(LatteDrink latte){
            this.latte = latte;

        }
        public void kindofDrink() {
            switch(latte) {
                case FRAPPICHINO:
                    System.out.println("This is my drink");
                    break;
                case MOCHA:
                    System.out.println("");
                    break;
                case COFFEE:
                    System.out.println("");
                    break;
                case MATCHALATTE:
                    System.out.println("This is a green drink");
                    break;
                default:
                    System.out.println("");
                    break;
            }

        }

}
