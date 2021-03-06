package rada;

public class SolverParameters {
  public String solverName = ""; 
  public String filePath = null; 
  public boolean showTempFiles = false; 
  public int timeout = -1;
  public int maxDepth = -1; 
  public int verbose = 0;
  public int threadPoolSize = 5;
	  
  public SolverParameters() {}
	  
  public void printIfVerbose(int level, String string) {
    if (verbose >= level) {
      System.out.println(string);
    }
  }
}; 
