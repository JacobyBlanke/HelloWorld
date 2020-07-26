class HelloWorld {
    public static void main(String[] args) {
    	int[] array = new int[334888956];
    	int place = 0;
    	for (int i = 0; i < 8; i++) {
		array[place]++;
	}
	while (array[place] != 0) {
		place++;
		for (int i = 0; i < 4; i++) {
			array[place]++;
		}
		while (array[place] != 0) {
			place++;
			for (int i = 0; i < 2; i++) {
				array[place]++;
			}
			place++;
			for (int i = 0; i < 3; i++) {
                                array[place]++;
                        }
			place++;
			for (int i = 0; i < 3; i++) {
                                array[place]++;
                        }
			place++;
			array[place]++;
			for (int i = 0; i < 4; i++) {
                                place--;
                        }
			array[place]--;
		}
		place++;
		array[place]++;
		place++;
		array[place]++;
		place++;
		array[place]--;
		for (int i = 0; i < 2; i++) {
                	place++;
                }
		array[place]++;
		while (array[place] != 0) {
			place--;
		}
		place--;
		array[place]--;
	}

	for (int i = 0; i < 2; i++) {
		place++;
	}
	System.out.print(Character.toString((char) array[place]));
	place++;
	for (int i = 0; i < 3; i++) {
		array[place]--;
	}
	System.out.print(Character.toString((char) array[place]));
	for (int i = 0; i < 7; i++) {
                array[place]++;
        }
	for (int i = 0; i < 2; i++) {
                System.out.print(Character.toString((char) array[place]));
        }
	for (int i = 0; i < 3; i++) {
                array[place]++;
        }
	System.out.print(Character.toString((char) array[place]));
	for (int i = 0; i < 2; i++) {
                place++;
        }
	System.out.print(Character.toString((char) array[place]));
	place--;
	array[place]--;
	System.out.print(Character.toString((char) array[place]));
	place--;
	System.out.print(Character.toString((char) array[place]));
	for (int i = 0; i < 3; i++) {
                array[place]++;
        }
	System.out.print(Character.toString((char) array[place]));
    	for (int i = 0; i < 6; i++) {
                array[place]--;
        }
	System.out.print(Character.toString((char) array[place]));
	for (int i = 0; i < 8; i++) {
                array[place]--;
        }
	System.out.print(Character.toString((char) array[place]));
	for (int i = 0; i < 2; i++) {
		place++;
	}
	array[place]++;
	System.out.print(Character.toString((char) array[place]));
	place++;
	for (int i = 0; i < 2; i++) {
                array[place]++;
        }
	System.out.print(Character.toString((char) array[place]));
    }
}
