package whch5;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class sample5_12
{
	public static void main(String[] args)
	{
		try
		{
			FileWriter fw = new FileWriter("test1.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
			
			pw.println("Hello!");
			pw.println("GoodBye!");
			
			pw.close();
			System.out.println("資料已經寫入檔案了");
		}
		catch(IOException e)
		{
			System.out.println("輸入輸出有誤");
		}
	}
}

