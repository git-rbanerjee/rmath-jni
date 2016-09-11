
#define MATHLIB_STANDALONE 1
#include "JNIRMathNative.h"
#include "include/Rmath.h"

JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_ppois
  (JNIEnv * env, jobject obj, jdouble x, jdouble lb, jint lt, jint lg)
{

	return ppois(x, lb, lt, lg);

}

