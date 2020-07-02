package individual.cy.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;
import java.net.URI;

/**
 * @author mystic
 */
public class HdfsClient {

    public static void main(String[] args) {
        URI uri = URI.create("hdfs://127.0.0.1:9000");
        Configuration conf = new Configuration();
//        conf.set("dfs.client.use.datanode.hostname", "true");
//        conf.set("dfs.datanode.use.datanode.hostname", "true");

        Path src = new Path("file:///C:\\Users\\test.txt");
        Path dest = new Path("/cc");

        try (FileSystem fs = FileSystem.get(uri, conf, "root")) {
            if (!fs.exists(dest)) {
                fs.mkdirs(dest);
            }
            fs.copyFromLocalFile(src, dest);
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}
