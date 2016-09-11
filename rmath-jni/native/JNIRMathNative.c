

//Author:: Rabin Banerjee 


#define MATHLIB_STANDALONE 1 
#include "JNIRMathNative.h" 
#include "include/Rmath.h" 
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_dnorm4(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4){
	return dnorm4(p1,p2,p3,p4);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    pnorm5
 * Signature: (DDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_pnorm5(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4, jint p5){
	return pnorm5(p1,p2,p3,p4,p5);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    qnorm5
 * Signature: (DDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_qnorm5(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4, jint p5){
	return qnorm5(p1,p2,p3,p4,p5);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    dunif
 * Signature: (DDDI)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_dunif(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4){
	return dunif(p1,p2,p3,p4);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    punif
 * Signature: (DDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_punif(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4, jint p5){
	return punif(p1,p2,p3,p4,p5);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    qunif
 * Signature: (DDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_qunif(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4, jint p5){
	return qunif(p1,p2,p3,p4,p5);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    dgamma
 * Signature: (DDDI)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_dgamma(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4){
	return dgamma(p1,p2,p3,p4);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    pgamma
 * Signature: (DDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_pgamma(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4, jint p5){
	return pgamma(p1,p2,p3,p4,p5);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    qgamma
 * Signature: (DDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_qgamma(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4, jint p5){
	return qgamma(p1,p2,p3,p4,p5);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    dbeta
 * Signature: (DDDI)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_dbeta(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4){
	return dbeta(p1,p2,p3,p4);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    pbeta
 * Signature: (DDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_pbeta(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4, jint p5){
	return pbeta(p1,p2,p3,p4,p5);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    qbeta
 * Signature: (DDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_qbeta(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4, jint p5){
	return qbeta(p1,p2,p3,p4,p5);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    dlnorm
 * Signature: (DDDI)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_dlnorm(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4){
	return dlnorm(p1,p2,p3,p4);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    plnorm
 * Signature: (DDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_plnorm(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4, jint p5){
	return plnorm(p1,p2,p3,p4,p5);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    qlnorm
 * Signature: (DDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_qlnorm(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4, jint p5){
	return qlnorm(p1,p2,p3,p4,p5);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    dchisq
 * Signature: (DDI)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_dchisq(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jint p3){
	return dchisq(p1,p2,p3);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    pchisq
 * Signature: (DDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_pchisq(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jint p3, jint p4){
	return pchisq(p1,p2,p3,p4);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    qchisq
 * Signature: (DDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_qchisq(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jint p3, jint p4){
	return qchisq(p1,p2,p3,p4);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    dnchisq
 * Signature: (DDDI)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_dnchisq(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4){
	return dnchisq(p1,p2,p3,p4);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    pnchisq
 * Signature: (DDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_pnchisq(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4, jint p5){
	return pnchisq(p1,p2,p3,p4,p5);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    qnchisq
 * Signature: (DDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_qnchisq(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4, jint p5){
	return qnchisq(p1,p2,p3,p4,p5);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    df
 * Signature: (DDDI)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_df(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4){
	return df(p1,p2,p3,p4);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    pf
 * Signature: (DDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_pf(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4, jint p5){
	return pf(p1,p2,p3,p4,p5);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    qf
 * Signature: (DDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_qf(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4, jint p5){
	return qf(p1,p2,p3,p4,p5);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    dt
 * Signature: (DDI)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_dt(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jint p3){
	return dt(p1,p2,p3);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    pt
 * Signature: (DDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_pt(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jint p3, jint p4){
	return pt(p1,p2,p3,p4);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    qt
 * Signature: (DDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_qt(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jint p3, jint p4){
	return qt(p1,p2,p3,p4);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    dbinom
 * Signature: (DDDI)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_dbinom(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4){
	return dbinom(p1,p2,p3,p4);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    pbinom
 * Signature: (DDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_pbinom(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4, jint p5){
	return pbinom(p1,p2,p3,p4,p5);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    qbinom
 * Signature: (DDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_qbinom(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4, jint p5){
	return qbinom(p1,p2,p3,p4,p5);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    dcauchy
 * Signature: (DDDI)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_dcauchy(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4){
	return dcauchy(p1,p2,p3,p4);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    pcauchy
 * Signature: (DDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_pcauchy(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4, jint p5){
	return pcauchy(p1,p2,p3,p4,p5);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    qcauchy
 * Signature: (DDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_qcauchy(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4, jint p5){
	return qcauchy(p1,p2,p3,p4,p5);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    dexp
 * Signature: (DDI)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_dexp(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jint p3){
	return dexp(p1,p2,p3);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    pexp
 * Signature: (DDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_pexp(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jint p3, jint p4){
	return pexp(p1,p2,p3,p4);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    qexp
 * Signature: (DDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_qexp(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jint p3, jint p4){
	return qexp(p1,p2,p3,p4);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    dgeom
 * Signature: (DDI)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_dgeom(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jint p3){
	return dgeom(p1,p2,p3);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    pgeom
 * Signature: (DDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_pgeom(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jint p3, jint p4){
	return pgeom(p1,p2,p3,p4);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    qgeom
 * Signature: (DDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_qgeom(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jint p3, jint p4){
	return qgeom(p1,p2,p3,p4);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    dhyper
 * Signature: (DDDDI)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_dhyper(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jdouble p4, jint p5){
	return dhyper(p1,p2,p3,p4,p5);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    phyper
 * Signature: (DDDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_phyper(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jdouble p4, jint p5, jint p6){
	return phyper(p1,p2,p3,p4,p5,p6);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    qhyper
 * Signature: (DDDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_qhyper(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jdouble p4, jint p5, jint p6){
	return qhyper(p1,p2,p3,p4,p5,p6);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    dnbinom
 * Signature: (DDDI)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_dnbinom(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4){
	return dnbinom(p1,p2,p3,p4);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    pnbinom
 * Signature: (DDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_pnbinom(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4, jint p5){
	return pnbinom(p1,p2,p3,p4,p5);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    qnbinom
 * Signature: (DDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_qnbinom(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4, jint p5){
	return qnbinom(p1,p2,p3,p4,p5);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    dpois
 * Signature: (DDI)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_dpois(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jint p3){
	return dpois(p1,p2,p3);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    ppois
 * Signature: (DDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_ppois(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jint p3, jint p4){
	return ppois(p1,p2,p3,p4);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    qpois
 * Signature: (DDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_qpois(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jint p3, jint p4){
	return qpois(p1,p2,p3,p4);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    dweibull
 * Signature: (DDDI)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_dweibull(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4){
	return dweibull(p1,p2,p3,p4);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    pweibull
 * Signature: (DDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_pweibull(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4, jint p5){
	return pweibull(p1,p2,p3,p4,p5);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    qweibull
 * Signature: (DDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_qweibull(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4, jint p5){
	return qweibull(p1,p2,p3,p4,p5);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    dlogis
 * Signature: (DDDI)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_dlogis(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4){
	return dlogis(p1,p2,p3,p4);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    plogis
 * Signature: (DDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_plogis(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4, jint p5){
	return plogis(p1,p2,p3,p4,p5);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    qlogis
 * Signature: (DDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_qlogis(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4, jint p5){
	return qlogis(p1,p2,p3,p4,p5);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    dnbeta
 * Signature: (DDDDI)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_dnbeta(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jdouble p4, jint p5){
	return dnbeta(p1,p2,p3,p4,p5);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    pnbeta
 * Signature: (DDDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_pnbeta(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jdouble p4, jint p5, jint p6){
	return pnbeta(p1,p2,p3,p4,p5,p6);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    qnbeta
 * Signature: (DDDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_qnbeta(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jdouble p4, jint p5, jint p6){
	return qnbeta(p1,p2,p3,p4,p5,p6);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    dnf
 * Signature: (DDDDI)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_dnf(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jdouble p4, jint p5){
	return dnf(p1,p2,p3,p4,p5);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    pnf
 * Signature: (DDDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_pnf(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jdouble p4, jint p5, jint p6){
	return pnf(p1,p2,p3,p4,p5,p6);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    qnf
 * Signature: (DDDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_qnf(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jdouble p4, jint p5, jint p6){
	return qnf(p1,p2,p3,p4,p5,p6);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    dnt
 * Signature: (DDDI)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_dnt(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4){
	return dnt(p1,p2,p3,p4);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    pnt
 * Signature: (DDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_pnt(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4, jint p5){
	return pnt(p1,p2,p3,p4,p5);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    qnt
 * Signature: (DDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_qnt(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4, jint p5){
	return qnt(p1,p2,p3,p4,p5);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    ptukey
 * Signature: (DDDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_ptukey(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jdouble p4, jint p5, jint p6){
	return ptukey(p1,p2,p3,p4,p5,p6);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    qtukey
 * Signature: (DDDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_qtukey(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jdouble p4, jint p5, jint p6){
	return qtukey(p1,p2,p3,p4,p5,p6);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    dwilcox
 * Signature: (DDDI)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_dwilcox(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4){
	return dwilcox(p1,p2,p3,p4);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    pwilcox
 * Signature: (DDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_pwilcox(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4, jint p5){
	return pwilcox(p1,p2,p3,p4,p5);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    qwilcox
 * Signature: (DDDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_qwilcox(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jdouble p3, jint p4, jint p5){
	return qwilcox(p1,p2,p3,p4,p5);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    dsignrank
 * Signature: (DDI)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_dsignrank(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jint p3){
	return dsignrank(p1,p2,p3);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    psignrank
 * Signature: (DDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_psignrank(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jint p3, jint p4){
	return psignrank(p1,p2,p3,p4);
}
/*
 * Class:     org_rmath_RMathNative
 * Method:    qsignrank
 * Signature: (DDII)D
 */
JNIEXPORT jdouble JNICALL Java_org_rmath_RMathNative_qsignrank(  JNIEnv * env, jobject obj, jdouble p1, jdouble p2, jint p3, jint p4){
	return qsignrank(p1,p2,p3,p4);
}
