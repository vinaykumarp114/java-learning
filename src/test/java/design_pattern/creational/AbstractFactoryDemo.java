package design_pattern.creational;

import design_pattern.creational.abstractfactory.CardType;
import design_pattern.creational.abstractfactory.CreditCard;
import design_pattern.creational.abstractfactory.CreditCardFactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		CreditCardFactory creditCardFactory = CreditCardFactory.getCreditCardFactory(700);
		CreditCard creditCard = creditCardFactory.getCreditCard(CardType.PLATINUM);

		System.out.println(creditCard);

		creditCardFactory = CreditCardFactory.getCreditCardFactory(550);
		creditCard = creditCardFactory.getCreditCard(CardType.GOLD);

		System.out.println(creditCard);
	}
}
