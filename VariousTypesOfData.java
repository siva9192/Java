import java.util.Scanner;
class VariousTypesOfData {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
    System.out.println("Enter name");
		String name= sc.nextLine();
    System.out.println("Enter roll number");
    int rollNumber= sc.nextInt();
    System.out.println("Enter Height");
    double height= sc.nextDouble();
    System.out.println("enter Section");
    char section= sc.next().charAt(0);

    System.out.println(name+"\n"+ rollNumber+"\n "+ height+" \n"+section);

	}

}
