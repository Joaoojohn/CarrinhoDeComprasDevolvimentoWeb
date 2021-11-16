package desevolvimentoWeb.desevolvimentoWeb.Service;

import java.math.BigDecimal;
public class FreteProduto implements Frete 
{

    @Override
    public BigDecimal calcularFrete(BigDecimal valorTotalDaCompra, BigDecimal valorFrete) 
    {
        if (valorTotalDaCompra.intValue() >= 250) 
        {
            return new BigDecimal("0.00");
        }
        return valorFrete;
    }
}
