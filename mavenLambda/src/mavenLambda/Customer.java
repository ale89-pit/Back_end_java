package mavenLambda;

public class Customer {
		private static long id = 0;
		private String name;
		private int tier;
		public Customer(String name, int tier) {
			super();
			id++;
			this.name = name;
			this.tier = tier;
		}
		public long getId() {
			return id;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getTier() {
			return tier;
		}
		public void setTier(int tier) {
			this.tier = tier;
		}
		@Override
		public String toString() {
			return "Customer [name=" + name + ", tier=" + tier + "]";
		}
		
		
}
