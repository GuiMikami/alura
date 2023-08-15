import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.ReajusteService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReajusteServiceTest {

    /*
    Reajuste baseado no desempenho anual:
    1- Se o desempenho foi "A Desejar" o reajuste será de 3% do salário
    2- Se o desemepenho foi "Bom" o reajuste será de 15% do salário
    3- Se o desempenho foi "Ótimo" o rejuaste será de 20% do salário
     */

    @Test
    public void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForADesejar(){
        var service = new ReajusteService();

        var funcionario = new Funcionario("Guilherme", LocalDate.now(), new BigDecimal("1000.00"));
        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);

        Assertions.assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());

    }

    @Test
    public void reajusteDeveriaSerDeQuinzePorcentoQuandoDesempenhoForBom(){
        var service = new ReajusteService();

        var funcionario = new Funcionario("Joao",LocalDate.now(),new BigDecimal("1000.00"));
        service.concederReajuste(funcionario, Desempenho.BOM);

        Assertions.assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }
    @Test
    public void reajusteDeveriaSerDeVintePorcentoQuandoDesemepenhoForOtimo(){
        var service = new ReajusteService();

        var funcionario = new Funcionario("Maria",LocalDate.now(),new BigDecimal("1000.00"));
        service.concederReajuste(funcionario, Desempenho.OTIMO);

        Assertions.assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }


}
