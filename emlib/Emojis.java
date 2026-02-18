package emlib;

import emlib.meta.EmojiCategory;
import static emlib.util.UnicodeUtil.toPrint;

public enum Emojis {
	// ============== emoticons ==============
	FACE_SMILLING(EmojiCategory.EMOTICON, "U+1F600", 
"face smilling");

	private final EmojiCategory category;
	private final String unicode;
	private final String name;

	Emojis(EmojiCategory category, String unicode, 
String name) {
		this.category = category;
		this.unicode = unicode;
		this.name = name;
	}

	public EmojiCategory getCategory() {
		return category;
	}

	public String getUnicode() {
		return unicode;
	}

	public String getName() {
		return name;
	}

	public String print() {
		return toPrint(unicode);
	}
}
