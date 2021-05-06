package lab;


import java.util.Scanner;



public class lab {
	public static void main(String[] str) {
		int m = 0;
		do {
		Scanner in = new Scanner(System.in);
		System.out.println("\n1. Перше завдання switch.\n2. Друге завдання цикли. \n3. Третє завдання - масиви. \n4. Четверте завдання - матриці. \n 5. Вихід");
		System.out.println("Виберіть один з пунктів меню:");
		try {
		m = in.nextInt();
		switch(m) {
		case 1: zavd1();break;
		case 2: zavd2();break;
		case 3: zavd3(); break;
		case 4:zavd4(); break;
		default:System.out.println("Вихід схвалено");
		
		}}
		catch(Exception r) {System.out.println("Помилка вводу!");}
		}
		while(m!=5);
		
	}
public static void zavd1() {
	Scanner in = new Scanner(System.in);
	try {
	System.out.println("Введіть номер кольору - ");
	int n = in.nextInt();
	switch(n) {
	case 1:System.out.print("Це - Червоний");break;
	case 2:System.out.print("Це - Помаранчивий");break;
	case 3:System.out.print("Це - Жовтий");break;
	case 4:System.out.print("Це - Зелений");break;
	case 5: System.out.print("Це - Блакитний");break;
	case 6:System.out.print("Це - Синій");break;
	case 7:System.out.print("Це - Фіолетовий");break;
	default:System.out.println("Кольору не існує!");
	}}
	catch(Exception e) {System.out.println("Невірний ввід "+e.toString());}

}
public static void zavd2() {
	double x1 = 0;
	double x2 = 6,y=0;
	double h = 0.5;
	System.out.println("while\nx\t|\ty\n__________________");
	while(x1<=x2) {
		y=1/(1-Math.sqrt(x1));
		System.out.printf("\n"+x1+"\t|\t" +"%.2f", y);
		System.out.printf("\n");
		x1 += h;
	}
	x1 = 0;
	x2 = 6;
	y=0;
	h = 0.5;
	System.out.println("do while\nx\t|\ty\n__________________");
	do {
		y=1/(1-Math.sqrt(x1));
		System.out.printf("\n"+x1+"\t|\t" +"%.2f", y);
		System.out.printf("\n");
		x1 += h;
	}
	while(x1<=x2);
	
}
public static void zavd3() {
	Scanner in = new Scanner(System.in);
	int j;
	System.out.println("Введіть розмір масиву:");
	int n = in.nextInt();
	double [] mas = new double[n];
	System.out.println("Виберіть як заповнити масив:\n1.Ввести масив з клавіатури.\n2.Рандомно згенерувати масив.");
	j = in.nextInt();
	if(j == 1) {
	enter(mas,  n);
	dobutok (mas,  n);
	suma(mas,  n);
	}
	
	else if(j == 2) {
	rand(mas,  n);
	print (mas,  n);
	dobutok (mas,  n);
	suma(mas,  n);
	}
	else System.out.println("Даний варіант відсутній.");
	
}
public static void enter(double[]mas, int n) {
	Scanner in = new Scanner(System.in);
	for(int i = 0;i < n; i++) {
		System.out.println("Введіть " + (i + 1)+ " значення масиву:");
		mas[i] = in.nextInt();
	}
}
public static void dobutok (double[]mas, int n) {
	double dobut = 1;
	for(int i = 0;i < n; i++) {
		
		if(mas[i] < 0) dobut *= mas[i];
	}
	System.out.printf("Добуток відємних елементів масиву:"+" %.2f", dobut);
	System.out.println("\n");
}
public static void suma (double[]mas, int n) {
	

	double suma = 0, temp=mas[0];
	int j = 0;
	for(int i = 0;i < n; i++) {
		if (temp>mas[i]) {
			temp=mas[i];
			j = i;
		}
	}
	for(int i = j+1;i <n; i++) {
		suma =suma+ mas[i];
	}
	System.out.printf("Сума елементів , розташованих після мінімального елемента: " + "%.2f",suma);
	System.out.println("\n");
}
public static void rand(double[]mas, int n) {
	for(int i = 0;i < n; i++) {
		 mas[i] =  Math.random()*200 - 100;
	}
}
public static void print(double[]mas, int n) {
	System.out.println("Згенерований масив:");
	for(int i = 0;i < n; i++) {
		System.out.printf("%.2f", mas[i]);
		System.out.println("\n");
	}
}
public static void zavd4() {
	Scanner in = new Scanner(System.in);
	int n, m;
	int j;
	System.out.println("Введіть розмір масиву.");
	System.out.println("Кількість стовпців:");
	n = in.nextInt();
	System.out.println("Кількість рядків:");
	m = in.nextInt();
	double ma[][]= new double[n][m];
	System.out.println("Виберіть як заповнити масив:\n1.Ввести масив з клавіатури.\n 2.Рандомно згенерувати масив.");
	j = in.nextInt();
	if(j == 1) {
	entermas(ma ,n,m);
	print2 (ma ,n,m);
	serdarefm(ma ,n,m);
	}
	else if(j == 2) {
	rand2 (ma ,n,m);
	print2 (ma ,n,m);
	serdarefm(ma ,n,m);
	}
	else System.out.println("Даний варіант відсутній.");
	
}
public static void entermas(double[][] mas,int n, int m ) {
	Scanner in = new Scanner(System.in);
	for(int i = 0;i < m; i++) {
		for(int j = 0;j < n; j++) {
			System.out.println("Введіть  значення масиву " + j +" "+ i);
			mas[j][i] = in.nextInt();
		}
	}
}
public static void serdarefm(double[][] mas,int n, int m ) {
	double suma = 0; 
	for(int i = 0;i < m; i++) {
		for(int j = 0;j < n; j++) {
			if( mas[j][i]<0) {
			suma =suma+ mas[j][i];
			}
		}
	}
	System.out.println("Сума відємних чисел матриці:");
	System.out.printf("%.0f",suma);
}
public static void rand2(double[][]mas, int n, int m) {
	for(int i = 0;i < m; i++) {
		for(int j = 0;j < n; j++) {
		 mas[j][i] =  Math.random()*200 - 100;
	}
	}
}
public static void print2(double[][]mas, int n,int m) {
	System.out.println("Згенерований масив:");
	for(int i = 0;i < m; i++) {
		for(int j = 0;j < n; j++) {
		System.out.printf( "%.0f" ,mas[j][i]);
		System.out.print(" ");
	}
		System.out.print("\n");
	}
}
}