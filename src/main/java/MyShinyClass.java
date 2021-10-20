public class MyShinyClass {

    public int compute(){
        String envValue = System.getenv("IS_RUNNING_IN_CI");
        Boolean isRunningInCI = Boolean.parseBoolean(envValue);

        if(isRunningInCI){
            throw new RuntimeException("Running in CI hence must fail.");
        } else {
            System.out.println("Completed Successfully");
            return 0;
        }
    }

}
