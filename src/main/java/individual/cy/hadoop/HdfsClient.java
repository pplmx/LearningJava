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
        conf.set("dfs.replication", "2");
        conf.set("dfs.blocksize", "64m");
        conf.addResource(new Path("/etc/hadoop/conf/core-site.xml"));
        conf.addResource(new Path("/etc/hadoop/conf/hdfs-site.xml"));

        Path src = new Path("file:///C:\\Users\\test.txt");
        Path dest = new Path("/var/tmp/test.txt");
        try (FileSystem fs = FileSystem.get(uri, conf, "root")) {
            fs.copyFromLocalFile(src, dest);
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}
