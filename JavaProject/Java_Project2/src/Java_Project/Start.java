package Java_Project;

import java.util.*;
import java.io.*;
import java.nio.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 


public class Start implements IBasicOperations {


    public void showInfo(){

        System.out.println("showing patron info");


    }



    public void borrow(Patron p,Book b){

        System.out.println("Please Enter what type of user you are :");

        System.out.println("1. Student");
        System.out.println("2. Teacher");

        Scanner sc = new Scanner(System.in);

        int select1= sc.nextInt();

        String type = "";


        if(select1 ==1){

            type = "Student";

            System.out.println("\n\n");

            System.out.println("Please Enter your Student ID :");

            Scanner sc9 = new Scanner(System.in);

            int select9= sc9.nextInt();

            FileReader fileReader2 = null;

        BufferedReader bufferedReader2 = null ;

        File file = new File("D:\\java\\mini project 2\\Student\\student_records.txt");

        try{

        fileReader2 = new FileReader(file);
        

        bufferedReader2 = new BufferedReader(fileReader2);
        







        String line = "";
        String result ="";
            String searchKey = "StudentID : "+select9 ;
            
            String words[] = null;
            boolean found = false;
            outer: while((line = bufferedReader2.readLine()) != null) {
                
                words = line.split(",");
                for(String word: words) {
                    if(word.equals(searchKey)){
                        found = true;

                        result = line;

                        break outer;
                    }
                }
            }
                if(found) {

                    System.out.println("\n\n");
                    

                    System.out.println("!!!  Succesfully Logged In  !!");

                    System.out.println("\n\n");


                    System.out.println("Here is the list of Books : ");



                    FileReader fileReader = null;

        BufferedReader bufferedReader = null ;

        File file2 = new File("D:\\java\\mini project 2\\Book\\book_records.txt");

        try{

            fileReader = new FileReader(file2);

            bufferedReader = new BufferedReader(fileReader);

            String line2 = "" ;


            while ((line2 = bufferedReader.readLine())!= null){

                System.out.println("\n\n");


                System.out.println(line2);
            }
        }

        catch(Exception e){

            System.out.println("Exception Occured"+e);
        }


        finally{

            try{

                fileReader.close();
                bufferedReader.close();
            }


            catch(Exception e){

                System.out.println("Exception Occured"+e);
            }
        }

        System.out.println("\n\n");


        System.out.println("Please enter the book id you want to borrow : ");

        Scanner sc10 = new Scanner(System.in);

            int select10= sc10.nextInt();



            FileReader fileReader3 = null;

        BufferedReader bufferedReader3 = null ;

        File file3 = new File("D:\\java\\mini project 2\\Book\\book_records.txt");

        try{

        fileReader3 = new FileReader(file3);
        

        bufferedReader3 = new BufferedReader(fileReader3);
        







        String line3 = "";
        String result3 ="";
            String searchKeyy = "Book's Id : "+select10 ;
            
            String words3[] = null;
            boolean found3 = false;
            outer2: while((line3 = bufferedReader3.readLine()) != null) {
                
                words3 = line3.split(",");
                for(String word: words3) {
                    if(word.equals(searchKeyy)){
                        found3 = true;

                        result3 = line3;

                        break outer2;
                    }
                }
            }
                if(found3) {

                    System.out.println("\n\n");


                    System.out.println("!!!  Succesfully Borrowed the Book  !!");

                    System.out.println("\n\n");

                    File reciept = new File("D:\\java\\mini project 2\\Borrow\\Student\\borrow_records.txt");

                    File recieptmax = new File("D:\\java\\mini project 2\\Borrow\\max\\Student\\maxborrowid.txt");

                    FileWriter recieptWriter = null;

                    FileWriter recieptmaxWriter = null;

                    int recieptmaxid=0;

                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
                    LocalDateTime now = LocalDateTime.now();  
                    
                    
                    

                    try{

                        if(recieptmax.createNewFile()){
            
            
                            FileWriter fileWriter18 = null;
            
                            try{
            
            
                                fileWriter18 = new FileWriter(recieptmax);
            
                                recieptmaxid = 5001;//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa


                            }
            
            
                            catch(Exception es){
            
            
                                System.out.println("Exception occured"+es);
                            }
            
            
                            finally{
            
                                try{
            
                                    fileWriter18.close();
            
                                }
            
                                catch(Exception ess){
            
            
                                    System.out.println("Exception occured"+ess);
                                }
            
            
            
                                
                            }
                        }
                    


                    else{

                        FileReader fileReader26 = null;
                        BufferedReader bufferedReader26=null;
        
        
                        try{
        
                            fileReader26 = new FileReader(recieptmax);
        
                            bufferedReader26 = new BufferedReader(fileReader26);
        
                            String line5 = "";
        
        
                            while ((line5 = bufferedReader26.readLine())!=null){
        
        
                                recieptmaxid= Integer.parseInt(line5)+1;
                                
                                
                            }
                                
                            }
        
                            catch(Exception esss){
        
                                System.out.println("Exception occured"+esss);
                            }
                        }
        
                    }


                    catch(Exception exs){


                        System.out.println("Exception Occured"+exs);
                    }





                    


                    try{

                        recieptWriter = new FileWriter(reciept,true);

                        recieptmaxWriter = new FileWriter(recieptmax);

                        String str1 ="\nBorrow id : "+recieptmaxid;
                        String str2 = ","+result3;
                        String str3 = ",Borrower Type : "+type;
                        String str4 = ",Borrow time and Date : "+dtf.format(now);

                        recieptWriter.write(str1);
                        recieptWriter.write(str2);
                        recieptWriter.write(str3);
                        recieptWriter.write(str4);
                        recieptmaxWriter.write(""+recieptmaxid);
                    }

                    catch(Exception edq){


                        System.out.println("exception here"+edq);
                    }

                    finally{

                        try{

                            recieptWriter.close();
                            recieptmaxWriter.close();
                        }

                        catch(Exception edr){

                            System.out.println("edr");
                        }
                    }


                    System.out.println("\n\n");


                    System.out.println("A reciept is also stored!!!");

                    System.out.println("\n\n");


                    System.out.println("your Borrow Id is : "+recieptmaxid);

                    System.out.println("\n\n");

                    System.out.println("\n note : Please remember the Id for the return book!!!");

                    


                }


                else{

                    System.out.println("\n");

                    System.out.println("you have entered wrong id");


                }
            }


                catch(Exception esa){

                    System.out.println("Exception here"+esa);
                }

                finally{

                    try{

                        fileReader3.close();
                        bufferedReader3.close();
                    }


                    catch(Exception esd){

                        System.out.println("Exception");
                    }
                }

            }

            




                    
                    
                

                else{
                    System.out.println("\n");

                    System.out.println("Not found sorry");

                    


                }

                

                
            
        }

        catch(Exception e){

            System.out.println("exception occured"+e);
        }

        finally{

            try{

                fileReader2.close();
                bufferedReader2.close();
            }


            catch(Exception e){

                System.out.println("exception occured"+e);
            }


        }







        }


        else if(select1 ==2){



            type = "Teacher";

            System.out.println("Please enter your Teacher ID :");

            Scanner sc9 = new Scanner(System.in);

            int select9= sc9.nextInt();

            FileReader fileReader2 = null;

        BufferedReader bufferedReader2 = null ;

        File file = new File("D:\\java\\mini project 2\\Teacher\\teacher_records.txt");

        try{

        fileReader2 = new FileReader(file);
        

        bufferedReader2 = new BufferedReader(fileReader2);
        







        String line = "";
        String result ="";
            String searchKey = "TeacherID : "+select9 ;
            
            String words[] = null;
            boolean found = false;
            outer: while((line = bufferedReader2.readLine()) != null) {
                
                words = line.split(",");
                for(String word: words) {
                    if(word.equals(searchKey)){
                        found = true;

                        result = line;

                        break outer;
                    }
                }
            }
                if(found) {

                    System.out.println("\n\n");
                    

                    System.out.println("!!!  Succesfully Logged In  !!");

                    System.out.println("\n\n");


                    System.out.println("Here is the list of books : ");



                    FileReader fileReader = null;

        BufferedReader bufferedReader = null ;

        File file2 = new File("D:\\java\\mini project 2\\Book\\book_records.txt");

        try{

            fileReader = new FileReader(file2);

            bufferedReader = new BufferedReader(fileReader);

            String line2 = "" ;


            while ((line2 = bufferedReader.readLine())!= null){

                System.out.println("\n\n");


                System.out.println(line2);
            }
        }

        catch(Exception e){

            System.out.println("Exception Occured"+e);
        }


        finally{

            try{

                fileReader.close();
                bufferedReader.close();
            }


            catch(Exception e){

                System.out.println("Exception Occured"+e);
            }
        }

        System.out.println("\n\n");


        System.out.println("Please enter the book id you want to borrow : ");

        Scanner sc10 = new Scanner(System.in);

            int select10= sc10.nextInt();



            FileReader fileReader3 = null;

        BufferedReader bufferedReader3 = null ;

        File file3 = new File("D:\\java\\mini project 2\\Book\\book_records.txt");

        try{

        fileReader3 = new FileReader(file3);
        

        bufferedReader3 = new BufferedReader(fileReader3);
        







        String line3 = "";
        String result3 ="";
            String searchKeyy = "Book's Id : "+select10 ;
            
            String words3[] = null;
            boolean found3 = false;
            outer2: while((line3 = bufferedReader3.readLine()) != null) {
                
                words3 = line3.split(",");
                for(String word: words3) {
                    if(word.equals(searchKeyy)){
                        found3 = true;

                        result3 = line3;

                        break outer2;
                    }
                }
            }
                if(found3) {

                    System.out.println("\n\n");


                    System.out.println("!!!  Succesfully Borrowed the Book  !!");

                    System.out.println("\n\n");

                    File reciept = new File("D:\\java\\mini project 2\\Borrow\\Teacher\\borrow_records.txt");

                    File recieptmax = new File("D:\\java\\mini project 2\\Borrow\\max\\Teacher\\maxborrowid.txt");

                    FileWriter recieptWriter = null;

                    FileWriter recieptmaxWriter = null;

                    int recieptmaxid=0;

                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
                    LocalDateTime now = LocalDateTime.now();  
                    
                    
                    

                    try{

                        if(recieptmax.createNewFile()){
            
            
                            FileWriter fileWriter18 = null;
            
                            try{
            
            
                                fileWriter18 = new FileWriter(recieptmax);
            
                                recieptmaxid = 5001;


                            }
            
            
                            catch(Exception es){
            
            
                                System.out.println("Exception occured"+es);
                            }
            
            
                            finally{
            
                                try{
            
                                    fileWriter18.close();
            
                                }
            
                                catch(Exception ess){
            
            
                                    System.out.println("Exception occured"+ess);
                                }
            
            
            
                                
                            }
                        }
                    


                    else{

                        FileReader fileReader26 = null;
                        BufferedReader bufferedReader26=null;
        
        
                        try{
        
                            fileReader26 = new FileReader(recieptmax);
        
                            bufferedReader26 = new BufferedReader(fileReader26);
        
                            String line5 = "";
        
        
                            while ((line5 = bufferedReader26.readLine())!=null){
        
        
                                recieptmaxid= Integer.parseInt(line5)+1;
                                
                                
                            }
                                
                            }
        
                            catch(Exception esss){
        
                                System.out.println("Exception occured"+esss);
                            }
                        }
        
                    }


                    catch(Exception exs){


                        System.out.println("Exception Occured"+exs);
                    }





                    


                    try{

                        recieptWriter = new FileWriter(reciept,true);

                        recieptmaxWriter = new FileWriter(recieptmax);

                        String str1 ="\nBorrow id : "+recieptmaxid;
                        String str2 = ","+result3;
                        String str3 = ",Borrower Type : "+type;
                        String str4 = ",Borrow time and Date : "+dtf.format(now);

                        recieptWriter.write(str1);
                        recieptWriter.write(str2);
                        recieptWriter.write(str3);
                        recieptWriter.write(str4);
                        recieptmaxWriter.write(""+recieptmaxid);
                    }

                    catch(Exception edq){


                        System.out.println("exception here"+edq);
                    }

                    finally{

                        try{

                            recieptWriter.close();
                            recieptmaxWriter.close();
                        }

                        catch(Exception edr){

                            System.out.println("edr");
                        }
                    }


                    System.out.println("\n\n");


                    System.out.println("A reciept is also stored");


                    System.out.println("your Borrow Id is : "+recieptmaxid);

                    System.out.println("\nNote : Please remember the Id for the return book!!!");

                    


                }


                else{

                    System.out.println("You have entered wrong id");


                }
            }


                catch(Exception esa){

                    System.out.println("Exception here"+esa);
                }

                finally{

                    try{

                        fileReader3.close();
                        bufferedReader3.close();
                    }


                    catch(Exception esd){

                        System.out.println("Exception");
                    }
                }

            }

            




                    
                    
                

                else{

                    System.out.println("Not found sorry");

                    


                }

                

                
            
        }

        catch(Exception e){

            System.out.println("exception occured"+e);
        }

        finally{

            try{

                fileReader2.close();
                bufferedReader2.close();
            }


            catch(Exception e){

                System.out.println("exception occured"+e);
            }


        }


        }

        


        else{

            System.out.println("You have entered wrong input,Please try again !!!");


        }

        
    }

