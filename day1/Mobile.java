package week1.day1;

public class Mobile {

	public void sendSMS() {
		System.out.println("SendSMS");
	}
	protected void AllowVoiceCall() {
		System.out.println("Allow Voice Call");

	}
	private void takeVideo() {
		System.out.println("Take Video");
	}
		public static void main(String[] args) {
			
		Mobile function = new Mobile();
		function.sendSMS();
		function.AllowVoiceCall();
		function.takeVideo();
		}
}
