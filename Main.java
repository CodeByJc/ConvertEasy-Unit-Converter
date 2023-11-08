//Project By Jaineel Chhatraliya

import java.util.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main
{
    public static void main (String[]args)
    {
        Scanner input = new Scanner (System.in);
        
        DiscountOnProduct DiscountCalculator = new DiscountOnProduct();
        GSTCalculator GSTCalculate = new GSTCalculator() ;
        Length LengthConvertor = new Length();
        Temperature TemperatureConvertor = new Temperature();
        MobileData DataConvertor = new MobileData();
        Area ConvertToArea = new Area();
        DateAndTime ConvertTime = new DateAndTime();
        Currency ConvertorCurrency = new Currency();
        Mass MassConvertor = new Mass();
        Volume VolumeConvertor = new Volume();

        do
        {
            System.out.println ("\n** Main Menu ** ");
            System.out.println ("1.Length");
            System.out.println ("2.Area");
            System.out.println ("3.Volume");
            System.out.println ("4.Temperature");
            System.out.println ("5.Mass");
            System.out.println ("6.Mobile data");
            System.out.println ("7.Currency");
            System.out.println ("8.Date and Time");
            System.out.println ("9.Discount on Product");
            System.out.println ("10.GST calculator");
            System.out.println ("11.Exit \n");
            
            System.out.print("Enter your choice : ");
            
            int MainChoice = input.nextInt ();
            
            switch (MainChoice)
            {
                case 1: LengthConvertor.LengthMenu();
                break;
                
                case 2: ConvertToArea.ConvertArea();;
                break;
                
                case 3: VolumeConvertor.ConvertVolume();
                break;
                
                case 4: TemperatureConvertor.ConvertTemp() ;
                break;
                
                case 5:; MassConvertor.ConvertMass();
                break;
                
                case 6: DataConvertor.ConvertMobileData() ;
                break;
                
                case 7: ConvertorCurrency.CurrencyConvertor();
                break;
                
                case 8: ConvertTime.DateandTime();
                break;
                
                case 9: DiscountCalculator.dop();
                break;
                
                case 10: GSTCalculate.CalculateGST();
                break;
                
                case 11: System.out.println("\n");
                         return;
                
                default:System.out.println ("Invalid choice!");
                break;
            }
        }while(true);
        
    }    
}        
    
class Length
{
    public static void LengthMenu()
    {
        Scanner input = new Scanner (System.in);
        
        do
        {
            int ChoiceLength1 , ChoiceLength2 ;
            System.out.println("\n 1. Picometer pm \n 2. Nanometer nm \n 3. Micrometer μm \n 4. Milimeter mm \n 5. centimeter \n 6. Decimeter dc \n 7. Meter m \n 8. Kilometer \n 9. Mile mi \n 10. Foot ft \n 11. Inch in \n 12. Yard yd \n 13. Mainmenu\n");
            System.out.print("Enter number of unit to convert value from : ");
            ChoiceLength1 = input.nextInt();

            if(ChoiceLength1 == 13)
            {
                return;
            }

            System.out.print("Enter number of unit to convert value into : ");
            ChoiceLength2 = input.nextInt();

            if(ChoiceLength2 == 13)
            {
                return;
            }

            System.out.print("Enter the length to convert : ");
            double Value = input.nextDouble();

            // Convert to Meter
            double Meter = 0.0 ;

            switch(ChoiceLength1) 
            {
                case 1 :
                    Meter = Value / (100000 * 10000000);
                    break;
                case 2 :
                    Meter = Value / (1000000 * 1000) ;
                    break;
                case 3:
                    Meter = Value / 1000000 ;
                    break;
                case 4 :
                    Meter = Value / 1000.0 ;
                    break;
                case 5 :
                    Meter = Value /  100.0 ;
                    break;
                case 6 :
                    Meter = Value / 10.0 ;
                    break;    
                case 7 :
                    Meter = Value ;
                    break;
                case 8 :
                    Meter = Value * 1000.0  ;
                    break;
                case 9 :
                    Meter = Value * 1609.344 ;
                    break;
                case 10 :
                    Meter = Value /  3.2808399 ;
                    break;
                case 11 :
                    Meter = Value / 39.3700787 ;
                    break;
                case 12 :
                    Meter = Value / 1.0936133;
                    break;
                default:
                    System.out.println("Invalid unit!");
                    return;
            }

            double Result = 0.0 ;

            switch(ChoiceLength2) 
            {
                case 1 :
                    Result = Meter * (100000 * 10000000) ;
                    break;
                case 2 :
                    Result = Meter * (1000000 * 1000) ;
                    break;
                case 3 :
                    Result = Meter * 1000000 ;
                    break;
                case 4 :
                    Result = Meter * 1000 ;
                    break;
                case 5 :
                    Result = Meter * 100 ;
                    break;
                case 6 : 
                    Result = Meter * 10 ;
                    break;    
                case 7:
                    Result = Meter ;
                    break;
                case 8:
                    Result = Meter / 1000 ;
                    break;
                case 9 :
                    Result = Meter / 1609.344 ;
                    break;
                case 10 :
                    Result = Meter * 3.2808399 ;
                    break;
                case 11 :
                    Result = Meter * 39.3700787 ;
                    break;
                case 12 :
                    Result = Meter * 1.0936133 ;
                    break;
                default:
                    System.out.println("Invalid unit!");
                    return;
            }

            System.out.println(Result);

        }while(true);
    }
}

