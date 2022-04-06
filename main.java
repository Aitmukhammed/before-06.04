  package com.company;
import java.io.*;
import java.util.Scanner;
import java.math.BigDecimal;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileWriter;
import org.json.JSONOArray;
import org.json.JSONObject;

public class main {
    public static void main(String args[])
            throws IOException {
        JSONObject j = new JSONObject();
        j.put("name","alex");
        j.put("age",18);
        





        // First create object type MyThread
        MyThread mt = new MyThread("Порожденный поток #1");

        // before form(формироваать) on the basis(на основе) this object
        Thread newThrd = new Thread(mt);

        // finally, start performance (начать) the stream
        newThrd.start();

        for (int i=0; i<50; i++){
            System.out.println(".");
            try {
                Thread.sleep(100);
            }catch (InterruptedException excx){
                System.out.println("Interruption (прерывание) of the main stream");
            }
        }
        System.out.println("Completion of the main stream");


        RandomAccessFile raf = new RandomAccessFile("C:\\JavaPractice\\input.txt", "rw");

//пишем в файл строку, начиная с 0-го байта
        raf.writeBytes("It is a string");

//ставим курсор на 8-й символ
        raf.seek(6);
//печатаем в файл строку surprise!
        raf.writeBytes("surprise!");

//закрываем файл
        raf.close();


        String t;
        BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));
        try(FileWriter fw = new FileWriter("test2.txt",true)) {
            do {
                System.out.println(": ");
                t = rb.readLine();

                if(t.compareTo("stop")==0) break;
                t = t+"\r\n";
                fw.write(t);
            }while(t.compareTo("stop")!=0);
        }catch (IOException e){
            System.out.println("Error: "+e);
        }
        System.out.println();
        ///////
        String ss;
        try (BufferedReader bb = new BufferedReader(new FileReader("C:\\JavaPractice\\test3.txt"))){
            while ((ss = bb.readLine()) != null){
                System.out.println(ss);
            }
        }catch (IOException e){
            System.out.println("Error " +e );
        }
        System.out.println();

        /////////////////////////////////////////////
        PrintWriter pw = new PrintWriter(System.out, true);
        int i1 =10;
        String hi = "HI";
        pw.println(i1);
        pw.println(hi);
        pw.println(i1 + hi);
        System.out.println();

        /// С помощью буфера создаем файл и пишем туда текст
        BufferedWriter buff = new BufferedWriter(new FileWriter("C:\\JavaPractice\\buffered.txt",true));
        String srt = "Буфферизация";
        buff.write(srt);
        buff.close();


        /// Чтение файла буфера созданный сверху ( символьна )
        BufferedReader bufr = new BufferedReader(new FileReader("C:\\JavaPractice\\buffered.txt"));
        int c;
        while ((c=bufr.read()) != -1){
            System.out.print((char)c);
        }
        bufr.close();
        System.out.println();

        /// Чтение файла буфера созданный сверху ( построчна )
        BufferedReader bufr2 = new BufferedReader(new FileReader("C:\\JavaPractice\\buffered.txt"));
        String s;
        while ((s=bufr2.readLine()) != null){
            System.out.print(s);
        }
        bufr2.close();
        System.out.println();


        ////////////////////////////////////////////////////////
        char as;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите символы; Окончание ввода 'точка' ");

        do {
            as = (char) br.read();
            System.out.println(as);
        }while (as != '.');

        //////////////////////////////////////////////////////////
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String text;
        System.out.println("Много рук, одна нога, что это?");
        while (!((text = buf.readLine()).equals("stop") || text.equals("Дерево"))){
            System.out.println("Много рук, одна нога, что это?");
        }
        buf.close();

        //////////////////////////////////////////////////////////////

        int i=10;
        double d=1023.6;
        boolean b=true;

        try(DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("testdata"))) {
            System.out.println("Written: "+i);
            dataOut.writeInt(i);

            System.out.println("Written: "+d);
            dataOut.writeDouble(d);

            System.out.println("Written: "+b);
            dataOut.writeBoolean(b);

            System.out.println("Written: "+12.2*7.4);
            dataOut.writeDouble(12.2*7.4);
        }catch (IOException e){
            System.out.println("Ошибка при записи");
            return;
        }
        System.out.println();
        try(DataInputStream input = new DataInputStream(new FileInputStream("testdata"))) {
            i = input.readInt();
            System.out.println("Прочитано: "+i);

            d = input.readDouble();
            System.out.println("Прочитано: "+d);

            b = input.readBoolean();
            System.out.println("Прочитано: "+b);

            d = input.readDouble();
            System.out.println("Прочитано: "+12.2*7.4);
        }catch (IOException e){
            System.out.println("Ошибка при чтении");
            return;
        }


        /// ошибочный код
//        try(ObjectInputStream oos = new ObjectInputStream(new FileInputStream("person.dat")))
//        {
//            Person p = new Person("Sam", 33, 178, true);
//            oos.writeObject(p);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }



