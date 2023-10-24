import { Product } from './product.interface';
import { Creator } from './creator';

export class FirstConcreteCreator extends Creator {
  public factoryMethod(): Product {
    return new FirstConcreteProduct();
  }
}

class FirstConcreteProduct implements Product {
  public operation(): string {
    return '{Result of the FirstConcreteProduct}';
  }
}
