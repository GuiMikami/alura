import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.BonusService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BonusServiceTest {

    @Test
    void bonusDeveriaSerZeroParaFuncionarioComSalarioAlto(){
        var service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Guilherme", LocalDate.now(),new BigDecimal("25000")));

        Assertions.assertEquals(new BigDecimal("0.00"), bonus);
    }
    @Test
    void bonusDeveriaSer10PorCentoDoSalario(){
        var service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Guilherme", LocalDate.now(),new BigDecimal("2500")));

        Assertions.assertEquals(new BigDecimal("250.00"), bonus);
    }

    @Test
    void bonusDeveriaSer10PorCentoParaSalarioDeExatamente10000(){
        var service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Guilherme", LocalDate.now(),new BigDecimal("10000")));

        Assertions.assertEquals(new BigDecimal("1000.00"), bonus);
    }

}
