package Project.dto;

public class AssortmentForm
{
  private final String product;

  private final int price;

  public AssortmentForm(String product, int price)
  {
    this.product = product;
    this.price = price;
  }

  public String getProduct()
  {
    return product;
  }

  public int getPrice()
  {
    return price;
  }
}
