import java.util.*;
import java.awt.*;
class Restaurant_Management
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int vstr,tvstr=0,nvstr,tnvstr=0,nvfd,tnvfd=0,vfd,tvfd=0,fd,tfd=0,amt=0,tamt=0,totalamt=0,d,totald=0,damt=0,ch;
        double gst=0;
        String str="",ans,choice="Y";
        System.out.println("Welcome to Multi Cuisine Restaurant");
        System.out.println("===================================");
        System.out.println();
        System.out.println("What would you like to have? We have : ");
        System.out.println("Starters");
        System.out.println("Main Course");
        System.out.println("and");
        System.out.println("Desserts");
        System.out.println();
        System.out.println("Press 1 for Starters");
        System.out.println("Press 2 for Main Course");
        System.out.println("Press 3 for Desserts");
        System.out.println();
        System.out.print("Enter your choice : ");
        ch=sc.nextInt();
        System.out.println();
        switch(ch)
        {
            case 1:
            System.out.println("Welcome to Starter Menu");
            System.out.println("=======================");
            System.out.println();
            System.out.print("For vegetarian starters, press 'VS', whereas, for non-veg starters, press 'NVS' : ");
            str=sc.next();
            System.out.println();
            if(str.equalsIgnoreCase("VS"))
            {
                System.out.println("Vegetarian Starters");
                System.out.println("___________________");
                System.out.println();
                System.out.println("Starters\t\t\t\tPrice in ₹");
                System.out.println("........\t\t\t\t...............");
                System.out.println();
                System.out.println("1.  Paneer Tikka\t\t\t110");
                System.out.println("2.  Veg. Seekh Kebab\t\t\t110");
                System.out.println("3.  Hara Bhara Kebab\t\t\t110");
                System.out.println("4.  Shanghai Spring Roll\t\t150");
                System.out.println("5.  American Corn Ball\t\t\t150");
                System.out.println("6.  Crispy American Corn\t\t140");
                System.out.println("7.  Crispy Baby Corn\t\t\t140");
                System.out.println("8.  Crispy Mushroom\t\t\t120");
                System.out.println("9.  Crispy Chilli Potato\t\t120");
                System.out.println("10. Crispy Chilli Chana\t\t\t150");
                System.out.println();
                while(choice.equalsIgnoreCase("Y"))
                {
                    System.out.print("Select your starter from the above list by entering the corresponding number : ");
                    vstr=sc.nextInt();
                    System.out.print("Enter the number of that starter you want : ");
                    tvstr=sc.nextInt();
                    if(vstr>=1 && vstr<=3)
                        amt=tvstr*110;
                    if(vstr==4 || vstr==7)
                        amt=tvstr*150;
                    if(vstr==6 || vstr==7)
                        amt=tvstr*140;
                    if(vstr==8 || vstr==9)
                        amt=tvstr*120;
                    if(vstr==10)
                        amt=tvstr*150;
                    tamt=tamt+amt;
                    System.out.println();
                    System.out.print("Do you want to place more orders? Press 'Y' if Yes, else 'N' : ");
                    choice=sc.next();
                    System.out.println();
                }
            }
            if(str.equalsIgnoreCase("NVS"))
            {
                System.out.println("Non-vegetarian starters");
                System.out.println("_______________________");
                System.out.println();
                System.out.println("Starters\t\t\t\tPrice in ₹");
                System.out.println("........\t\t\t\t...............");
                System.out.println("1.  Chicken Tikka\t\t\t\t170");
                System.out.println("2.  Murg Reshmi Kebab\t\t\t\t170");
                System.out.println("3.  Murg Chilli Kebab\t\t\t\t160");
                System.out.println("4.  Chicken Seekh Kebab\t\t\t\t180");
                System.out.println("5.  Tangdi Kebab\t\t\t\t180");
                System.out.println("6.  Murg Tandoori\t\t\t\t190");
                System.out.println("7.  Fish Ajwani Tikka\t\t\t\t190");
                System.out.println("8.  Chilli Chicken\t\t\t\t160");
                System.out.println("9.  Drums of Heaven\t\t\t\t180");
                System.out.println("10. Shanghai Chicken\t\t\t\t180");
                System.out.println();
                while(choice.equalsIgnoreCase("Y"))
                {
                    System.out.print("Select your starter from the above list by entering the corresponding number : ");
                    nvstr=sc.nextInt();
                    System.out.print("Enter the number of that starter you want : ");
                    tnvstr=sc.nextInt();
                    if(nvstr==1 || nvstr==2)
                        amt=tnvstr*170;
                    if(nvstr==3)
                        amt=tnvstr*160;
                    if(nvstr==4 || nvstr==5)
                        amt=tnvstr*180;
                    if(nvstr==6 || nvstr==7)
                        amt=tnvstr*190;
                    if(nvstr==8)
                        amt=tnvstr*160;
                    if(nvstr==9 || nvstr==10)
                        amt=tnvstr*180;
                    tamt=tamt+amt;
                    System.out.println();
                    System.out.print("Do you want to place more orders? Press 'Y' if Yes, else 'N' : ");
                    choice=sc.next();
                    System.out.println();
                }
            }
            System.out.println("==========Multi-Cuisine Restaurant==========");
            System.out.println("--------------------BILL--------------------");
            System.out.println();
            System.out.println("Total cost = ₹ "+tamt);
            gst=Math.round(18/100.0*tamt);
            System.out.println("CGST = 9 %");
            System.out.println("SGST = 9 %");
            System.out.println("Total GST = 18 %");
            System.out.println("Total gst = ₹ "+gst);
            System.out.println("Amount to be paid = ₹ "+(tamt+gst));
            System.out.println();
            break;
            case 2:
            System.out.println("Welcome to Main Course menu: Indian and Chinese Dishes");
            System.out.println("======================================================");
            System.out.println();
            System.out.print("For Indian vegetarian dishes, press 'V', for Indian non-vegetarian starters, press 'NV' and for Chinese dishes, press 'C' : ");
            str=sc.next();
            if(str.equalsIgnoreCase("V"))
            {
                System.out.println("Indian Vegetarian Dishes");
                System.out.println("________________________");
                System.out.println();
                System.out.println("Dishes\t\t\t\tPrice in ₹");
                System.out.println("......\t\t\t\t...............");
                System.out.println("1.  Shahi Paneer\t\t\t\t180");
                System.out.println("2.  Navratan Korma\t\t\t\t180");
                System.out.println("3.  Kadhai Paneer\t\t\t\t150");
                System.out.println("4.  Malai Kofta\t\t\t\t140");
                System.out.println("5.  Kadhai Vegetable\t\t\t\t140");
                System.out.println("6.  Vegetable Pakeeza\t\t\t\t140");
                System.out.println("7.  Shabnam Curry\t\t\t\t150");
                System.out.println("8.  Makai Corn Paalak\t\t\t\t150");
                System.out.println("9.  Veg Pulaav\t\t\t\t110");
                System.out.println("10. Kashmiri Pulaav\t\t\t\t140");
                System.out.println("11. Butter Naan\t\t\t\t40");
                System.out.println("12. Stuffed Kulcha\t\t\t\t60");
                System.out.println();
                while(choice.equalsIgnoreCase("Y"))
                {
                    System.out.print("Select your dish from the above list by entering the corresponding number : ");
                    vfd=sc.nextInt();
                    System.out.print("Enter the number of plates you want for the above dish : ");
                    tvfd=sc.nextInt();
                    if(vfd==1 || vfd==2)
                        amt=tvfd*180;
                    if(vfd==3)
                        amt=tvfd*150;
                    if(vfd==4 || vfd==5 || vfd==6)
                        amt=tvfd*140;
                    if(vfd==7 || vfd==8)
                        amt=tvfd*150;
                    if(vfd==9)
                        amt=tvfd*110;
                    if(vfd==10)
                        amt=tvfd*140;
                    if(vfd==11)
                        amt=tvfd*40;
                    if(vfd==12)
                        amt=tvfd*60;
                    totalamt=totalamt+amt;
                    System.out.println();
                    System.out.print("Do you want to place more orders? Press 'Y' if Yes, else 'N' : ");
                    choice=sc.next();
                    System.out.println();
                }
            }
            if(str.equalsIgnoreCase("NV"))
            {
                System.out.println("Indian Non-vegetarian Dishes");
                System.out.println("____________________________");
                System.out.println();
                System.out.println("Dishes\t\t\t\tPrice in ₹");
                System.out.println("......\t\t\t\t...............");
                System.out.println("1.  Chicken Tikka Masaala\t\t\t\t180");
                System.out.println("2.  Chicken Tikka Labaadaar\t\t\t\t180");
                System.out.println("3.  Chicken Bharta\t\t\t\t150");
                System.out.println("4.  Kadhai Chicken\t\t\t\t160");
                System.out.println("5.  Mughlai Chicken\t\t\t\t160");
                System.out.println("6.  Murg Navratan Korma\t\t\t\t160");
                System.out.println("7.  Chicken Do Pyaaza\t\t\t\t170");
                System.out.println("8.  Murg Musallam\t\t\t\t170");
                System.out.println("9.  Mutton Rogan Josh\t\t\t\t190");
                System.out.println("10. Biriyaani\t\t\t\t190");
                System.out.println("11. Fish Sarsowaala\t\t\t\t140");
                System.out.println("12. Fish Dhaniawaala\t\t\t\t160");
                System.out.println();
                while(choice.equalsIgnoreCase("Y"))
                {
                    System.out.print("Select your dish from the above list by entering the corresponding number : ");
                    vfd=sc.nextInt();
                    System.out.print("Enter the number of plates you want for the above dish : ");
                    tvfd=sc.nextInt();
                    if(vfd==1 || vfd==2)
                        amt=tvfd*180;
                    if(vfd==3)
                        amt=tvfd*150;
                    if(vfd==4 || vfd==5 || vfd==6)
                        amt=tvfd*160;
                    if(vfd==7 || vfd==8)
                        amt=tvfd*170;
                    if(vfd==9 || vfd==10)
                        amt=tvfd*190;
                    if(vfd==11)
                        amt=tvfd*140;
                    if(vfd==12)
                        amt=tvfd*160;
                    totalamt=totalamt+amt;
                    System.out.println();
                    System.out.print("Do you want to place more orders? Press 'Y' if Yes, else 'N' : ");
                    choice=sc.next();
                    System.out.println();
                }
            }
            if(str.equalsIgnoreCase("C"))
            {
                System.out.println("Chinese Dishes");
                System.out.println("______________");
                System.out.println();
                System.out.println("Dishes\t\t\t\tPrice in ₹");
                System.out.println("......\t\t\t\t...............");
                System.out.println("1.  Schezwan Fried Rice\t\t\t\t240");
                System.out.println("2.  Schezwan Chicken\t\t\t\t280");
                System.out.println("3.  Chilly Chicken\t\t\t\t280");
                System.out.println("4.  Chicken Noodles\t\t\t\t210");
                System.out.println("5.  Veg. Hakka Noodles\t\t\t\t210");
                System.out.println("6.  Manchurian\t\t\t\t190");
                System.out.println("7.  Momos\t\t\t\t190");
                System.out.println("8.  Chilli Paneer\t\t\t\t190");
                System.out.println("9.  Shanghai Fried Rice\t\t\t\t240");
                System.out.println("10. Veg. Fried Rice\t\t\t\t210");
                System.out.println("11. Chicken Fried Rice\t\t\t\t210");
                System.out.println("12. Kimchi Rice Veg.\t\t\t\t210");
                System.out.println();
                while(choice.equalsIgnoreCase("Y"))
                {
                    System.out.print("Select your dish from the above list by entering the corresponding number : ");
                    fd=sc.nextInt();
                    System.out.print("Enter the number of plates you want for the above dish : ");
                    tfd=sc.nextInt();
                    if(fd==1)
                        amt=tfd*240;
                    if(fd==2 || fd==3)
                        amt=tfd*280;
                    if(fd==4 || fd==5)
                        amt=tfd*210;
                    if(fd==6 || fd==7 || fd==8)
                        amt=tfd*190;
                    if(fd==9)
                        amt=tfd*240;
                    if(fd==10 || fd==11 || fd==12)
                        amt=tfd*210;
                    totalamt=totalamt+amt;
                    System.out.println();
                    System.out.print("Do you want to place more orders? Press 'Y' if Yes, else 'N' : ");
                    choice=sc.next();
                    System.out.println();
                }
            }
            System.out.println("==========Multi-Cuisine Restaurant==========");
            System.out.println("--------------------BILL--------------------");
            System.out.println();
            System.out.println("Total cost = ₹ "+totalamt);
            gst=Math.round(18/100.0*totalamt);
            System.out.println("CGST = 9 %");
            System.out.println("SGST = 9 %");
            System.out.println("Total GST = 18 %");
            System.out.println("Amount to be paid = ₹ "+(totalamt+gst));
            System.out.println();
            break;
            case 3:
            System.out.println("Welcome to the Dessert section");
            System.out.println("==============================");
            System.out.println();
            System.out.println("Desserts\t\t\t\tPrice in ₹");
            System.out.println("........\t\t\t\t...............");
            System.out.println("1.  Softy Pineapple\t\t\t110");
            System.out.println("2.  Softy Crunchy Chocolate\t\t110");
            System.out.println("3.  Chocolate Walnut Brownie\t\t110");
            System.out.println("4.  Chocolate Doughnut\t\t\t190");
            System.out.println("5.  Marble Cake\t\t\t\t70");
            System.out.println("6.  Mocha Magic\t\t\t\t90");
            System.out.println("7.  Black Forest Gateaux\t\t190");
            System.out.println("8.  Mango Shake\t\t\t\t80");
            System.out.println("9.  Pineapple Shake\t\t\t80");
            System.out.println("10. Tooty Fruity\t\t\t120");
            System.out.println();
            while(choice.equalsIgnoreCase("Y"))
            {
                System.out.print("Select your dessert from the above list by entering the corresponding number : ");
                d=sc.nextInt();
                System.out.print("Enter the number of that dessert you want : ");
                totald=sc.nextInt();
                if(d==1 && d==3)
                    damt=totald*110;
                if(d==3 || d==4)
                    damt=totald*90;
                if(d==5)
                    damt=totald*70;
                if(d==6 || d==7)
                    damt=totald*90;
                if(d==8 || d==9)
                    damt=totald*80;
                if(d==10)
                    damt=totald*150;
                totalamt=totalamt+damt;
                System.out.println();
                System.out.print("Do you want to place more orders? Press 'Y' if Yes, else 'N' : ");
                choice=sc.next();
                System.out.println();
            }
            System.out.println("==========Multi-Cuisine Restaurant==========");
            System.out.println("--------------------BILL--------------------");
            System.out.println();
            System.out.println("Total cost = ₹ "+totalamt);
            gst=Math.round(18/100.0*totalamt);
            System.out.println("CGST = 9 %");
            System.out.println("SGST = 9 %");
            System.out.println("Total GST = 18 %");
            System.out.println("Amount to be paid = ₹ "+(totalamt+gst));
            System.out.println();
            break;
            default:
            System.out.println("You've entered an invalid option!!");
            System.out.println("You can reorder by running the Multi-Cuisine Restaurant Software again.");
            System.out.println();
            System.out.println("Program is exiting now");
            break;
        }
        System.out.println(".___________________________________________.");
        System.out.println("| ========Multi-Cuisine Restaurant========= |");
        System.out.println("|                                           |");
        System.out.println("| Designed                                  |");
        System.out.println("|          and                              |");
        System.out.println("|              programmed                   |");
        System.out.println("|                         by                |");
        System.out.println("|                            Faran          |");
        System.out.println("|                                  Mohammad |");
        System.out.println("|                                           |");
        System.out.println("|         ************************          |");
        System.out.println("|___________________________________________|");
    }
}