/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bogglecalc;

/**
 *
 * @author scott.walker
 */
public class BoggleCalc {

//    private static final Set<Edge> edgeSet = ImmutableSet.of(
    private static final Edge[] egdes = new Edge[]{
        new Edge((byte) 0, (byte) 1),
        new Edge((byte) 0, (byte) 4),
        new Edge((byte) 0, (byte) 5),
        new Edge((byte) 1, (byte) 2),
        new Edge((byte) 1, (byte) 4),
        new Edge((byte) 1, (byte) 5),
        new Edge((byte) 1, (byte) 6),
        new Edge((byte) 2, (byte) 3),
        new Edge((byte) 2, (byte) 5),
        new Edge((byte) 2, (byte) 6),
        new Edge((byte) 2, (byte) 7),
        new Edge((byte) 3, (byte) 6),
        new Edge((byte) 3, (byte) 7),
        new Edge((byte) 4, (byte) 5),
        new Edge((byte) 4, (byte) 8),
        new Edge((byte) 4, (byte) 9),
        new Edge((byte) 5, (byte) 6),
        new Edge((byte) 5, (byte) 8),
        new Edge((byte) 5, (byte) 9),
        new Edge((byte) 5, (byte) 10),
        new Edge((byte) 6, (byte) 7),
        new Edge((byte) 6, (byte) 9),
        new Edge((byte) 6, (byte) 10),
        new Edge((byte) 6, (byte) 11),
        new Edge((byte) 7, (byte) 10),
        new Edge((byte) 7, (byte) 11),
        new Edge((byte) 8, (byte) 9),
        new Edge((byte) 8, (byte) 12),
        new Edge((byte) 8, (byte) 13),
        new Edge((byte) 9, (byte) 10),
        new Edge((byte) 9, (byte) 12),
        new Edge((byte) 9, (byte) 13),
        new Edge((byte) 9, (byte) 14),
        new Edge((byte) 10, (byte) 11),
        new Edge((byte) 10, (byte) 13),
        new Edge((byte) 10, (byte) 14),
        new Edge((byte) 10, (byte) 15),
        new Edge((byte) 11, (byte) 14),
        new Edge((byte) 11, (byte) 15),
        new Edge((byte) 12, (byte) 13),
        new Edge((byte) 13, (byte) 14),
        new Edge((byte) 14, (byte) 15)
    };
//    );

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Sets.powerSet(edgeSet).parallelStream().filter(s -> s.size() != 15)
//                .map((Set<Edge> s) -> {
//                    byte[] valence = new byte[16];
//                    s.parallelStream().map((e) -> {
//                        valence[e.getNode1()]++;
//                        return e;
//                    }).forEach((Edge e) -> {
//                        valence[e.getNode2()]++;
//                    });
//                    return new HashMap.SimpleImmutableEntry<byte[], Set<Edge>>(valence, s);
//                }).filter((AbstractMap.SimpleImmutableEntry<byte[], Set<Edge>> e) -> {
//                    byte[] valence = e.getKey();
//                    for (byte w : valence) {
//                        if (w > 2) {
//                            return false;
//                        }
//                        if (w < 1) {
//                            return false;
//                        }
//                    }
//                    return true;
//                }).map(e -> e.getValue()).limit(1000).forEach(System.out::println);

    }

}