class Area
{
    public static void ConvertArea()
    {
        Scanner input = new Scanner (System.in);
        do
        {
            int ChoiceArea1 , ChoiceArea2 ;
            System.out.println("\n 1. Square Micron μm²\n 2. Square Milimeter mm²\n 3. Square Centimeter  cm²\n 4. Square Decimeter dm²\n 5. Square Meter m²\n 6. Square Mile mi²\n 7. Square Foot ft²\n 8. Inch in²\n 9. Yard yd²\n 10. Acre ac\n 11. Hectare ha\n 12. Mainmenu\n");
            System.out.print("Enter number of unit to convert value from : ");
            ChoiceArea1 = input.nextInt();

            if(ChoiceArea1 == 12)
            {
                return;
            }

            System.out.print("Enter number of unit to convert value into : ");
            ChoiceArea2 = input.nextInt();

            if(ChoiceArea2 == 12)
            {
                return;
            }

            System.out.print("Enter the length to convert : ");
            double Value = input.nextDouble();

            // Convert to Meter
            double MeterSquare = 0.0 ;

            switch (ChoiceArea1)    
            {
                case 1:
                    MeterSquare = Value / (1000000.0 * 1000000.0) ;
                    break;
                case 2:
                    MeterSquare = Value / 1000000.0;
                    break;
                case 3:
                    MeterSquare = Value / 10000.0;
                    break;
                case 4:
                    MeterSquare = Value / 100.0;
                    break;
                case 5:
                    MeterSquare = Value;
                    break;
                case 6:
                    MeterSquare = Value /  0.00000038610215855; 
                    break;
                case 7:
                    MeterSquare = Value / 10.7639;
                    break;
                case 8:
                    MeterSquare = Value / 1550;
                    break;
                case 9:
                    MeterSquare = Value / 1.19599;
                    break;
                case 10:
                    MeterSquare = Value * 40.47;
                    break;
                case 11:
                    MeterSquare = Value * 10000;
                    break;
                default:
                    System.out.println("Invalid input unit.");
                    return;
            }

            double Result ;

            switch (ChoiceArea2) 
            {
                case 1:
                    Result = MeterSquare * (1000000.0 * 1000000.0);
                    break;
                case 2:
                    Result = MeterSquare * 1000000;
                    break;
                case 3:
                    Result = MeterSquare * 10000;
                    break;
                case 4:
                    Result = MeterSquare * 100;
                    break;
                case 5:
                    Result = MeterSquare;
                    break;
                case 6:
                    Result = MeterSquare * 0.00000038610215855 ;
                    break;
                case 7:
                    Result = MeterSquare * 10.7639104;
                    break;
                case 8:
                    Result = MeterSquare * 1550;
                    break;
                case 9:
                    Result = MeterSquare * 1.19599;
                    break;
                case 10:
                    Result = MeterSquare / 100;
                    break;
                case 11:
                    Result = MeterSquare / 10000;
                    break;
                default:
                    System.out.println("Invalid output unit.");
                    return;
            }

            System.out.println(Result);
        
        }while(true);
    }
}

