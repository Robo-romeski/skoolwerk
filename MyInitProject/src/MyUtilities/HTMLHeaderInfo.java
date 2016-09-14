package MyUtilities;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

public class HTMLHeaderInfo {
	public static final String header = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
 "Transitional//EN\"><HEAD><TITLE>Hello World</TITLE></HEAD>"; 
	public static String headwithTitle (String title){
			return header.replace("Hello World" , title);
	}

}
