import java.io.File;

import java.io.FileWriter;

import java.io.IOException;

import java.util.ArrayList;

import java.util.Scanner;


public class gg {

    public static void main(String[] args) {

        /*Ввести строки из файла, записать их в стек. Вывести строки в файл в обратном порядке. */

        System.out.println(" Ввести строки из файла, записать их в стек. Вывести строки в файл в обратном порядке. Введите путь к файлу:");

        Scanner in = new Scanner(System.in);

        String file=in.nextLine();

        try{

            File f=new File(file);

            Scanner fr = new Scanner(f);

            ArrayList <String> stack = new ArrayList<String>();

            System.out.println("Строки в файле:");

            while(fr.hasNextLine()){

                stack.add(fr.nextLine());

                System.out.println(stack.get(stack.size()-1));

            }

            System.out.println("Строки в обратном порядке:");

            FileWriter fw = new FileWriter(f);

            for(int i=stack.size()-1;i>=0;i--){

                System.out.println(stack.get(i));

                fw.append(stack.get(i)+((i!=0)?" ":""));

            }

            fw.close();

            System.out.println("Строки записаны в файл в обратном порядке.");

        }

catch(IOException err){
            System.out.println(err.getMessage());

        }

    }

}