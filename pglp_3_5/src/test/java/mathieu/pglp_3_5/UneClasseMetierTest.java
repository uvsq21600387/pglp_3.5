package mathieu.pglp_3_5;

import org.junit.Test;

public class UneClasseMetierTest {

    @Test
    public void test() {
        UneClasseMetier acm = new UneClasseMetier(new AfficheMetier());
        acm.uneMethodeMetier();
    }

}
