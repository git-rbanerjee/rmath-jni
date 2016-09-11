package org.rmath;

/**
 * 
 * @author Rabin Banerjee
 *
 */
public class RMathNative {

	/* Normal Distribution */
	public native double dnorm4(double x, double mu, double sigma, int lg);

	public native double pnorm5(double x, double mu, double sigma, int lt, int lg);

	public native double qnorm5(double p, double mu, double sigma, int lt, int lg);

	// double rnorm(double mu, double sigma);

	/* Uniform Distribution */
	public native double dunif(double x, double a, double b, int lg);

	public native double punif(double x, double a, double b, int lt, int lg);

	public native double qunif(double p, double a, double b, int lt, int lg);

	// double runif(double a, double b);

	/* Gamma Distribution */
	public native double dgamma(double x, double shp, double scl, int lg);

	public native double pgamma(double x, double alp, double scl, int lt, int lg);

	public native double qgamma(double p, double alp, double scl, int lt, int lg);

	// double rgamma(double a, double scl);

	/* Beta Distribution */
	public native double dbeta(double x, double a, double b, int lg);

	public native double pbeta(double x, double p, double q, int lt, int lg);

	public native double qbeta(double a, double p, double q, int lt, int lg);

	// double rbeta(double a, double b);

	/* Lognormal Distribution */
	public native double dlnorm(double x, double ml, double sl, int lg);

	public native double plnorm(double x, double ml, double sl, int lt, int lg);

	public native double qlnorm(double p, double ml, double sl, int lt, int lg);

	// double rlnorm(double ml, double sl);

	/* Chi-squared Distribution */
	public native double dchisq(double x, double df, int lg);

	public native double pchisq(double x, double df, int lt, int lg);

	public native double qchisq(double p, double df, int lt, int lg);

	// double rchisq(double df);

	/* Non-central Chi-squared Distribution */
	public native double dnchisq(double x, double df, double ncp, int lg);

	public native double pnchisq(double x, double df, double ncp, int lt, int lg);

	public native double qnchisq(double p, double df, double ncp, int lt, int lg);

	// double rnchisq(double df, double lb);

	/* F Distibution */
	public native double df(double x, double df1, double df2, int lg);

	public native double pf(double x, double df1, double df2, int lt, int lg);

	public native double qf(double p, double df1, double df2, int lt, int lg);

	// double rf(double df1, double df2);

	/* Student t Distibution */
	public native double dt(double x, double n, int lg);

	public native double pt(double x, double n, int lt, int lg);

	public native double qt(double p, double n, int lt, int lg);

	// double rt(double n);

	/* Binomial Distribution */
	public native double dbinom(double x, double n, double p, int lg);

	public native double pbinom(double x, double n, double p, int lt, int lg);

	public native double qbinom(double p, double n, double m, int lt, int lg);

	// double rbinom(double n, double p);

	/* Multnomial Distribution */
	// void rmultinom(int n, double* prob, int k, int* rn);

	/* Cauchy Distribution */
	public native double dcauchy(double x, double lc, double sl, int lg);

	public native double pcauchy(double x, double lc, double sl, int lt, int lg);

	public native double qcauchy(double p, double lc, double sl, int lt, int lg);

	// double rcauchy(double lc, double sl);

	/* Exponential Distribution */
	public native double dexp(double x, double sl, int lg);

	public native double pexp(double x, double sl, int lt, int lg);

	public native double qexp(double p, double sl, int lt, int lg);

	// double rexp(double sl);

	/* Geometric Distribution */
	public native double dgeom(double x, double p, int lg);

	public native double pgeom(double x, double p, int lt, int lg);

	public native double qgeom(double p, double pb, int lt, int lg);

	// double rgeom(double p);

	/* Hypergeometric Distibution */
	public native double dhyper(double x, double r, double b, double n, int lg);

	public native double phyper(double x, double r, double b, double n, int lt, int lg);

	public native double qhyper(double p, double r, double b, double n, int lt, int lg);

	// double rhyper(double r, double b, double n);

	/* Negative Binomial Distribution */
	public native double dnbinom(double x, double sz, double pb, int lg);

	public native double pnbinom(double x, double sz, double pb, int lt, int lg);

	public native double qnbinom(double p, double sz, double pb, int lt, int lg);

	// double rnbinom(double sz, double pb);

	/* Poisson Distribution */
	public native double dpois(double x, double lb, int lg);

	public native double ppois(double x, double lb, int lt, int lg);

	public native double qpois(double p, double lb, int lt, int lg);

	// double rpois(double mu);

	/* Weibull Distribution */
	public native double dweibull(double x, double sh, double sl, int lg);

	public native double pweibull(double x, double sh, double sl, int lt, int lg);

	public native double qweibull(double p, double sh, double sl, int lt, int lg);

	// double rweibull(double sh, double sl);

	/* Logistic Distribution */
	public native double dlogis(double x, double lc, double sl, int lg);

	public native double plogis(double x, double lc, double sl, int lt, int lg);

	public native double qlogis(double p, double lc, double sl, int lt, int lg);

	// double rlogis(double lc, double sl);

	/* Non-central Beta Distribution */
	public native double dnbeta(double x, double a, double b, double ncp, int lg);

	public native double pnbeta(double x, double a, double b, double ncp, int lt, int lg);

	public native double qnbeta(double p, double a, double b, double ncp, int lt, int lg);

	// double rnbeta(double a, double b, double np);

	/* Non-central F Distribution */
	public native double dnf(double x, double df1, double df2, double ncp, int lg);

	public native double pnf(double x, double df1, double df2, double ncp, int lt, int lg);

	public native double qnf(double p, double df1, double df2, double ncp, int lt, int lg);

	/* Non-central Student t Distribution */
	public native double dnt(double x, double df, double ncp, int lg);

	public native double pnt(double x, double df, double ncp, int lt, int lg);

	public native double qnt(double p, double df, double ncp, int lt, int lg);

	/* Studentized Range Distribution */
	public native double ptukey(double q, double rr, double cc, double df, int lt, int lg);

	public native double qtukey(double p, double rr, double cc, double df, int lt, int lg);

	/* Wilcoxon Rank Sum Distribution */
	public native double dwilcox(double x, double m, double n, int lg);

	public native double pwilcox(double q, double m, double n, int lt, int lg);

	public native double qwilcox(double x, double m, double n, int lt, int lg);

	// double rwilcox(double m, double n);

	/* Wilcoxon Signed Rank Distribution */
	public native double dsignrank(double x, double n, int lg);

	public native double psignrank(double x, double n, int lt, int lg);

	public native double qsignrank(double x, double n, int lt, int lg);

}
