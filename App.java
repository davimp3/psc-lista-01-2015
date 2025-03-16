package PSC;
import java.text.DecimalFormat;
import java.util.Scanner;


public class App {


    // Crie um programa que receba uma temperatura em Celsius (28 graus) e a converta e exiba usando as escalas Kelvin e Fahrenheit. 

    public class Weather{
        public static void main(String[] args) {
            double 
            tcelsius,
            tfahrenheit,
            tkelvin,
            temp;
            String chooseTemp;
            DecimalFormat dfWheater = new DecimalFormat("#.00");

                try(Scanner scanweather = new Scanner(System.in)){
                    System.out.println("Digite qual a medida de temperatura em sua cidade (Celsius, Fahrenheit ou Kelvin.)");
                        chooseTemp = scanweather.next().toLowerCase();

                    System.out.println("Agora, digite a temperatura:");
                        temp = scanweather.nextDouble();
                        

                        switch (chooseTemp){
                            case "celsius", "c":
                                tfahrenheit = (1.8* temp) + 32;
                                tkelvin = (temp + 273);
                                System.out.println(" A temperatura Celsius em Fahrenheit é:"+dfWheater.format(tfahrenheit)+"e em Kelvin "+dfWheater.format(tkelvin));
                            break;

                            case "fahrenheit", "f":
                                tcelsius = (temp - 32) * 5/9;
                                tkelvin =  (temp - 32) * 5/9 + 273.15;
                                System.out.println("A temperatura Fahrenheit em celsius é"+dfWheater.format(tcelsius)+ "e em Kelvin é"+dfWheater.format(tkelvin));
                            break;

                            case "kelvin,", "k":
                                tcelsius = (temp - 273.15);
                                tfahrenheit = (temp - 273.15) * 9/5 +32;
                                System.out.println("A temperatura Kelvin em celsius é:"+dfWheater.format(tcelsius)+"e em Fahrenheit é"+dfWheater.format(tfahrenheit));
                                break;
                                
                                default: System.out.println("Digite uma temperatura válida.");
                                

                        }
                }



            
            
        }
    }

    // Considere a seguinte regra de proporcionalidade: Um passo é equivalente a 0,82 metros. Crie um programa que leia uma distância em quilômetros e calcule e exiba quanto é essa distância em passos. (Distância = 8km)

    // public class Porporcao {
    //     public static void main(String[] args){
    //         double 
    //         metros = 0.82, 
    //         distancia, 
    //         passos;
    //         DecimalFormat df = new DecimalFormat("#.00");

    //         try(Scanner scankm = new Scanner(System.in)){
    //         System.out.println("Vamos calcular a distância em passos, qual a distância em Km será percorrida?");
    //             distancia = scankm.nextDouble();
            
    //             passos = distancia / metros;

    //             System.out.println("O total da distância em passos para este percurso é:"+df.format(passos)+"km.");
            
    //         }
    //     }
    // }
    

    // Na construção civil, sabe-se que 8 pedreiros levam 72 horas para construir um muro. Faça um programa que leia a quantidade de pedreiros disponíveis e informe quantas horas eles demorarão para terminar o muro. (Quantidade de pedreiros disponíveis = 16)

    // public class Obra{
    //     public static void main(String [] args){
    //         int 
    //         horasMedia = 9,
    //         pedreiros,
    //         horasTotais;
    //         try(Scanner scanCostru = new Scanner(System.in)){

    //             System.out.println("Qual a quantidade de pedreiros disponíveis para realizar a obra?");
    //                 pedreiros = scanCostru.nextInt();

    //                 horasTotais = pedreiros * horasMedia ;

    //             System.out.println("A quantidade de horas para finalizar o muro será:"+horasTotais+"horas.");
    //         }

    //     }
    // }


    // Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar o ano com 365 dias e mês com 30 dias. (Idade = 30 anos)

    public class PersonAge{
        public static void main(String[] args) {
            double 
            age, 
            year, 
            month = 12, 
            days = 365;
            DecimalFormat df1 = new DecimalFormat("#");

            try(Scanner scanAge = new Scanner(System.in)){

                System.out.println("Qual o seu ano de nascimento?");
                    year = scanAge.nextDouble();

                    age = 2025 - year;
                    month = age * month;
                    days = age * days;

                System.out.println("A sua idade exepressa em dias é de:"+df1.format(days)+"dias");


                    
                    
            }
        }
    }

    // Um estudo mostrou que o lucro de uma viagem estadual é 55% vindo de pessoas que pagam a passagem inteira e 45% de estudantes que pagam meia. Uma passagem de ônibus custa 30 reais. Sabendo disso, crie um programa que leia quanto a empresa de ônibus acumulou no caixa após um dia de trabalho e calcule e exiba a estimativa de quantos passageiros de cada tipo andaram de ônibus naquele dia. (Acumulou no caixa após um dia = 250)



    public class Trip{
        public static void main(String[] args){
            double 
            adultPassanger,
            studentPassanger,
            fullValue = 30,
            midValue = 15,
            adult = 0.55,
            student = 0.45,
            dayGain;

            DecimalFormat df2 = new DecimalFormat("R$#.00");
            DecimalFormat df3 = new DecimalFormat("#");

            try(Scanner scanTrip = new Scanner(System.in)){

                System.out.println("Qual foi o acúmulo diário da empresa?");
                    dayGain = scanTrip.nextDouble();

            adultPassanger = (dayGain*adult);

                System.out.println("O lucro total com os adultos foi de"+ df2.format(adultPassanger));

            adultPassanger = (adultPassanger / fullValue);

                System.out.println("A quantidade de viajantes adultos foi em torno de:"+df3.format(adultPassanger)+"adultos.");

            studentPassanger = (dayGain*student);

                System.out.println("O lucro total com os estudantes foi de:"+df2.format(studentPassanger));

            studentPassanger =(studentPassanger/midValue);

                System.out.println("A quantidade de viajantes estudantes foi em torno de"+df3.format(studentPassanger)+"estudantes.");
              
            }


        }
    }




}
