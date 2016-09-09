
#define MATHLIB_STANDALONE 1
#include "JNIRMath.h"
#include "include/Rmath.h"

JNIEXPORT jdouble JNICALL Java_com_jni_RMath_ppois
  (JNIEnv * env, jobject obj, jdouble x, jdouble lb, jint lt, jint lg)
{

	return ppois(x, lb, lt, lg);

}

