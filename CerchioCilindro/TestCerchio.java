/*
	Oggetto:		Test della classe cerchio
*/
import java.io.*;
class TestCerchio{
	public static void main(String args[]){
		try{
			Cerchio c1 = new Cerchio(5.5);
			System.out.println(c1.toStringa());
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
