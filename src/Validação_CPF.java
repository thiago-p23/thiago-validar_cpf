import static java.lang.IO.*;

void main() {

    String cpf = readln("Digite o CPF (somente números): ");

    if (cpf.length() != 11) {
        println("CPF inválido!");
        return;
    }

    int soma = 0;

    // 1º dígito
    for (int i = 0; i < 9; i++) {
        int num = Integer.parseInt("" + cpf.charAt(i));
        soma += num * (10 - i);
    }

    int resto = soma % 11;
    int dig1;

    if (resto < 2) {
        dig1 = 0;
    } else {
        dig1 = 11 - resto;
    }

    // 2º dígito
    soma = 0;
    for (int i = 0; i < 10; i++) {
        int num = Integer.parseInt("" + cpf.charAt(i));
        soma += num * (11 - i);
    }

    resto = soma % 11;
    int dig2;

    if (resto < 2) {
        dig2 = 0;
    } else {
        dig2 = 11 - resto;
    }

    // Verificação final
    int ultimo1 = Integer.parseInt("" + cpf.charAt(9));
    int ultimo2 = Integer.parseInt("" + cpf.charAt(10));

    if (dig1 == ultimo1 && dig2 == ultimo2) {
        println("CPF válido!");
    } else {
        println("CPF inválido!");
    }
}