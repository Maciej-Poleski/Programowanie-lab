package laboratorium04.zadanie4p;

public class Relation {
	private boolean[][] data;

	public Relation(int n) {
		data = new boolean[n][n];
	}

	public void addPair(int a, int b) {
		data[a - 1][b - 1] = true;
	}

	public boolean isReflective() {
		for (int i = 0; i < data.length; ++i)
			if (data[i][i] == false)
				return false;
		return true;
	}

	public boolean isSymetric() {
		for (int i = 0; i < data.length; ++i) {
			for (int j = 0; j < data.length; ++j) {
				if (data[i][j] != data[j][i])
					return false;
			}
		}
		return true;
	}

	public boolean isTransitive() {
		for (int a = 0; a < data.length; ++a) {
			for (int b = 0; b < data.length; ++b) {
				for (int c = 0; c < data.length; ++c) {
					if (data[a][b] && data[b][c] && !data[a][c])
						return false;
				}
			}
		}
		return true;
	}

	public boolean isEquivalence() {
		return isReflective() && isSymetric() && isTransitive();
	}

	public static Relation add(Relation relA, Relation relB) {
		int n = Math.max(relA.data.length, relB.data.length);
		Relation result = new Relation(n);
		for (int a = 0; a < n; ++a)
			for (int b = 0; b < n; ++b) {
				if (a < relA.data.length && b < relA.data.length)
					result.data[a][b] |= relA.data[a][b];
				if (a < relB.data.length && b < relB.data.length)
					result.data[a][b] |= relB.data[a][b];
			}
		return result;
	}

	public static Relation sub(Relation relA, Relation relB) {
		int n = relA.data.length;
		Relation result = new Relation(n);
		for (int a = 0; a < n; ++a)
			for (int b = 0; b < n; ++b) {
				if (a < relB.data.length && b < relB.data.length)
					result.data[a][b] = (relA.data[a][b] && !relB.data[a][b]);
				else
					result.data[a][b] = relA.data[a][b];
			}
		return result;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("{");
		for (int a = 0; a < data.length; ++a) {
			for (int b = 0; b < data.length; ++b) {
				if (data[a][b])
					result.append("(" + (a + 1) + "," + (b + 1) + "),");
			}
		}
		result.replace(result.length() - 1, result.length(), "}");
		return result.toString();
	}

	public Relation closure() {
		Relation result = add(this, new Relation(data.length));
		for (int a = 0; a < data.length; ++a) {
			for (int b = 0; b < data.length; ++b) {
				for (int c = 0; c < data.length; ++c) {
					result.data[a][c] |= (data[a][b] && data[b][c]);
				}
			}
		}
		return result;
	}

	public static Relation compose(Relation relA, Relation relB) {
		int n = Math.max(relA.data.length, relB.data.length);
		int m = Math.min(relA.data.length, relB.data.length);
		Relation result = new Relation(n);
		for (int a = 0; a < relA.data.length; ++a) {
			for (int b = 0; b < m; ++b) {
				for (int c = 0; c < relB.data.length; ++c) {
					result.data[a][c] |= relA.data[a][b] && relB.data[b][c];
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Relation relA = new Relation(2);
		Relation relB = new Relation(3);
		relA.addPair(1, 1);
		relA.addPair(2, 2);
		System.out.println(relA.toString());
		relB.addPair(1, 2);
		relB.addPair(2, 3);
		System.out.println(relB.toString());
		System.out.println(Relation.add(relA, relB).toString());
		System.out.println(Relation.sub(relA, relB).toString());
		System.out.println(Relation.compose(relA, relB).toString());
		System.out.println(relB.closure().toString());
		System.out.println(relA.isEquivalence());
		System.out.println(relB.isEquivalence());
		System.out.println(Relation.add(relA, relB).closure().toString());
	}

}
