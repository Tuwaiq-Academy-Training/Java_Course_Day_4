import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
      //Exercise 1:
       String name="meshal";

        for (int i = 0; i <name.length() ; i++) {
            System.out.println(name.charAt(i));
        }
        //Exercise 2:
        for (int i = name.length()-1; i >=0 ; i--) {
            System.out.println(name.charAt(i));
        }

        //Exercise 3:
        String[] names={"mohammed","saleh","eman"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }


        //Exercise 4:
        int[] numbers={5,5,10,15};
        int sum=0;
        for (int i = 0; i < numbers.length ; i++) {
            sum +=numbers[i];
        }
        double avg=sum/ numbers.length;
        System.out.println("the sum of the array is: "+sum);
        System.out.println("the average of the array is: "+avg);

//   Exercise 5:
      int[] numbers2={1,1,2,5,6,78,9,0};
        int check=scan.nextInt();
        for (int i = 0; i < numbers2.length ; i++) {
            if(numbers2[i]==check){
                System.out.println("the number "+check+
                        " is found at index "+i);
                break;
            }else {
                System.out.println("the number "+check+" was not found at index "+i);
            }

        }

        //Exercise 6:
        System.out.println("please enter your size");
        int size= scan.nextInt();
        int[] exercise=new int[size];
        for (int i = 0; i < exercise.length; i++) {
            System.out.println("please enter the number at index "+i);
            exercise[i]= scan.nextInt();
            System.out.println("the number you entered at index "+
                    i+" is: "+exercise[i]);
        }
        int sum2=0;
        for (int i = 0; i < exercise.length ; i++) {
            sum2 =sum2+ exercise[i];
        }
        System.out.println("the sum is "+sum2);
        double avg2=sum2/exercise.length;
        System.out.println("the avg is "+avg2);


    }
}