    public void returnBook(Patron p,Book b){

        System.out.println("\n\n");


        System.out.println("Please Enter what user you are :");

        System.out.println("1. Student");
        System.out.println("2. Teacher");

        Scanner sc = new Scanner(System.in);

        int select1= sc.nextInt();


        if(select1 == 1){

            System.out.println("\n\n");



            System.out.println("Please enter your Student ID : ");



            Scanner sc9 = new Scanner(System.in);

            int select9= sc9.nextInt();

            FileReader fileReader2 = null;

        BufferedReader bufferedReader2 = null ;

        File file = new File("D:\\java\\mini project 2\\Student\\student_records.txt");

        try{

        fileReader2 = new FileReader(file);
       

        bufferedReader2 = new BufferedReader(fileReader2);
        







        String line = "";
        String result ="";
            String searchKey = "StudentID : "+select9 ;
            
            String words[] = null;
            boolean found = false;
            outer: while((line = bufferedReader2.readLine()) != null) {
               
                words = line.split(",");
                for(String word: words) {
                    if(word.equals(searchKey)){
                        found = true;

                        result = line;

                        break outer;
                    }
                }
            }
                if(found) {


                    System.out.println("\n\n");


                    System.out.println("Successfully Found Your ID");


                    System.out.println("\n\n");


                    System.out.println("Please enter your borrow id : ");


            Scanner sc2 = new Scanner(System.in);

            int select12= sc2.nextInt();

            File file3 = new File("D:\\java\\mini project 2\\Borrow\\Student\\borrow_records.txt");

            FileReader fileReader3 = null;

            BufferedReader bufferedReader3 = null;


            try{

                fileReader3 = new FileReader(file3);
               
        
                bufferedReader3 = new BufferedReader(fileReader3);
                
        
        
        
        
        
        
        
                String line3 = "";
                String result3 ="";
                    String searchKeyy = "Borrow id : "+select12 ;
                    
                    String words3[] = null;
                    boolean found3 = false;
                    outer2: while((line3 = bufferedReader3.readLine()) != null) {
                       
                        words3 = line3.split(",");
                        for(String word: words3) {
                            if(word.equals(searchKeyy)){
                                found3 = true;
        
                                result3 = line3;
        
                                break outer2;
                            }
                        }
                    }


                    if(found3){

                        String result8 ="";

                        System.out.println("\n\n");

                        System.out.println("Your Borrowed History found");

                        System.out.println("\n");

                        System.out.println("Return Book Successful");


                        try{
                            result8 = result3;
                            
        
        
        
        
        
                    StringBuilder sb = new StringBuilder();
            try (Scanner sc3 = new Scanner(file3)) {
                String currentLine;
                while(sc3.hasNext()){
                    currentLine = sc3.nextLine();
                    if(currentLine.equals(result8)){
                        continue; //skips lineToRemove
                    }
                    sb.append(currentLine).append("\n");
                }
            }
            //Delete File Content
        
            PrintWriter pw = null;
            BufferedWriter writer2 = null;
        
            try{
            pw = new PrintWriter(file3);
            
        
            writer2 = new BufferedWriter(new FileWriter(file3, true));
            writer2.append(sb.toString());
        
        
        
        }
        
        catch(Exception edsaq){
            System.out.println(edsaq);
        }
        
            finally{
                try{
                    pw.close();
            writer2.close();
                }
             catch(Exception edsa)   {
        
             }
            }
        
        }
        
        catch(Exception edqa){
        
            System.out.println(edqa);
        }




                    }

                    else{


                        System.out.println("Not found sorry");
                    }
                }


                catch(Exception esdd){


                    System.out.println(esdd);
                }







                }

                else{

                    System.out.println("Sorry Your id not found");
                }















        }

        catch(Exception pda){

            System.out.println(pda);
        }

    }


        


        

        else if(select1 == 2){


            System.out.println("Please enter your Teacher ID : ");



            Scanner sc9 = new Scanner(System.in);

            int select9= sc9.nextInt();

            FileReader fileReader2 = null;

        BufferedReader bufferedReader2 = null ;

        File file = new File("D:\\java\\mini project 2\\Teacher\\teacher_records.txt");

        try{

        fileReader2 = new FileReader(file);
        

        bufferedReader2 = new BufferedReader(fileReader2);
     







        String line = "";
        String result ="";
            String searchKey = "TeacherID : "+select9 ;
            
            String words[] = null;
            boolean found = false;
            outer: while((line = bufferedReader2.readLine()) != null) {
                
                words = line.split(",");
                for(String word: words) {
                    if(word.equals(searchKey)){
                        found = true;

                        result = line;

                        break outer;
                    }
                }
            }
                if(found) {


                    System.out.println("\n\n");


                    System.out.println("Successfully Found Your ID");


                    System.out.println("\n\n");


                    System.out.println("Please enter your borrow id : ");


            Scanner sc2 = new Scanner(System.in);

            int select12= sc2.nextInt();

            File file3 = new File("D:\\java\\mini project 2\\Borrow\\Teacher\\borrow_records.txt");

            FileReader fileReader3 = null;

            BufferedReader bufferedReader3 = null;


            try{

                fileReader3 = new FileReader(file3);
                
        
                bufferedReader3 = new BufferedReader(fileReader3);
               
        
        
        
        
        
        
        
                String line3 = "";
                String result3 ="";
                    String searchKeyy = "Borrow id : "+select12 ;
                    
                    String words3[] = null;
                    boolean found3 = false;
                    outer2: while((line3 = bufferedReader3.readLine()) != null) {
                       
                        words3 = line3.split(",");
                        for(String word: words3) {
                            if(word.equals(searchKeyy)){
                                found3 = true;
        
                                result3 = line3;
        
                                break outer2;
                            }
                        }
                    }


                    if(found3){

                        String result8 ="";

                        System.out.println("\n\n");

                        System.out.println("Your Borrowed History found");

                        System.out.println("\n");

                        System.out.println("Return Book Successful");


                        try{
                            result8 = result3;
                            
        
        
        
        
                    StringBuilder sb = new StringBuilder();
            try (Scanner sc3 = new Scanner(file3)) {
                String currentLine;
                while(sc3.hasNext()){
                    currentLine = sc3.nextLine();
                    if(currentLine.equals(result8)){
                        continue; //skips lineToRemove
                    }
                    sb.append(currentLine).append("\n");
                }
            }
            //Delete File Content
        
            PrintWriter pw = null;
            BufferedWriter writer2 = null;
        
            try{
            pw = new PrintWriter(file3);
            
        
            writer2 = new BufferedWriter(new FileWriter(file3, true));
            writer2.append(sb.toString());
        
        
        
        }
        
        catch(Exception edsaq){
            System.out.println(edsaq);
        }
        
            finally{
                try{
                    pw.close();
            writer2.close();
                }
             catch(Exception edsa)   {
        
             }
            }
        
        }
        
        catch(Exception edqa){
        
            System.out.println(edqa);
        }




                    }

                    else{


                        System.out.println("Not found sorry");
                    }
                }


                catch(Exception esdd){


                    System.out.println(esdd);
                }







                }

                else{

                    System.out.println("Sorry Your id not found");
                }















        }

        catch(Exception pda){

            System.out.println(pda);
        }

            


        }


        else{

            System.out.println("Wrong input");
        }



    }


