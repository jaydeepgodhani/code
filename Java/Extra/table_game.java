import java.util.*;
public class table_game {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int times = Integer.parseInt(sc.nextLine());
        int x, y, i, counter;
        for (i = 0; i < times; i++) {
            String width = sc.nextLine();
            String height = sc.nextLine();
            int x1[] = new int[width.length() + 1];
            int y1[] = new int[height.length() + 1];
            x1[0] = -1;
            y1[0] = -1;
            for (i = 0; i < width.length(); i++)
                x1[i + 1] = Integer.parseInt(String.valueOf(width.charAt(i)));
            for (i = 0; i < height.length(); i++)
                y1[i + 1] = Integer.parseInt(String.valueOf(height.charAt(i)));
            int cases = sc.nextInt();
            int input[][] = new int[cases][2];
            for (i = 0; i < cases; i++) {
                input[i][0] = sc.nextInt();
                input[i][1] = sc.nextInt();
            }
            for (i = 0; i < cases; i++) {
                x = input[i][0];
                y = input[i][1];
                counter = 0;
                while (x != 0 && y != 0) {
                    if (((x1[y] == 1) && (y1[x] == 0)) || ((x1[y] == 0) && (y1[x] == 1))) {
                        if (x == y) {
                            if (x % 2 == 0) {
                                if (x1[y] == 1) {
                                    x--;
                                    counter++;// System.out.print("a");
                                } else {
                                    y--;
                                    counter++;// System.out.print("b");
                                }
                            } else {
                                if (x1[y] == 0) {
                                    x--;
                                    counter++;// System.out.print("c");
                                } else {
                                    y--;
                                    counter++;// System.out.print("d");
                                }
                            }
                        } else {
                            if ((x % 2 == 0) && (y % 2 == 0)) {
                                if (x > y) {
                                    x--;
                                    counter++;// System.out.print("e");
                                } else {
                                    y--;
                                    counter++;// System.out.print("f");
                                }
                            } else if ((x % 2 == 1) && (y % 2 == 1)) {
                                if (x < y) {
                                    x--;
                                    counter++;// System.out.print("g");
                                } else {
                                    y--;
                                    counter++;// System.out.print("h");
                                }
                            } else {
                                if (x % 2 == 0) {
                                    if (y1[x] == 0) {
                                        if (x > y) {
                                            x--;
                                            counter++;// System.out.print("i");
                                        } else {
                                            y--;
                                            counter++;// System.out.print("j");
                                        }
                                    } else {
                                        if (x < y) {
                                            x--;
                                            counter++;// System.out.print("k");
                                        } else {
                                            y--;
                                            counter++;// System.out.print("l");
                                        }
                                    }
                                } else {
                                    if (y1[x] == 0) {
                                        if (x < y) {
                                            x--;
                                            counter++;// System.out.print("m");
                                        } else {
                                            y--;
                                            counter++;// System.out.print("n");
                                        }
                                    } else {
                                        if (x > y) {
                                            x--;
                                            counter++;// System.out.print("o");
                                        } else {
                                            y--;
                                            counter++;// System.out.print("p");
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        // System.out.println("inside same");
                        if (x == y) {
                            x--;
                            counter++;
                        } else {
                            // System.out.println("NsNs");
                            if (x1[y] == 1) {
                                if ((x % 2 == 0) && (y % 2 == 0)) {
                                    if (x < y) {
                                        x--;
                                        counter++;// System.out.print("q");
                                    } else {
                                        y--;
                                        counter++;// System.out.print("r");
                                    }
                                } else if ((x % 2 == 1) && (y % 2 == 1)) {
                                    if (x > y) {
                                        x--;
                                        counter++;// System.out.print("s");
                                    } else {
                                        y--;
                                        counter++;// System.out.print("t");
                                    }
                                } else {
                                    if (x % 2 == 0) {
                                        x--;
                                        counter++;// System.out.print("u");
                                    } else {
                                        y--;
                                        counter++;// System.out.print("v");
                                    }
                                }
                            } else {
                                // System.out.println("NSSs");
                                if ((x % 2 == 0) && (y % 2 == 0)) {
                                    if (x > y) {
                                        x--;
                                        counter++;// System.out.print("w");
                                    } else {
                                        y--;
                                        counter++;// System.out.print("x");
                                    }
                                } else if ((x % 2 == 1) && (y % 2 == 1)) {
                                    if (x < y) {
                                        x--;
                                        counter++;// System.out.print("y");
                                    } else {
                                        y--;
                                        counter++;// System.out.print("z");
                                    }
                                } else {
                                    if (x % 2 == 1) {
                                        x--;
                                        counter++;// System.out.print("yo");
                                    } else {
                                        y--;
                                        counter++;// System.out.print("ni");
                                    }
                                }
                            }
                        }
                    }
                }
                // System.out.println(counter + " " + x + " " + y + "\n");
                if (x == 0) {
                    if (x1[y] == 0) {
                        System.out.print((counter) % 2);
                    } else {
                        System.out.print((counter + 1) % 2);
                    }
                }
                if (y == 0) {
                    if (y1[x] == 0) {
                        System.out.print((counter) % 2);
                    } else {
                        System.out.print((counter + 1) % 2);
                    }
                }
            }
        }
    }
}