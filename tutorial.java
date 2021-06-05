public class Rectangle {
    private double length;
    private double breath;

    public Rectangle (double length, double breath){
        this.length = length;
        this.breath = breath;
    }
    public void setlenth(double length){
        this.length = length;
    }
    public double getlength(){
        return length;
    }
    public void setbreath(double breath){
        this.breath = breath;
    }
    public double getbreath(){
        return breath;
    }
    public double calculateArea(){
        return length*breath;
    }
    public double calculatePer(){
        return 2*(length+breath);
    }
    public class Solve{
        public static void main(String[]args){
            Rectangle R1=new Rectangle(4.6,2.3);
            System.out.println("The area of the rectangle of length, "+ R1.getlength()+ " and breath, "+R1.getbreath()+ " is "+ R1.calculateArea());
            System.out.println("The perimeter of the rectangle of length, "+ R1.getlength()+ " and breath, "+R1.getbreath()+ " is "+ R1.calculatePer());
        }
    }
    

}


