/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.io.*;
import java.awt.print.*;
import java.awt.print.PrinterJob;
import java.awt.print.PageFormat;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
class Imprimir{
    static String cod;
    static String total;
    public Imprimir(String cod,String total){
    this.cod=cod;
    this.total=total;
    }
static public void main(String []args){
PageFormat format = new PageFormat();
        Paper paper = new Paper();

        double paperWidth = 3;//3.25
        double paperHeight = 3.69;//11.69
        double leftMargin = 0.12;
        double rightMargin = 0.10;
        double topMargin = 0;
        double bottomMargin = 0;

        paper.setSize(paperWidth * 200, paperHeight * 200);
        paper.setImageableArea(leftMargin * 200, topMargin ,
                (paperWidth - leftMargin - rightMargin) * 200 ,
                (paperHeight - topMargin - bottomMargin) * 200);
       

        format.setPaper(paper);

        PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
        aset.add(OrientationRequested.PORTRAIT);
//testing 

        PrinterJob printerJob = PrinterJob.getPrinterJob();
        Printable printable = new ObjetoDeImpresion(cod,total);

        format = printerJob.validatePage(format);
        boolean don = printerJob.printDialog();
        printerJob.setPrintable(printable, format);
        try {
            printerJob.print(aset);
        } catch (Exception e) {
            e.printStackTrace();
        }
}
public void imprimir(){
PageFormat format = new PageFormat();
        Paper paper = new Paper();

        double paperWidth = 3;//3.25
        double paperHeight = 3.69;//11.69
        double leftMargin = 0.12;
        double rightMargin = 0.10;
        double topMargin = 0;
        double bottomMargin = 0;

        paper.setSize(paperWidth * 200, paperHeight * 200);
        paper.setImageableArea(leftMargin * 200, topMargin ,
                (paperWidth - leftMargin - rightMargin) * 200 ,
                (paperHeight - topMargin - bottomMargin) * 200);
       

        format.setPaper(paper);

        PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
        aset.add(OrientationRequested.PORTRAIT);
//testing 

        PrinterJob printerJob = PrinterJob.getPrinterJob();
        Printable printable = new ObjetoDeImpresion(cod,total);

        format = printerJob.validatePage(format);
        boolean don = printerJob.printDialog();
        printerJob.setPrintable(printable, format);
        try {
            printerJob.print(aset);
        } catch (Exception e) {
            e.printStackTrace();
        }
}
}
