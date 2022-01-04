package com.cc.research.sort.priorityqueue;

import com.cc.research.basedatastrusts.Stack;
import com.cc.research.util.StdOut;
import com.cc.research.utils.ResourceUtils;

import java.io.*;

/**
 * @author 10082
 * @description: TODO
 * @date 2021/11/30 16:55
 */
public class TopM {
    // This class should not be instantiated.
    private TopM() {
    }

    /**
     * Reads a sequence of transactions from standard input; takes a
     * command-line integer m; prints to standard output the m largest
     * transactions in descending order.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) throws IOException {
        int m = 5;
        MinPQ<Transaction> pq = new MinPQ<>(m + 1);

        File filePath = new File(ResourceUtils.getURL("classpath:").getPath());
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath + "/sort/tinyBatch.txt"));
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            Transaction transaction = new Transaction(line);
            pq.insert(transaction);

            // remove minimum if m+1 entries on the PQ
            if (pq.size() > m)
                pq.delMin();
        }   // top m entries are on the PQ

        // print entries on PQ in reverse order
        Stack<Transaction> stack = new Stack<Transaction>();
        for (Transaction transaction : pq)
            stack.push(transaction);
        for (Transaction transaction : stack)
            StdOut.println(transaction);
    }
}
