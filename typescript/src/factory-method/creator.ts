import { Product } from './product.interface';

export abstract class Creator {
  abstract factoryMethod(): Product;

  public someOperation() {
    const product = this.factoryMethod();
    return product.operation();
  }
}
