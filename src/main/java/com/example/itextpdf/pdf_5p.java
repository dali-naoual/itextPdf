package com.example.itextpdf;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.properties.UnitValue;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

public class pdf_5p {


    public void WHYANALYSE() throws FileNotFoundException, MalformedURLException {
        String imgSource="images\\bontaz.png";
        ImageData data= ImageDataFactory.create(imgSource);
        Image image1=new Image(data);
        image1.scaleToFit(90f, 60f);
        String path="C:\\pdf\\WHYANALYSE.pdf";
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
        Paragraph header=new Paragraph("PROBLEM SOLVING TEAM");

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
                .add(new Paragraph("Claim reference (8D or QRQC)")
                        .setFontColor(myColor)
                        .setBold());

        Cell cell12=new Cell(1,1).setBackgroundColor(colorHeader)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("Product / Process / System")
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
        Table table3 = new Table(UnitValue.createPercentArray(new float[]{2,1,10})).setMarginTop(10).setMarginLeft(-30).setMarginRight(-30).setWidth(583);
        table3.setWidth(UnitValue.createPercentValue(100));
        table3.setFixedLayout();

        // Table table3 = new Table(3,false).setMarginTop(10).setMarginLeft(-30).setMarginRight(-30).setWidth(583).setFixedLayout();


        Cell cell3_11=new Cell(1,3).setBackgroundColor(myColor)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("FAILURE OCCURRENCE ANALYSIS")
                        .setFontColor(ColorConstants.WHITE)
                        .setBold());


        table3.addCell(cell3_11);





        for (int i=1;i<6;i++){

            Cell cell3_12=new Cell(1,1).setBackgroundColor(colorHeader)
                    .setTextAlignment(TextAlignment.CENTER)
                    .add(new Paragraph(i+": Why")
                            .setFontColor(myColor)
                            .setBold());
            table3.addCell(cell3_12);

            Cell cell3_13=new Cell(1,2)
                    .setTextAlignment(TextAlignment.CENTER)
                    .add(new Paragraph("Email")
                            .setFontColor(ColorConstants.WHITE)
                            .setBold());
            table3.addCell(cell3_13);

            Cell cell3_21= new Cell(1,2).setBackgroundColor(colorHeader)
                    .setTextAlignment(TextAlignment.CENTER)
                    .add(new Paragraph("Answer :")
                            .setFontColor(myColor)
                            .setBold());
            table3.addCell(cell3_21);



            Cell cell3_23=new Cell()
                    .add(new Paragraph("value3"));
            table3.addCell(cell3_23);

        }
        Table table4 = new Table(UnitValue.createPercentArray(new float[]{2,1,10})).setMarginTop(10).setMarginLeft(-30).setMarginRight(-30).setWidth(583);


        Cell cell4_11=new Cell(1,3).setBackgroundColor(myColor)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph("FAILURE DETECTION ANALYSIS")
                        .setFontColor(ColorConstants.WHITE)
                        .setBold());


        table4.addCell(cell4_11);





        for (int i=1;i<6;i++){

            Cell cell4_12=new Cell(1,1).setBackgroundColor(colorHeader)
                    .setTextAlignment(TextAlignment.CENTER)
                    .add(new Paragraph(i+": Why")
                            .setFontColor(myColor)
                            .setBold());
            table4.addCell(cell4_12);

            Cell cell4_13=new Cell(1,2)
                    .setTextAlignment(TextAlignment.CENTER)
                    .add(new Paragraph("Email")
                            .setFontColor(ColorConstants.BLACK)
                            .setBold());
            table4.addCell(cell4_13);

            Cell cell4_21= new Cell(1,2).setBackgroundColor(colorHeader)
                    .setTextAlignment(TextAlignment.CENTER)
                    .add(new Paragraph("Answer :")
                            .setFontColor(myColor)
                            .setBold());
            table4.addCell(cell4_21);



            Cell cell4_23=new Cell()
                    .add(new Paragraph("value3"));
            table4.addCell(cell4_23);

        }

        //**********************************

        Table table5 = new Table(UnitValue.createPercentArray(new float[]{2,1,10})).setMarginTop(10).setMarginLeft(-30).setMarginRight(-30).setWidth(583);


        Cell cell5_11=new Cell(1,3).setBackgroundColor(myColor)
                .setTextAlignment(TextAlignment.CENTER)
                .add(new Paragraph(" FAILURE SYSTEM ANALYSIS")
                        .setFontColor(ColorConstants.WHITE)
                        .setBold());


        table5.addCell(cell5_11);





        for (int i=1;i<6;i++){

            Cell cell5_12=new Cell(1,1).setBackgroundColor(colorHeader)
                    .setTextAlignment(TextAlignment.CENTER)
                    .add(new Paragraph(i+": Why")
                            .setFontColor(myColor)
                            .setBold());
            table5.addCell(cell5_12);

            Cell cell5_13=new Cell(1,2)
                    .setTextAlignment(TextAlignment.CENTER)
                    .add(new Paragraph("Email")
                            .setFontColor(ColorConstants.BLACK)
                            .setBold());
            table5.addCell(cell5_13);

            Cell cell5_21= new Cell(1,2).setBackgroundColor(colorHeader)
                    .setTextAlignment(TextAlignment.CENTER)
                    .add(new Paragraph("Answer :")
                            .setFontColor(myColor)
                            .setBold());
            table5.addCell(cell5_21);



            Cell cell5_23=new Cell()
                    .add(new Paragraph("value3"));
            table5.addCell(cell5_23);

        }


        document.add(table);
        document.add(table2);
        document.add(table3);
        document.add(table4);
        document.add(table5);

        document.close();




}}
