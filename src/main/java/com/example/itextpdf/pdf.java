package com.example.itextpdf;




import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.fields.PdfButtonFormField;
import com.itextpdf.forms.fields.PdfFormField;
import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.colors.DeviceCmyk;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.*;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.properties.UnitValue;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Map;

import static com.itextpdf.io.font.constants.StandardFonts.HELVETICA;
import static com.itextpdf.io.font.constants.StandardFonts.TIMES_BOLD;
import static com.itextpdf.kernel.colors.DeviceRgb.*;

public class pdf {
    public static final String DEST = "./target/sandbox/graphics/drawing_lines.pdf";
    public static final String FONT = "./src/main/resources/font/FreeSans.ttf";
    public void generatePdf() throws IOException {

        //ajouter list
        List list1=new List();
        list1.add("java");
        list1.add("spring");
        list1.add("kotlin");
        list1.add("c");



        //ajouter image
        String imgSource="images\\téléchargement.jpg";
        ImageData data= ImageDataFactory.create(imgSource);
        Image image1=new Image(data);



        String path="C:\\pdf\\fistPdf.pdf";
//ajouter une paragraphe
        String paraText="itext itext 7 itext pdf itextpdf c# itextsharp itext java itext pad. itext maven itext software itext pdf java. itextpdf maven itext html to pdf itext pricing. itext free itext 7 c# lowagie itext pdf example. itextsharp c# examples itext 5 itext github. itextsharp example itextsharp view pdf itext pdf reader. what is itext itext 7 c# examples itext 7 examples c# itext 7 examples itextsharp nugget. itext c# java itext pdf example itext 7 pricing. itext in action itext java example itext 7 maven lowagie itext. android image not appearing in itext pdf. itext as text extracting/reading from pdf on android. if someone uses the itext library in an android application for pdf without purchasing license. cyrillic letters not displaying in pdf generated with itext in android. pdf generation using itext for bangla ";
        Paragraph paragraph1=new Paragraph(paraText);



        PdfWriter pdfWriter=new PdfWriter(path);
        PdfDocument pdfDocument=new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();
        Document document=new Document(pdfDocument);

        //font
       PdfFont boldFont = PdfFontFactory.createFont(TIMES_BOLD);
        Text text=new Text("hi i am nawal dali").setFont(boldFont);

        //style
        Style auther=new Style();
        auther.setFontColor(BLUE).setFontSize(40f).setItalic();

        Paragraph paragraph2=new Paragraph("hello how are you?").addStyle(auther);
        document.add(paragraph2);
        paragraph1.add(text);

        //ajouter dans le document
        document.add(paragraph1);
        document.add(image1);
        document.add(list1);


        document.close();
    }

    public void Table() throws FileNotFoundException, MalformedURLException {
        String imgSource="images\\téléchargement.jpg";
        ImageData data= ImageDataFactory.create(imgSource);
        Image image1=new Image(data);

        String path="C:\\pdf\\TablePdf.pdf";
        PdfWriter pdfWriter=new PdfWriter(path);
        PdfDocument pdfDocument=new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();
        Document document=new Document(pdfDocument);
//***************************************
        float columnWidth[]= {200f,50f,100f};
        Table table=new Table(columnWidth);
        Cell cell_11=new Cell();
        table.addCell(cell_11);
        table.addCell(new Cell());
        table.addCell(new Cell());
        table.addCell(new Cell());
        table.addCell(new Cell());
        table.addCell(new Cell());
        table.addCell(new Cell().add(new Paragraph("ok")));
        document.add(table);
        document.close();
    }

