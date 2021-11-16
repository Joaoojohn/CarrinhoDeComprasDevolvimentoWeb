package desevolvimentoWeb.desevolvimentoWeb.Service;

import java.math.BigDecimal;

public interface Frete 
{
    public BigDecimal calcularFrete(BigDecimal valorTotalDaCompra, BigDecimal valorFrete);
}