class Temperature
{
    public static void ConvertTemp()
    {
        Scanner input = new Scanner (System.in);
        do
        {
            System.out.println("\n 1. Celcius \n 2. Fahrenheit \n 3. Kelvin \n 4. Rankine \n 5. Reaumur \n 6. Main Menu\n");

            System.out.print("Enter First unit : ");
            int ChoiceTemperature1 = input.nextInt();

            if(ChoiceTemperature1 == 6)
            {
                return;
            }

            System.out.print("Enter Second unit : ");
            int ChoiceTemperature2 = input.nextInt();

            if(ChoiceTemperature2 == 6)
            {
                return;
            }

            System.out.print("Enter Value : ");
            int Value = input.nextInt();

            double Celcius =0.0 ;

                switch(ChoiceTemperature1)
                {
                    case 1 :
                        Celcius = Value ;
                        break;
                    case 2 :
                        Celcius =(Value - 32) * 5.0 / 9.0 ;
                        break;
                    case 3 : 
                        Celcius = Value - 273.15 ;
                        break ;
                    case 4 : 
                        Celcius = ( Value - 32 - 459.67) / 1.8 ;
                        break ;
                    case 5 :
                        Celcius =  1.25 * Value ;
                        break ;
                }

            double Result = 0.0 ;

                switch(ChoiceTemperature2)
                {
                    case 1 :
                        Result = Celcius;
                        break;
                    case 2 :
                        Result = (Celcius * 9.0 / 5.0) + 32;  ;
                        break;
                    case 3 : 
                        Result = Celcius + 273.15  ;
                        break ;
                    case 4 : 
                        Result = (Celcius + 273.15) * 9 / 5 ;
                        break ;
                    case 5 :
                        Result = Celcius * 4.0 / 5.0  ;
                        break ;
                }

            System.out.println(Result);
        
        }while(true);       
    }
}

class MobileData
{
    public static void ConvertMobileData()
    {
        Scanner input = new Scanner (System.in);
        
        do
        {
            int ChoiceData1 , ChoiceData2 ;
            System.out.println("\n 1. Bits bit \n 2. Byte b \n 3. Kilobyte Kb \n 4. Megabyte Mb \n 5. Gigabyte Gb  \n 6. Terabyte Tb \n 7. Petabyte Pb \n 8. Main Menu\n");
            System.out.print("Enter number of unit to convert value from : ");
            ChoiceData1 = input.nextInt();

            if(ChoiceData1 == 8)
            {
                return;
            }

            System.out.print("Enter number of unit to convert value into : ");
            ChoiceData2 = input.nextInt();

            if(ChoiceData2 == 8)
            {
                return;
            }

            System.out.print("Enter the Data to convert : ");
            double Value = input.nextDouble();

            // Convert to Meter
            double Megabyte = 0.0 ;

            switch (ChoiceData1) 
            {
                case 1:
                    Megabyte = (Value / 8000.0)/ 1024.0 ;
                    break;
                case 2:
                    Megabyte = (Value / 1024.0)/ 1024.0;
                    break;
                case 3:
                    Megabyte = (Value / 1024.00) ;
                    break;
                case 4:
                    Megabyte = Value ;
                    break;
                case 5:
                    Megabyte= ((Value / 1024.0) / 1024.0) ;
                    break;
                case 6:
                    Megabyte = ((Value / 1024.0) / 1024.0) / 1024.0 ; 
                    break;
                case 7:
                   Megabyte = (((Value / 1024.0) / 1024.0) / 1024.0) / 1024.0 ;
                    break;
                case 8:
                   
                    break;
                default:
                    System.out.println("Invalid input unit.");
                    return;
            }

            double Result = 0.0 ;

            switch (ChoiceData2) 
            {
                case 1:
                    Result = (Megabyte * 1048576.0) * 8.0;
                    break;
                case 2:
                    Result = Megabyte * 1048576.0;
                    break;
                case 3:
                    Result = Megabyte * 1024.0;
                    break;
                case 4:
                    Result = Megabyte ;
                    break;
                case 5:
                    Result = Megabyte / 1024.0;
                    break;
                case 6:
                    Result = (Megabyte / 1024.0) / 1024.0 ;
                    break;
                case 7:
                    Result = ((Megabyte / 1024.0) / 1024.0) / 1024;
                    break;
                case 8:
                    
                    break;

                default:
                    System.out.println("Invalid output unit.");
                    return;
            }
            System.out.println(Result);
        
        }while(true);
        
    }
}

