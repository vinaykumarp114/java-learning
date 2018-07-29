/**
 * 
 */
package design_pattern.creational.abstractfactory;

/**
 * @author vinay
 *
 */
public abstract class CreditCardFactory {

	public abstract CreditCard getCreditCard(CardType type);

	public abstract Validator getValidator(CardType type);

	public static CreditCardFactory getCreditCardFactory(int creditScore) {
		if (creditScore > 600) {
			return new AmexFactory();
		} else {
			return new VisaFactory();
		}
	}
}
