import { Product } from './product.interface';
import { Creator } from './creator';

export class SecondConcreteCreator extends Creator {
  public factoryMethod(): Product {
    return new SecondConcreteProduct();
  }
}

class SecondConcreteProduct implements Product {
  public operation(): string {
    return '{Result of the SecondConcreteProduct}';
  }
}