    public void fine(Patron p,double amount){

        System.out.println("\n\n");


        System.out.println("Please select what type of user you want to add fine : ");

        System.out.println("\n");

        System.out.println("1.Student");
        System.out.println("2.Teacher");

        Scanner sc = new Scanner(System.in);

        int select = sc.nextInt();

        String type2 ="";

        if(select==1){

            type2 ="Student";



            System.out.println("Please enter the Student ID : ");



            Scanner sc9 = new Scanner(System.in);

            int select9= sc9.nextInt();

            FileReader fileReader2 = null;

        BufferedReader bufferedReader2 = null ;

        File file = new File("D:\\java\\mini project 2\\Student\\student_records.txt");

        try{

        fileReader2 = new FileReader(file);
        

        bufferedReader2 = new BufferedReader(fileReader2);
        







        String line = "";
        String result ="";
            String searchKey = "StudentID : "+select9 ;
            
            String words[] = null;
            boolean found = false;
            outer: while((line = bufferedReader2.readLine()) != null) {
                
                words = line.split(",");
                for(String word: words) {
                    if(word.equals(searchKey)){
                        found = true;

                        result = line;

                        break outer;
                    }
                }
            }
                if(found) {

                    System.out.println("\n\n");

                    System.out.println("Logged in Successfully");

                    System.out.println("\n\n");

                    FileWriter fileWriter = null;

                    File finefile = new File("D:\\java\\mini project 2\\Fine\\Student\\fine_records.txt");


                    System.out.println("Please enter the amount you want to add Fine");

                    Scanner sc29 = new Scanner(System.in);

                    int amn = sc29.nextInt();

                    double amt = amn;

                    try{

                        file.createNewFile();
                    }

                    catch(Exception epi){

                        System.out.println(epi);
                    }


                    try{

                        fileWriter = new FileWriter(finefile,true);

                        String str = "\nStudent id : "+select9;
                        String str1= ",User Type : "+type2;
                        String str2 = ",Fine : "+amt;

                        fileWriter.write(str);
                        fileWriter.write(str1);
                        fileWriter.write(str2);


                        System.out.println("\n\n");


                        System.out.println("Fine added Successfully");


                    }

                    catch(Exception odq){

                        System.out.println(odq);
                    }

                    finally{

                        try{

                            fileWriter.close();
                        }

                        catch(Exception ng){

                            System.out.println(ng);
                        }
                    }






                }

                else{

                    System.out.println("Sorry not found");
                }


        }


        catch(Exception edp){

            System.out.println(edp);
        }




        }


        else if(select==2){

            type2= "Teacher";


            System.out.println("Please enter the Teacher ID : ");



            Scanner sc9 = new Scanner(System.in);

            int select9= sc9.nextInt();

            FileReader fileReader2 = null;

        BufferedReader bufferedReader2 = null ;

        File file = new File("D:\\java\\mini project 2\\Teacher\\teacher_records.txt");

        try{

        fileReader2 = new FileReader(file);
        

        bufferedReader2 = new BufferedReader(fileReader2);
        







        String line = "";
        String result ="";
            String searchKey = "TeacherID : "+select9 ;
            System.out.println(searchKey);
            String words[] = null;
            boolean found = false;
            outer: while((line = bufferedReader2.readLine()) != null) {
                
                words = line.split(",");
                for(String word: words) {
                    if(word.equals(searchKey)){
                        found = true;

                        result = line;

                        break outer;
                    }
                }
            }
                if(found) {


                    System.out.println("Logged in Successfully");

                    System.out.println("\n\n");

                    FileWriter fileWriter = null;

                    File finefile = new File("D:\\java\\mini project 2\\Fine\\Teacher\\fine_records.txt");


                    System.out.println("Please enter the amount you want to add Fine");

                    Scanner sc29 = new Scanner(System.in);

                    int amn = sc29.nextInt();

                    double amt = amn;

                    try{

                        file.createNewFile();
                    }

                    catch(Exception epi){

                        System.out.println(epi);
                    }


                    try{

                        fileWriter = new FileWriter(finefile,true);

                        String str = "\nTeacher id : "+select9;
                        String str1= ",User Type : "+type2;
                        String str2 = ",Fine : "+amt;

                        fileWriter.write(str);
                        fileWriter.write(str1);
                        fileWriter.write(str2);


                        System.out.println("\n\n");


                        System.out.println("Fine added Successfully");


                    }

                    catch(Exception odq){

                        System.out.println(odq);
                    }

                    finally{

                        try{

                            fileWriter.close();
                        }

                        catch(Exception ng){

                            System.out.println(ng);
                        }
                    }
                }

                else{

                    System.out.println("Sorry not found");
                }


        }


        catch(Exception edp){

            System.out.println(edp);
        }

    }


        else{

            System.out.println("Sorry Wrong input");
        }
    }


