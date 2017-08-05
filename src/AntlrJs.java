
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import org.antlr.v4.runtime.CharStream;
//import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author papa
 */
public class AntlrJs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
		
		
		
		String s;
		//FileReader r=new FileReader("d:/lisp.txt");
                s=new BufferedReader(new InputStreamReader(System.in)).readLine();
               org.antlr.v4.runtime.CharStream  input = new org.antlr.v4.runtime.ANTLRInputStream(s);
// create a lexer that feeds off of input CharStream

		
                koLexer lexer = new koLexer(input);
                /*lexer.reset();*/

                CommonTokenStream tokens = new CommonTokenStream(lexer);
                koParser parser = new koParser(tokens);
                ParseTree tree = parser.expr(); // begin parsing at // rule
                //
                koVistorImpl visitor = new koVistorImpl();
                //System.out.println(tree.toStringTree(parser));


Object o= visitor.visit(tree);
System.out.println(String.valueOf(o));//o rashiryaetsya do String i Integer
    //}
	
    
}
}
