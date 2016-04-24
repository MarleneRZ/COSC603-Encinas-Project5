package edu.towson.cis.cosc603.project5.coffeemaker;



/**
 * The class <code>RecipeFactory</code> implements static methods that return instances of the class <code>{@link Recipe}</code>.
 *
 * @generatedBy CodePro at 4/23/16 11:34 AM
 * @author MarleneRZ
 * @version $Revision: 1.0 $
 */
public class RecipeFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 4/23/16 11:34 AM
	 */
	private RecipeFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Recipe}</code>.
	 *
	 * @generatedBy CodePro at 4/23/16 11:34 AM
	 */
	public static Recipe createRecipe() {
		return new Recipe();
	}
}