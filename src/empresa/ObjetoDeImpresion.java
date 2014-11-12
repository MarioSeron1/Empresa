package empresa;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.print.*;
import javax.swing.JTextArea;

import net.sourceforge.jbarcodebean.BarcodeException;
import net.sourceforge.jbarcodebean.JBarcodeBean;
import net.sourceforge.jbarcodebean.model.Codabar;
import net.sourceforge.jbarcodebean.model.Code128;
import net.sourceforge.jbarcodebean.model.Code39;
import net.sourceforge.jbarcodebean.model.Ean13;
import net.sourceforge.jbarcodebean.model.Ean8;
import net.sourceforge.jbarcodebean.model.Interleaved25;

class ObjetoDeImpresion implements Printable{
    String codigo;
    String total;
    public ObjetoDeImpresion(String codigo,String total){
    this.codigo=codigo;
    this.total=total;
    }
    
public int print(Graphics g, PageFormat f, int pageIndex){
   String str2;
        Graphics2D g2d = (Graphics2D) g;
        Font font = new Font("MONOSPACED", Font.BOLD, 9);

        if (pageIndex < 0 || pageIndex >= 1) {
            return Printable.NO_SUCH_PAGE;
        }


        g2d.translate(f.getImageableX(), f.getImageableY());

        g2d.setFont(font);
  
      

         
          JBarcodeBean barcode = new JBarcodeBean();

        // nuestro tipo de codigo de barra
//        barcode.setCodeType(new Interleaved25());
        barcode.setCodeType(new Code128());
                

        // nuestro valor a codificar y algunas configuraciones mas
        barcode.setCode(codigo);
                
                
        barcode.setCheckDigit(true);

        BufferedImage bufferedImage = barcode.draw(new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB));
       g2d.drawString("TOTAL: "+total, 20, 10);
         g2d.drawImage(bufferedImage, 20,30, null);
       str2 = "****************************";
       g2d.drawString(str2, 20, 130);
       str2 = "*  gracias por preferirnos *";
       g2d.drawString(str2, 20, 140);
       str2 = "****************************";
       g2d.drawString(str2, 20, 150);
        return Printable.PAGE_EXISTS;
    
}
}