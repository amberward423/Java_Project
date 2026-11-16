public class Clock {

        private static Clock instance;
        private long currentTime;


         private Clock() {
        }

        public static Clock getInstance() {
            if (instance == null) {
                instance = new Clock();
            }
            return instance;
        }
        public void setTime(long newTime){
            currentTime = newTime;
        }

        public long getTime(){
            return currentTime;
        }
    }

