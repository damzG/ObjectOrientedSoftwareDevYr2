public  class Rectangle{
    private double length;
    private double width;

    public Rectangle(){
        this.length = 1;
        this.width = 1;
    }

    public void setLength(double length){
        if(length > 0.0 && length <= 40.0){
            this.length = length;
        }
    }

    public void setWidth(double width){
        if (width > 0 && width <= 40.0) {
            this.width = width;  
        }
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public String toString(){
        return "Length " + length + " Breadth: " + width;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return 2 * (length + width);
    }

    public void printRectangle(){
        String w  = "";
        for(int i = 1; i <= width; i++){
            w += "*";
        }
        
        System.out.println(w);

        //Next Line
        for(int j = 0; j < length-2; j++){
                System.out.print("*");

                for(int x = 0; x < width-2; x++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
            System.out.println(w);
    }
}