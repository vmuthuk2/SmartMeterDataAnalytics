package ca.uwaterloo.iss4e;

import org.apache.hadoop.util.ProgramDriver;

import ca.uwaterloo.iss4e.clustering.KSCClustering;
import ca.uwaterloo.iss4e.clustering.PrepareDataPoints;
import ca.uwaterloo.iss4e.datagen.DataGenerator;
import ca.uwaterloo.iss4e.datagen.DataPreparator;

/**
 * Created by xiuli on 2/29/16.
 */
public class Driver {
    public static void main(String argv[]) {
        int exitCode = -1;
        ProgramDriver pgd = new ProgramDriver();
        try {
            pgd.addClass("DataPreparator", DataPreparator.class,  "Prepare the parameters for data generator");
            pgd.addClass("DataGenerator",  DataGenerator.class,  "Generate synthetic data set");
            pgd.addClass("KSCClustering",  KSCClustering.class,  "Clustering");
            pgd.addClass("PrepareDataPoints",  PrepareDataPoints.class,  "Prepare points for clustering");
            exitCode = pgd.run(argv);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.exit(exitCode);
    }
}