//             int i;
//             if(args.length != 1){
//                 System.out.println("Использование:  main - источник и назначение ");
//                 return;
//             }
//             try(FileInputStream fin = new FileInputStream("pro.txt")) {
//                 do {
//                     i = fin.read();
//                     if (i != -1) System.out.println((char) i);
//                 } while (i != -1);
//             }catch (IOException e){
//                 System.out.println("Ошибка ввода-вывода"+e);
//             }

        ///////

//                String str = "Input and output streams";
//                try {
//                    PrintStream pr = new PrintStream("C:\\JavaPractice\\practiceJava.txt");
//                    pr.println(str);
//                }catch(IOException exc){
//                    System.out.println(exc.getMessage());
//                }
//
//                ////////////////////////
//
//                String str2 ="overwrite\n";
//                try{
//                    FileOutputStream fout = new FileOutputStream("C:\\JavaPractice\\practiceJava.txt",true);
//                    byte buf[] = str2.getBytes();
//                    fout.write(buf);
//                    System.out.println("Перезапись произошла успешно");
//                }catch (IOException exc){
//                    System.err.println(exc.getMessage());
//                }
//
//                //////////////////////
//
//                StringBuffer s = new StringBuffer();
//                try{
//                    FileInputStream fileOut = new FileInputStream("C:\\JavaPractice\\practiceJava.txt");
//                    int i = -1;
//                    while ((i = fileOut.read()) != -1){
////                        System.out.print((char)i);
//                        s.append((char)i);
//                    }
//                }catch (IOException exc){
//                    exc.printStackTrace();
//                }
//                System.out.print(s);
//
//                ///////////////////////////////
//
//                try {
//                    Scanner scr = new Scanner(new File("C:\\JavaPractice\\practiceJava.txt"));
//                    String x = scr.nextLine();
//                    System.out.println(x);
//                    scr.close();
//                }catch (IOException e){
//
//                }
//
//
//                /////////////////////////////////
//
//                int i;
//                FileInputStream fin = null;
//                FileOutputStream fout = null;
//
//                if(args.length !=2){
//                    System.out.println("Использование: CopyFile ");
//                    return;
//                }
//                try{
//                    fin = new FileInputStream("C:\\JavaPractice\\copy1.txt");
//                    fout = new FileOutputStream("C:\\JavaPractice\\copy2.txt");
//
//                    do {
//                        i = fin.read();
//                        if (i != -1) fout.write(i);
//                    }while (i != -1);
//                }catch (IOException exc){
//                    System.out.println("Ошибка ввода и вывода: "+exc);
//                }finally {
//                    try {
//                        if (fin != null) fout.close();
//                    }
//                catch (IOException exc){
//                    System.out.println("Ошибка при закрытии входного файла");
//                }
//
//                try {
//                    if (fout != null) fout.close();
//                }catch (IOException exc){
//                    System.out.println("Ошибка при закрытии выходного файла");
//                }
//            }





        //////

//        byte data[] = new byte[10];
//        System.out.println("Vvedite simvoly: ");
//        System.in.read(data);
//        System.out.println("Вы ввели: ");
//        for(int i=0; i< data.length; i++)
//            System.out.print((char) data[i]);
//
//        ////
//
//        int b;
//        b = 'X';
//        System.out.write(b);
//        System.out.write('\n');
//        FileWriter fr = null;
//        String hot = " Это новый тескстовый документ создался с помощью IntellijIdea";
//        File file = new File("C:/Practice/primer3.html");
//        try {
//            fr = new FileWriter(file,true);
//            fr.write(hot);
//
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }catch (IOException e){
//            e.printStackTrace();
//        }finally {
//            try {
//                fr.close();
//            }catch (IOException e){
//                e.printStackTrace();
//            }
//        }



//        FileWriter fr = null;
//        String hot = " Это строка дописывается в блокноте с помощью true";
//        try {
//            fr = new FileWriter("C:/Practice/primer2.txt",true);
//            fr.write(hot);
//
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }catch (IOException e){
//            e.printStackTrace();
//        }finally {
//            try {
//                fr.close();
//            }catch (IOException e){
//                e.printStackTrace();
//            }
//        }



//        FileOutputStream fileOutputStream = null;
//        String str = " Это строка переписывается  в блокноте вместо тех слов";
//        try{
//            fileOutputStream = new FileOutputStream("C:/Practice/primer.txt");
//            fileOutputStream.write(str.getBytes());
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }
//        catch(IOException e){
//            e.printStackTrace();
//        }
//



//        FileInputStream fis = null;
//        InputStreamReader isr = null;
//        int b=0;
//        try{
//                fis = new FileInputStream("C:/Practice/primer.txt" );
//                isr = new InputStreamReader(fis,"UTF-8");
//
//            while((b=isr.read())!=-1) {
//                System.out.println((char)b);
//                    }
//        } catch(IOException e){
//            e.printStackTrace();
//        }
//        finally {
//            try{
//                    fis.close();
//            }catch (IOException e){
//                    e.printStackTrace();
//                }
//
//            try{
//                isr.close();
//            }catch (IOException e){
//                e.printStackTrace();
//            }
//        }
    }
}