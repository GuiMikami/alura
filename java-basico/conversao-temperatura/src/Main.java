public class Main {
    public static void main(String[] args) {
        double temperaturaCelsius = 59.2;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        System.out.println("A conversão de temperatura em Celsius para fahrenheit é = "+ temperaturaFahrenheit);

        // casting da variável double para int
        int tempInteiraFahrenheit = (int) temperaturaFahrenheit;
        System.out.println("A temperatura em fahrenheit inteira é = " + tempInteiraFahrenheit);


    }
}