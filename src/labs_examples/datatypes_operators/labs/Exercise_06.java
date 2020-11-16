package labs_examples.datatypes_operators.labs;


/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here

        double radius = 3.14;
        double height = 5;

        System.out.println("The volume of a cylinder of radius= " +radius+" and height= "+height+" is: " + cylVolume( radius,  height));
        System.out.println("The surface of a cylinder of radius= " +radius+" and height= "+height+" is: " + cylSurface( radius,  height));


    }

    // return volume of cylinder
    public static double cylVolume(double radius, double height)
    {
        double volume = Math.PI*(Math.pow(radius,2))*height;
        return volume;
    }

    // return the surface area of cylinder
    public static double cylSurface(double radius, double height)
    {
        double surface = 2*Math.PI*radius*height + 2*Math.PI*(Math.pow(radius,2));
        return surface;

    }

}