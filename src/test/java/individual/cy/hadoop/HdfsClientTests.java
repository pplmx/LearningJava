package individual.cy.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;

/**
 * @author mystic
 */
public class HdfsClientTests {
    private static URI uri;
    private static Configuration conf;

    @BeforeEach
    void setUp() {
        uri = URI.create("hdfs://127.0.0.1:9000");
        conf = new Configuration();
        conf.set("dfs.replication", "2");
        conf.set("dfs.blocksize", "64m");
    }

    @Test
    void upload() {
        Path src = new Path("file:///C:\\Users\\test.txt");
        Path dest = new Path("/var/tmp");
        try (FileSystem fs = FileSystem.get(uri, conf, "root")) {
            fs.copyFromLocalFile(src, dest);
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}
