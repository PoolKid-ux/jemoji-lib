package emlib.meta;

public enum EmojiCategory {
	EMOTICON("emoticons");

	private final String name;

	EmojiCategory(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