    public void testPdf() throws FileNotFoundException {
        String path="C:\\pdf\\TablePdf.pdf";
        PdfWriter pdfWriter=new PdfWriter(path);
       Rectangle page=new Rectangle(700,1400);
        PdfDocument pdfdocument=new PdfDocument(pdfWriter);

        pdfdocument.addNewPage();
        Document document=new Document(pdfdocument,new PageSize(page));
        //********************
        Paragraph header=new Paragraph("HEADER").setTextAlignment(TextAlignment.CENTER).setFontSize(20);
        //********new Line
        Paragraph newline=new Paragraph(new Text("SUB HEADER")).setTextAlignment(TextAlignment.CENTER).setFontSize(15);

        Paragraph sautLine=new Paragraph(new Text("\n"));
        document.add(header);
        document.add(sautLine);
        document.add(newline);

        //add paragraph1
        Paragraph paragraph1=new Paragraph("itext itext 7 itext pdf itextpdf c# itextsharp itext java itext pad. itext maven itext software itext pdf java. itextpdf maven itext html");
        document.add(paragraph1);

        //add Table
        Table table = new Table(2,false);
        Cell cell11=new Cell(1,1).setBackgroundColor(ColorConstants.GRAY)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("State"));
        Cell cell12=new Cell(1,1)
                .setBackgroundColor(ColorConstants.GRAY)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("Capital"));
        Cell cell21=new Cell(1,1)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("New York"));
        Cell cell22=new Cell(1,1)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("albany"));

        table.addCell(cell11);
        table.addCell(cell12);
        table.addCell(cell21);
        table.addCell(cell22);
        document.add(sautLine);
        document.add(table);




        document.close();

    }

    public void Report8D() throws FileNotFoundException, MalformedURLException {
        String imgSource="images\\bontaz.png";
        ImageData data= ImageDataFactory.create(imgSource);
        Image image1=new Image(data);
        image1.scaleToFit(90f, 60f);
        String path="C:\\pdf\\TablePdf.pdf";
        PdfWriter pdfWriter=new PdfWriter(path);
        Rectangle page=new Rectangle(600,1200);
        PdfDocument pdfdocument=new PdfDocument(pdfWriter);

        Document document=new Document(pdfdocument,new PageSize(page));
        pdfdocument.addNewPage();
        //********************
        Color myColor = new DeviceRgb(0,55,84);
        float col=280f;
        float columnWidth[] = {40,350,150};
        Cell cell=new Cell();
        Table table=new Table(columnWidth).setBackgroundColor(myColor).setMarginTop(-20f).setMarginLeft(-30).setMarginRight(-30);
        table.addCell(new Cell().add(image1.setRelativePosition(0,10,0,0)).setBackgroundColor(ColorConstants.WHITE).setBorder(Border.NO_BORDER));
        Paragraph header=new Paragraph("8D Report");

        header.setTextAlignment(TextAlignment.CENTER)
                .setFontSize(20f)
                .setFontColor(ColorConstants.WHITE)
                .setPadding(10).setBold()
                ;
        table.addCell(cell.add(header).setBorder(Border.NO_BORDER));
        Paragraph header2=new Paragraph("Formulaire \n" +"FGR0070 /20\n" +"2 du 26/02/2019")
                .setTextAlignment(TextAlignment.CENTER)
                .setFontColor(ColorConstants.WHITE)
                .setFontSize(10);
        table.addCell(new Cell().add(header2).setBorder(Border.NO_BORDER));
        cell.setHeight(50f);
        //*************table 2
        Color colorHeader = new DeviceRgb(221,231,240);

        Table table2 = new Table(UnitValue.createPercentArray(new float[]{10,10,5})).setMarginTop(5).setMarginLeft(-30).setMarginRight(-30).setWidth(583);
        table2.setWidth(UnitValue.createPercentValue(100));
        table2.setFixedLayout();

        Cell cell11=new Cell(1,1).setBackgroundColor(colorHeader)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("8D REFERENCE (customer)")
                        .setFontColor(myColor)
                        .setBold());

        Cell cell12=new Cell(1,1).setBackgroundColor(colorHeader)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("8D REFERENCE (Bontaz)")
                        .setFontColor(myColor)
                        .setBold());

        Cell cell13=new Cell(1,1).setBackgroundColor(colorHeader)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("Opening Date")
                        .setFontColor(myColor)
                        .setBold());

        Cell cell21=new Cell()
                .add(new Paragraph("value1 "));

        Cell cell22=new Cell()
                .add(new Paragraph("value2"));

        Cell cell23=new Cell()
                .add(new Paragraph("value3"));


        table2.addCell(cell11);
        table2.addCell(cell12);
        table2.addCell(cell13);
        table2.addCell(cell21);
        table2.addCell(cell22);
        table2.addCell(cell23);

        //******table 3
        Table table3 = new Table(UnitValue.createPercentArray(new float[]{10,10,5})).setMarginTop(10).setMarginLeft(-30).setMarginRight(-30).setWidth(583);
        table3.setWidth(UnitValue.createPercentValue(100));
        table3.setFixedLayout();

       // Table table3 = new Table(3,false).setMarginTop(10).setMarginLeft(-30).setMarginRight(-30).setWidth(583).setFixedLayout();


        Cell cell3_11=new Cell(1,1).setBackgroundColor(colorHeader)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("Product / Process / System")
                        .setFontColor(myColor)
                        .setBold());

        Cell cell3_12=new Cell(1,1).setBackgroundColor(colorHeader)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("Organisation information")
                        .setFontColor(myColor)
                        .setBold());

        Cell cell3_13=new Cell(1,1).setBackgroundColor(colorHeader)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("Update Date")
                        .setFontColor(myColor)
                        .setBold());

        Cell cell3_21=new Cell()
                .add(new Paragraph("value1"));

        Cell cell3_22=new Cell()
                .add(new Paragraph("value2"));

        Cell cell3_23=new Cell()
                .add(new Paragraph("value3"));


        table3.addCell(cell3_11);
        table3.addCell(cell3_12);
        table3.addCell(cell3_13);
        table3.addCell(cell3_21);
        table3.addCell(cell3_22);
        table3.addCell(cell3_23);
        //*************table 4

        Table table4 = new Table(UnitValue.createPercentArray(new float[]{4,10,4,1})).setMarginTop(5).setMarginLeft(-30).setMarginRight(-30).setWidth(583);
        table4.setWidth(UnitValue.createPercentValue(100));
        table4.setFixedLayout();

        Cell cell4_11=new Cell(1,4).setBackgroundColor(myColor)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("2. PROBLEM DESCRIPTION")
                        .setFontColor(ColorConstants.WHITE)
                        .setBold());
        Cell cell4_20=new Cell(1,4).setHeight(100)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("")
                        .setBold());

        Cell cell4_21=new Cell(1,1).setBackgroundColor(colorHeader).setBorderRight(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("Traceability :")
                        .setFontColor(myColor)
                        .setBold());
        Cell cell4_22=new Cell(1,1).setBorderLeft(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("")
                        .setBold());
        Cell cell4_23=new Cell(1,1).setBackgroundColor(colorHeader)
                .setTextAlignment(TextAlignment.CENTER).setBorderRight(Border.NO_BORDER)
                .add(new Paragraph("Reccurence ?")
                        .setFontColor(myColor)
                        .setBold());
        Cell cell4_24=new Cell(1,1).setBorderLeft(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("YES")
                        );
        table4.addCell(cell4_11);
        table4.addCell(cell4_20);
        table4.addCell(cell4_21);
        table4.addCell(cell4_22);
        table4.addCell(cell4_23);
        table4.addCell(cell4_24);


