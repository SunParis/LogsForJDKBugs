
import jdk.incubator.vector.*;

// class UserDefinedExceptionTest extends java.lang.RuntimeException {
//     public int field;
//     public UserDefinedExceptionTest() {
//         super("UserDefinedExceptionTest");
//     }
//     public UserDefinedExceptionTest(java.lang.String mess) {
//         super(mess);
//     }
// }

class Cls extends Test {
    public static final int N = 128;
    public static long instanceCount = -369377765L;
}

public class Test {
    public static final int N = 128;
    public static long instanceCount = -172L;
    public static java.lang.String strFld = "one";
    // static {
    //     FuzzerUtils.init(Test.iArrFld, 35881);
    //     FuzzerUtils.init(Test.OArrFld, new Cls1());
    // }
    // public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i2, int i3) {
        
        FloatVector floatVec1 = null;
        FloatVector floatVec2 = null;
        FloatVector floatVec3 = null;
        float[] floatArr1 = new float[100];
        float[] floatArr2 = new float[100];
        float[] lv_float_arr_1772845798995_148932461776892774 = new float[100];
        long meth_res = 0;
        int i4 = -31548;
        int i5 = -2;
        int i6 = 63287;
        boolean b = true;
        boolean bArr[] = new boolean[Test.N];
        long l = 62017L;
        Object O3 = new Object();
        for (int i = 0; i < floatArr1.length; i++) {
            floatArr1[i] = (((float) (i)) * 1.5F) + 7.89F;
        }
        for (int i = 0; i < floatArr2.length; i++) {
            floatArr2[i] = (((float) (i)) * 1.5F) + 7.89F;
        }
        for (int ihaksjdfhdsjkf = 0; ihaksjdfhdsjkf < lv_float_arr_1772845798995_148932461776892774.length; ihaksjdfhdsjkf++) {
            lv_float_arr_1772845798995_148932461776892774[ihaksjdfhdsjkf] = (((float) (ihaksjdfhdsjkf)) * 1.5F) + 7.89F;
        }
        
        for (i4 = ((int) (109)); i4 > 6; i4 -= 2) {
            Test.instanceCount -= ((long) (i4));
            i5 >>= ((int) (Test.instanceCount));
            for (i6 = ((int) (30)); i6 > 1; i6 -= 3) {
                i2 = ((int) (Cls1.instanceCount));
                switch ((i6 % 5) + 81) {
                    case 81 :
                        {
                            try {
                                Object tmpObj1adfsfds = new Object();
                                synchronized(tmpObj1adfsfds) {
                                    
                                    Object tmpObj2dsfdas = new Object();
                                    synchronized(tmpObj2dsfdas) {
                                        Test.strFld = "";
                                        // hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh
                                        floatVec2 = ((FloatVector) (VectorShuffle.iota(FloatVector.SPECIES_PREFERRED, 0, 16, true).toVector()));
                                        floatVec3 = FloatVector.fromArray(FloatVector.SPECIES_PREFERRED, floatArr2, 16);
                                        floatVec1 = floatVec2.div(floatVec3);
                                        floatVec1.intoArray(floatArr1, 16);
                                        
                                        Test.strFld += Test.strFld;
                                    }
                                    
                                    if ((((int) (lv_float_arr_1772845798995_148932461776892774[0])) % 3) < 1) {
                                        floatVec3 = ((FloatVector) (VectorShuffle.iota(FloatVector.SPECIES_PREFERRED, 0, 30, true).toVector()));
                                    } else {
                                        floatVec3 = FloatVector.fromArray(FloatVector.SPECIES_PREFERRED, lv_float_arr_1772845798995_148932461776892774, 30);
                                    }
                                    floatVec2 = FloatVector.fromArray(FloatVector.SPECIES_PREFERRED, floatArr1, 30);
                                    floatVec1 = floatVec3.div(floatVec2);
                                    floatVec1.intoArray(lv_float_arr_1772845798995_148932461776892774, 30);

                                }
                            } catch (java.lang.ArithmeticException exc18) {
                                for (l = ((long) (1)); 4 > l; l += 2) {
                                    synchronized(O3) {
                                        Object tmpObj = new Object();
                                        synchronized(tmpObj) {   
                                        }
                                        
                                    }
                                }
                            }
                            break;
                        }
                }
            }
        }
        meth_res =
            i2 + i3 + i4 + i5 + i6 + (b ? 1 : 0) + l +
            FuzzerUtils.checkSum(bArr) +
            FuzzerUtils.checkSum(O3);
        Test.iMeth_check_sum += meth_res;
        return ((int) (meth_res));
    }

    public void mainTest(java.lang.String[] strArr1) {
        for (int smallinvoc = 0; smallinvoc < 367; smallinvoc++) {
            int i16 = 42;
            Test.vMeth_check_sum += Test.iMeth(i16, i16);
        }
    }
    public static void main(java.lang.String[] args) {
        try {
            AllFuzzer_FakeMain_1772845799023_7345(args);
        } catch (java.lang.OutOfMemoryError ex) {
            ex.printStackTrace(System.err);
            System.exit(1);
        } catch (java.lang.Exception ex) {
            System.out.println(ex.getClass().getCanonicalName());
        } catch (java.lang.Throwable ex) {
            System.out.println(ex.getClass().getCanonicalName());
        }
        System.out.println("PASS");
    }

    public static void AllFuzzer_FakeMain_1772845799023_7345(java.lang.String[] strArr) {
        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++) {
                try {
                    _instance.mainTest(strArr);
                } catch (java.lang.OutOfMemoryError ex) {
                    ex.printStackTrace(FuzzerUtils.err);
                    java.lang.System.exit(1);
                } catch (java.lang.Exception ex) {
                    FuzzerUtils.out.println(ex.getClass().getCanonicalName());
                }
            }
        } catch (java.lang.Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }
}

class Cls1 {
    public static final int N = 128;
    public static long instanceCount = 112L;
    public static String gbStrdfasf = new String("");
}

