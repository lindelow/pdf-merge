
package org.lindelow.pdfmerge;

import java.io.File;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.edit.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

/**
 * Merges all image layers in a PDF file into one layer, leaving
 * only one image layer and one text layer.
 */
public class PDFMerge {
    
    public static void main(String[] args) throws Exception {
        PDDocument doc = new PDDocument();
        PDPage page = new PDPage();
        doc.addPage(page);
        
        PDFont font = PDType1Font.HELVETICA_BOLD;
        
        PDPageContentStream stream = new PDPageContentStream(doc, page);
        stream.beginText();
        stream.setFont(font, 12);
        stream.moveTextPositionByAmount(100, 700);
        stream.drawString("Hello, world!");
        stream.endText();
        stream.close();
        
        doc.save(new File("c:/Users/jonas/Desktop/hello-world.pdf"));
        doc.close();
        
        
    }
    
}
