package com.cc.research.sort.priorityqueue;

import com.cc.research.util.In;
import com.cc.research.util.StdOut;
import com.cc.research.utils.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author 10082
 * @description: 索引优先队列测试用例
 * @date 2021/12/1 10:47
 */
public class Multiway {

    // This class should not be instantiated.
    private Multiway() { }

    // merge together the sorted input streams and write the sorted result to standard output
    private static void merge(In[] streams) {
        int n = streams.length;
        IndexMinPQ<String> pq = new IndexMinPQ<String>(n);
        for (int i = 0; i < n; i++)
            if (!streams[i].isEmpty())
                pq.insert(i, streams[i].readString());

        // Extract and print min and read next from its stream.
        while (!pq.isEmpty()) {
            StdOut.print(pq.minKey() + " ");
            int i = pq.delMin();
            if (!streams[i].isEmpty())
                pq.insert(i, streams[i].readString());
        }
        StdOut.println();
    }


    /**
     *  Reads sorted text files specified as command-line arguments;
     *  merges them together into a sorted output; and writes
     *  the results to standard output.
     *  Note: this client does not check that the input files are sorted.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File filePath = new File(ResourceUtils.getURL("classpath:").getPath() + "/sort");
        String[] files = {filePath + "/m1.txt", filePath + "/m2.txt", filePath + "/m3.txt"};
        int n = 3;
        In[] streams = new In[n];
        for (int i = 0; i < n; i++)
            streams[i] = new In(files[i]);
        merge(streams);
    }
}
