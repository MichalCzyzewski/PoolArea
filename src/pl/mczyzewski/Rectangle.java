package pl.mczyzewski;

public class Rectangle
{

    private double width;
    private double length;

    public Rectangle(double width, double heigth)
    {
        if(width<0 )
        {
            this.width = 0;
        }
        this.width = width;

        if (heigth < 0)
        {
            this.length = 0;
        }
        this.length = heigth;
    }

    public double getWidth()
    {
        return this.width;
    }

    public double getLenght()
    {
        return length;
    }

    public double getArea()
    {
        return this.length * this.width;
    }
}