class Currency
{
    public static void CurrencyConvertor()
    {
        Scanner input = new Scanner(System.in);

       do
        {
            System.out.println("\n 1. US dollar USD \n 2. Euro EUR \n 3. Indian rupee IND  \n 4. Australian dollar AUD \n 5. Bangladesi taka BDT \n 6. Singapore dollar SGD \n 7. Pakistani rupee PKR \n 8. Russian ruble RUB \n 9. Chinese yuan CNY \n 10. Canadian dollar CAD \n 11. Colombian peso COP \n 12. Ejyptian pound  EGP \n 13. Hongkong dollar HKD \n 14. Sri Lankan rupee LKR \n 15. Main Menu \n");
            
            System.out.print("Enter First Currency: ");
            int ChoiceCurrency1 = input.nextInt();

            if(ChoiceCurrency1 == 15)
            {
                return;
            }
            
            System.out.print("Enter Second Currency : ");
            int ChoiceCurrency2 = input.nextInt();

            if(ChoiceCurrency2 == 15)
            {
                return;
            }

            System.out.print("Enter Value : ");
            int Value = input.nextInt();

            double Ind = 0.0 ;

                switch(ChoiceCurrency1)
                {
                    case 1 :
                        Ind = Value * 81.965 ;
                        break;
                    case 2 :
                        Ind = Value * 87.219;
                        break;
                    case 3 :
                        Ind = Value ;
                        break;
                    case 4 :
                        Ind = Value * 53.917 ;
                        break;
                    case 5 :
                        Ind = Value * 0.7775 ;
                        break;
                    case 6 :
                        Ind = Value * 60.753 ;
                        break;
                    case 7 :
                        Ind = Value * 0.2922 ;
                        break;
                    case 8 :
                        Ind = Value * 1.0757 ;
                        break;
                    case 9 :
                        Ind = Value * 11.8683 ;
                        break;
                    case 10 :
                        Ind = Value * 59.2704 ;
                        break;
                    case 11 :
                        Ind = Value * 0.0174 ;
                        break;
                    case 12 :
                        Ind = Value * 2.6526 ;
                        break; 
                    case 13 :
                        Ind = Value * 10.4458 ;
                        break;
                    case 14 :
                        Ind = Value * 0.2561 ;
                        break;
                    default:
                        System.out.println("Invalid input unit.");
                        return; 


                }

            double Result = 0.0 ;

                switch(ChoiceCurrency2)
                {
                    case 1 :
                        Result = Ind / 81.965 ;
                        break;
                    case 2 :
                        Result = Ind / 87.219;
                        break;
                    case 3 : 
                        Result = Ind ;
                        break ;
                    case 4 : 
                        Result = Ind / 53.917; 
                        break ;
                    case 5 :
                        Result = Ind / 0.7775 ;
                        break ;
                    case 6 :
                        Result = Ind / 60.753 ;
                        break;
                    case 7 :
                        Result = Ind / 0.2922;
                        break;
                    case 8 : 
                        Result = Ind / 1.0757 ;
                        break ;
                    case 9 : 
                        Result = Ind / 11.8683 ; 
                        break ;
                    case 10 :
                        Result = Ind / 59.2704 ;
                        break ;
                    case 11 :
                        Result = Ind / 0.0174 ;
                        break;
                    case 12 :
                        Result = Ind / 2.6526 ;
                        break;
                    case 13 : 
                        Result = Ind / 10.4458 ;
                        break ;
                    case 14 : 
                        Result = Ind / 0.2561; 
                        break ;
                    default:
                        System.out.println("Invalid input unit.");
                        return;        
                }

            System.out.println(Result);
        
        }while(true);
    }
}

class DateAndTime
{
    public static void DateandTime()
    {
        Scanner input = new Scanner (System.in);
        
        do
        {
            int ChoiceDt1 , ChoiceDT2 ;
            System.out.println("1. Age Calculator (in Years, Months, Weeks, Days, Minutes, Seconds") ;         
            System.out.println("2. Day & Time Convertor [ NanoSecond - MicroSecond - MiliSecond - Second - Minute - Hour - day - Week - Month - Year - Decade - Sentury");
            System.out.println("3. Exit \n\n");
            System.out.print("Enter Your Choice : ");
            int DTChoice = input.nextInt();

            if(DTChoice == 1)
            {
                AgeCalculator();
            }
            else if(DTChoice == 2)
            {
                DayAndTimeConvertor();
            }
            else
            {
                return ;
            }    
        }while(true);
    }

