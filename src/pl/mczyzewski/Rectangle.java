package pl.mczyzewski;

public class Rectangle
{

    private double width;
    private double heigth;

    public Rectangle(double width, double heigth)
    {
        if(width<0 )
        {
            this.width = 0;
        }
        this.width = width;

        if (heigth < 0)
        {
            this.heigth = 0;
        }
        this.heigth = heigth;
    }

    public double getWidth()
    {
        return this.width;
    }

    public double getHeigth()
    {
        return heigth;
    }

    public double getArea()
    {
        return this.heigth * this.width;
    }
}