    public static void main(String[] args){

        Start object = new Start();


        System.out.println("**********Welcome to Library Management System**********");

        System.out.println("\n");







        System.out.println("1. Student Management");
        System.out.println("2. Teacher Management");
        System.out.println("3. Book Management");
        System.out.println("4. Basic Operations");
        System.out.println("5. Exit");


        System.out.println("\n");


        System.out.println("Please Enter the number which you want to entry");


        Scanner sc = new Scanner(System.in);

        int select1= sc.nextInt();

        if(select1 ==1){


            System.out.println("1. Insert New Student");
            System.out.println("2. Search by studentId");
            System.out.println("3. Show All Student");

            System.out.println("\n");



            System.out.println("Please Enter the number which you want to entry");


            Scanner sc2 = new Scanner(System.in);

            int select2 = sc2.nextInt();


            if(select2 == 1){


                StudentOperations obj1 = new StudentOperations();

                Student student = new Student();

                


                obj1.insertStudent(student);

            }

            else if(select2 == 2){

                StudentOperations obj2 = new StudentOperations();

                System.out.println("Please enter the id you want to search");

                Scanner search1 = new Scanner(System.in);

                int search2 = search1.nextInt();

                obj2.getStudent(search2);




            }


            else if(select2 == 3){


                StudentOperations obj3 = new StudentOperations();

                obj3.showAllStudents();


            }


            else{

                System.out.println("You have entered a wrong input");
            }


            





        }

        else if(select1==2){


            System.out.println("1. Insert New Teacher");
            System.out.println("2. Search by teacherId");
            System.out.println("3. Show All Teacher");

            System.out.println("\n");



            System.out.println("Please Enter the number which you want to entry");

            Scanner sc3 = new Scanner(System.in);

            int select2 = sc3.nextInt();


            if(select2==1){

                TeacherOperations obj1 = new TeacherOperations();

                Teacher teacher = new Teacher();

                


                obj1.insertTeacher(teacher);


            }

            else if(select2==2){

                TeacherOperations obj2 = new TeacherOperations();

                System.out.println("Please enter the id you want to search");

                Scanner search1 = new Scanner(System.in);

                int search2 = search1.nextInt();

                obj2.getTeacher(search2);


            }

            else if (select2==3){

                TeacherOperations obj3 = new TeacherOperations();

                obj3.showAllTeachers();
            }


            else{

                System.out.println("You have entered a wrong input");
            }





        }


        else if(select1 ==3){



            System.out.println("1. Insert New Book");
            System.out.println("2. Search by bookId");
            System.out.println("3. Show All Books");

            System.out.println("\n");



            System.out.println("Please Enter the number which you want to entry");


            Scanner sc3 = new Scanner(System.in);

            int select2 = sc3.nextInt();

            if(select2==1){

                BookOperations obj1 = new BookOperations();

                Book b = new Book();

                Author a = new Author();

                Publisher p = new Publisher();

                obj1.insertBook(b);



            }

            else if(select2==2){

                BookOperations obj2 = new BookOperations();


                System.out.println("Please enter the id you want to search");

                Scanner search1 = new Scanner(System.in);

                int search2 = search1.nextInt();

                obj2.getBook(search2);


            }


            else if(select2==3){


                BookOperations obj3 = new BookOperations();

                obj3.showAllBooks();


            }


            else{


                System.out.println("You have entered a wrong input,please try again");
            }


            
        }


        else if(select1 ==4){


            System.out.println("1. Borrow Book");
            System.out.println("2. Return Book");
            System.out.println("3. Add fine");

            System.out.println("\n");



            System.out.println("Please Enter the number which you want to entry");


            Scanner sc3 = new Scanner(System.in);

            int select2 = sc3.nextInt();

            if(select2==1){

                

                Patron p = new Student();

                Book b = new Book();

                

                object.borrow(p,b);



            }

            else if(select2==2){

                

                Patron p = new Student();

                Book b = new Book();

                

                object.returnBook(p,b);


            }


            else if(select2==3){


                

                Patron p = new Student();

                

                

                object.fine(p,5.0);


            }


            else{


                System.out.println("You have entered a wrong input,please try again");
            }
        }


        else if(select1 ==5){


            System.exit(1);
        }



        else {


            System.out.println("Please enter a valid entry");
        }













    }
}