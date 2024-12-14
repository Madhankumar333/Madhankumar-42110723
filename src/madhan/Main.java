package madhan;
	class BaseClass {
	    int baseValue;

	    BaseClass(int value) {
	        baseValue = value;
	        System.out.println("BaseClass constructor called with value: " + value);
	    }
	}

	class SubClass extends BaseClass {
	    int subValue;

	    SubClass(int baseValue, int subValue) {
	        super(baseValue); // Calling the BaseClass constructor without using 'this'
	        subValue = subValue; // You can omit 'this' here
	        System.out.println("SubClass constructor called with subValue: " + subValue);
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        SubClass obj = new SubClass(10, 20);
	        System.out.println("BaseValue: " + obj.baseValue);
	        System.out.println("SubValue: " + obj.subValue);
	    }
	}
