package ex1_v1;

import java.util.List;

public class TextRepository {
	// TODO

	public TextRepository(String text, String stringToBeFound, int chunkSize) {
		// TODO

	}

	public synchronized TextChunk getChunk() {
		// TODO

		return null;
	}

	public synchronized void submitResult(TextChunk chunk) {
		// TODO
	}

	public synchronized List<Integer> getAllMatches() throws InterruptedException {
		// TODO
		
		return null;

	}
}
