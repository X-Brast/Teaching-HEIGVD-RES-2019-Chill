package ch.heigvd.res.chill.domain.Ichimizu;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class DragonBeer implements IProduct {

  public final static String NAME = "DragonBeer";
  public final static BigDecimal PRICE = new BigDecimal(2.80);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
