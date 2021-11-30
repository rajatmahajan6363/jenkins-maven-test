import static org.junit.Assert.*;

import org.junit.Test;

import com.demo.Demo;

public class TestDemo {

	@Test
	public void testAdd() {
		Demo d=new Demo();
		int ans=d.add(20, 20);
		assertEquals(400, ans);
	}

}