    public static void AgeCalculator()
    {
        Scanner input = new Scanner (System.in);
        int Dob , Mob , Yob ;

        System.out.print("Enter Date of Birth ( 1-31 ) : ");
        Dob = input.nextInt();
        System.out.print("Enter Month of Birth ( 1-12 ): ");
        Mob = input.nextInt();
        System.out.print("Enter Year of Birth ( year <2023 ): ");
        Yob = input.nextInt();
        if(( Dob >= 1 && Dob <= 31) && (Mob >=1 && Mob<= 12) && (Yob < 2023))
        {
            LocalDate birthDate = LocalDate.of(Yob, Mob, Dob);
            LocalDate currentDate = LocalDate.now();

            Period period = Period.between(birthDate, currentDate);

            long years = ChronoUnit.YEARS.between(birthDate, currentDate);

            long months = ChronoUnit.MONTHS.between(birthDate.atStartOfDay(), currentDate.atStartOfDay());
            
            long weeks = ChronoUnit.WEEKS.between(birthDate.atStartOfDay(), currentDate.atStartOfDay());
            
            long days = ChronoUnit.DAYS.between(birthDate.atStartOfDay(), currentDate.atStartOfDay());
            
            long hours = ChronoUnit.HOURS.between(birthDate.atStartOfDay(), currentDate.atStartOfDay());
            
            long minutes = ChronoUnit.MINUTES.between(birthDate.atStartOfDay(), currentDate.atStartOfDay());
            
            long seconds = ChronoUnit.SECONDS.between(birthDate.atStartOfDay(), currentDate.atStartOfDay());
            
        
            System.out.println("Age ==> \n" +years+ " Years old \n" +months+ " Months old \n"  +weeks+ " Weeks old \n"  +days+ " Days old \n" +hours+ " hours old \n" +minutes+ " Minutes old \n" +seconds+ " Seconds old");
        }
        else
        {
            System.out.println("Choose Again");
        }
    }

    public static void DayAndTimeConvertor()
    {
        Scanner input = new Scanner (System.in);
        do
        {
            System.out.println("1. NanoSecond \n 2. MicroSecond \n 3. MiliSecond \n 4. Second \n 5. Minute \n 6. Hour \n 7. day \n 8. Week \n 9. Month \n 10. Year \n 11. Decade \n 12. Sentury \n 13. Exit ");
            System.out.print("Enter Your Choice for first unit : ");
            int ChoiceDT1 = input.nextInt();
            System.out.print("Enter Your Choice for second unit : ");
            int ChoiceDT2 = input.nextInt();

            System.out.print("Enter value : ");
            int Value = input.nextInt();

            double Second = 0 ;

            switch (ChoiceDT1) 
            {
                case 1 : 
                    Second = Value / 1000000000.0 ;
                    break;
                case 2 : 
                    Second = Value / 1000000.0 ;
                    break;
                case 3 : 
                    Second = Value / 1000.0 ;
                    break;        
                case 4 :
                    Second = Value;
                    break;
                case 5 :
                    Second = Value * 60.0;
                    break;
                case 6 :
                    Second = (Value * 60.0 )* 60.0;
                    break;
                case 7 :
                    Second = ((Value * 60.0 )* 60.0 )* 24.0;
                    break;
                case 8 :
                    Second = (((Value * 60.0) * 60.0)* 24.0) * 7.0;
                    break;
                case 9 :
                    Second = (((Value * 60.0) * 60.0)* 24.0 )* 30.44; // average month length
                    break;
                case 10 :
                    Second = (((Value * 60.0) * 60.0) * 24.0 )* 365.24; // average year length
                    break;
                case 11 :
                    Second = ((((Value * 60.0) * 60.0) * 24.0) * 365.24) * 10.0;
                    break;
                case 12 :
                    Second = ((((Value * 60.0) * 60.0)* 24.0) * 365.24) * 100.0;
                    break; 
                case 13:
                    break; 
                default:
                    System.out.println("Invalid input unit.");
                    return;
            }

            double Result = 0 ;

            switch(ChoiceDT2) 
            {
                case 1:
                    Result = Second * 1000000000  ;
                    break;
                case 2:
                    Result = Second * 10000000 ;
                    break; 
                case 3:
                    Result =  Second * 1000 ;
                    break;
                case 4:
                    Result = Second  ;
                    break;
                case 5:
                    Result = Second / 60.0 ;
                    break;
                case 6:
                    Result = (Second / 60) / 60; 
                    break;
                case 7:
                    Result =  ((Second / 60) / 60) / 24 ;
                    break;
                case 8:
                    Result = (((Second / 60) / 60) / 24) / 7 ;
                    break;
                case 9:
                    Result = (((Second / 60) / 60)/ 24) / 30.44 ;
                    break;
                case 10:
                    Result = ((((Second / 60) / 60)/ 24) / 365.24);
                    break;
                case 11: 
                    Result = (((((Second / 60) / 60)/ 24) / 365.24)) / 10 ;
                    break;    
                case 12:
                    Result = (((((Second / 60) / 60) / 24) / 365.24)) / 100 ;
                    break;
                case 13:
                   
                    break; 
                default:
                    System.out.println("Invalid input unit.");
                    return;    
            }
            System.out.println(Result);
        }while(true);
    }
}

