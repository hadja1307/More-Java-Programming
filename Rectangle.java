/**
 * A simple class representing a rectangle.
 * This class has been amended to include a
 * method to calculate a perimeter for the
 * week 8 lectoral class
 * 
 * @author 
 * @version 
 */
public class Rectangle
{
    // instance variables 
    private int length;
    private int breadth;

    /**
     * Constructor for objects of class Rectangle.
     */
    public Rectangle(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
   
    
    /**
     * obtains the current value of length.
     *
     * @return     the length
     */
    public int getLength( )
    {
        return length;
    }
    
     /**
     * obtains the current value of breadth.
     *
     * @return     the breadth
     */
    public int getBreadth( )
    {
        return breadth;
    }
    
    /**
     * Calculates the area of the rectangle.
     *
     * @return     the area of the rectangle
     */
    public int calculateArea()
    {
        return length * breadth;
    }
    
    /**
     * Calculate perimeter
     * 
     * @return the perimeter of the rectangle
     */
    public int calculatePerimeter()
    {
        return 2 * ( length + breadth);
    }

}
