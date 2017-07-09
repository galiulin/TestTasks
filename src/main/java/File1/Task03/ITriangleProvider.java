package File1.Task03;

public final class ITriangleProvider {
    public static ITriangle getTriangle(){
        return new ITriangle() {
            private int X1 = 6000;
            private int Y1 = 20000;
            private int X2 = 6000;
            private int Y2 = -5000;
            private int X3 = -4000;
            private int Y3 = 20000;

            @Override
            public int getX1() {
                return X1;
            }

            @Override
            public int getY1() {
                return Y1;
            }

            @Override
            public int getX2() {
                return X2;
            }

            @Override
            public int getY2() {
                return Y2;
            }

            @Override
            public int getX3() {
                return X3;
            }

            @Override
            public int getY3() {
                return Y3;
            }
        };
    }
}
