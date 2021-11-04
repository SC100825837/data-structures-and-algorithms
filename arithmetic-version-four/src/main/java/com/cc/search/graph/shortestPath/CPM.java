package com.cc.search.graph.shortestPath;

import com.cc.search.util.StdOut;

import java.io.*;
import java.util.*;

public class CPM {
    // this class cannot be instantiated
    private CPM() { }

    /*public static void main(String[] args) {
        // number of jobs
        int n = StdIn.readInt();

        // source and sink
        int source = 2*n;
        int sink   = 2*n + 1;

        // build network
        EdgeWeightedDigraph G = new EdgeWeightedDigraph(2*n + 2);
        for (int i = 0; i < n; i++) {
            double duration = StdIn.readDouble();
            G.addEdge(new DirectedEdge(source, i, 0.0));
            G.addEdge(new DirectedEdge(i+n, sink, 0.0));
            G.addEdge(new DirectedEdge(i, i+n,    duration));

            // precedence constraints
            int m = StdIn.readInt();
            for (int j = 0; j < m; j++) {
                int precedent = StdIn.readInt();
                G.addEdge(new DirectedEdge(n+i, precedent, 0.0));
            }
        }

        // compute longest path
        AcyclicLP lp = new AcyclicLP(G, source);

        // print results
        StdOut.println(" job   start  finish");
        StdOut.println("--------------------");
        for (int i = 0; i < n; i++) {
            StdOut.printf("%4d %7.1f %7.1f\n", i, lp.distTo(i), lp.distTo(i+n));
        }
        StdOut.printf("Finish time: %7.1f\n", lp.distTo(sink));

        for (int v = 0; v < G.V(); v++) {
            if (lp.hasPathTo(v)) {
                StdOut.printf("%d to %d (%.2f)  ", n, v, lp.distTo(v));
                for (DirectedEdge e : lp.pathTo(v)) {
                    StdOut.print(e + "   ");
                }
                StdOut.println();
            }
            else {
                StdOut.printf("%d to %d         no path\n", n, v);
            }
        }
    }*/
    /**
     *  Reads the precedence constraints from standard input
     *  and prints a feasible schedule to standard output.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) throws IOException {

        Double[] durations = {41.0, 51.0, 50.0, 36.0, 38.0, 45.0, 21.0, 32.0, 32.0, 29.0};

        Map<Integer, LinkedList<Integer>> constraints = new HashMap<>();
        LinkedList<Integer> pre0 = new LinkedList<>();
        pre0.add(1);
        pre0.add(7);
        pre0.add(9);
        constraints.put(0, pre0);

        LinkedList<Integer> pre1 = new LinkedList<>();
        pre1.add(2);
        constraints.put(1, pre1);

        LinkedList<Integer> pre6 = new LinkedList<>();
        pre6.add(3);
        pre6.add(8);
        constraints.put(6, pre6);

        LinkedList<Integer> pre7 = new LinkedList<>();
        pre7.add(3);
        pre7.add(8);
        constraints.put(7, pre7);

        LinkedList<Integer> pre8 = new LinkedList<>();
        pre8.add(2);
        constraints.put(8, pre8);

        LinkedList<Integer> pre9 = new LinkedList<>();
        pre9.add(4);
        pre9.add(6);
        constraints.put(9, pre9);
        System.out.println(constraints);
        // number of jobs
        int n = durations.length;

        // source and sink
        int source = 2*n;
        int sink   = 2*n + 1;

        // build network
        EdgeWeightedDigraph G = new EdgeWeightedDigraph(2*n + 2);
        for (int i = 0; i < n; i++) {
            double duration = durations[i];
            G.addEdge(new DirectedEdge(source, i, 0.0));
            G.addEdge(new DirectedEdge(i+n, sink, 0.0));
            G.addEdge(new DirectedEdge(i, i+n,    duration));

            LinkedList<Integer> pres = constraints.get(i);
            if (pres == null) {
                continue;
            }
            int m = pres.size();
            for (int j = 0; j < m; j++) {
                int precedent = pres.remove();
                G.addEdge(new DirectedEdge(n+i, precedent, 0.0));
            }
        }

        // compute longest path
        AcyclicLP lp = new AcyclicLP(G, source);

        // print results
        StdOut.println(" job   start  finish");
        StdOut.println("--------------------");
        for (int i = 0; i < n; i++) {
            StdOut.printf("%4d %7.1f %7.1f\n", i, lp.distTo(i), lp.distTo(i+n));
        }
        StdOut.printf("Finish time: %7.1f\n", lp.distTo(sink));

        // 打印路径
        for (int v = 0; v < G.V(); v++) {
            if (lp.hasPathTo(v)) {
                StdOut.printf("%d to %d (%.2f)  ", n, v, lp.distTo(v));
                for (DirectedEdge e : lp.pathTo(v)) {
                    StdOut.print(e + "   ");
                }
                StdOut.println();
            }
            else {
                StdOut.printf("%d to %d         no path\n", n, v);
            }
        }
        System.out.println("===========================找到最长路径=============================");
        Iterable<DirectedEdge> cpm = lp.pathTo(sink);
        List<Integer> cpmProList = new ArrayList<>();
        for (DirectedEdge project : cpm) {
            int originProjectIndex = project.from();
            if (originProjectIndex >= durations.length) {
                continue;
            }
            cpmProList.add(originProjectIndex);
        }
        System.out.println("cpm 关键路径为: " + cpmProList);
    }
}
