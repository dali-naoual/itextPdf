package com.example.itextpdf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

@SpringBootApplication
public class ItextPdfApplication {


    public static void main(String[] args) {
        SpringApplication.run(ItextPdfApplication.class, args);

        pdf_5p pdf=new pdf_5p();


        try {
            pdf.WHYANALYSE();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
