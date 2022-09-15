package Assignment8;

public class ThreadFunctionDemo {

	public static void main(String[] args) {

		final ThreadFunctions thread = new ThreadFunctions();

		new Thread(new Runnable() {
			@Override
			public void run() {
				while (thread.getCounter() < 10) {
					thread.changeNumber(true);
					Thread.currentThread().setName("Srushti");
					System.out.println(
							"Thread: " + Thread.currentThread().getName() + " " + " counter: " + thread.getCounter());
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		;

		new Thread(new Runnable() {
			@Override
			public void run() {
				while (thread.getCounter() > -10) {
					Thread.currentThread().setName("Vedanti");
					thread.changeNumber(false);
					System.out.println(
							"Thread: " + Thread.currentThread().getName() + " counter: " + thread.getCounter());
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
			}
		}).start();
	}
}
