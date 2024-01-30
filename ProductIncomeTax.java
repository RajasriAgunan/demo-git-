public class ProductIncomeTax implements Taxable{
    int pid;
    float price;
    int quantity;
    float caltax;
    ProductIncomeTax( int pid,float price,int quantity){
        this.pid=pid;
        this.price=price;
        this.quantity=quantity;
    }

    @Override
    public void calTax() {
        caltax=(sales*price)/100;
        System.out.println("SalesTax of the product="+pid+caltax);
    }
}
