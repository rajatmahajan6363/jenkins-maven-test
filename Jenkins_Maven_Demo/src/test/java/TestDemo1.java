import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.Demo;

public class TestDemo1 {

	@Test
	public void testAdd() {
		Demo d=new Demo();
		int ans=d.add(20, 20);
		assertEquals(100, ans);
	}
}
