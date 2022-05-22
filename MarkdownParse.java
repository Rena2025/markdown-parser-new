//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {

    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        int currentIndex = 0;
        while(currentIndex < markdown.length()) {
            int openBracket = markdown.indexOf("[", currentIndex);
            // fix 1
            int backTick = markdown.indexOf("`", currentIndex);
		    if (openBracket == -1) {
                break;
            }
            // fix 1
            if (openBracket - backTick == 1) {
                openBracket = markdown.indexOf("[", openBracket + 1);
            }
            
            int closeBracket = markdown.indexOf("]", openBracket);
            if (closeBracket == -1) {
                break;
            }
            
            int openParen = markdown.indexOf("(", closeBracket);
		    if(openParen == -1){
			    break;
		    }

            // fix 3
            if (markdown.substring(openBracket, closeBracket).contains("\n")) {
                openBracket = markdown.indexOf("[", openBracket + 1);
                closeBracket = markdown.indexOf("]", openBracket+1);
                // openParen = markdown.indexOf("\n", openParen);
            }
            

            int closeParen = markdown.indexOf(")", openParen);
            
            // fix 2
            if (closeParen < markdown.length() -1) {
                while (markdown.charAt(closeParen+1) == ')') {
                    closeParen++;
                }
            }
            
            
	        if(closeParen == -1){
		        break;
            }
            
            // fix 3
            // openParen = markdown.indexOf("\n", openParen);
            // markdown.charAt(closeParen-3) == '\n'
            // if (markdown.substring("\n\n", openParen, closeParen))
            if (markdown.substring(openParen, closeParen).contains("\n\n")) {
                openParen = markdown.indexOf("(", openParen + 1);
                closeParen = markdown.indexOf(")", closeParen+1);
                if(closeParen == -1 || openParen == -1) {
                    break;
                }
            }
            
            
            toReturn.add(markdown.substring(openParen + 1, closeParen));
            currentIndex = closeParen + 1;
            
        }

        return toReturn;
    }


    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
	    System.out.println(links);
    }
}
