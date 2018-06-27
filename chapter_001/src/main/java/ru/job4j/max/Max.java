package ru.job4j.max;

/**
 * @author Bondarenko.
 * @since  7.6.18.
 * @version 347.
 */

public class Max {
	/**
	 * method for Max number find
	 * @param first, second
	 *
	 */
	public int max(int first, int second) {
		return first > second ? first : second;
	}
	public int max(int first, int second, int third) {
		return max(max(first, second), max(second, third));
	}
}