public class Transition
{
        /**
         begin - the initial state in transition
         end - the final state in transition
        */
        private String value;
        private String begin;
        private String destination;

        public Transition(String value, String begin, String destination)
        {
            this.value = value;
            this.begin = begin;
            this.destination = destination;
        }

        public String getValue() {
             return value;
        }

        public void setValue(String value) {
            this.value = value;
         }

        public String getBegin() {
            return begin;
        }

        public void setBegin(String begin) {
            this.begin = begin;
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        @Override
        public String toString() {
            return "Transition{" +
                "value='" + value + '\'' +
                ", begin='" + begin + '\'' +
                ", destination='" + destination + '\'' +
                '}';
        }
}