class DiscountOnProduct
{
    public static void dop()
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Original Price : ");
        double OrignalPrice = input.nextDouble();
        
        System.out.print("Discount (% off) : ");
        int OfferPer = input.nextInt();
        
        double SavedPrice = (OrignalPrice * OfferPer) / 100;
        double FinalPrice = OrignalPrice - SavedPrice;    
        
        System.out.println("You Saved : " +SavedPrice);
        System.out.println("Final Price : " +FinalPrice);
        
    }
}

class GSTCalculator
{
    public static void CalculateGST()
    {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Orignal Price : ");
        double OriginalPriceGST = input.nextDouble();
        
        System.out.println("Select GST in Percentage : ");
        System.out.println("1. 3% | 2. 5% | 3. 12% | 4. 18% | 5. 28%");
        
        int ChoiceGST = input.nextInt();
        int PerGST ;
        
        if(ChoiceGST == 1)
            {PerGST = 3 ; }
        else if(ChoiceGST == 2)  
            {PerGST = 5 ; }
        else if(ChoiceGST == 3)
            {PerGST = 12 ;}
        else if(ChoiceGST == 4)
            {PerGST = 18 ;}
        else
            {PerGST = 28 ;}
    
        
        double GSTPrice = (OriginalPriceGST * PerGST ) / 100;
        double FinalPriceGST = OriginalPriceGST + GSTPrice ;
        
        System.out.println("GST on Product : " +GSTPrice);
        System.out.println("Final Price : " +FinalPriceGST);
    }
}

class Mass
{
    public static void ConvertMass()
    {
        Scanner input = new Scanner (System.in);
        do
        {
            System.out.println("\n 1. MIcrogram µg \n 2. Miligram mg \n 3. Gram g \n 4. Kilogram Kg \n 5. Tonne t \n 6. Pound Lb \n 7. Carrat ct \n 8. Long Ton l.t \n 9. Short Ton sh.t \n 10. Stone \n 11. Grain gr \n 12. Quintal q \n 13. Main Menu \n");
            
            System.out.print("Enter Your Choice for first unit : ");
            int ChoiceMass1 = input.nextInt();

            if(ChoiceMass1 == 13)
            {
                return;
            }

            System.out.print("Enter Your Choice for second unit : ");
            int ChoiceMass2 = input.nextInt();

            if(ChoiceMass2 == 13)
            {
                return;
            }

            System.out.print("Enter value : ");
            int Value = input.nextInt();

            double Kg = 0.0 ;

            switch (ChoiceMass1) 
            {
                case 1 : 
                    Kg = Value / 1000000000.0 ;
                    break;
                case 2 : 
                    Kg = Value / 1000000.0 ;
                    break;
                case 3 : 
                    Kg = Value / 1000.0 ;
                    break;        
                case 4 :
                    Kg = Value;
                    break;
                case 5 :
                    Kg = Value * 1000.0;
                    break;
                case 6 :
                    Kg = Value / 2.2046 ;
                    break;
                case 7 :
                    Kg = Value / 5000 ;
                    break;
                case 8 :
                    Kg = Value / 0.000984206528 ;
                    break;
                case 9 :
                    Kg = Value / 0.00110231131 ; 
                    break;
                case 10 :
                    Kg = Value / 0.157473044 ;
                    break;
                case 11 :
                    Kg = Value / 15431.3584;
                    break;
                case 12 :
                    Kg = Value / 100;
                    break; 
                case 13:
                    break; 
                default:
                    System.out.println("Invalid input unit.");
                    return;
            }

            double Result = 0.0 ;

            switch(ChoiceMass2) 
            {
                case 1 : 
                    Result = Kg  * 1000000000.0 ;
                    break;
                case 2 : 
                    Result = Kg  * 1000000.0 ;
                    break;
                case 3 : 
                    Result = Kg  * 1000.0 ;
                    break;        
                case 4 :
                    Result = Kg ;
                    break;
                case 5 :
                    Result = Kg / 1000.0;
                    break;
                case 6 :
                    Result = Kg * 2.2046 ;
                    break;
                case 7 :
                    Result = Kg * 5000 ;
                    break;
                case 8 :
                    Result = Kg * 0.000984206528 ;
                    break;
                case 9 :
                    Result = Kg * 0.00110231131 ; 
                    break;
                case 10 :
                    Result = Kg * 0.157473044 ;
                    break;
                case 11 : 
                    Result = Kg * 15431.3584;
                    break; 
                case 12 :
                   Result  = Kg * 100;
                    break;
                case 13:
                   
                    break; 
                default:
                    System.out.println("Invalid input unit.");
                    return;    
            }
            System.out.println(Result);
        }while(true);
    }
}

