package haffmancode;

import java.io.FileNotFoundException;

public class HaffmanApplication {
    public static void main(String[] args) throws FileNotFoundException {
        String inputFile = args[0], outputFile = args[1], codeTable = args[2];
        new Node.LeafNode().setOutputFile(codeTable);
        long startTime = System.currentTimeMillis();
        new HaffmanCode().compressData(inputFile, outputFile);
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime + " ms");
    }
}
