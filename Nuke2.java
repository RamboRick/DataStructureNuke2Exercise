package testhw1;
import java.io.*;

public class Nuke2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader keyBoard;
		String inputString;
		
		keyBoard = new BufferedReader(new  InputStreamReader(System.in));
		System.out.print("Please enter a string:  ");
		System.out.flush();
		inputString = keyBoard.readLine();
		
		
		for (int i= 0; i <inputString.length() ; i++){
			if (inputString.length()> 2){
			if(i != 1){
			System.out.print(inputString.charAt(i));
				}
			}
		}
	}

}
