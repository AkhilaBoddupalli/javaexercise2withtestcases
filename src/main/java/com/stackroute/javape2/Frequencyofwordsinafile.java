package com.stackroute.javape2;
import java.io.*;

import java.util.*;
public class Frequencyofwordsinafile
{

    public String wordFrequencyCount(String fname) throws IOException

    {
        File f1 = new File("hello.txt");

        if(!f1.exists())

        {
            System.out.println("Source file doesnot exists");

            System.exit(0);

        }
        String contentsToWrite="i an a man"+"\n"+"i like to sleep"+"\n"+"i have a home";


        FileInputStream fis = new FileInputStream(fname);

        int ch;
        String str="";

        StringTokenizer st = new StringTokenizer(str);

        int count=0;

        while(st.hasMoreTokens())

        {

            HashSet Set = new HashSet();

            if(Set.contains(st.nextToken()))

                count++;

        }

        System.out.println("no of words"+count);
        fis.close();
        return null;
    }

}



