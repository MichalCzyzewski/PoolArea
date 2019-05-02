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
}
