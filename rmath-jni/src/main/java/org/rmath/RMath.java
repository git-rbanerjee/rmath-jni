package org.rmath;

/**
 * 
 * @author Rabin Banerjee
 *
 */
public class RMath {
	private static RMathNative impl;
	
	static {
        try {
            impl = RMathLoader.load();
        }
        catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }
	
	
	/* Normal Distribution */
    public static double dnorm(double x, double mu, double sigma, boolean lg) {
        return impl.dnorm4(x, mu, sigma, lg ? 1 : 0);
    }
    public static double dnorm(double x, double mu, double sigma) {
        return impl.dnorm4(x, mu, sigma, 0);
    }
    public static double pnorm(double x, double mu, double sigma, boolean lt, boolean lg) {
        return impl.pnorm5(x, mu, sigma, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pnorm(double x, double mu, double sigma) {
        return impl.pnorm5(x, mu, sigma, 1, 0);
    }
    public static double qnorm(double p, double mu, double sigma, boolean lt, boolean lg) {
        return impl.qnorm5(p, mu, sigma, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qnorm(double p, double mu, double sigma) {
        return impl.qnorm5(p, mu, sigma, 1, 0);
    }



    /* Uniform Distribution */
    public static double dunif(double x, double a, double b, boolean lg) {
        return impl.dunif(x, a, b, lg ? 1 : 0);
    }
    public static double dunif(double x, double a, double b) {
        return impl.dunif(x, a, b, 0);
    }
    public static double punif(double x, double a, double b, boolean lt, boolean lg) {
        return impl.punif(x, a, b, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double punif(double x, double a, double b) {
        return impl.punif(x, a, b, 1, 0);
    }
    public static double qunif(double p, double a, double b, boolean lt, boolean lg) {
        return impl.qunif(p, a, b, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qunif(double p, double a, double b) {
        return impl.qunif(p, a, b, 1, 0);
    }



    /* Gamma Distribution */
    public static double dgamma(double x, double shp, double scl, boolean lg) {
        return impl.dgamma(x, shp, scl, lg ? 1 : 0);
    }
    public static double dgamma(double x, double shp, double scl) {
        return impl.dgamma(x, shp, scl, 0);
    }
    public static double pgamma(double x, double alp, double scl, boolean lt, boolean lg) {
        return impl.pgamma(x, alp, scl, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pgamma(double x, double alp, double scl) {
        return impl.pgamma(x, alp, scl, 1, 0);
    }
    public static double qgamma(double p, double alp, double scl, boolean lt, boolean lg) {
        return impl.qgamma(p, alp, scl, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qgamma(double p, double alp, double scl) {
        return impl.qgamma(p, alp, scl, 1, 0);
    }



    /* Beta Distribution */
    public static double dbeta(double x, double a, double b, boolean lg) {
        return impl.dbeta(x, a, b, lg ? 1 : 0);
    }
    public static double dbeta(double x, double a, double b) {
        return impl.dbeta(x, a, b, 0);
    }
    public static double pbeta(double x, double p, double q, boolean lt, boolean lg) {
        return impl.pbeta(x, p, q, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pbeta(double x, double p, double q) {
        return impl.pbeta(x, p, q, 1, 0);
    }
    public static double qbeta(double a, double p, double q, boolean lt, boolean lg) {
        return impl.qbeta(a, p, q, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qbeta(double a, double p, double q) {
        return impl.qbeta(a, p, q, 1, 0);
    }



    /* Lognormal Distribution */
    public static double dlnorm(double x, double ml, double sl, boolean lg) {
        return impl.dlnorm(x, ml, sl, lg ? 1 : 0);
    }
    public static double dlnorm(double x, double ml, double sl) {
        return impl.dlnorm(x, ml, sl, 0);
    }
    public static double plnorm(double x, double ml, double sl, boolean lt, boolean lg) {
        return impl.plnorm(x, ml, sl, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double plnorm(double x, double ml, double sl) {
        return impl.plnorm(x, ml, sl, 1, 0);
    }
    public static double qlnorm(double p, double ml, double sl, boolean lt, boolean lg) {
        return impl.qlnorm(p, ml, sl, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qlnorm(double p, double ml, double sl) {
        return impl.qlnorm(p, ml, sl, 1, 0);
    }



    /* Chi-squared Distribution */
    public static double dchisq(double x, double df, boolean lg) {
        return impl.dchisq(x, df, lg ? 1 : 0);
    }
    public static double dchisq(double x, double df) {
        return impl.dchisq(x, df, 0);
    }
    public static double pchisq(double x, double df, boolean lt, boolean lg) {
        return impl.pchisq(x, df, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pchisq(double x, double df) {
        return impl.pchisq(x, df, 1, 0);
    }
    public static double qchisq(double p, double df, boolean lt, boolean lg) {
        return impl.qchisq(p, df, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qchisq(double p, double df) {
        return impl.qchisq(p, df, 1, 0);
    }



    /* Non-central Chi-squared Distribution */
    public static double dnchisq(double x, double df, double ncp, boolean lg) {
        return impl.dnchisq(x, df, ncp, lg ? 1 : 0);
    }
    public static double dnchisq(double x, double df, double ncp) {
        return impl.dnchisq(x, df, ncp, 0);
    }
    public static double pnchisq(double x, double df, double ncp, boolean lt, boolean lg) {
        return impl.pnchisq(x, df, ncp, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pnchisq(double x, double df, double ncp) {
        return impl.pnchisq(x, df, ncp, 1, 0);
    }
    public static double qnchisq(double p, double df, double ncp, boolean lt, boolean lg) {
        return impl.qnchisq(p, df, ncp, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qnchisq(double p, double df, double ncp) {
        return impl.qnchisq(p, df, ncp, 1, 0);
    }



    /* F Distibution */
    public static double df(double x, double df1, double df2, boolean lg) {
        return impl.df(x, df1, df2, lg ? 1 : 0);
    }
    public static double df(double x, double df1, double df2) {
        return impl.df(x, df1, df2, 0);
    }
    public static double pf(double x, double df1, double df2, boolean lt, boolean lg) {
        return impl.pf(x, df1, df2, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pf(double x, double df1, double df2) {
        return impl.pf(x, df1, df2, 1, 0);
    }
    public static double qf(double p, double df1, double df2, boolean lt, boolean lg) {
        return impl.qf(p, df1, df2, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qf(double p, double df1, double df2) {
        return impl.qf(p, df1, df2, 1, 0);
    }



    /* Student t Distibution */
    public static double dt(double x, double n, boolean lg) {
        return impl.dt(x, n, lg ? 1 : 0);
    }
    public static double dt(double x, double n) {
        return impl.dt(x, n, 0);
    }
    public static double pt(double x, double n, boolean lt, boolean lg) {
        return impl.pt(x, n, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pt(double x, double n) {
        return impl.pt(x, n, 1, 0);
    }
    public static double qt(double p, double n, boolean lt, boolean lg) {
        return impl.qt(p, n, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qt(double p, double n) {
        return impl.qt(p, n, 1, 0);
    }



    /* Binomial Distribution */
    public static double dbinom(double x, double n, double p, boolean lg) {
        return impl.dbinom(x, n, p, lg ? 1 : 0);
    }
    public static double dbinom(double x, double n, double p) {
        return impl.dbinom(x, n, p, 0);
    }
    public static double pbinom(double x, double n, double p, boolean lt, boolean lg) {
        return impl.pbinom(x, n, p, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pbinom(double x, double n, double p) {
        return impl.pbinom(x, n, p, 1, 0);
    }
    public static double qbinom(double p, double n, double m, boolean lt, boolean lg) {
        return impl.qbinom(p, n, m, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qbinom(double p, double n, double m) {
        return impl.qbinom(p, n, m, 1, 0);
    }



    /* Cauchy Distribution */
    public static double dcauchy(double x, double lc, double sl, boolean lg) {
        return impl.dcauchy(x, lc, sl, lg ? 1 : 0);
    }
    public static double dcauchy(double x, double lc, double sl) {
        return impl.dcauchy(x, lc, sl, 0);
    }
    public static double pcauchy(double x, double lc, double sl, boolean lt, boolean lg) {
        return impl.pcauchy(x, lc, sl, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pcauchy(double x, double lc, double sl) {
        return impl.pcauchy(x, lc, sl, 1, 0);
    }
    public static double qcauchy(double p, double lc, double sl, boolean lt, boolean lg) {
        return impl.qcauchy(p, lc, sl, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qcauchy(double p, double lc, double sl) {
        return impl.qcauchy(p, lc, sl, 1, 0);
    }



    /* Exponential Distribution */
    public static double dexp(double x, double sl, boolean lg) {
        return impl.dexp(x, sl, lg ? 1 : 0);
    }
    public static double dexp(double x, double sl) {
        return impl.dexp(x, sl, 0);
    }
    public static double pexp(double x, double sl, boolean lt, boolean lg) {
        return impl.pexp(x, sl, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pexp(double x, double sl) {
        return impl.pexp(x, sl, 1, 0);
    }
    public static double qexp(double p, double sl, boolean lt, boolean lg) {
        return impl.qexp(p, sl, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qexp(double p, double sl) {
        return impl.qexp(p, sl, 1, 0);
    }



    /* Geometric Distribution */
    public static double dgeom(double x, double p, boolean lg) {
        return impl.dgeom(x, p, lg ? 1 : 0);
    }
    public static double dgeom(double x, double p) {
        return impl.dgeom(x, p, 0);
    }
    public static double pgeom(double x, double p, boolean lt, boolean lg) {
        return impl.pgeom(x, p, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pgeom(double x, double p) {
        return impl.pgeom(x, p, 1, 0);
    }
    public static double qgeom(double p, double pb, boolean lt, boolean lg) {
        return impl.qgeom(p, pb, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qgeom(double p, double pb) {
        return impl.qgeom(p, pb, 1, 0);
    }



    /* Hypergeometric Distibution */
    public static double dhyper(double x, double r, double b, double n, boolean lg) {
        return impl.dhyper(x, r, b, n, lg ? 1 : 0);
    }
    public static double dhyper(double x, double r, double b, double n) {
        return impl.dhyper(x, r, b, n, 0);
    }
    public static double phyper(double x, double r, double b, double n, boolean lt, boolean lg) {
        return impl.phyper(x, r, b, n, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double phyper(double x, double r, double b, double n) {
        return impl.phyper(x, r, b, n, 1, 0);
    }
    public static double qhyper(double p, double r, double b, double n, boolean lt, boolean lg) {
        return impl.qhyper(p, r, b, n, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qhyper(double p, double r, double b, double n) {
        return impl.qhyper(p, r, b, n, 1, 0);
    }



    /* Negative Binomial Distribution */
    public static double dnbinom(double x, double sz, double pb, boolean lg) {
        return impl.dnbinom(x, sz, pb, lg ? 1 : 0);
    }
    public static double dnbinom(double x, double sz, double pb) {
        return impl.dnbinom(x, sz, pb, 0);
    }
    public static double pnbinom(double x, double sz, double pb, boolean lt, boolean lg) {
        return impl.pnbinom(x, sz, pb, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pnbinom(double x, double sz, double pb) {
        return impl.pnbinom(x, sz, pb, 1, 0);
    }
    public static double qnbinom(double p, double sz, double pb, boolean lt, boolean lg) {
        return impl.qnbinom(p, sz, pb, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qnbinom(double p, double sz, double pb) {
        return impl.qnbinom(p, sz, pb, 1, 0);
    }



    /* Poisson Distribution */
    public static double dpois(double x, double lb, boolean lg) {
        return impl.dpois(x, lb, lg ? 1 : 0);
    }
    public static double dpois(double x, double lb) {
        return impl.dpois(x, lb, 0);
    }
    public static double ppois(double x, double lb, boolean lt, boolean lg) {
        return impl.ppois(x, lb, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double ppois(double x, double lb) {
        return impl.ppois(x, lb, 1, 0);
    }
    public static double qpois(double p, double lb, boolean lt, boolean lg) {
        return impl.qpois(p, lb, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qpois(double p, double lb) {
        return impl.qpois(p, lb, 1, 0);
    }



    /* Weibull Distribution */
    public static double dweibull(double x, double sh, double sl, boolean lg) {
        return impl.dweibull(x, sh, sl, lg ? 1 : 0);
    }
    public static double dweibull(double x, double sh, double sl) {
        return impl.dweibull(x, sh, sl, 0);
    }
    public static double pweibull(double x, double sh, double sl, boolean lt, boolean lg) {
        return impl.pweibull(x, sh, sl, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pweibull(double x, double sh, double sl) {
        return impl.pweibull(x, sh, sl, 1, 0);
    }
    public static double qweibull(double p, double sh, double sl, boolean lt, boolean lg) {
        return impl.qweibull(p, sh, sl, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qweibull(double p, double sh, double sl) {
        return impl.qweibull(p, sh, sl, 1, 0);
    }



    /* Logistic Distribution */
    public static double dlogis(double x, double lc, double sl, boolean lg) {
        return impl.dlogis(x, lc, sl, lg ? 1 : 0);
    }
    public static double dlogis(double x, double lc, double sl) {
        return impl.dlogis(x, lc, sl, 0);
    }
    public static double plogis(double x, double lc, double sl, boolean lt, boolean lg) {
        return impl.plogis(x, lc, sl, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double plogis(double x, double lc, double sl) {
        return impl.plogis(x, lc, sl, 1, 0);
    }
    public static double qlogis(double p, double lc, double sl, boolean lt, boolean lg) {
        return impl.qlogis(p, lc, sl, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qlogis(double p, double lc, double sl) {
        return impl.qlogis(p, lc, sl, 1, 0);
    }



    /* Non-central Beta Distribution */
    public static double dnbeta(double x, double a, double b, double ncp, boolean lg) {
        return impl.dnbeta(x, a, b, ncp, lg ? 1 : 0);
    }
    public static double dnbeta(double x, double a, double b, double ncp) {
        return impl.dnbeta(x, a, b, ncp, 0);
    }
    public static double pnbeta(double x, double a, double b, double ncp, boolean lt, boolean lg) {
        return impl.pnbeta(x, a, b, ncp, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pnbeta(double x, double a, double b, double ncp) {
        return impl.pnbeta(x, a, b, ncp, 1, 0);
    }
    public static double qnbeta(double p, double a, double b, double ncp, boolean lt, boolean lg) {
        return impl.qnbeta(p, a, b, ncp, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qnbeta(double p, double a, double b, double ncp) {
        return impl.qnbeta(p, a, b, ncp, 1, 0);
    }



    /* Non-central F Distribution */
    public static double dnf(double x, double df1, double df2, double ncp, boolean lg) {
        return impl.dnf(x, df1, df2, ncp, lg ? 1 : 0);
    }
    public static double dnf(double x, double df1, double df2, double ncp) {
        return impl.dnf(x, df1, df2, ncp, 0);
    }
    public static double pnf(double x, double df1, double df2, double ncp, boolean lt, boolean lg) {
        return impl.pnf(x, df1, df2, ncp, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pnf(double x, double df1, double df2, double ncp) {
        return impl.pnf(x, df1, df2, ncp, 1, 0);
    }
    public static double qnf(double p, double df1, double df2, double ncp, boolean lt, boolean lg) {
        return impl.qnf(p, df1, df2, ncp, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qnf(double p, double df1, double df2, double ncp) {
        return impl.qnf(p, df1, df2, ncp, 1, 0);
    }



    /* Non-central Student t Distribution */
    public static double dnt(double x, double df, double ncp, boolean lg) {
        return impl.dnt(x, df, ncp, lg ? 1 : 0);
    }
    public static double dnt(double x, double df, double ncp) {
        return impl.dnt(x, df, ncp, 0);
    }
    public static double pnt(double x, double df, double ncp, boolean lt, boolean lg) {
        return impl.pnt(x, df, ncp, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pnt(double x, double df, double ncp) {
        return impl.pnt(x, df, ncp, 1, 0);
    }
    public static double qnt(double p, double df, double ncp, boolean lt, boolean lg) {
        return impl.qnt(p, df, ncp, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qnt(double p, double df, double ncp) {
        return impl.qnt(p, df, ncp, 1, 0);
    }



    /* Studentized Range Distribution */
    public static double ptukey(double q, double rr, double cc, double df, boolean lt, boolean lg) {
        return impl.ptukey(q, rr, cc, df, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double ptukey(double q, double rr, double cc, double df) {
        return impl.ptukey(q, rr, cc, df, 1, 0);
    }
    public static double qtukey(double p, double rr, double cc, double df, boolean lt, boolean lg) {
        return impl.qtukey(p, rr, cc, df, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qtukey(double p, double rr, double cc, double df) {
        return impl.qtukey(p, rr, cc, df, 1, 0);
    }



    /* Wilcoxon Rank Sum Distribution */
    public static double dwilcox(double x, double m, double n, boolean lg) {
        return impl.dwilcox(x, m, n, lg ? 1 : 0);
    }
    public static double dwilcox(double x, double m, double n) {
        return impl.dwilcox(x, m, n, 0);
    }
    public static double pwilcox(double q, double m, double n, boolean lt, boolean lg) {
        return impl.pwilcox(q, m, n, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pwilcox(double q, double m, double n) {
        return impl.pwilcox(q, m, n, 1, 0);
    }
    public static double qwilcox(double x, double m, double n, boolean lt, boolean lg) {
        return impl.qwilcox(x, m, n, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qwilcox(double x, double m, double n) {
        return impl.qwilcox(x, m, n, 1, 0);
    }



    /* Wilcoxon Signed Rank Distribution */
    public static double dsignrank(double x, double n, boolean lg) {
        return impl.dsignrank(x, n, lg ? 1 : 0);
    }
    public static double dsignrank(double x, double n) {
        return impl.dsignrank(x, n, 0);
    }
    public static double psignrank(double x, double n, boolean lt, boolean lg) {
        return impl.psignrank(x, n, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double psignrank(double x, double n) {
        return impl.psignrank(x, n, 1, 0);
    }
    public static double qsignrank(double x, double n, boolean lt, boolean lg) {
        return impl.qsignrank(x, n, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qsignrank(double x, double n) {
        return impl.qsignrank(x, n, 1, 0);
    }
	
	public static void main(String[] args)
	{
		double result = RMath.ppois(19,33322.0 * 0.000692144915267599 / 1000000,false,false);
		System.out.println(result);
	}

}
