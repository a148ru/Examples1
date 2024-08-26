package ru.a148ru.examples.solid.srp;

public class OutputAreas {
    double areas=0;

    public OutputAreas(double a){
        this.areas=a;
    }
    public void console(){
        System.out.println("Total of all areas = " + this.areas);
    }

    public void HTML(){
        System.out.println("<HTML>");
        System.out.println("Total of all areas = " + this.areas);
        System.out.println("</HTML>");
    }
}