//**************table 5
        Table table5 = new Table(UnitValue.createPercentArray(new float[]{4,10})).setMarginTop(5).setMarginLeft(-30).setMarginRight(-30).setWidth(583);
        table5.setWidth(UnitValue.createPercentValue(100));
        table5.setFixedLayout();
        Cell cell5_11=new Cell(1,2).setBackgroundColor(myColor)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("3. CONTAINMENT ACTION(S) including other products with associated risk")
                        .setFontColor(ColorConstants.WHITE)
                        .setBold());

        Cell cell5_20=new Cell(1,2).setHeight(100)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph(""));

        Cell cell5_21=new Cell(1,1).setBackgroundColor(colorHeader).setBorderRight(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("First Certified Batch :")
                        .setFontColor(myColor)
                        .setBold());
        Cell cell5_22=new Cell(1,1).setBorderLeft(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("")
                        .setBold());

        table5.addCell(cell5_11);
        table5.addCell(cell5_20);
        table5.addCell(cell5_21);
        table5.addCell(cell5_22);



//*********table 6

        Table table6= new Table(UnitValue.createPercentArray(new float[]{9,1,8,5})).setMarginTop(5).setMarginLeft(-30).setMarginRight(-30).setWidth(588);
        table4.setWidth(UnitValue.createPercentValue(100));
        table4.setFixedLayout();

        Cell cell6_11=new Cell(1,4).setBackgroundColor(myColor)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("4. ROOT CAUSE OR ESCAPE POINT")
                        .setFontColor(ColorConstants.WHITE)
                        .setBold());
        Cell cell6_21=new Cell(1,4).setBackgroundColor(colorHeader)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("On Occurrence").setFontColor(myColor)
                        .setBold());

        Cell cell6_31=new Cell(1,4).setHeight(50)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("T")
                        .setFontColor(myColor)
                        );
        Cell cell6_41=new Cell(1,4).setBackgroundColor(colorHeader)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("On No detection")
                        .setFontColor(myColor)
                        .setBold());
        Cell cell6_51=new Cell(1,4).setHeight(50)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("T")
                        .setFontColor(myColor)
                );
        Cell cell7_11=new Cell(1,1).setBackgroundColor(colorHeader).setBorderRight(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("Is Bontaz responsible for this issue ?")
                        .setFontColor(myColor)
                        .setBold());
        Cell cell7_12=new Cell(1,1).setBorderLeft(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("YES")
                        );
        Cell cell7_13=new Cell(1,1).setBackgroundColor(colorHeader)
                .setTextAlignment(TextAlignment.CENTER).setBorderRight(Border.NO_BORDER)
                .add(new Paragraph("Date of Root Cause defintion :")
                        .setFontColor(myColor)
                        .setBold());
        Cell cell7_14=new Cell(1,1).setBorderLeft(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("")
                        .setBold());
        table6.addCell(cell6_11);
        table6.addCell(cell6_21);
        table6.addCell(cell6_31);
        table6.addCell(cell6_41);
        table6.addCell(cell6_51);
        table6.addCell(cell7_11);
        table6.addCell(cell7_12);
        table6.addCell(cell7_13);
        table6.addCell(cell7_14);

        //*********table 7

        Table table8= new Table(UnitValue.createPercentArray(new float[]{7,3,7,3,7,5,7,3})).setMarginTop(5).setMarginLeft(-30).setMarginRight(-30).setWidth(588);
        table8.setWidth(UnitValue.createPercentValue(100));
        table8.setFixedLayout();
        Cell cell8_11=new Cell(1,5).setBackgroundColor(myColor)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("5/ POTENTIAL ACTIONS - Occurrence /  detection")
                        .setFontColor(ColorConstants.WHITE)
                        .setBold());
        Cell cell8_12=new Cell(1,1).setBackgroundColor(colorHeader)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("Pilot").setFontColor(myColor)
                        .setBold());
        Cell cell8_13=new Cell(1,1).setBackgroundColor(colorHeader)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("Planned date").setFontColor(myColor)
                        .setBold());
        Cell cell8_14=new Cell(1,1).setBackgroundColor(colorHeader)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("Status").setFontColor(myColor)
                        .setBold());
