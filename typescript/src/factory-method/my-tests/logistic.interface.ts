import { Transport } from './transport.interface';

export abstract class Logistic {
  abstract createTransport(): Transport;

  public delivery(): void {
    const transport = this.createTransport();

    transport.delivery();
  }
}
