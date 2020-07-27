import org.junit.Assert;
import org.junit.Test;

public class Operationtests {

        @Test
        public void addTest() {
            int answer = Operations.add(80, 40);

            // the answer must be 60
            Assert.assertEquals(answer, 60);
        }

        @Test
        public void multiplyTest() {
            int answer = Operations.multiply(20, 40);

            // the answer must be 60
            Assert.assertEquals(answer, 800);
        }

        @Test
        public void divideTest() {
            int answer = Operations.divide(40, 20);

            // the answer must be 60
            Assert.assertEquals(answer, 2);
        }

}
