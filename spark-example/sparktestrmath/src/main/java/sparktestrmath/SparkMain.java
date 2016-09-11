package sparktestrmath;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.spark.SparkConf;
import org.apache.spark.SparkEnv;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function;
import org.rmath.RMath;
/**
 * spark-submit --driver-class-path rmath-jni-2.0.0.jar --jars rmath-jni-2.0.0.jar --num-executors 5  --master yarn-client --class sparktestrmath.SparkMain sparktestrmath-0.0.1-jar-with-dependencies.jar
 * spark-submit --driver-class-path rmath-jni-2.0.0.jar  --jars rmath-jni-2.0.0.jar --num-executors 5  --master yarn-cluster --class sparktestrmath.SparkMain sparktestrmath-0.0.1-jar-with-dependencies.jar
 * @author Rabin Banerjee
 *
 */
public class SparkMain {
	
	private static final Logger LOG = LogManager.getLogger(SparkMain.class); 
	
	public static void main(String[] args)
	{
		SparkConf sc = new SparkConf().setAppName("Testing Rmath");
		

		JavaSparkContext jsc = new JavaSparkContext(sc);
		
		
		LOG.info("\n\n Executing in Driver :: "+RMath.ppois(19,33322.0 * 0.000692144915267599 / 1000000,false,false) +"\n\n");
		
		List<Integer> li = new ArrayList<Integer>();
		
		for(int i=1;i<50;i++)
		{
			li.add(i);
		}
		
		JavaRDD<Integer> dat= jsc.parallelize(li,20);
		
		@SuppressWarnings("serial")
		JavaRDD<String> res=dat.map( new Function<Integer, String>() {

			public String call(Integer arg0) throws Exception {
				
				return "Executing in Executor "+SparkEnv.get().executorId()+" for inp "+ arg0+" :: "+RMath.ppois(arg0,33322.0 * 0.000692144915267599 / 1000000,false,false)+"";
			}
		});
		
		for(String st:res.collect())
		{
			LOG.info(st);
		}
		jsc.close();
		
	}

}
