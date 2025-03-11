class Double_data_tp{
	public static void main(String[] args){
		double temperature = 98.6;
        double speed = 55.8;
        double altitude = 30000.75;
        double accuracy = 99.99;
        double percentage = 87.5;

        System.out.println("First initialization values (double):");
        System.out.println(temperature);
        System.out.println(speed);
        System.out.println(altitude);
        System.out.println(accuracy);
        System.out.println(percentage);

        double heat = temperature;
        double velocity = speed;
        double height = altitude;
        double precision = accuracy;
        double ratio = percentage;

        System.out.println("Re-initialization values (double):");
        System.out.println(heat);
        System.out.println(velocity);
        System.out.println(height);
        System.out.println(precision);
        System.out.println(ratio);
	}
}