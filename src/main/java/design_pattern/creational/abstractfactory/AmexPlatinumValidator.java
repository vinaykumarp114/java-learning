/**
 * 
 */
package design_pattern.creational.abstractfactory;

/**
 * @author vinay
 *
 */
public class AmexPlatinumValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		return false;
	}

}
