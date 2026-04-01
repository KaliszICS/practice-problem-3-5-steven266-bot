public class PracticeProblem {

	public static void main(String args[]) {



	}

	
	public static String getFirstName(String fullName) {
    if (fullName == null || fullName.trim().isEmpty()) {
        return "";
    }

    fullName = fullName.trim();
    int spaceIndex = fullName.indexOf(" ");

    if (spaceIndex == -1) {
        return fullName; 
    }

    return fullName.substring(0, spaceIndex);
			
		
	}

	public static String getLastName(String fullName) {
    if (fullName == null || fullName.trim().isEmpty()) {
        return "";
    }

    String[] names = fullName.trim().split("\\s+");
    return names[names.length - 1];
	}

	public static boolean isValidName(String name) {
    if (name == null) {
        return false;
    }

    String[] parts = name.trim().split("\\s+");


    if (parts.length != 2) {
        return false;
    }

    return parts[0].length() >= 2 && parts[1].length() >= 2;
	}

	

}