//*****************
        Cell cell8_21=new Cell(1,5)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("1").setFontColor(myColor));
        Cell cell8_22=new Cell(1,1)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("2").setFontColor(myColor));
        Cell cell8_23=new Cell(1,1)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("3").setFontColor(myColor));
        Cell cell8_24=new Cell(1,1)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("4").setFontColor(myColor));
        table8.addCell(cell8_11);
        table8.addCell(cell8_12);
        table8.addCell(cell8_13);
        table8.addCell(cell8_14);
         table8.addCell(cell8_21);
            table8.addCell(cell8_22);
            table8.addCell(cell8_23);
            table8.addCell(cell8_24);
        for (int i=1;i<5;i++){

            table8.addCell(new Cell(1,5)
                    .setTextAlignment(TextAlignment.CENTER)
                    .add(new Paragraph("1").setFontColor(myColor)));
            table8.addCell(new Cell(1,1)
                    .setTextAlignment(TextAlignment.CENTER)
                    .add(new Paragraph("2").setFontColor(myColor)));
            table8.addCell(new Cell(1,1)
                    .setTextAlignment(TextAlignment.CENTER)
                    .add(new Paragraph("3").setFontColor(myColor)));

            table8.addCell(new Cell(1,1)
                    .setTextAlignment(TextAlignment.CENTER)
                    .add(new Paragraph("4").setFontColor(myColor)));

        }

        Cell cell8_41=new Cell(1,1).setBackgroundColor(colorHeader).setBorderRight(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("DDM")
                        .setFontColor(myColor)
                        .setBold());
        Cell cell8_42=new Cell(1,1).setBorderLeft(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("YES")
                );
        Cell cell8_43=new Cell(1,1).setBackgroundColor(colorHeader)
                .setTextAlignment(TextAlignment.CENTER).setBorderRight(Border.NO_BORDER)
                .add(new Paragraph("Pilot :")
                        .setFontColor(myColor)
                        .setBold());
        Cell cell8_44=new Cell(1,3)
                .setTextAlignment(TextAlignment.CENTER).setBorderLeft(Border.NO_BORDER)
                .add(new Paragraph("")
                        .setFontColor(myColor)
                        .setBold());
        Cell cell8_45=new Cell(1,1).setBackgroundColor(colorHeader)
                .setTextAlignment(TextAlignment.CENTER).setBorderRight(Border.NO_BORDER)
                .add(new Paragraph("Approved :")
                        .setFontColor(myColor)
                        .setBold());
        Cell cell8_46=new Cell(1,1).setBorderLeft(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("YES")
                );


        table8.addCell(cell8_41);
        table8.addCell(cell8_42);
        table8.addCell(cell8_43);
        table8.addCell(cell8_44);
        table8.addCell(cell8_45);
        table8.addCell(cell8_46);
        //*********************
        Table table9= new Table(UnitValue.createPercentArray(new float[]{7,3,7,3,7,5,7,3})).setMarginTop(5).setMarginLeft(-30).setMarginRight(-30).setWidth(588);
        table9.setWidth(UnitValue.createPercentValue(100));
        table9.setFixedLayout();
        Cell cell9_11=new Cell(1,5).setBackgroundColor(myColor)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("6/ IMPLEMENTED ACTIONS - Occurrence / detection")
                        .setFontColor(ColorConstants.WHITE)
                        .setBold());
        Cell cell9_12=new Cell(1,1).setBackgroundColor(colorHeader)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("Pilot").setFontColor(myColor)
                        .setBold());
        Cell cell9_13=new Cell(1,1).setBackgroundColor(colorHeader)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("Date").setFontColor(myColor)
                        .setBold());
        Cell cell9_14=new Cell(1,1).setBackgroundColor(colorHeader)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("Status").setFontColor(myColor)
                        .setBold());
        table9.addCell(cell9_11);
        table9.addCell(cell9_12);
        table9.addCell(cell9_13);
        table9.addCell(cell9_14);

        for (int i=1;i<4;i++){

            table9.addCell(new Cell(1,5)
                    .setTextAlignment(TextAlignment.CENTER)
                    .add(new Paragraph("1").setFontColor(myColor)));
            table9.addCell(new Cell(1,1)
                    .setTextAlignment(TextAlignment.CENTER)
                    .add(new Paragraph("2").setFontColor(myColor)));
            table9.addCell(new Cell(1,1)
                    .setTextAlignment(TextAlignment.CENTER)
                    .add(new Paragraph("3").setFontColor(myColor)));

            table9.addCell(new Cell(1,1)
                    .setTextAlignment(TextAlignment.CENTER)
                    .add(new Paragraph("4").setFontColor(myColor)));

        }
        Cell cell9_21=new Cell(1,2).setBackgroundColor(colorHeader).setBorderRight(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("First Certified Batch :")
                        .setFontColor(myColor)
                        .setBold());
        Cell cell9_22=new Cell(1,6).setBorderLeft(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("")
                );
        table9.addCell(cell9_21);table9.addCell(cell9_22);
        //*************
        Table table10= new Table(UnitValue.createPercentArray(new float[]{7,3,7,3,7,5,7,3})).setMarginTop(5).setMarginLeft(-30).setMarginRight(-30).setWidth(588);
        table10.setWidth(UnitValue.createPercentValue(100));
        table10.setFixedLayout();
        Cell cell10_11=new Cell(1,5).setBackgroundColor(myColor)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("7/ PREVENTIVE ACTIONS and DOCUMENT UPDATE")
                        .setFontColor(ColorConstants.WHITE)
                        .setBold());
        Cell cell10_12=new Cell(1,1).setBackgroundColor(colorHeader)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("Pilot").setFontColor(myColor)
                        .setBold());
        Cell cell10_13=new Cell(1,1).setBackgroundColor(colorHeader)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("Date").setFontColor(myColor)
                        .setBold());
        Cell cell10_14=new Cell(1,1).setBackgroundColor(colorHeader)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("Status").setFontColor(myColor)
                        .setBold());
        table10.addCell(cell10_11);
        table10.addCell(cell10_12);
        table10.addCell(cell10_13);
        table10.addCell(cell10_14);

        for (int i=1;i<3;i++){

            table10.addCell(new Cell(1,5)
                    .setTextAlignment(TextAlignment.CENTER)
                    .add(new Paragraph("1").setFontColor(myColor)));
            table10.addCell(new Cell(1,1)
                    .setTextAlignment(TextAlignment.CENTER)
                    .add(new Paragraph("2").setFontColor(myColor)));
            table10.addCell(new Cell(1,1)
                    .setTextAlignment(TextAlignment.CENTER)
                    .add(new Paragraph("3").setFontColor(myColor)));

            table10.addCell(new Cell(1,1)
                    .setTextAlignment(TextAlignment.CENTER)
                    .add(new Paragraph("4").setFontColor(myColor)));

        }
        Cell cell10_41=new Cell(1,1).setBackgroundColor(colorHeader)
                .setTextAlignment(TextAlignment.CENTER).setBorderRight(Border.NO_BORDER)
                .add(new Paragraph("DFMEA ?")
                        .setFontColor(myColor)
                        .setBold());
        Cell cell10_42=new Cell(1,1)
                .setTextAlignment(TextAlignment.CENTER).setBorderLeft(Border.NO_BORDER)
                .add(new Paragraph("yes"));
        Cell cell10_43=new Cell(1,1).setBackgroundColor(colorHeader)
                .setTextAlignment(TextAlignment.CENTER).setBorderRight(Border.NO_BORDER)
                .add(new Paragraph("PFMEA ?")
                        .setFontColor(myColor)
                        .setBold());
        Cell cell10_44=new Cell(1,1).setBorderLeft(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("YES")
                );
        Cell cell10_45=new Cell(1,1).setBackgroundColor(colorHeader)
                .setTextAlignment(TextAlignment.CENTER).setBorderRight(Border.NO_BORDER)
                .add(new Paragraph("Ctrl Plan ?")
                        .setFontColor(myColor)
                        .setBold());
        Cell cell10_46=new Cell(1,1).setBorderLeft(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("YES")
                );
        Cell cell10_47=new Cell(1,1).setBackgroundColor(colorHeader)
                .setTextAlignment(TextAlignment.CENTER).setBorderRight(Border.NO_BORDER)
                .add(new Paragraph("Others ?")
                        .setFontColor(myColor)
                        .setBold());
        Cell cell10_48=new Cell(1,1).setBorderLeft(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("YES")
                );


        table10.addCell(cell10_41);
        table10.addCell(cell10_42);
        table10.addCell(cell10_43);
        table10.addCell(cell10_44);
        table10.addCell(cell10_45);
        table10.addCell(cell10_46);
        table10.addCell(cell10_47);
        table10.addCell(cell10_48);

        //*****************************

        Table table11= new Table(UnitValue.createPercentArray(new float[]{10,5,10})).setMarginTop(5).setMarginLeft(-30).setMarginRight(-30).setWidth(588);
        table11.setWidth(UnitValue.createPercentValue(100));
        table11.setFixedLayout();

        Cell cell11_11=new Cell(1,3).setBackgroundColor(myColor)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("8/ TEAM AND INDIVIDUAL RECOGNITION")
                        .setFontColor(ColorConstants.WHITE)
                        .setBold());

        Cell cell11_21=new Cell(2,1)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph(""));

        Cell cell11_22=new Cell(1,1).setBackgroundColor(colorHeader)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("Reported by :")
                        .setFontColor(myColor)
                        .setBold());
        Cell cell11_23=new Cell(1,1)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("")
                        .setFontColor(ColorConstants.WHITE));
        Cell cell11_31=new Cell(1,1)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph(""));

        Cell cell11_32=new Cell(1,1).setBackgroundColor(colorHeader)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("Closed date :")
                        .setFontColor(myColor)
                        .setBold());
        Cell cell11_33=new Cell(1,1)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("")
                        .setFontColor(ColorConstants.WHITE));




        table11.addCell(cell11_11);
        table11.addCell(cell11_21);
        table11.addCell(cell11_22);
        table11.addCell(cell11_23);
        table11.addCell(cell11_32);
        table11.addCell(cell11_33);






//****************add to page
        document.add(table);
        document.add(table2);
        document.add(table3);
        document.add(table4);
        document.add(table5);
        document.add(table6);
        document.add(table8);
        document.add(table9);
        document.add(table10);
        document.add(table11);

        document.close();

    }


}
