import com.aliyun.tairjedis.tairgis.TairGis;
import com.aliyun.tairjedis.tairgis.TairGisCluster;
import com.aliyun.tairjedis.tairgis.TairGisPipeline;
import org.junit.BeforeClass;

public class TairGisTestBase extends TestBase {

    public static TairGis tairGis;
    public static TairGisPipeline tairGisPipeline;
    public static TairGisCluster tairGisCluster;

    @BeforeClass
    public static void setUp() {
        tairGis = new TairGis(jedis);
        tairGisPipeline = new TairGisPipeline();
        tairGisPipeline.setClient(jedis.getClient());
        tairGisCluster = new TairGisCluster(jedisCluster);

    }
}
