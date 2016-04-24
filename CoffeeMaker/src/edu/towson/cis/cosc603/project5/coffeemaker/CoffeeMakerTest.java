package edu.towson.cis.cosc603.project5.coffeemaker;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * The class <code>CoffeeMakerTest</code> contains tests for the class <code>{@link CoffeeMaker}</code>.
 *
 * @generatedBy CodePro at 4/23/16 12:09 PM
 * @author MarleneRZ
 * @version $Revision: 1.0 $
 */
public class CoffeeMakerTest {
	//private CoffeeMaker cm;
	//private Inventory i;
	private Recipe r1;
	Inventory invOld;
	private CoffeeMaker fixtureSuccess;
	private Recipe rsuccess;// = RecipeFactory.createRecipe();
	/**
	 * Run the CoffeeMaker() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@Test
	public void testCoffeeMaker_1()
		throws Exception {

		CoffeeMaker result = new CoffeeMaker();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CoffeeMaker() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@Test
	public void testCoffeeMaker_2()
		throws Exception {

		CoffeeMaker result = new CoffeeMaker();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@Test
	public void testAddInventory_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = 0;
		int amtChocolate = -1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@Test
	public void testAddInventory_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = 0;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@Test
	public void testAddInventory_3()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		int amtCoffee = -1;
		int amtMilk = 1;
		int amtSugar = 1;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@Test
	public void testAddInventory_4()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		int amtCoffee = 1;
		int amtMilk = -1;
		int amtSugar = 1;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@Test
	public void testAddInventory_5()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = 1;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@Test
	public void testAddInventory_6()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = 0;
		int amtChocolate = 1;
		invOld = fixture.checkInventory();
		int oldAmtCoffee = invOld.getCoffee();
		int oldAmtMilk = invOld.getMilk();
		int oldAmtSugar = invOld.getSugar();
		int oldAmtChocolate = invOld.getChocolate();
		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);
		Inventory invNew = fixture.checkInventory();
		// add additional test code here
		assertEquals(oldAmtCoffee + amtCoffee, invNew.getCoffee());
		assertEquals(oldAmtMilk + amtMilk, invNew.getMilk());
		assertEquals(oldAmtSugar + amtSugar, invNew.getSugar());
		assertEquals(oldAmtChocolate + amtChocolate , invNew.getChocolate());
	}
	
	/**
	 * Run the boolean addRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy Marlene at 4/23/16 12:09 PM
	 */
	@Test
	public void testAddRecipe1()
		throws Exception {
		

		boolean result = fixtureSuccess.addRecipe(rsuccess);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@Test
	public void testAddRecipe_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.addRecipe(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@Test
	public void testAddRecipe_3()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.addRecipe(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@Test
	public void testAddRecipe_4()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.addRecipe(r);

		// add additional test code here
		assertEquals(true, result);
	}
	/**
	 * Run the boolean AddRecipe_Exist method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy Marlene at 4/23/16 12:09 PM
	 */
	@Test
	public void testAddRecipe_Exist()
		throws Exception {
		//CoffeeMaker coffeeMaker = CoffeeMakerFactory.createCoffeeMaker();
		//Recipe r = RecipeFactory.createRecipe();
		boolean result1 = fixtureSuccess.addRecipe(r1);
		boolean result2 =fixtureSuccess.addRecipe(r1);
		assertEquals(false, result2);
	}

	/**
	 * Run the Inventory checkInventory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@Test
	public void testCheckInventory_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();

		Inventory result = fixture.checkInventory();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Coffee: 15\r\nMilk: 15\r\nSugar: 15\r\nChocolate: 15\r\n", result.toString());
		assertEquals(15, result.getCoffee());
		assertEquals(15, result.getSugar());
		assertEquals(15, result.getChocolate());
		assertEquals(15, result.getMilk());
	}

	/**
	 * Run the boolean chkRecipeExist(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@Test
	public void testChkRecipeExist_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.chkRecipeExist(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean chkRecipeExist(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@Test
	public void testChkRecipeExist_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.chkRecipeExist(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean chkRecipeExist(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@Test
	public void testChkRecipeExist_3()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.chkRecipeExist(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@Test
	public void testDeleteRecipe1()
		throws Exception {
		//CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		boolean result1= fixtureSuccess.addRecipe(rsuccess);
		//Recipe r = RecipeFactory.createRecipe();

		boolean result2 = fixtureSuccess.deleteRecipe(rsuccess);

		// add additional test code here
		assertEquals(true, result2);
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@Test
	public void testDeleteRecipe_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.deleteRecipe(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@Test
	public void testDeleteRecipe_3()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.deleteRecipe(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@Test
	public void testDeleteRecipe_4()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = null;

		boolean result = fixture.deleteRecipe(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@Test
	public void testEditRecipe1()
		throws Exception {
		//CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		boolean result1= fixtureSuccess.addRecipe(rsuccess);
		Recipe oldRecipe = RecipeFactory.createRecipe();
		//Recipe newRecipe = RecipeFactory.createRecipe();

		boolean result = fixtureSuccess.editRecipe(oldRecipe, r1);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@Test
	public void testEditRecipe_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe oldRecipe = RecipeFactory.createRecipe();
		Recipe newRecipe = RecipeFactory.createRecipe();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@Test
	public void testEditRecipe_3()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe oldRecipe = RecipeFactory.createRecipe();
		Recipe newRecipe = RecipeFactory.createRecipe();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@Test
	public void testEditRecipe_4()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe oldRecipe = RecipeFactory.createRecipe();
		Recipe newRecipe = RecipeFactory.createRecipe();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@Test
	public void testEditRecipe_5()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe oldRecipe = RecipeFactory.createRecipe();
		Recipe newRecipe = RecipeFactory.createRecipe();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@Test
	public void testGetRecipeForName_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtMilk());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getPrice());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getAmtChocolate());
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@Test
	public void testGetRecipeForName_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtMilk());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getPrice());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getAmtChocolate());
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@Test
	public void testGetRecipeForName_3()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtMilk());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getPrice());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getAmtChocolate());
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@Test
	public void testGetRecipeForName_4()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtMilk());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getPrice());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getAmtChocolate());
	}
	
	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy Marlene Encinas at 4/23/16 12:09 PM
	 */
	@Test
	public void testGetRecipeForName_5()
		throws Exception {
		//CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		boolean result1 = fixtureSuccess.addRecipe(rsuccess);
		String name = rsuccess.getName();

		Recipe result = fixtureSuccess.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(rsuccess, result);
		assertEquals("Coffee", result.getName());
		assertEquals(1, result.getAmtMilk());
		assertEquals(1, result.getAmtSugar());
		assertEquals(50, result.getPrice());
		assertEquals(3, result.getAmtCoffee());
		assertEquals(0, result.getAmtChocolate());
	}

	/**
	 * Run the Recipe[] getRecipes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@Test
	public void testGetRecipes_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();

		Recipe[] result = fixture.getRecipes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].toString());
		assertEquals(null, result[0].getName());
		assertEquals(0, result[0].getAmtMilk());
		assertEquals(0, result[0].getAmtSugar());
		assertEquals(0, result[0].getPrice());
		assertEquals(0, result[0].getAmtCoffee());
		assertEquals(0, result[0].getAmtChocolate());
		assertNotNull(result[1]);
		assertEquals(null, result[1].toString());
		assertEquals(null, result[1].getName());
		assertEquals(0, result[1].getAmtMilk());
		assertEquals(0, result[1].getAmtSugar());
		assertEquals(0, result[1].getPrice());
		assertEquals(0, result[1].getAmtCoffee());
		assertEquals(0, result[1].getAmtChocolate());
		assertNotNull(result[2]);
		assertEquals(null, result[2].toString());
		assertEquals(null, result[2].getName());
		assertEquals(0, result[2].getAmtMilk());
		assertEquals(0, result[2].getAmtSugar());
		assertEquals(0, result[2].getPrice());
		assertEquals(0, result[2].getAmtCoffee());
		assertEquals(0, result[2].getAmtChocolate());
		assertNotNull(result[3]);
		assertEquals(null, result[3].toString());
		assertEquals(null, result[3].getName());
		assertEquals(0, result[3].getAmtMilk());
		assertEquals(0, result[3].getAmtSugar());
		assertEquals(0, result[3].getPrice());
		assertEquals(0, result[3].getAmtCoffee());
		assertEquals(0, result[3].getAmtChocolate());
	}

	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@Test
	public void testMakeCoffee_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();
		int amtPaid = 1;

		int result = fixture.makeCoffee(r, amtPaid);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@Test
	public void testMakeCoffee_UpdInventory()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
	//	Recipe r = RecipeFactory.createRecipe();
		int amtPaid = 60;

		
		int amtCoffee = r1.getAmtCoffee();
		int amtMilk = r1.getAmtMilk();
		int amtSugar = r1.getAmtSugar();
		int amtChocolate = r1.getAmtChocolate();
		invOld = fixture.checkInventory();
		int oldAmtCoffee = invOld.getCoffee();
		int oldAmtMilk = invOld.getMilk();
		int oldAmtSugar = invOld.getSugar();
		int oldAmtChocolate = invOld.getChocolate();
		//boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);
		
		int result = fixture.makeCoffee(r1, amtPaid);
		
		Inventory invNew = fixture.checkInventory();
		// add additional test code here
		assertEquals(oldAmtCoffee - amtCoffee, invNew.getCoffee());
		assertEquals(oldAmtMilk - amtMilk, invNew.getMilk());
		assertEquals(oldAmtSugar - amtSugar, invNew.getSugar());
		assertEquals(oldAmtChocolate -amtChocolate , invNew.getChocolate());
		assertEquals(10, result);
		
		
		
		
		

		
		
		
		
		// add additional test code here
		//assertEquals(1, result);
	}

	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy Marlene at 4/23/16 12:09 PM
	 */
	@Test
	public void testMakeCoffee_3()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		//Recipe r = RecipeFactory.createRecipe();
		int amtPaid = 50;

		int result = fixture.makeCoffee(r1, amtPaid);

		// add additional test code here
		assertEquals(0, result);
	}
	/**
	 * Run the int purchaseBeverage1(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy MarleneEncinas at 4/23/16 12:09 PM
	 */
	@Test
	public void purchaseBeverage1()
		throws Exception {
		//CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		
		boolean success = fixtureSuccess.addRecipe(rsuccess);
		//Recipe r = RecipeFactory.createRecipe();
		int amtPaid = 60;

		int result = fixtureSuccess.makeCoffee(r1, amtPaid);

		// add additional test code here
		assertEquals(10, result);
	}
	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	//	cm = new CoffeeMaker();
	//	i = cm.checkInventory();

		r1 = new Recipe();
		
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(3);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(0);
		
		//for testing successful insertion of recipe
		fixtureSuccess = CoffeeMakerFactory.createCoffeeMaker();
		rsuccess = RecipeFactory.createRecipe();
		
		rsuccess.setName("Coffee");
		rsuccess.setPrice(50);
		rsuccess.setAmtCoffee(3);
		rsuccess.setAmtMilk(1);
		rsuccess.setAmtSugar(1);
		rsuccess.setAmtChocolate(0);
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
		//cm = null;
		r1 = null;
		fixtureSuccess = null;
		rsuccess = null;
		
		
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 4/23/16 12:09 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CoffeeMakerTestold.class);
	}
}