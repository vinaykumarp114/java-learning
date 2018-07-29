/**
 * 
 */
package design_pattern.creational.abstractfactory;

/**
 * @author vinay
 *
 */
public abstract class CreditCard {

	protected int cardNumberLength;

	protected int cscNumber;

	/**
	 * @return the cardNumberLength
	 */
	public int getCardNumberLength() {
		return cardNumberLength;
	}

	/**
	 * @param cardNumberLength the cardNumberLength to set
	 */
	public void setCardNumberLength(int cardNumberLength) {
		this.cardNumberLength = cardNumberLength;
	}

	/**
	 * @return the cscNumber
	 */
	public int getCscNumber() {
		return cscNumber;
	}

	/**
	 * @param cscNumber the cscNumber to set
	 */
	public void setCscNumber(int cscNumber) {
		this.cscNumber = cscNumber;
	}

}
