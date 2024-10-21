import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;

class Anypattern  
{
	public static void main(String[] args) 
	{
		try{
			File file =new File ("C:\\Users\\ACER\\OneDrive\\Documents\\Desktop\\Qspider\\pic.png");
			BufferedImage image = ImageIO.read(file);
			
			for (int i=0;i<=image.getHeight() ;i++ )
			{
				for (int j=0;j<image.getWidth() ;j++ )
				{
					Color color = new Color(image.getRGB(j,i));
					if (color.getRed()==0 && color.getGreen()==0 && color.getBlue()==0)
					{
						System.out.print("*  ");
					}else 
							System.out.print("  ");
				}
				System.out.println();
			}
		}
		catch(Exception e)
		{
		System.out.println("Something Went Wrong");
	}
	}
}
