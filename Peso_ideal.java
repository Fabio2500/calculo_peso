import java.util.Scanner;

class Peso_ideal{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
           
        int escolha;
   		String nome;
		double peso,altura;
		double homem_peso,mulher_peso;

		System.out.println("digite seu nome:");
		nome = sc.next();
		System.out.println("digite a sua altura");
		altura = sc.nextDouble();
		System.out.println("digite 1 caso seja do sexo masculino e 2 caso seja do feminino:");
		escolha = sc.nextInt();
		//System.out.println(nome);

		if(escolha == 1){
			homem_peso = (72.7 * altura ) - 58.00;
			System.out.println(nome + " seu peso ideal como homem:" + homem_peso);    
		}else{
			mulher_peso = (62.10 * altura ) - 44.70;
			System.out.println(nome + " seu peso ideal como mulher:" + mulher_peso);
		}

	}
}