class Volume
{
    public static void ConvertVolume()
    {
        Scanner input = new Scanner(System.in);

        do
        {
            System.out.println("\n 1. Cubic Milimeter mm \n 2. Cubic Centimeter cm \n 3. Cubic Decimeter dc \n 4. Cubic Meter m\n 5. Miliiter  ml \n 6. Centiliter cl \n 7. Deciliter dl \n 8. Liter l \n 9. Hectoliter hl \n 10. Cubic Foot ft \n 11. cubic Inch in \n 12. Cubic Yard yd \n 13. Area Foot af \n 14. Main Menu\n");
            System.out.print("Enter Your Choice for first unit : ");
            int ChoiceVolume1 = input.nextInt();

            if(ChoiceVolume1 == 14)
            {
                return;
            }
            
            System.out.print("Enter Your Choice for second unit : ");
            int ChoiceVolume2 = input.nextInt();

            if(ChoiceVolume2 == 14)
            {
                return;
            }

            System.out.print("Enter value : ");
            int Value = input.nextInt();

            double Liter = 0.0 ;

            switch (ChoiceVolume1) 
            {
                case 1 : 
                    Liter = Value / 1000000.0 ;
                    break;
                case 2 : 
                    Liter = Value / 1000.0 ;
                    break;
                case 3 : 
                    Liter = Value ;
                    break;        
                case 4 :
                    Liter = Value * 1000.0 ;
                    break;
                case 5 :
                    Liter = Value / 1000.0;
                    break;
                case 6 :
                    Liter = Value / 100.0 ;
                    break;
                case 7 :
                    Liter = Value / 10.0 ;
                    break;
                case 8 :
                    Liter = Value ;
                    break;
                case 9 :
                    Liter = Value * 100.0 ; 
                    break;
                case 10 :
                    Liter = Value * 28.3168466 ;
                    break;
                case 11 :
                    Liter = Value * 0.016387064 ;
                    break;
                case 12 :
                    Liter = Value * 764.554858;
                    break; 
                case 13:
                    Liter = Value * 1234000.0 ;
                    break; 
                default:
                    System.out.println("Invalid input unit.");
                    return;
            }

            double Result = 0 ;

            switch(ChoiceVolume2) 
            {
                case 1 : 
                    Result = Liter * 1000000.0 ;
                    break;
                case 2 : 
                    Result = Liter * 1000.0 ;
                    break;
                case 3 : 
                    Result = Liter ;
                    break;        
                case 4 :
                    Result = Liter / 1000.0 ;
                    break;
                case 5 :
                    Result = Liter * 1000.0;
                    break;
                case 6 :
                    Result = Liter * 100.0 ;
                    break;
                case 7 :
                    Result = Liter * 10.0 ;
                    break;
                case 8 :
                    Result = Liter ;
                    break;
                case 9 :
                    Result = Liter / 100.0 ; 
                    break;
                case 10 :
                    Result = Liter / 28.3168466 ;
                    break;
                case 11 :
                    Result = Liter / 0.016387064 ;
                    break;
                case 12 :
                    Result = Liter / 764.554858;
                    break; 
                case 13:
                    Result = Liter / 1234000.0 ;
                    break;
                default:
                    System.out.println("Invalid input unit.");
                    return;    
            }
            System.out.println(Result);
        }while(true);
    }
}