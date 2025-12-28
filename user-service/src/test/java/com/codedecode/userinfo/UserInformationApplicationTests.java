package com.codedecode.userinfo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserInformationApplicationTests {

	@Test
	void contextLoads() {
	}

	@BeforeMethod
    public void setUp() {
        User user = new User();
    }

    // Test for the 'add' method
    @Test
    public void testAdd() {
        int result = user.add(5, 3);
        // Assert that the result of 5 + 3 is 8
        Assert.assertEquals(result, 8, "Incorrect");
    }

    // Test for the 'subtract' method
    @Test
    public void testSubtract() {
        int result = user.subtract(5, 3);
        // Assert that the result of 5 - 3 is 2
        Assert.assertEquals(result, 2, "Incorrect");
}
