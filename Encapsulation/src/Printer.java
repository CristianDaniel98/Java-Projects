public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount > 0 && tonerAmount <=100){
            if(tonerAmount+this.tonerLevel > 100){
                return -1;
            }else{
                return tonerAmount+this.tonerLevel;
            }
        }else{
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrints = pages;

        if(this.duplex){
            System.out.println("Printing in duplex mode");
            this.pagesPrinted += (pagesToPrints/2) + (pagesToPrints%2);
        }else{
            this.pagesPrinted += pagesToPrints;
        }

        return this.pagesPrinted;

    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
